package stepdefinitions.DataBase_Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
public class student_info_us17_us18 {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("query gonderir student_info")
    public void queryGonderir() throws SQLException {
        //SELECT * FROM teacher WHERE id = 35;
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select name from contact_message where email = 'rabiaa@gmail.com'");
        resultSet.next();
    }
    @Then("validete data student_info")
    public void valideteData() throws SQLException {
        assertEquals(0, resultSet.getInt("absentee"));
        assertEquals(99, resultSet.getInt("exam_average"));
        assertEquals(99, resultSet.getInt("final_exam"));
        assertEquals("Basarili Ogrenci", resultSet.getString("info_note"));
        assertEquals("AA", resultSet.getString("letter_grade"));
        assertEquals(99, resultSet.getInt("midterm_exam"));
        assertEquals(2, resultSet.getInt("education_term_id"));
        assertEquals(3, resultSet.getInt("lesson_lesson_id"));
        assertEquals(10, resultSet.getInt("student_id"));
        assertEquals(40, resultSet.getInt("teacher_id"));
        connection.close();
        statement.close();
        resultSet.close();
    }
}