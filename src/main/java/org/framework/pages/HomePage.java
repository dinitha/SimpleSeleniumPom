package org.framework.pages;


import org.framework.core.BasePage;
import org.framework.utils.propertyreader.PropertyReader;
import org.framework.pages.homepage.components.FilterComponent;
import org.framework.pages.homepage.components.TVAudioAndCameraComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private By hamburgerMenu = By.id("nav-hamburger-menu");
    private String subItemMenu = "//a[@data-menu-id='%s']";
    private TVAudioAndCameraComponent tvAudioAndCameraComponent;



    private FilterComponent filterComponent;
    public HomePage(WebDriver driver) {
        super(driver);
        this.tvAudioAndCameraComponent = new TVAudioAndCameraComponent(driver);
        this.filterComponent = new FilterComponent(driver);

    }

    public FilterComponent getFilterComponent() {
        return filterComponent;
    }
    public TVAudioAndCameraComponent getTvAudioAndCameraComponent() {
        return tvAudioAndCameraComponent;
    }
    public HomePage getHomePage(){
        driver.get(PropertyReader.getPropertyFromFile("url"));
        return this;
    }
    public HomePage openHamburgerMenu() {
        click(hamburgerMenu);
        return this;
    }
    public HomePage scrollToTVAppliencesElectronics(){
        WebElement element = driver.findElement(By.xpath(String.format(subItemMenu, String.valueOf(9))));
        scrollToElement(element);
        return this;
    }
    public HomePage expandTVAppliencesElectronics() {
        click(By.xpath(String.format(subItemMenu, String.valueOf(9))));
        return this;
    }



}
