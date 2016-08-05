package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import static step_definitions.Hooks.driver;

public class Stepdefs {

//    public WebDriver driver;

    /*public Stepdefs()
    {
        driver = Hooks.driver;
    }*/


    @Given("^the OKTA url$")
    public void the_OKTA_url() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("1");
        WebDriver driver = new FirefoxDriver();
        Thread.sleep (10);
        driver.get("http://google.com");
        System.out.println("Complete");
        //System.setProperty("webdriverhttp://.chrome.driver", "/SATHEESH_MYFILES/Work/vijayfw3/BCGMSP/src/chromedriver");
        //driver = new ChromeDriver();
        //driver.get("https://thoughtworks.okta.com/");
        //throw new PendingException();
    }

    @When("^I enter username$")
    public void i_enter_username() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2");
        //throw new PendingException();
    }

    @When("^I enter Password$")
    public void i_enter_Password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("3");
        //throw new PendingException();
    }

    @When("^I click signin button$")
    public void i_click_signin_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("4");
        //throw new PendingException();
    }

    @Then("^I should be loggedin$")
    public void i_should_be_loggedin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("5");
        //throw new PendingException();
    }

//
//    public static void main(String args[])
//       {
//        WebDriver  driver = new FirefoxDriver();
//        driver.get("http://google.com");
//    }



}
