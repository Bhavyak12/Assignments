package IntellipaatAssignments.WebdriverAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

    public static void main(String[] args) {


        WebDriver driver;

        //TC1-Write a Test Script to open Test URL in Chrome Browser
        driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();

        //TC2-Write a Test Script to open Test URL in Firefox Browser.
        driver=new FirefoxDriver();
        driver.get("https://google.com");
        driver.quit();
        //TC3-Write a Test Script to open Test URL in Internet Explorer Browser
        driver=new EdgeDriver();
        driver.get("https://google.com");
        driver.quit();
    }

}
