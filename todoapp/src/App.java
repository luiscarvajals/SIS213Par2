import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int menuSelection = 99;

        System.out.println("APLICACION DE GESTION DE TAREAS");
        System.out.println("*******************************");
        System.out.println("Integrantes:");
        System.out.println("- Luis Carvajal");
        System.out.println("- Mayra Valdez");
        System.out.println("");
  
        do{
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Crear nueva tarea");
            System.out.println("2. Modificar tarea");
            System.out.println("3. Ver tareas");
            System.out.println("0. Salir");
            menuSelection = scanner.nextInt();
        } while(menuSelection != 0);

        scanner.close();
    }
}

