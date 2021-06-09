package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.Addtocartprocess;
import com.nopcommerce.demo.pages.ProductAddedToShoppingCart;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ShoppingCartSuccessFully extends TestBase {
ProductAddedToShoppingCart productAddedToShoppingCart = new ProductAddedToShoppingCart();
Addtocartprocess addtocartprocess = new Addtocartprocess();
@Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        productAddedToShoppingCart.clickonelement();
        productAddedToShoppingCart.sortbyAtoZandclickaddtocart();
        productAddedToShoppingCart.clickaddtocart();
        addtocartprocess.selectproductandmodify();
    }
}
