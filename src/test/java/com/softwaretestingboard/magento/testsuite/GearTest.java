package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    GearPage gearPage = new GearPage();


@Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
    gearPage.mouseHoverOnGearMenu();
    gearPage.mouseHoverAndClickOnBags();
    gearPage.clickOnOverNightDuffleProductName();

    // Verify the text ‘Overnight Duffle’
    String expectedText = "Overnight Duffle";
    String actualText = gearPage.getOverNightDuffleText();
    Assert.assertEquals(actualText,expectedText,"Error message displayed");
    gearPage.changeQuantity3();
    gearPage.clickOnAddToCartButton();

    //  Verify the text ‘You added Overnight Duffle to your shopping cart.’
    String expectedText1 = "You added Overnight Duffle to your shopping cart.";
    String actualText1 = gearPage.getProductAddedToShoppingCartText();
    Assert.assertEquals(actualText1,expectedText1,"Error message displayed");
    gearPage.clickOnShoppingCart();

    // Verify the product name ‘Overnight Duffle’
    String expectedText2 = "Overnight Duffle";
    String actualText2 = gearPage.getProductNameOvernightDuffle();
    Assert.assertEquals(actualText2,expectedText2,"Error message displayed");

    //Verify the Qty is ‘3’
    String expectedQuantity  = "3";
    String actualQuantity = gearPage.getTextFromTheEnterQuantity3();
    Assert.assertEquals(expectedQuantity,actualQuantity,"Error message displayed");

    //  Verify the product price ‘$135.00’
    String expectedText3 = "$135.00";
    String actualText3 = gearPage.getProductPrice135();
    Assert.assertEquals(expectedText3,actualText3,"Error message displayed");

    gearPage.changeQuantity5();
    gearPage.clickOnUpdateShoppingCart();

    //  Verify the product price ‘$225.00’
    String expectedText4 = "$225.00";
    String actualText4 = gearPage.verifyProductPrice225();
    Assert.assertEquals(actualText4,expectedText4,"Error message displayed");



















}


}
