package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    //  Mouse Hover on Men Menu
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    // Mouse Hover on Bottoms
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    //  Click on Pants
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    //  Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    By size32 = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    By colourBlack = By.xpath("(//div[@class='swatch-option color'])[1]");
    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    By addToCart = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    By CronusYogaPantAddedText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    // Click on ‘shopping cart’ Link into message
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    // Verify the text ‘Shopping Cart.
    By shoppingCartText = By.xpath("//span[@class='base']");
    //  Verify the product name ‘Cronus Yoga Pant’
    By cronusYogaPantProduct = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    //  Verify the product size ‘32’
    By size32Product = By.xpath("//dd[contains(text(),'32')]");
    //  Verify the product colour ‘Black’
    By blackColourProduct = By.xpath("//dd[contains(text(),'Black')]");

    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
    }
    public void clickOnPants(){
        clickOnElement(pants);
    }
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnSize(){
        mouseHoverToElementAndClick(size32);
    }
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnColour(){
        mouseHoverToElementAndClick(colourBlack);
    }
   public void mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCart(){
        mouseHoverToElementAndClick(addToCart);
   }
   public String getCronusYogaPantAddedToYourShoppingCartText(){
        return getTextFromElement(CronusYogaPantAddedText);
   }
   public void clickOnShoppingCartMessage(){
        clickOnElement(shoppingCart);
   }
   public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
   }
   public String verifyTheProductNameCronusYogaPant(){
        return getTextFromElement(cronusYogaPantProduct);
   }
   public String verifyTheSize32Product(){
        return getTextFromElement(size32Product);
   }
   public String verifyTheProductColourBlack(){
        return getTextFromElement(blackColourProduct);
   }



}
