package IntellipaatAssignments.SearchElementXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        //TC-1 launch Chrome browser
        driver=new ChromeDriver();
        //TC-2 go to Facebook Registration Page
        driver.navigate().to("https://www.facebook.com/");
        //TC-3 fill First Name Textbox with input
        driver.findElement(By.id("email")).sendKeys("Firstname");
        //TC-4 clear the input from First Name Textbox
        driver.findElement(By.id("email")).clear();
        //TC-5 again fill the First Name Textbox with input
        driver.findElement(By.id("email")).sendKeys("Firstname");
//        Actions act=new Actions(driver);
//        act.sendKeys(Keys.ARROW_DOWN);

        Thread.sleep(3000);
        //TC-6 Get the input from Textbox and display it in Console
        WebElement ele= driver.findElement(By.id("email"));

        System.out.println(ele.getText());
        //TC-6 Close browser
        driver.quit();


    }
}
