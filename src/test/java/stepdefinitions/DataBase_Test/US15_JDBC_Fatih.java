package stepdefinitions.DataBase_Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US15_JDBC_Fatih {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("Fatih Find student by ID")
    public void findStudentByID() throws SQLException {
        //SELECT * FROM student WHERE id = 54;
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM student WHERE id = 54");

        resultSet.next();
    }

    @Then("Fatih Validate data student")
    public void validateDataStudent() throws SQLException {

        assertEquals("2005-05-24", resultSet.getString("birth_day"));
        assertEquals("Konya", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("father", resultSet.getString("name"));
        assertEquals("232-882-2349", resultSet.getString("phone_number"));
        assertEquals("343-33-8723", resultSet.getString("ssn"));
        assertEquals("koca", resultSet.getString("surname"));
        assertEquals("kocamustafa", resultSet.getString("username"));
        assertEquals("konya123@hotmail.com", resultSet.getString("email"));
        assertEquals("alican", resultSet.getString("father_name"));
        assertTrue("true",resultSet.getBoolean("is_active"));
        assertEquals("mother", resultSet.getString("mother_name"));
        assertEquals(1052, resultSet.getInt("student_number"));
        assertEquals(5, resultSet.getInt("user_role_id"));
        assertEquals(19, resultSet.getInt("advisor_teacher_id"));

        connection.close();
        statement.close();
        resultSet.close();

    }
}
