public class ProyectoBasicoStep1 {
    @io.cucumber.java.en.When("^Como usuario busco referencias a <juegos>$")
    public void comoUsuarioBuscoReferenciasAJuegos() {
    }

    @When("Como usuario busco referencias a (.*)$")
    public void busqueda() {
        ProyectoBasico.busqueda();
        ProyectoBasico.click();
    }
}
C:\Users\yerma\OneDrive\Documents\Crowdar\PrimerProyectoBasico\PrimerProyectoBasico\.gitlab-ci.yml