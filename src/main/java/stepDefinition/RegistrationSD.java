package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class RegistrationSD {

    WebDriver driver;
    @Given("I am on user enquiry page")
    public void iAmOnUserEnquiryPage()
    {
      driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/contact/");
    }

    @When("I enter below data")
    public void iEnterBelowData(DataTable dataTable) {

        List<List<String>> dataList = dataTable.asLists();

        System.out.println(dataList.get(0).get(0));
        System.out.println(dataList.get(0).get(1));
        System.out.println(dataList.get(0).get(2));
        System.out.println(dataList.get(0).get(3));
        System.out.println(dataList.get(0).get(4));

        driver.findElement(By.name("item_meta[6]")).sendKeys(dataList.get(0).get(0));
        driver.findElement(By.name("item_meta[7]")).sendKeys(dataList.get(0).get(1));
        driver.findElement(By.name("item_meta[9]")).sendKeys(dataList.get(0).get(2));
        driver.findElement(By.name("item_meta[10]")).sendKeys(dataList.get(0).get(3));
        driver.findElement(By.name("item_meta[12]")).sendKeys(dataList.get(0).get(4));
    }

    @And("I click on submit")
    public void iClickOnSubmit() {

        System.out.println("I click on submit");
    }

    @Then("enquiry should be submitted")
    public void enquiryShouldBeSubmitted() {
        System.out.println("enquiry should be submitted");
    }
}
