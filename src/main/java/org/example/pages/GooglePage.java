package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;
import java.util.Set;

public class GooglePage {

    WebDriver driver;
    public GooglePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), this);
        driver.navigate().to("https://www.google.com/");

    }

    @FindBy(id = "APjFqb")
    private WebElement googleSearchBar;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement googleSearchButton;

    public void fillGoogleSearchBar(String text) {
        googleSearchBar.sendKeys(text);
    }

    public void clickSearch(){
        googleSearchButton.click();

    }

}
