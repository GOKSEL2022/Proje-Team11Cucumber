package stepdefinitions.DataBase_Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US01_JDBC_Goksel {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("Find admins by ID")
    public void findAdminsByID() throws SQLException {
        //SELECT * FROM admins WHERE id = 45;
        connection = DriverManager.getConnection("postgresql://164.92.252.42:8080/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM admins WHERE id = 45");

        resultSet.next();
    }

    @Then("Validate data")
    public void validateData() throws SQLException {

        assertEquals("1881-05-05", resultSet.getString("birth_day"));
        assertEquals("selanik", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Atatürk", resultSet.getString("name"));
        assertEquals("938-938-3838", resultSet.getString("phone_number"));
        assertEquals("188-11-9380", resultSet.getString("ssn"));
        assertEquals("Kemal", resultSet.getString("surname"));
        assertEquals("Mustafa", resultSet.getString("username"));
        assertTrue(resultSet.getBoolean("is_advisor"));
        assertEquals(1, resultSet.getInt("user_role_id"));

        connection.close();
        statement.close();
        resultSet.close();
    }
}
