package practice.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){}
    private static WebDriver driver;

    public static WebDriver getDriver() {
        /*WebDriverManager.chromiumdriver().setup();
        ChromeOptions options=new ChromeOptions();
        ChromeDriver chromeDriver =new ChromeDriver((ChromeOptions) options.setBrowserVersion("108.0.5359.125"));
        return chromeDriver;*/
        if (driver==null) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver !=null){
            driver.quit();
            driver=null;
        }
    }
}
