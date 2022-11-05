package org.framework.pages.homepage.components;

import org.framework.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TVAudioAndCameraComponent extends BasePage {
    private By televisionMenuItem =By.linkText("Televisions");

    public TVAudioAndCameraComponent(WebDriver driver) {
        super(driver);
    }


    public TVAudioAndCameraComponent clickTelevision(){
        click(televisionMenuItem);
        return this;
    }


}
