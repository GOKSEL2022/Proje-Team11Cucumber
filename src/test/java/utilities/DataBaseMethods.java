package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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









}
