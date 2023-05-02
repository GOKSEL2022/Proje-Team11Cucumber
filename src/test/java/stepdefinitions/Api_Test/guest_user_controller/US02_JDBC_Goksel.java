package stepdefinitions.Api_Test.guest_user_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US02_JDBC_Goksel {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("Find guest_user by ID")
    public void findGuest_userByID() throws SQLException {
        //SELECT * FROM guest_user WHERE id = 198;
        connection = DriverManager.getConnection("postgresql://164.92.252.42:8080/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM guest_user WHERE id = 198");

        resultSet.next();
    }

    @Then("Validate data guest_user")
    public void validateDataGuest_user() throws SQLException {
        assertEquals(198, resultSet.getInt("id"));
        assertEquals("2000-06-01", resultSet.getString("birth_day"));
        assertEquals("Samsun", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Goksel", resultSet.getString("name"));
        assertEquals("542-453-8523", resultSet.getString("phone_number"));
        assertEquals("258-45-7852", resultSet.getString("ssn"));
        assertEquals("Celik", resultSet.getString("surname"));
        assertEquals("Goksel", resultSet.getString("username"));
        assertEquals(7, resultSet.getInt("user_role_id"));

        connection.close();
        statement.close();
        resultSet.close();
    }
}
