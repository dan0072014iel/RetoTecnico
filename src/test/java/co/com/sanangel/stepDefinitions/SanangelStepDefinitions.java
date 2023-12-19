package co.com.sanangel.stepDefinitions;

import co.com.sanangel.questions.ValidateProducts;
import co.com.sanangel.tasks.AddProductTask;
import co.com.sanangel.tasks.ClickProductTask;
import co.com.sanangel.tasks.OpenPageTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SanangelStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("user open the page in the browser")
    public void userOpenThePageInTheBrowser() {
        theActorCalled("user").wasAbleTo(
                OpenPageTask.openPage()
        );
    }
    @When("add the first product with two quantities")
    public void addTheFirstProductWithTwoQuantities() {
        theActorInTheSpotlight().attemptsTo(ClickProductTask.clickProduct());
        theActorInTheSpotlight().attemptsTo(AddProductTask.addProduct());
    }
    @When("add second product with five quantities to the cart respectively")
    public void addSecondProductWithFiveQuantitiesToTheCartRespectively() {
        theActorInTheSpotlight().attemptsTo(ClickProductTask.clickProduct());
        theActorInTheSpotlight().attemptsTo(AddProductTask.addProduct());
    }
    @Then("user can see the two products in the cart")
    public void userCanSeeTheTwoProductsInTheCart() {
        theActorInTheSpotlight().should(seeThat(ValidateProducts.validate(), Matchers.equalTo(true)));
    }

    @After
    public void closeBrowser() {
        try {
            if (driver != null) {
                if (!driver.getWindowHandles().isEmpty()) {
                    for (String windowHandle : driver.getWindowHandles()) {
                        driver.switchTo().window(windowHandle);
                        driver.close();
                    }
                }
                driver.quit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
