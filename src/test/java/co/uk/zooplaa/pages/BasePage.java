package co.uk.zooplaa.pages;

import co.uk.zooplaa.common.DriverLib;

public class BasePage extends DriverLib {
    private String BASE_URL = "https://www.zoopla.co.uk/";

    public void launchURL(){
        driver.navigate().to(BASE_URL);
    }
}
