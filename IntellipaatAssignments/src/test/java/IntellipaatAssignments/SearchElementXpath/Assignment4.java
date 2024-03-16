package IntellipaatAssignments.SearchElementXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Assignment4 {

    public static void main(String[] args) {

        WebDriver driver;
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        List<WebElement> links
                = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
//        for (WebElement link : links) {
//            System.out.println(link.getText());
//        }

        driver.quit();
    }
}
