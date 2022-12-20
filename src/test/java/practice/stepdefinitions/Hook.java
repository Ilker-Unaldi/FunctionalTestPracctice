package practice.stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import practice.utilities.Driver;

public class Hook {


    @Before
    public void setUp(){
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

}
