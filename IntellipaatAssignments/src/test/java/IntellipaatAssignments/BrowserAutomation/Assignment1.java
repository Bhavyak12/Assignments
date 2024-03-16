package IntellipaatAssignments.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Assignment1 {

    public static void main(String[] args) {

        WebDriver driver;

        //TC-1 launch Chrome browser
        driver=new ChromeDriver();

        //TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
        driver.get("https://netbanking.hdfcbank.com/netbanking/");

        //TC-3 maximize the browser window
        driver.manage().window().maximize();

        //TC-4 get the title of page
        System.out.println(driver.getTitle());
        //TC-5 click on know more link text
        driver.switchTo().frame("login_page");

        driver.findElement(By.linkText("Know More...")).click();
        //TC-6 switch from 0th window to 1st window
        ArrayList <String> list=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));


        //TC-7 after switching get the title of page
        System.out.println(driver.getTitle()) ;

        //TC-8 switch from 1st window to 0th window
        driver.switchTo().window(list.get(0));

        // TC-9 after switching, get the title of page
        System.out.println(driver.getTitle()) ;

        //TC-10 close all windows of the browser
        driver.quit();
    }

}
