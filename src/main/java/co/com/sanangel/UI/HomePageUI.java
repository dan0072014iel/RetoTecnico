package co.com.sanangel.UI;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI {

    public static Target LIST_PRODUCTS = Target.the("list products").locatedBy(
            "//ul[@class = 'products columns-3']/li/a/img/ancestor::a//h2"
    );
}
