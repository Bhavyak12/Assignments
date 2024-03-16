package IntellipaatAssignments.WebdriverAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

    // TC-1 launch Chrome browser
        driver=new ChromeDriver();

    //TC-2 go to test URL https://www.google.com
        driver.get("https://google.com");
    //TC-3 specify wait time for 5 sec
        Thread.sleep(5000);
    //TC-4 get the title of page into console
        System.out.println(driver.getTitle());
    //TC-5 close the browser
        driver.quit();




    }
}
