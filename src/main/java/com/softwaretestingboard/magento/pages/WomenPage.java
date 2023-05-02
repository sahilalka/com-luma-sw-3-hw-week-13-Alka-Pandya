package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenPage extends Utility{
    // Mouse Hover on Women Menu
    By womenMenu = By.xpath("//span[normalize-space()='Women'])");
    // Mouse Hover on Tops
    By topMenu  = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    // Click on Jackets
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains]");
    // Storing jackets names in list
    By dropDownListProductName = By.xpath("//strong[@class='product name product-item-name']//a");
    // Select Sort By filter “Product Name”
    By productNamesElement = By.xpath("(//select[@id='sorter'])[1]), Product Name");
    // Select Sort By filter “Price”
    By dropDownListPrice = By.xpath("(//select[@id='sorter'])[1]), Price");
    // After Sorting Products by Price
    By priceElements = By.xpath("//span[@class='price-wrapper ']//span)");

    public void mouseHoverOnWomenMenuTab(){
       mouseHoverToElement(womenMenu);

    }
    public void mouseHoverOnTopTab(){
        mouseHoverToElement(topMenu);
    }
   public void clickOnJackets(){
        clickOnElement(jackets);
   }
    public void selectSortByFilterProductName(){
        selectByVisibleTextFromDropDown(dropDownListProductName,"Product Name");

    }

    public List<WebElement> returnListOfPriceElementsLocator(){
        List<WebElement> listOfElements = driver.findElements(priceElements);
        return listOfElements;
    }

    public List<WebElement> returnListOfProductNamesElementsLocator() {
        List<WebElement> listOfElements = driver.findElements(productNamesElement);
        return listOfElements;
    }

   public void selectSortByFilterPrice(){
        selectByVisibleTextFromDropDown(dropDownListPrice,"Price");
   }






}
