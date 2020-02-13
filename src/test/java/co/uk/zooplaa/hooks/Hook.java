package co.uk.zooplaa.hooks;

import co.uk.zooplaa.common.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Browser
{
    @Before
    public void setUp()
    {
        launchBrowser("Chrome");
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}