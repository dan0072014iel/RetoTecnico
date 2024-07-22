package co.com.sanangel.questions;

import co.com.sanangel.Utils.NormalizeString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Optional;

import static co.com.sanangel.UI.CartPageUI.IMG_PRODUCT10;
import static co.com.sanangel.UI.CartPageUI.IMG_PRODUCT20;
//import static co.com.sanangel.UI.CartPageUI.LABEL_PRODUCT1;
//import static co.com.sanangel.UI.CartPageUI.LABEL_PRODUCT2;

public class ValidateProducts implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        /*String product10 = NormalizeString.normalizeString(LABEL_PRODUCT1.resolveFor(actor).getText());
        String product11 = NormalizeString.normalizeString(actor.recall("product1"));
        String product20 = NormalizeString.normalizeString(LABEL_PRODUCT2.resolveFor(actor).getText());
        String product21 = NormalizeString.normalizeString(actor.recall("product2"));
        return product10.startsWith(product11) && product20.startsWith(product21);*/
        String product10 = (IMG_PRODUCT10.resolveFor(actor).getAttribute("src"));
        String product20 = (IMG_PRODUCT20.resolveFor(actor).getAttribute("src"));
        return product10.equals(actor.recall("product1")) && product20.equals(actor.recall("product2"));
    }

    public static Question <Boolean> validate(){
        return new ValidateProducts();
    }
}
