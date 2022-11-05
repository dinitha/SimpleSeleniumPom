package org.framework.pages.homepage.components;

import org.framework.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SelectedItemComponent extends BasePage {

    private By aboutThisItemLabel = By.xpath("//h1[text()=' About this item ']");
    private By aboutThisItemDescriptionLabel = By.id("feature-bullets");
    public SelectedItemComponent(WebDriver driver) {
        super(driver);
    }

    public SelectedItemComponent scrollToAboutThisItem(){
        scrollToElement(driver.findElement(aboutThisItemLabel));
        return this;
    }


    public String getAboutThisItemText() {
        return readText(aboutThisItemLabel);
    }

    public String getAboutThisItemDescription() {
        return readText(aboutThisItemDescriptionLabel);
    }
}
