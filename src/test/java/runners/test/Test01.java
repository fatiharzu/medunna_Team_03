package runners.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Driver;

public class Test01 {

    WebDriver driver;

    @Test
    public void test01(){
        driver = Driver.getDriver();

        driver.get("https://www.amazon.com");
    }
}
