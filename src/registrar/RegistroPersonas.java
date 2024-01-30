package registrar;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroPersonas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Persona> personas = new ArrayList<>();

        while (true) {
            System.out.println("Introduce los datos de la persona:");
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Contraseña: ");
            String contraseña = sc.nextLine();


            if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                System.out.println("El email no es válido.");
                continue;
            }
            if (contraseña.length() < 8) {
                System.out.println("La contraseña debe tener al menos 8 caracteres.");
                continue;
            }

            Persona persona = new Persona(email, nombre, contraseña);
            personas.add(persona);

            System.out.println("Persona registrada con éxito.");
        }
        new InicioSesion(personas);
    }
}