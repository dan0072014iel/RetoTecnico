package co.com.sanangel.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;
import java.util.Random;

import static co.com.sanangel.UI.HomePageUI.LIST_PRODUCTS_IMG;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandomProduct implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int i=1;
        while(actor.recall("product"+i) != null){
            i++;
        }
        List<WebElementFacade> listProducts = LIST_PRODUCTS_IMG.resolveAllFor(actor);
        Random random = new Random();
        int index = random.nextInt(listProducts.size());
        //actor.remember("product"+i, listProducts.get(index).getText());
        actor.remember("product"+i, listProducts.get(index).getAttribute("src"));
        while(actor.recall("product"+i) == actor.recall("product"+(i-1))){
            index = random.nextInt(listProducts.size());
            //actor.remember("product"+i, listProducts.get(index).getText());
            actor.remember("product"+i, listProducts.get(index).getAttribute("src"));
        }
        actor.attemptsTo(
                Scroll.to(listProducts.get(index)),
                JavaScriptClick.on(listProducts.get(index))
        );
    }

    public static ClickRandomProduct clickRandomProduct(){
        return instrumented(ClickRandomProduct.class);
    }
}
