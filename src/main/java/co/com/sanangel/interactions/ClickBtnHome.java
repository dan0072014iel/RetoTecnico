package co.com.sanangel.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sanangel.UI.CartPageUI.BTN_HOME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBtnHome implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.recall("product2")==null){
            actor.attemptsTo(
                    Click.on(BTN_HOME)
            );
        }
    }

    public static ClickBtnHome clickBtnHome(){
        return instrumented(ClickBtnHome.class);
    }
}
