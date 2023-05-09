package stepdefinitions.DataBase_Test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class US22 {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @When("{string} ile gönderi sorgulanir")
    public void ileGönderiSorgulanir(String string) throws SQLException {
        resultSet = statement.executeQuery("select * from admins where ssn ="+string+"");
        resultSet.next();
    }

    @Then("resultSet ile veriyi dogrula: name={string} gender={string} phoneNumber={string} ssn={string} userName={string}")
    public void resultsetIleVeriyiDogrulaNameGenderPhoneNumberSsnUserName(String Name, String Gender, String Phone_Number, String Ssn, String User_Name) throws SQLException {

        String actName = resultSet.getString("Name");
        String actGender = resultSet.getString("Gender");
        String actPhoneNumber = resultSet.getString("Phone Number");
        String actSsn = resultSet.getString("Ssn");
        String actUserName = resultSet.getString("User Name");

        assertEquals(actName,Name);
        assertEquals(actGender,Gender);
        assertEquals(actPhoneNumber,Phone_Number);
        assertEquals(actSsn,Ssn);
        assertEquals(actUserName,User_Name);

    }
}
