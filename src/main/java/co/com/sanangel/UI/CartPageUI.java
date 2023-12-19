package co.com.sanangel.UI;

import net.serenitybdd.screenplay.targets.Target;

public class CartPageUI {

    public static Target BTN_HOME = Target.the("list products").locatedBy(
            "(//a[@href = 'https://sanangel.com.co/'])[1]"
    );
    public static Target LABEL_PRODUCT1 = Target.the("list products").locatedBy(
            "(//tbody/tr/td[@class='product-name']/span/div[@class = 'ts-product-name'][text()])[1]"
    );
    public static Target LABEL_PRODUCT2 = Target.the("list products").locatedBy(
            "(//tbody/tr/td[@class='product-name']/span/div[@class = 'ts-product-name'][text()])[last()]"
    );

}
