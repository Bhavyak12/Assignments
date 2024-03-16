package IntellipaatAssignments.AdvanceUserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class Assignment10 {
    public static void handleFileUpload(String filePath) throws AWTException {
        // Set file path to clipboard
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        System.out.println("stringSelection" +stringSelection);
        // Create Robot class object to simulate keyboard events
        Robot robot = new Robot();

        // Paste file path from clipboard
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm file upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void main(String[] args) throws InterruptedException, AWTException {

        //Step 1: Launch Chrome browser
        WebDriver driver=new ChromeDriver();

        //Step 2: Open test URL: https://smallpdf.com/word-to-pdf
        driver.get("https://smallpdf.com/word-to-pdf");
        driver.manage().window().maximize();
        //Step 3: Click on Choose File button

        //Step 4: Automate Window Alert by uploading file

        WebElement chooseFileButton=driver.findElement(By.xpath("//input[@id='__picker-input']/following-sibling::div/descendant::div/button"));
        chooseFileButton.click();
        Thread.sleep(3000);
        String filePath = "C:\\Users\\bhavy\\Downloads\\car-parts.pdf";
        handleFileUpload(filePath);
        Thread.sleep(5000);


        driver.quit();

        //Step 7: Close browser


    }
}
