package practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestAutomationPracticeHomePage extends BasePage {

    @FindBy(xpath = "//a[@class='nav-link']")
    private WebElement Home_Element;

    @FindBy(xpath = "//span[.='Test Automation Practice']")
    private WebElement TestPractice;

    public WebElement getHome_Element() {
        return Home_Element;
    }

    public WebElement getTestPractice() {
        return TestPractice;
    }
}
