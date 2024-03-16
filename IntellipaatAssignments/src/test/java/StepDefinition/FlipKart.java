package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FlipKart extends BaseCode {

@When("Enter {string} in search bar")
    public void productSearch(String productname) throws InterruptedException {
    WebElement element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
    element.sendKeys(productname);
    element.sendKeys(Keys.ENTER);
    Thread.sleep(3000);

}

@And("Fetch and save results")
    public void savingResults()
{

    List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='_13oc-S']/descendant::a"));
    String folderPath = "src/test/resources/testresult";
    File folder = new File(folderPath);
    if (!folder.exists()) {
        folder.mkdir();
    }
    File file= new File("src/test/resources/testresult/result.txt");
    try (FileWriter writer = new FileWriter(file)) {
        for (int i = 0; i < searchResults.size(); i++) {
            WebElement result = searchResults.get(i);
            String resultTitle = result.getText();
            writer.write("Result " + (i+1) + ": " + resultTitle + "\n");
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

}
@Then("validate folder creation")
public void validation()
{
    File file= new File("src/test/resources/testresult/result.txt");
    if(!file.exists())
    {
        System.out.println("result search failed");
    }
    else
    {
        System.out.println("result search successful");
    }
}

@And("product sorting")
    public void productsorting() throws InterruptedException {

    String[] sortOptions = {"Relevance","Popularity","Price -- Low to High","Price -- High to Low","Newest First"};

    Random rand = new Random();
    String selectedSortOption = sortOptions[rand.nextInt(sortOptions.length)];
    System.out.println(selectedSortOption);

    List <WebElement> hlist=driver.findElements(By.xpath("//*[@class='_2i7N3j']/following-sibling::div"));
    int Count = hlist.size();
    System.out.println("count is" +Count);

    for(int n =0 ;n < Count ;n++){

      //String value =hlist.get(n).getText();
    //  System.out.println(value);
        if (hlist.get(n).getText().equals(selectedSortOption)) {

            hlist.get(n).click();
            break;
        }
  }


  Thread.sleep(3000);
}
@And("select 64GB phone and add to cart")
        public void addtocart() throws InterruptedException {
    Thread.sleep(3000);
    //click on desired phone link
    driver.findElement(By.xpath("//*[@class='_1YokD2 _3Mn1Gg']/descendant::div[@class='_1AtVbE col-12-12'][10]")).click();
    System.out.println(driver.getTitle());

  //clk add to cart
    Thread.sleep(5000);
    Set<String> windowHandles = driver.getWindowHandles();
    int i = 0;
    for (String handle : windowHandles) {
        i++;
        if (i == 2) {
            driver.switchTo().window(handle);
            break;
        }
    }
    System.out.println("Title of the second tab: " + driver.getTitle());

    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

}
@And("change the shipping address and proceed to checkout")
    public void checkout() throws InterruptedException {
  driver.findElement(By.xpath("//*[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();

  Thread.sleep(5000);
  ////*[@id="container"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input
    driver.findElement(By.xpath("//*[@class='_2IX_2- _17N0em']")).sendKeys("9849431536");
  
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();

}
@Then("validate checkout page")
  public void validationcheckoutpage()
{



    String actualMessage=driver.getTitle();
    System.out.println(actualMessage);
    String expectedResult="Secure Payment";
    if(actualMessage.contains(expectedResult))
    {
        System.out.println("validation checkout successful");

    }
    else {
        System.out.println("validation checkout failed");

    }

}


}
