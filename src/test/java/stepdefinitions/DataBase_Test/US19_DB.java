package stepdefinitions.DataBase_Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.sql.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class US19_DB {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("emin Find teacher by ID")
    public void emin_find_dean_by_ıd() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM teacher WHERE id = 149");
        resultSet.next();
    }
    @Then("emin Validate data")
    public void emin_validate_data() throws SQLException {
        assertEquals("149", resultSet.getString("id"));
        assertEquals("2000-12-12", resultSet.getString("birth_day"));
        assertEquals("kij", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("asA", resultSet.getString("name"));
       // assertEquals("$2a$10$IsdC9xlcyKVAvSw6ptxQ5uwBcBZjDv9y14z67IqEWhicwGT84mz52", resultSet.getString("password"));
        assertEquals("896-987-6327", resultSet.getString("phone_number"));
        assertEquals("456-98-7853", resultSet.getString("ssn"));
        assertEquals("FRE", resultSet.getString("surname"));
        assertEquals("LUOK", resultSet.getString("username"));
        assertEquals("uj@ac.com", resultSet.getString("email"));
        assertTrue(resultSet.getBoolean("is_advisor"));
        assertEquals(4, resultSet.getInt("user_role_id"));

        connection.close();
        statement.close();
        resultSet.close();

    }

}
