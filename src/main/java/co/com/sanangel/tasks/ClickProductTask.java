package co.com.sanangel.tasks;

import co.com.sanangel.interactions.ClickRandomProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickRandomProduct.clickRandomProduct()
        );
    }

    public static ClickProductTask clickProduct(){
        return instrumented(ClickProductTask.class);
    }
}
