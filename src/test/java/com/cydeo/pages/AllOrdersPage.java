package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class AllOrdersPage extends BasePage {

    public AllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//table[@class='table is-fullwidth']//tr[1]//td[1]")
    public WebElement firstRowName;

}
