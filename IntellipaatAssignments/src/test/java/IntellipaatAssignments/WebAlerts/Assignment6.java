package IntellipaatAssignments.WebAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment6 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver=new FirefoxDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        Thread.sleep(3000);

       // Step 3: Switch into Frame
        driver.switchTo().frame("iframeResult");

        //Step 4: Click on Try it Button
        driver.findElement(By.xpath("/html/body/button")).click();

        //Step 5: Send the text into Alert
         Alert alert=driver.switchTo().alert();
         alert.sendKeys("HI,this is ABC");
       // Step 6: Accept the Web Alert
        alert.accept();
        //Step 7: Get the text displayed on page into Console
        System.out.println(driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText());
       // Step 8: Close browser
       driver.quit();




    }
}
