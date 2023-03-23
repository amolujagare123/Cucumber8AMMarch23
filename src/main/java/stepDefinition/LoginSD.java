package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSD {

    WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {

        System.out.println("I am on login page");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("http://localhost/ip");

    }
    @When("I enter correct username and correct Password")
    public void i_enter_correct_username_and_correct_password() {
        System.out.println("I enter correct username and correct Password");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amolujagare@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("I should be on dashboard")
    public void i_should_be_on_dashboard() {
        System.out.println("I should be on dashboard");

        String expected = "http://127.0.0.1/ip/index.php/dashboard";
        String actual = driver.getCurrentUrl();
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(expected,actual);
    }

    @When("I enter incorrect username and incorrect Password")
    public void iEnterIncorrectUsernameAndIncorrectPassword() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amolujagare1@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admi1111");

    }

    @Then("^I should get An error$")
    public void i_should_get_an_error() throws Throwable {
        String expected = "http://127.0.0.1/ip/index.php/sessions/login";
        String actual = driver.getCurrentUrl();
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(expected,actual);
    }


    @When("I enter blank username and blank Password")
    public void enterBlankUsernameAndPassword()
    {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");

    }

    @Then("I should get Another error")
    public void iShouldGetAnError()
    {
        String expected = "http://127.0.0.1/ip/index.php/sessions/login";
        String actual = driver.getCurrentUrl();
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(expected,actual);
    }

    @When("I enter username as {string} and password {string}")
    public void iEnterUsernameAsAndPassword(String username, String password) {

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

    }
}
