package co.com.flext.certification.testeo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterUser implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        // Aquí definimos las acciones que el actor realizará

        // El actor llena el campo de nombre de usuario
        actor.attemptsTo(

        );
    }

    // Método estático para crear una nueva instancia de la tarea de login
    public static RegisterUser withCredentials(String username, String password) {
        return new RegisterUser();
    }
}

