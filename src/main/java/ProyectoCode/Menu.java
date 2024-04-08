package ProyectoCode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        int opcion;

        while(!salir){

            /*Opciones*/

            System.out.println("\n\t-- Programa que muestra un menu con opciones de ejercicios de las diferentes estructuras --");

            System.out.println("1.- Temperatura");
            System.out.println("2.- Superficie");
            System.out.println("3.- Distancia hasta la 'Tierra' y tiempo que tardarias en llegar");
            System.out.println("4.- Gravedad");
            System.out.println("5.- Hay la posibilad de supervivencia");

            System.out.println("6.- Salir");

            try{

                System.out.println("Seleccione la opcion deseada: ");
                opcion = sn.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("Esta es la seccion que muestra la temperatura del planeta");
                        break;
                    case 2:
                        System.out.println("Esta es la seccion que muestra la superficie del planeta");
                        break;
                    case 3:
                        System.out.println("Esta es la seccion que muestra la distancia desde la 'Tierra' hasta el planeta.");
                        break;
                    case 4:
                        System.out.println("Esta es la seccion que muestra la gravedad del planeta");
                        break;
                    case 5:
                        System.out.println("Esta es la seccion que muestra la posibilidad de supervivencia del planeta");
                        break;
                    case 6:
                        salir=true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 6");

                }
            }
            catch(InputMismatchException e){
                System.out.println("Debes seleccionar un numero de opcion");
                sn.next();
            }
        }

        System.out.println("Gracias por utilizar el sistema, hasta luego... ");
    }
}
