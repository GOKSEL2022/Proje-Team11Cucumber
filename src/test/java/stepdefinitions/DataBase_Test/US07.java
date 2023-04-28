package stepdefinitions.DataBase_Test;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    LocalDate bugununTarihi;
    DateTimeFormatter formatter;
    String date;
    @Given("Ogrenci mesaj gonderir.")
    public void ogrenciMesajGonderir() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschools"));
        contactPage.contact_Button.click();
        contactPage.yourName_textBox.sendKeys(name);
        contactPage.yourEmail_textBox.sendKeys(email);
        contactPage.subject_textBox.sendKeys(subject);
        contactPage.message_textBox.sendKeys(message);
        Driver.clickWithJS(contactPage.sendMessage_Button);
        bugununTarihi = LocalDate.now();
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = bugununTarihi.format(formatter);
    }

    @Given("Database icin contact saglanir")
    public void databaseIcinContactSaglanir() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://209.38.244.227:5432/school_management", "select_user", "43w5ijfso");

    }

    @When("Databaseden olusturulan mesajlar sorgulanir")
    public void databasedenOlusturulanMesajlarSorgulanir() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT message FROM contact_message");

    }

    @Then("Gonderilen mesajlarin goruldugu dogrulanir")
    public void gonderilenMesajlarinGorulduguDogrulanir() throws SQLException {
        Assert.assertTrue(resultSet.getString("message").contains(message));
    }

    @When("Databaseden olusturulan yazarlar sorgulanir")
    public void databasedenOlusturulanYazarlarSorgulanir() throws SQLException {
        resultSet = statement.executeQuery("SELECT name FROM contact_message");
    }

    @Then("Gonderilen mesajlarin yazarlarinin goruldugu dogrulanir")
    public void gonderilenMesajlarinYazarlarininGorulduguDogrulanir() throws SQLException {
        Assert.assertTrue(resultSet.getString("name").contains(name));
    }

    @When("Databaseden mesaajlari gonderenlerin emailleri  sorgulanir")
    public void databasedenMesaajlariGonderenlerinEmailleriSorgulanir() throws SQLException {
        resultSet = statement.executeQuery("SELECT email FROM contact_message");
    }

    @Then("Gonderilen mesaajlari gonderenlerin emaillerinin goruldugu dogrulanir")
    public void gonderilenMesaajlariGonderenlerinEmaillerininGorulduguDogrulanir() throws SQLException {
        Assert.assertTrue(resultSet.getString("email").contains(email));
    }

    @When("Databaseden mesaajlarin gonderilme tarihi  sorgulanir")
    public void databasedenMesaajlarinGonderilmeTarihiSorgulanir() throws SQLException {
        resultSet = statement.executeQuery("SELECT date FROM contact_message");
    }

    @Then("Gonderilen mesaajlarin tarihinin goruldugu dogrulanir")
    public void gonderilenMesaajlarinTarihininGorulduguDogrulanir() throws SQLException {
        Assert.assertTrue(resultSet.getString("date").contains(date));
    }

}
