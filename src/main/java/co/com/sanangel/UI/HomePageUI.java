package co.com.sanangel.UI;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI {

    /*public static Target LIST_PRODUCTS = Target.the("list products").locatedBy(
            "//ul[@class = 'products columns-3']/li/a/img/ancestor::a//h2"
    );*/
    public static Target LIST_PRODUCTS_IMG = Target.the("list products").locatedBy(
            "//div[@class='vc_tta-panel vc_active']//ul[@class = 'products columns-3']/li/a/img"
    );
}
