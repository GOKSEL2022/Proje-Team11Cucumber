package stepdefinitions.DataBase_Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Dean_Controller_DB_Select_Validate_US04 {

    ResultSet resultSet;
    Connection connection;
    Statement statement;

    @Given("Ali Find dean by ID")
    public void ali_find_dean_by_id() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM dean WHERE id = 200");
        resultSet.next();

    }

    @Then("Ali Validate data")
    public void ali_validate_data() throws SQLException {
     //   assertEquals("2000-01-01", resultSet.getString("birth_day"));
        assertEquals("van", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("veli", resultSet.getString("name"));
        assertEquals("230-545-2004", resultSet.getString("phone_number"));
        assertEquals("405-47-6721", resultSet.getString("ssn"));
        assertEquals("tarik", resultSet.getString("surname"));
        assertEquals("hasan36", resultSet.getString("username"));
        assertEquals(2, resultSet.getInt("user_role_id"));

        connection.close();
        statement.close();
        resultSet.close();

    }
}
