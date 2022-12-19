package practice.pages;

import org.openqa.selenium.support.PageFactory;
import practice.utilities.Driver;

public class Base_Page {

    public Base_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
