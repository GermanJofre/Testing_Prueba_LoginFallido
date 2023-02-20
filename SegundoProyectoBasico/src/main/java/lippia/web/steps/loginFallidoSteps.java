package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.loginFallidoServices;

public class loginFallidoSteps extends PageSteps {

    @Given("Como usuario estoy en la main page de gmail")
    public void mainpage() {
        loginFallidoServices.mainpage();
    }

    @And("Como usuario me dirijo a logearme")
    public void acceder() {
        loginFallidoServices.acceder();
    }

    @When("Como usuario ingreso mal mi (.*)$")
    public void login(String login) {
        loginFallidoServices.login(login);
    }

    @Then("El usuario no deberia poder ingresar a su cuenta")
    public void resultado() {
        loginFallidoServices.resultados();
    }

}
