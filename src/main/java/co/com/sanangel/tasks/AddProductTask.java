package co.com.sanangel.tasks;

import co.com.sanangel.interactions.AmountProduct;
import co.com.sanangel.interactions.ClickBtnHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sanangel.UI.ProductPageUI.BTN_ADDCART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AmountProduct.amountProduct(),
                Click.on(BTN_ADDCART),
                ClickBtnHome.clickBtnHome()
        );
    }

    public static AddProductTask addProduct(){
        return instrumented(AddProductTask.class);
    }
}
