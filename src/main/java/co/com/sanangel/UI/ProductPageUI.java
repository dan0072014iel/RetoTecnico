package co.com.sanangel.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPageUI {

    public static Target INPUT_AMOUNT = Target.the("Input amount").locatedBy(
            "//input[@type = 'number']"
    );
    public static Target BTN_ADDCART = Target.the("Input amount").locatedBy(
            "//button[@type = 'submit']"
    );
}
