package IntellipaatAssignments.AdvanceUserActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment9 {

    public static void main(String[] args) throws InterruptedException {


        //Step 1: Launch Chrome browser
         WebDriver driver=new ChromeDriver();

        //Step 2: Open test URL:
        driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
        driver.manage().window().maximize();

        //Step 3: Double click on Double-Click Me to see Alert Button to generate Alert
       WebElement element= driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
       Actions action=new Actions(driver);
       action.doubleClick(element).perform();
        Thread.sleep(3000);

       // Step 4: Accept Alert
        Alert newalert= driver.switchTo().alert();
        newalert.accept();
        Thread.sleep(3000);
       // Step 5: Close browser
        Thread.sleep(3000);
        driver.quit();
    }
}
