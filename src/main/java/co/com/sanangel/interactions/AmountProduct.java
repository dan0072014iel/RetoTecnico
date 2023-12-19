package co.com.sanangel.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sanangel.UI.ProductPageUI.INPUT_AMOUNT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AmountProduct implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.recall("product1")!=null && actor.recall("product2")==null){
            actor.attemptsTo(
                    Enter.theValue("2").into(INPUT_AMOUNT)
            );
        }else if(actor.recall("product1")!=null && actor.recall("product2")!=null){
            actor.attemptsTo(
                    Enter.theValue("5").into(INPUT_AMOUNT)
            );
        }
    }

    public static AmountProduct amountProduct(){
        return instrumented(AmountProduct.class);
    }
}
