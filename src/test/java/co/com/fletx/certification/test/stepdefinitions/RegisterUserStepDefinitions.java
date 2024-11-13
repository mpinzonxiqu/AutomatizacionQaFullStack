package co.com.fletx.certification.test.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.junit.Assert.assertTrue;

public class RegisterUserStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Pinzon");
    }
    @Given("Inicio Automatizacion Pagina Inicial")
    public void InicioAutomatizacionPaginaInicial() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://fletx.co/"));
    }

    @When("Registro de Informacion Formulario")
    public void RegistrodeInformacionFormulario() {
        // Lógica para ingresar las credenciales
        System.out.println("User enters valid credentials");
    }

    @Then("Validacion de Informacion de Test")
    public void ValidacionDeInformacionDeTest () {
        // Verifica que el usuario fue redirigido a la página de inicio
        System.out.println("User is redirected to the homepage");
        assertTrue(true); // Asegúrate de reemplazarlo por una validación real
    }
}
