package stepdefinitions.DataBase_Test;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactPage;

import java.sql.*;
import java.time.LocalDate;


public class US07 {

    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();
    String email=faker.internet().emailAddress();
    String subject=faker.lorem().word();
    String message=faker.lorem().paragraph();
    String name=faker.name().fullName();

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    static LocalDate localDate=LocalDate.now();
    static String date=localDate.toString();

    @Given("Database icin contact saglanir")
    public void
    databaseIcinContactSaglanir() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
    }

    @When("Databaseden olusturulan mesajlar sorgulanir")
    public void databasedenOlusturulanMesajlarSorgulanir() throws SQLException {

        resultSet = statement.executeQuery("select * from contact_message where email = 'rabiaa@gmail.com'");
        resultSet.next();
    }
    @Then("Gonderilen mesajlarin goruldugu dogrulanir")
    public void gonderilenMesajlarinGorulduguDogrulanir() throws SQLException {
        Assert.assertTrue(resultSet.getString("message").contains("boş mesaj"));
    }
    @When("Databaseden olusturulan yazarlar sorgulanir")
    public void databasedenOlusturulanYazarlarSorgulanir() throws SQLException {
        resultSet = statement.executeQuery("SELECT name FROM contact_message where email = 'rabiaa@gmail.com'");
    }

    @When("Databaseden mesaajlari gonderenlerin emailleri  sorgulanir")
    public void databasedenMesaajlariGonderenlerinEmailleriSorgulanir() throws SQLException {
        resultSet = statement.executeQuery("SELECT email FROM contact_message where name='rabiaa'");


    }

    @Then("Gonderilen mesaajlari gonderenlerin emaillerinin goruldugu dogrulanir")
    public void gonderilenMesaajlariGonderenlerinEmaillerininGorulduguDogrulanir() throws SQLException {
        resultSet.next();
        Assert.assertTrue(resultSet.getString("email").contains("rabiaa@gmail.com"));
    }

    @When("Databaseden mesaajlarin gonderilme tarihi  sorgulanir")
    public void databasedenMesaajlarinGonderilmeTarihiSorgulanir() throws SQLException {
        resultSet = statement.executeQuery("SELECT date FROM contact_message where email = 'rabiaa@gmail.com'");
    }

    @Then("Gonderilen mesaajlarin tarihinin goruldugu dogrulanir")
    public void gonderilenMesaajlarinTarihininGorulduguDogrulanir() throws SQLException {
        resultSet.next();
        Assert.assertTrue(resultSet.getString("date").contains(date));
    }

    @Then("Gonderilen mesajlarin yazarlarinin goruldugu dogrulanir")
    public void gonderilen_mesajlarin_yazarlarinin_goruldugu_dogrulanir() throws SQLException {
        resultSet.next();
        Assert.assertTrue(resultSet.getString("name").contains("rabiaa"));
    }

}