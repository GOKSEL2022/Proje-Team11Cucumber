package stepdefinitions.DataBase_Test;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US03 {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("{string} ile mesaji al")
    public void ile_mesaji_al(String email) throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM contact_message WHERE email = '"+email+"';");

        resultSet.next();

    }
    @Then("resultSet ile veriyi dogrula: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void result_set_ile_veriyi_dogrula_name_email_subject_message_date(String name, String email, String subject, String message, String date) throws SQLException {

        String actName = resultSet.getString("name");
        String actEmail = resultSet.getString("email");
        String actSubject = resultSet.getString("subject");
        String actMessage = resultSet.getString("message");
        String actDate = resultSet.getString("date");

        assertEquals(actName,name);
        assertEquals(actEmail,email);
        assertEquals(actSubject,subject);
        assertEquals(actMessage,message);
        assertEquals(actDate,date);



    }
}
