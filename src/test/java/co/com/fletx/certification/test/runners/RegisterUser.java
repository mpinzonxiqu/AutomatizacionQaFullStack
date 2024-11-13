package co.com.fletx.certification.test.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_user.feature",   // Ubicación de los archivos .feature
        glue = "co.com.fletx.certification.test.stepdefinitions"      // Paquete donde están las definiciones de pasos

)
public class RegisterUser {
}

