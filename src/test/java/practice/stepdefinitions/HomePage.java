package practice.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import practice.pages.TestAutomationPracticeHomePage;
import practice.utilities.Driver;

public class HomePage {

    TestAutomationPracticeHomePage homePage =new TestAutomationPracticeHomePage();

    @Given("I am on the Test Automation Practice")
    public void i_am_on_the_test_automation_practice() throws InterruptedException {

        Thread.sleep(1000);
        Driver.getDriver().get("http://practice.cybertekschool.com/");
    }

    @When("I click Home Button")
    public void i_click_home_button() throws InterruptedException {
   }

    @Then("I should land on Home Page")
    public void i_should_land_on_home_page() throws InterruptedException {
        Thread.sleep(2000);
        String actual = homePage.getTestPractice().getText();
        String expected = "Test Automation Practice";
        Assert.assertEquals("Failed",expected,actual);
    }

}
