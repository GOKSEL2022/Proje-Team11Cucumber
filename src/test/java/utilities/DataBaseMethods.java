package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseMethods {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


    //1. Adım: Driver'a kaydol
    //2. Adım: Datbase'e bağlan
    public static Connection connectToDataBase(String hostName, String dbName,String username, String password)  {

        try {
            Class.forName("org.postgresql.Driver");        //
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            connection = DriverManager.getConnection("jdbc:postgresql://"+hostName+":5432/"+dbName,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if(connection!=null){
            System.out.println("Connection Success");
        }else {
            System.out.println("Connection Fail");
        }

        return connection;
    }

    //3. Adım: Statement oluştur.
    public static Statement createStatement(){


        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return statement;
    }

    //4. Adım: Query çalıştır.
    public static boolean execute(String sql){
        boolean isExecute;
        try {
            isExecute = statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return isExecute;
    }



    //5. Adım: Bağlantı ve Statement'ı kapat.
    public static void closeConnectionAndStatement(){

        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            if(connection.isClosed()&&statement.isClosed()){
                System.out.println("Connection and statement closed!");

            }else {
                System.out.println("Connection and statement NOT closed!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Table oluşturan method
    public static void createTable(String tableName, String... columnName_dataType ){
        StringBuilder columnName_dataValue = new StringBuilder("");

        for(String w : columnName_dataType){

            columnName_dataValue.append(w).append(",");

        }

        columnName_dataValue.deleteCharAt(columnName_dataValue.length()-1);

        try {
            statement.execute( "CREATE TABLE "+tableName+"("+columnName_dataValue+")");
            System.out.println("Table "+tableName+" successfully created!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    //===============  executeQuery methodu==============================
    public static ResultSet executeQuery(String sql) {

        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultSet;
    }

    //============================ ExecuteUpdate methodu =======================
    //Bu yöntem, verilen SQL güncelleştirme sorgusunu yürütür ve update olan satır sayısını döndürür.
    public static int executeUpdate(String sql) {
        int affectedRows;
        try {
            affectedRows = statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return affectedRows;
    }

    //============================ Table'a Değer giren method =======================
    /*
    Bu yöntem, bir tabloya yeni değerler eklemek için kullanılır.
    İlk parametre olarak tablo adı, ikinci parametre olarak sütun adları ve üçüncü parametre olarak da sütunlara eklenecek değerlerin bir dizisi alınır.
     */

    public static void insertValueIntoTable(String tableName, String columnNames, String values) {
        try {
            String sql = "INSERT INTO " + tableName + " (" + columnNames + ") VALUES (" + values + ")";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //============================ Sütun Değerlerini List içerisine alan method=======================
      /* Bu yöntem, belirtilen tablodaki belirtilen sütunun değerlerini bir List içinde döndürür.
      İlk parametre olarak tablo adı ve ikinci parametre olarak sütun adı alınır.
      Bu yöntem, bir SELECT sorgusu oluşturur ve statement nesnesini kullanarak sorguyu yürütür.
       Daha sonra, ResultSet içindeki her bir satırı döngüyle döner ve her sütun değerini List içine ekler.
*/
    public static List<String> getColumnValues(String tableName, String columnName) {
        List<String> columnValues = new ArrayList<>();
        try {
            String sql = "SELECT " + columnName + " FROM " + tableName;
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String value = resultSet.getString(columnName);
                columnValues.add(value);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return columnValues;
    }

    public static void createConnection(){
        String url = "jdbc:postgresql://164.92.252.42:5432/school_management";
        String username = "select_user";
        String password = "43w5ijfso";

       try {
           connection = DriverManager.getConnection(url,username,password);
        }catch(SQLException e){
           e.printStackTrace();
       }
        if(connection!=null){
            System.out.println("Connection Success");
        }else {
            System.out.println("Connection Fail");
        }

    }


    public static void dropTable(String tableName){
        try {
            statement.execute("DROP TABLE " + tableName);
            System.out.println("Table " + tableName + " dropped");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    //Use this to get the ResutSet object
    public static ResultSet getResultset() {
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return resultSet;
    }

    // This method returns the number fo row in a table in the database
    public static int getRowCount() throws Exception {
        resultSet.last();
        int rowCount = resultSet.getRow();
        return rowCount;
    }

            ////////////
    /**
     * @return sorgu sonucunu, dış listenin temsil ettiği bir liste listesinde döndürür
     *       * satırların ve iç listelerin toplanması tek bir satırı temsil eder
     */
    public static List<List<Object>> getQueryResultList(String query) {
        executeQuery(query);
        List<List<Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                List<Object> row = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    row.add(resultSet.getObject(i));
                }
                rowList.add(row);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rowList;
    }


                /////////////

    /**
     * @return returns a single cell value. If the results in multiple rows and/or
     *         columns of data, only first column of the first row will be returned.
     *         The rest of the data will be ignored
     */
    public static Object getCellValue(String query) {
        return getQueryResultList(query).get(0).get(0);
    }




    /**
     * @return bir veri satırını temsil eden Dizelerin bir listesini döndürür. eğer sorgu
     *       * birden çok veri satırı ve/veya sütunuyla sonuçlanır, yalnızca ilk satır
     *       * iade edilecektir. Verilerin geri kalanı yoksayılacak
     */
    public static List<Object> getRowList(String query) {
        return getQueryResultList(query).get(0);
    }



    public static List<Map<String, Object>> getQueryResultMap(String query) {
        executeQuery(query);
        List<Map<String, Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                Map<String, Object> colNameValueMap = new HashMap<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    colNameValueMap.put(rsmd.getColumnName(i), resultSet.getObject(i));
                }
                rowList.add(colNameValueMap);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rowList;
    }



    /**
     * @return anahtarın sütun olduğu bir veri satırını temsil eden bir harita döndürür
     *       *         isim. Sorgu, birden çok veri satırı ve/veya sütunuyla sonuçlanırsa,
     *       * sadece ilk satır döndürülür. Verilerin geri kalanı yoksayılacak
     */
    public static Map<String, Object> getRowMap(String query) {
        return getQueryResultMap(query).get(0);
    }










}
