package StepDefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import reusable.BaseCode;

import java.io.IOException;

public class Hooks extends BaseCode {

  //System.out.println("in hooks");

    @Before
    public void setUp() throws IOException {
     System.out.println("in hooks");

     BaseCode.LaunchBrowser();
    }
    @After
    public void TearDown()
    {

        driver.quit();
    }
}

