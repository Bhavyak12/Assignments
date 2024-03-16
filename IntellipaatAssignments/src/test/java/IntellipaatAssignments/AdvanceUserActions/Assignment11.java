package IntellipaatAssignments.AdvanceUserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import static IntellipaatAssignments.AdvanceUserActions.Assignment10.handleFileUpload;

public class Assignment11 {

    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement download=driver.findElement(By.xpath("//a[@href='/download']"));
        download.click();
        driver.findElement(By.xpath("//a[@href='download/upload-me.txt']")).click();

        try {
            Thread.sleep(5000); // Adjust the wait time based on the expected download time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String downloadPath = "C:\\Users\\bhavy\\Downloads"; // Change this to the actual download directory
        String fileName = "testing.mp3";
        File file = new File(downloadPath + File.separator + fileName);
        if (file.exists()) {
            System.out.println("File is downloaded successfully.");
        } else {
            System.out.println("File is not downloaded.");
        }


        Thread.sleep(3000);

        driver.quit();

    }
}
