package IntellipaatAssignments.AdvanceUserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment8 {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch Chrome browser
        WebDriver driver=new ChromeDriver();

        //Step 2: Open test URL- https://www.flipkart.com/

        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();
        //Step 3: hover on fashion
        Thread.sleep(3000);
       WebElement Mainmenu = driver.findElement(By.xpath("//*[@class='_3sdu8W emupdz']/child::div[1]"));
       Mainmenu.click();
        Thread.sleep(3000);
        Actions action=new Actions(driver);
        action.clickAndHold(Mainmenu);
        WebElement submenu=driver.findElement(By.linkText("Women Western"));
        submenu.click();

        Thread.sleep(3000);

 driver.quit();


    }
}
