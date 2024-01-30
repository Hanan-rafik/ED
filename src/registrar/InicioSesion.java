package registrar;

import java.util.ArrayList;
import java.util.Scanner;

class InicioSesion {

    private ArrayList<Persona> personas;

    public InicioSesion(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void iniciarSesion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu email: ");
        String emailSesion = sc.nextLine();
        System.out.println("Introduce tu contraseña: ");
        String contraseñaSesion = sc.nextLine();

        // Buscar la persona
        Persona personaSesionada = null;
        for (Persona persona : personas) {
            if (persona.getEmail().equals(emailSesion) && persona.getContraseña().equals(contraseñaSesion)) {
                personaSesionada = persona;
                break;
            }
        }

        if (personaSesionada != null) {
            System.out.println("Sesión iniciada con éxito.");
        } else {
            System.out.println("Email o contraseña incorrectos.");
        }
    }
}