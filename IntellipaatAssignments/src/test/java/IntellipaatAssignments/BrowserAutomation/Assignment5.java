package IntellipaatAssignments.BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5
{
    public static void main(String[] args) {
        WebDriver driver;

       // TC-1 launch Chrome browser
        driver=new ChromeDriver();

       //TC-2 go to test URL - https://www.google.com
        driver.navigate().to("https://www.google.com");


      //TC-3 maximize the browser window
        driver.manage().window().maximize();
       //TC-4 get the URL of page
        System.out.println(driver.getCurrentUrl());

       //TC-5 navigate to test URL - https://www.selenium.dev/
        driver.navigate().to("https://www.selenium.dev/");

      //TC-6 get the URL of page
        System.out.println(driver.getCurrentUrl());
     //TC-7 navigate back to test URL - https://www.google.com
        driver.navigate().back();
     // TC-8 get the URL of page
        System.out.println(driver.getCurrentUrl());
      //TC-8 navigate one step forward to test URL - https://www.selenium.dev/
        driver.navigate().forward();
       // TC-9 get the URL of page
        System.out.println(driver.getCurrentUrl());
       //TC-10 refresh the current page
        driver.navigate().refresh();
       // TC-11 get the URL of page
        System.out.println(driver.getCurrentUrl());
      // TC-12 close the browser
        driver.quit();
    }
}
