package IntellipaatAssignments.AdvanceUserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment7 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");
        WebElement vf=driver.findElement(By.xpath("//*[@id=\"slider\"]"));

        Actions action = new Actions(driver);
        action.dragAndDropBy(vf,50,0).build().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
