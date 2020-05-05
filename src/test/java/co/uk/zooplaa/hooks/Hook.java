package co.uk.zooplaa.hooks;

import co.uk.zooplaa.common.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends Browser


{
    public Scenario scenario;
    public String defaultBrowser  = "Chrome";
    @Before
    public void setUp(Scenario scenario)
    {this.scenario = scenario;
        launchBrowser(defaultBrowser);
    }
    @After
    public void tearDown()

    {if(scenario.isFailed()){
        try {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"screenshot.png","failurePage");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
        closeBrowser();
    }
}
