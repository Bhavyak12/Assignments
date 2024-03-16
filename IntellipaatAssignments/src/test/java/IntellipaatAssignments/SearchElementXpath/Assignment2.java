package IntellipaatAssignments.SearchElementXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
        driver.findElement(By.name("sView1:r1:0:email")).sendKeys("xyz@test.com");
        driver.findElement(By.name("sView1:r1:0:password")).sendKeys("Password@123");
        driver.findElement(By.name("sView1:r1:0:retypePassword")).sendKeys("Password@123");
        Select country=new Select(driver.findElement(By.name("sView1:r1:0:country")));
        country.selectByIndex(30);
        Thread.sleep(3000);
        driver.findElement(By.name("sView1:r1:0:firstName")).sendKeys("firstname");
        driver.findElement(By.name("sView1:r1:0:lastName")).sendKeys("lastname");
        driver.findElement(By.name("sView1:r1:0:jobTitle")).sendKeys("Manager");
        driver.findElement(By.name("sView1:r1:0:workPhone")).sendKeys("7323278223");
        driver.findElement(By.name("sView1:r1:0:companyName")).sendKeys("Amazon");
        driver.findElement(By.name("sView1:r1:0:address1")).sendKeys("Addresss");
        driver.findElement(By.name("sView1:r1:0:city")).sendKeys("Arizona");
        Select state=new Select(driver.findElement(By.name("sView1:r1:0:state")));
        state.selectByIndex(3);
        driver.findElement(By.name("sView1:r1:0:postalCode")).sendKeys("08817");




    }
}
