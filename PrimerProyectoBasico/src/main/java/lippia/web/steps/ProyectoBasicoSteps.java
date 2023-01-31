package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ProyectoBasicoServices;

public class ProyectoBasicoSteps extends PageSteps {

    @Given("Como usuario estoy en la main page de google")
    public void navegador() {
        ProyectoBasicoServices.navegadorWeb();
    }

    @When("Como usuario busco referencias a (.*)$")
    public void busqueda(String juego) {
        ProyectoBasicoServices.busqueda(juego);
        //ProyectoBasicoServices.click();
    }

    @Then("El buscador muestra los siguientes resultados (.*)$")
    public void resultados(String juego) {
        ProyectoBasicoServices.resultados(juego);
    }

}
