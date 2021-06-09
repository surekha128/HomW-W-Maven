package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
/*
//	2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
//	2.7.Select "8GB [+$60.00]" using Select class.
//	2.8 Select HDD radio "400 GB [+$100.00]"
//	2.9 Select OS radio "Vista Premium [+$60.00]"
//  2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
//	2.11 Verify the price "$1,475.00"
//	2.12 Click on "ADD TO CARD" Button.
//	2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
//After that close the bar clicking on the cross button.
 */
public class Addtocartprocess extends Utility {

    public void selectproductandmodify() throws InterruptedException {
        Thread.sleep(5000);
        sendtexttoelement(By.id("product_attribute_1"), "2.2 GHz Intel Pentium Dual-Core E2200");
        clickonelement(By.xpath("//select[@id='product_attribute_2']/option[4]"));
        clickonelement(By.xpath("//input[@id='product_attribute_3_7']"));
        clickonelement(By.xpath("//input[@id='product_attribute_4_9']"));
        clickonelement(By.xpath("//input[@id='product_attribute_5_10']"));
        clickonelement(By.xpath("//input[@id='product_attribute_5_10']"));
        clickonelement(By.xpath("//input[@id='product_attribute_5_12']"));
        Thread.sleep(5000);
        String expectedMessage = "$1,475.00";
        String actualMessage = gettextfromelemrnt(By.xpath("//span[@id='price-value-1']"));
        Assert.assertEquals(actualMessage, expectedMessage);
        clickonelement(By.id("add-to-cart-button-1"));

        Thread.sleep(3000);
        String expectedMessage1 = "The product has been added to your shopping cart";
        String actualMessage1 = gettextfromelemrnt(By.xpath("//body/div[@id='bar-notification']/div[1]"));
        Assert.assertEquals(actualMessage1, expectedMessage1);
        clickonelement(By.className("close"));
    }
}
