package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

/*
2.1 Click on Computer Menu.
	2.2 Click on Desktop
	2.3 Select Sort By position "Name: A to Z"
	2.4 Click on "Add To Cart"
	2.5 Verify the Text "Build your own computer"

 */
public class ProductAddedToShoppingCart extends Utility {

    public void clickonelement() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(By.xpath("//div[@class='header-menu']/child::ul[@class='top-menu notmobile']/child::li[1]"));
        clickonelement(By.xpath("//div[@class='header-menu']/ul[1]/child::li[1]/ul[1]/li[1]"));
    }

    public void sortbyAtoZandclickaddtocart() throws InterruptedException {
        Thread.sleep(1000);
        waitvisiblityifElementlocated(By.id("products-orderby"), 5);
        clickonelement(By.xpath("//div[@class='product-sorting']/select[1]/child::option[2]"));
    }

    public void clickaddtocart() throws InterruptedException {
        Thread.sleep(1000);
        clickonelement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));
        String expectedMessage = "Build your own computer";
        String actualMessage = gettextfromelemrnt(By.className("product-name"));
        Assert.assertEquals(actualMessage, expectedMessage);
    }


}



