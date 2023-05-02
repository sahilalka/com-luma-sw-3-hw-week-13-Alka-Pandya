package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    //  Mouse Hover on Gear Menu
    By gearMenu = By.xpath("//span[normalize-space()='Gear'])");
    // Click on Bags
    By bagsMenu = By.xpath("//span[normalize-space()='Bags'])");
    // Click on Product Name ‘Overnight Duffle’
    By overNightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    // Verify the text ‘Overnight Duffle’
    By overNightDuffleText = By.xpath("//span[@class='base'])))");
    // Change Qty 3
    By quantity3 = By.xpath("//input[@id='qty']");
    // Click on ‘Add to Cart’ Button.
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    By addDuffleText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)'])");
    // Click on ‘shopping cart’ Link into message
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    // Verify the product name ‘Overnight Duffle’
    By productNameOvernightDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle'])");
    //Verify the Qty is ‘3’
    By text3 = By.xpath("//input[@title='Qty']), value))");
    // Verify the product price ‘$135.00’
    By price135 = By.xpath("(//span[@class='cart-price']//span)[2]))");
    // Change Qty to ‘5’
    By quantity5 = By.xpath("(//input[@class='input-text qty'])[1]), 5)");
    // Click on ‘Update Shopping Cart’ button
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart'])");
    // Verify the product price ‘$225.00’
    By productPrice225 = By.xpath("(//span[@class='cart-price']//span)[2])))");

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverAndClickOnBags() {
        mouseHoverToElement(bagsMenu);
    }

    public void clickOnOverNightDuffleProductName() {
        clickOnElement(overNightDuffle);
    }

    public String getOverNightDuffleText() {
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQuantity3() {
        clearValueFromTextBox(quantity3);
        sendTextToElement(quantity3, "3");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    public String getProductAddedToShoppingCartText() {
        return getTextFromElement(addDuffleText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String getProductNameOvernightDuffle() {
        return getTextFromElement(productNameOvernightDuffle);
    }

    public String getTextFromTheEnterQuantity3() {
       return getTextFromElement(text3);
    }

    public String getProductPrice135() {
       return getTextFromElement(price135);
    }

    public void changeQuantity5() {
        clearValueFromTextBox(quantity5);
        sendTextToElement(quantity3, "5");

    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }
    public String verifyProductPrice225(){
       return  getTextFromElement(productPrice225);

    }


}




































