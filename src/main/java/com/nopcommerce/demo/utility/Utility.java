package com.nopcommerce.demo.utility;

import com.nopcommerce.demo.basepage.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends BasePage {

//this method will click on element
public void clickonelement(By by){
driver.findElement(by).click();

}

    public void clickonelement(WebElement element){
        element.click();

    }


//this method will get text from element
public String gettextfromelemrnt(By by){
    return driver.findElement(by).getText();


}

//this method will send text on element
public void sendtexttoelement(By by ,String text){

    driver.findElement(by).sendKeys(text);
}

    public void sendtexttoelement(WebElement element ,String text){

        element.sendKeys(text);
    }
//alert popup
    public void alertexample(){
        clickonelement(By.name("proceed"));
//alert switch
        Alert alert = driver.switchTo().alert();
        // alert.getText();
        System.out.println(alert.getText());
        alert.accept();
    }
//this method will select by value from dropdown
public void selectbyvaluefromdropdown(By by,String value){

    Select select = new Select(driver.findElement(by));
    //select by value
    select.selectByValue(value);
    //select by text

}

    /**
     * This method will used to hover mouse on element
     */
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

//h2[@class='product-title']/a

//this method will be used to wait untill element located
    //visivlibtyofElementlocated

    public WebElement waitvisiblityifElementlocated(By by,int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }


}
