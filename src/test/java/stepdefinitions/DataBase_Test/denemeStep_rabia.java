package stepdefinitions.DataBase_Test;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;


public class denemeStep_rabia {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("quary gönderir")
    public void quaryGönderir() throws  SQLException {

        connection =  DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM student_info where id=74");
        resultSet.next();
    }

    @Then("do assertion")
    public void doAssertion() {

    }
}
