package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        menPage.mouseHoverOnMenMenu();
        menPage.mouseHoverOnBottoms();
        menPage.clickOnPants();
        menPage.mouseHoverOnProductNameCronusYogaPantAndClickOnSize();
        menPage.mouseHoverOnProductNameCronusYogaPantAndClickOnColour();
        menPage.mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCart();

        // Verify the text You added Cronus Yoga Pant to your shopping cart.
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menPage.getCronusYogaPantAddedToYourShoppingCartText();
        Assert.assertEquals(expectedText, actualText, "Error message displayed");
        menPage.clickOnShoppingCartMessage();

        // Verify the text ‘Shopping Cart.
        String expectedText1 = "Shopping Cart";
        String actualText1 = menPage.getShoppingCartText();
        Assert.assertEquals(expectedText1, actualText1, "Error message displayed");

        // Verify the product name ‘Cronus Yoga Pant’
        String expectedText2 = "Cronus Yoga Pant";
        String actualText2 = menPage.verifyTheProductNameCronusYogaPant();
        Assert.assertEquals(expectedText2, actualText2, "Error message displayed");

        // Verify the product size ‘32’
        String expectedText3 = "32";
        String actualText3 = menPage.verifyTheSize32Product();
        Assert.assertEquals(expectedText3, actualText3, "Error message displayed");

        // Verify the product colour ‘Black’
        String expectedProduct = "Black";
        String actualProduct = menPage.verifyTheProductColourBlack();
        Assert.assertEquals(expectedProduct, actualProduct, "Error message displayed");


    }


}











