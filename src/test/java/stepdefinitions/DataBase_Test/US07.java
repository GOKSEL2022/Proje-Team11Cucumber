package stepdefinitions.DataBase_Test;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactPage;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    List<Object> messageNameList = new ArrayList<>();


//    @Given("Ogrenci mesaj gonderir.")
//    public void ogrenciMesajGonderir() {
//
//        specAdmin.pathParams("first","contactMessages","second","save");
//        MessageSavePojo saveMessage=new MessageSavePojo("rabiaa","rabiaa@gmail.com","devamsızlık","boş mesaj");
//        Response response=given(specAdmin).when().body(saveMessage).post("{first}/{second}");
//        response.prettyPrint();
//    }

    @Given("Database icin contact saglanir")
    public void databaseIcinContactSaglanir() throws SQLException {
       //DataBaseMethods.createConnection();

        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");

    }

    @When("Databaseden olusturulan mesajlar sorgulanir")
    public void databasedenOlusturulanMesajlarSorgulanir() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select name from contact_message where email = 'rabiaa@gmail.com'");
        resultSet.next();
    }

    @Then("Gonderilen mesajlarin goruldugu dogrulanir")
    public void gonderilenMesajlarinGorulduguDogrulanir() throws SQLException {
        Assert.assertTrue(resultSet.getString("message").contains("boş mesaj"));
    }

    @When("Databaseden olusturulan yazarlar sorgulanir")
    public void databasedenOlusturulanYazarlarSorgulanir() throws SQLException {
        resultSet = statement.executeQuery("SELECT name FROM contact_message");
    }

    @Then("Gonderilen mesajlarin yazarlarinin goruldugu dogrulanir")
    public void gonderilenMesajlarinYazarlarininGorulduguDogrulanir() throws SQLException {
        Assert.assertTrue(resultSet.getString("name").contains("rabiaa"));


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
