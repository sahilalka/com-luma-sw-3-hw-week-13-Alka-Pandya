package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class WomenTest extends BaseTest {

    WomenPage womenPage = new WomenPage();


    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        womenPage.mouseHoverOnWomenMenuTab();
        womenPage.mouseHoverOnTopTab();
        womenPage.clickOnJackets();
        womenPage.selectSortByFilterProductName();

        //Verify the Products Name display in alphabetical order
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(womenPage.returnListOfProductNamesElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(womenPage.returnListOfProductNamesElementsLocator());
        Thread.sleep(1000);
        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message : Products are not displayed in alphabetical order");
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        womenPage.mouseHoverOnWomenMenuTab();
        womenPage.mouseHoverOnTopTab();
        womenPage.clickOnJackets();
        womenPage.selectSortByFilterPrice();

        // Verify the Products Price display in Low to high
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(womenPage.returnListOfPriceElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(womenPage.returnListOfPriceElementsLocator());
        Thread.sleep(1000);
        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message : Products are not displayed in Low to high order");


    }


}














