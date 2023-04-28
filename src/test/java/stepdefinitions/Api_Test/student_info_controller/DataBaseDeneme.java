package stepdefinitions.Api_Test.student_info_controller;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DataBaseMethods;
import utilities.ReusableMethods;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DataBaseDeneme {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("query gonderir")
    public void queryGonderir() throws SQLException {
        //SELECT * FROM teacher WHERE id = 35;
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM teacher WHERE id = 5");

        resultSet.next();



    }

    @Then("validete data")
    public void valideteData() throws SQLException {
        assertEquals("1995-06-07", resultSet.getString("birth_day"));
        assertEquals("USA", resultSet.getString("birth_place"));
        assertEquals("FEMALE", resultSet.getString("gender"));
        assertEquals("Nancy", resultSet.getString("name"));
        assertEquals("555-990-6767", resultSet.getString("phone_number"));
        assertEquals("555-90-6767", resultSet.getString("ssn"));
        assertEquals("CAN", resultSet.getString("surname"));
        assertEquals("nancy13", resultSet.getString("username"));
        assertEquals("nancy_can@gmail.com", resultSet.getString("email"));
        assertTrue(resultSet.getBoolean("is_advisor"));
        assertEquals(4, resultSet.getInt("user_role_id"));

        connection.close();
        statement.close();
        resultSet.close();

    }




}
