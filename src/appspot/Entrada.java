package appspot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        // Crear una lista
        List<Pagina> paginas = new ArrayList<>();
        paginas.add(new Pagina("Codecademy",  "Ofrece cursos gratuitos y de pago para aprender a programar en una variedad de lenguajes, " +
                "incluyendo HTML, CSS, JavaScript, Python, Java, C++ y más.", "https://www.codecademy.com/"));

        paginas.add(new Pagina("Stack Overflow",  "Stack Overflow es un foro de preguntas y respuestas donde los desarrolladores" +
                " pueden encontrar ayuda con problemas de programación.\n", "https://stackoverflow.com/"));

        paginas.add(new Pagina("Reddit",  "Reddit tiene varios subreddits dedicados a la programación, donde los desarrolladores" +
                " pueden encontrar ayuda con problemas específicos.\n", "https://www.reddit.com/"));

        paginas.add(new Pagina("Medium",  " Medium es una plataforma donde los desarrolladores pueden publicar artículos y " +
                "tutoriales sobre programación. \n", "https://medium.com/"));

        // Menú
        while (true) {
            System.out.println("=== Menú ===");
            System.out.println("1. Codecademy");
            System.out.println("2. Stack Overflow");
            System.out.println("3. Reddit");
            System.out.println("4. Medium");
            System.out.println("5. Salir");


            Scanner scanner = new Scanner(System.in);
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    mostrarInformacion(paginas.get(opcion - 1));
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        }
    }

    //mostrar datos
    private static void mostrarInformacion(Pagina pagina) {
        System.out.println("Información de " + pagina.getNombre() + ":");
        System.out.println(pagina.getDescripcion());
        System.out.println("Enlace: " + pagina.getEnlace());
    }
}