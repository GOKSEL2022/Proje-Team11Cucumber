package stepdefinitions.DataBase_Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.sql.*;
import static org.junit.Assert.assertEquals;
public class US01_TC01_Select_Validate {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("Find admins_goksel by ID")
    public void findAdmins_gokselByID() throws SQLException {
        //SELECT * FROM admins WHERE id = 45;
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM admins WHERE id = 45");
        resultSet.next();
    }
    @Then("Validate data_goksel")
    public void validateData_goksel() throws SQLException {
        assertEquals("1881-05-05", resultSet.getString("birth_day"));
        assertEquals("selanik", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Atatürk", resultSet.getString("name"));
        assertEquals("938-938-3838", resultSet.getString("phone_number"));
        assertEquals("188-11-9380", resultSet.getString("ssn"));
        assertEquals("Kemal", resultSet.getString("surname"));
        assertEquals("Mustafa", resultSet.getString("username"));
        assertEquals(1, resultSet.getInt("user_role_id"));

        connection.close();
        statement.close();
        resultSet.close();
    }
}
