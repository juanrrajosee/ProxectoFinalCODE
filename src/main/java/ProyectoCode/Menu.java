package ProyectoCode;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Esta clase implementa un menu interactivo que proporciona información sobre los planetas del sistema solar.
 */
public class Menu {


    /**
     * Método principal que inicia el programa.
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        int opcion;
        String planetaElegido = "";


        while (!salir) {
            //Menu de planetas
            System.out.println("\n\t-- SISTEMA SOLAR --");
            System.out.println("1.- Mercurio");
            System.out.println("2.- Venus");
            System.out.println("3.- Tierra");
            System.out.println("4.- Marte");
            System.out.println("5.- Jupiter");
            System.out.println("6.- Saturno");
            System.out.println("7.- Urano");
            System.out.println("8.- Neptuno");
            System.out.println("10.- Salir del programa");

            //Seleccion de planetas
            try {
                System.out.println("Seleccione un planeta del Sistema Solar (1-8): ");
                int planetaSeleccionado = sn.nextInt();

                switch (planetaSeleccionado) {
                    case 1:
                        planetaElegido = "Mercurio";
                        break;
                    case 2:
                        planetaElegido = "Venus";
                        break;
                    case 3:
                        planetaElegido = "Tierra";
                        break;
                    case 4:
                        planetaElegido = "Marte";
                        break;
                    case 5:
                        planetaElegido = "Jupiter";
                        break;
                    case 6:
                        planetaElegido = "Saturno";
                        break;
                    case 7:
                        planetaElegido = "Urano";
                        break;
                    case 8:
                        planetaElegido = "Neptuno";
                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Debe seleccionar un numero valido.");
                        break;
                }

                if (!salir) {
                    System.out.println("Planeta seleccionado: " + planetaElegido);
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes seleccionar un número de opción.");
                sn.next();
            }

            //Menu de opciones
            if (!salir) {
                System.out.println("\n\t-- MENU --");
                System.out.println("1.- Temperatura");
                System.out.println("2.- Superficie");
                System.out.println("3.- Distancia hasta " + planetaElegido + " y tiempo que tardarias en llegar");
                System.out.println("4.- Gravedad");
                System.out.println("5.- Posibilidad de supervivencia");
                System.out.println("6.- Calcular peso en " + planetaElegido);
                System.out.println("7.- Cambiar de planeta");
                System.out.println("8.- Salir");

                //Eleccion de opciones
                try {
                    System.out.println("Seleccione la opcion deseada: ");
                    opcion = sn.nextInt();

                    switch (opcion) {
                        case 1:
                            InformacionPlaneta.mostrarTemperatura(planetaElegido);
                            break;
                        case 2:
                            InformacionPlaneta.mostrarSuperficie(planetaElegido);
                            break;
                        case 3:
                            InformacionPlaneta.mostrarDistancia(planetaElegido);
                            break;
                        case 4:
                            InformacionPlaneta.mostrarGravedad(planetaElegido);
                            break;
                        case 5:
                            InformacionPlaneta.mostrarPosibilidadSupervivencia(planetaElegido);
                            break;
                        case 6:

                            CalculosPlaneta.calcularPesoEnPlaneta(planetaElegido);
                            break;
                        case 7:
                            break;
                        case 8:
                            salir = true;
                            break;
                        default:
                            System.out.println("Las opciones son entre 1 y 7");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes seleccionar un número de opción.");
                    sn.next();
                }
            }
        }

        System.out.println("Gracias por utilizar el sistema, hasta luego...");
    }


}
