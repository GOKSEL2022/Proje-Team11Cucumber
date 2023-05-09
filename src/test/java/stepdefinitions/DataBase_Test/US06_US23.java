package stepdefinitions.DataBase_Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.testng.AssertJUnit.assertEquals;

public class US06_US23 {
    ResultSet resultSet;
    Connection connection;
    Statement statement;


    @Given("Nilufer find vice dean by ID")
    public void niluferFindViceDeanByID() throws SQLException {
        //SELECT * FROM vice_dean where id=360 ;
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM vice_dean where id=360");
        resultSet.next();
    }

    @Then("Nilufer validate data")
    public void niluferValidateData() throws SQLException {
        assertEquals("1995-01-01", resultSet.getString("birth_day"));
        assertEquals("Istanbul", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Selcuk", resultSet.getString("name"));
        assertEquals("211-110-8904", resultSet.getString("phone_number"));
        assertEquals("211-11-8904", resultSet.getString("ssn"));
        assertEquals("Yildiz", resultSet.getString("surname"));
        assertEquals("yildizselcuk", resultSet.getString("username"));
        assertEquals(3, resultSet.getInt("user_role_id"));

        connection.close();
        statement.close();
        resultSet.close();
    }
}

