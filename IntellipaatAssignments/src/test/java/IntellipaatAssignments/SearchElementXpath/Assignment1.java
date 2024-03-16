package IntellipaatAssignments.SearchElementXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("firstname");
        driver.findElement(By.name("lastname")).sendKeys("surname");
        driver.findElement(By.name("reg_email__")).sendKeys("7437437983");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password");
        Select day=new Select(driver.findElement(By.name("birthday_day")));
        day.selectByValue("10");
       Select month=new Select(driver.findElement(By.name("birthday_month")));
       month.selectByValue("9");
        Select year=new Select(driver.findElement(By.name("birthday_year")));
        year.selectByValue("2007");
        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
