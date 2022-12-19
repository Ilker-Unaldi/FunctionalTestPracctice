package practice.pages;

import org.openqa.selenium.support.PageFactory;
import practice.utilities.Driver;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
