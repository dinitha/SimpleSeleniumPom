package org.framework.pages.homepage.components;

import org.framework.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BrandsComponent extends BasePage {
    private By brandsLabel =By.xpath("//span[text()='Brands']");
    private By samsungCheckbox = By.linkText("Samsung");
    public BrandsComponent(WebDriver driver) {
        super(driver);
    }

    public BrandsComponent scrollToBrands(){

        WebElement element = driver.findElement(brandsLabel);
        scrollToElement(element);
        return this;
    }

    public BrandsComponent clickSamsungCheckbox(){
        click(samsungCheckbox);
        return this;
    }


}
