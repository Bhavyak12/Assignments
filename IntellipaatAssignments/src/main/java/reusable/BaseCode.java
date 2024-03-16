package reusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Properties;

public class BaseCode {
    public static WebDriver driver;

    public static void LaunchBrowser() throws IOException {
        FileInputStream fis= new FileInputStream(new File("src/main/resources/configuration/configuration.properties")) ;
        Properties prob=new Properties();
        prob.load(fis);

        if(prob.getProperty("browser").equalsIgnoreCase("edge"))
        {
            driver=new EdgeDriver();
        }
        else if (prob.getProperty("browser").equalsIgnoreCase("chrome"))
        {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
            //driver=new ChromeDriver();
        }
        else if (prob.getProperty("browser").equalsIgnoreCase("safari")) {

            driver=new SafariDriver();
        }

        else{

            throw new InvalidArgumentException("please enter valid browser input");
        }
        driver.get(prob.getProperty("environment"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


}
