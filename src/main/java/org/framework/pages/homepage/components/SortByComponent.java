package org.framework.pages.homepage.components;

import org.framework.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SortByComponent extends BasePage {
    private String sortByDropdownOptions = "s-result-sort-select_";
    private By sortByDropdown = By.xpath("//span[text()='Sort by:']");

    public SortByComponent(WebDriver driver) {
        super(driver);
    }

    public SortByComponent SelectSortOption(String sortBy){
        click(sortByDropdown);
        click(By.id((sortByDropdownOptions.concat(sortBy))));
        return this;

    }

}
