package ProyectoCode;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private static Map<String, Double> temperaturas = new HashMap<>();

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        int opcion;
        String planetaElegido = "";

        inicializarTemperaturas();

        while (!salir) {

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

                try {
                    System.out.println("Seleccione la opcion deseada: ");
                    opcion = sn.nextInt();

                    switch (opcion) {
                        case 1:
                            mostrarTemperatura(planetaElegido);
                            break;
                        case 2:
                            mostrarSuperficie(planetaElegido);
                            break;
                        case 3:
                            mostrarDistancia(planetaElegido);
                            break;
                        case 4:
                            mostrarGravedad(planetaElegido);
                            break;
                        case 5:
                            mostrarPosibilidadSupervivencia(planetaElegido);
                            break;
                        case 6:
                            // Llamada al método para calcular el peso en el planeta elegido
                            calcularPesoEnPlaneta(planetaElegido);
                            break;
                        case 7:
                            break;
                        case 8:
                            salir=true;
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

    private static void inicializarTemperaturas() {
        temperaturas.put("Mercurio", 167.0);
        temperaturas.put("Venus", 462.0);
        temperaturas.put("Tierra", 15.0);
        temperaturas.put("Marte", -50.0);
        temperaturas.put("Júpiter", -110.0);
        temperaturas.put("Saturno", -140.0);
        temperaturas.put("Urano", -195.0);
        temperaturas.put("Neptuno", -200.0);
    }

    public static void mostrarTemperatura(String planeta) {
        if (temperaturas.containsKey(planeta)) {
            double temperatura = temperaturas.get(planeta);
            System.out.println("La temperatura de " + planeta + " es de : " + temperatura + " grados Celsius");
        } else {
            System.out.println("No se encontró información de temperatura para el planeta " + planeta);
        }
    }


    public static void mostrarSuperficie(String planeta) {
        // Mapa que contiene la superficie de cada planeta
        Map<String, String> superficies = new HashMap<>();
        superficies.put("Mercurio", "Superficie rocosa y craterizada");
        superficies.put("Venus", "Superficie cubierta de densas nubes y volcanes");
        superficies.put("Tierra", "Superficie compuesta por oceanos y continentes");
        superficies.put("Marte", "Superficie con montanas, valles y casquetes polares");
        superficies.put("Júpiter", "Superficie gaseosa con tormentas y vientos fuertes");
        superficies.put("Saturno", "Superficie gaseosa con anillos");
        superficies.put("Urano", "Superficie gaseosa con anillos y atmosfera fria");
        superficies.put("Neptuno", "Superficie gaseosa con tormentas y vientos rapidos");

        // Verificar si el planeta tiene información de superficie almacenada
        if (superficies.containsKey(planeta)) {
            String superficie = superficies.get(planeta);
            System.out.println(planeta + ": " + superficie);
        } else {
            System.out.println("No se encontro informacion de superficie para el planeta " + planeta);
        }
    }

    public static void mostrarDistancia(String planeta) {
        // Mapa que contiene la distancia de cada planeta a la Tierra en UA
        Map<String, Double> distancias = new HashMap<>();
        distancias.put("Mercurio", 0.39);
        distancias.put("Venus", 0.72);
        distancias.put("Tierra", 1.0);
        distancias.put("Marte", 1.52);
        distancias.put("Jupiter", 5.2);
        distancias.put("Saturno", 9.58);
        distancias.put("Urano", 19.22);
        distancias.put("Neptuno", 30.05);

        // Velocidad de la luz en años-luz por año
        double velocidadLuz = 1.0;

        // Verificar si el planeta tiene información de distancia almacenada
        if (distancias.containsKey(planeta)) {
            double distanciaUA = distancias.get(planeta);
            double tiempoViaje = distanciaUA / velocidadLuz;
            System.out.println("Distancia hasta " + planeta + ": " + distanciaUA + " UA ('UA'=1,496e+8 KM)");
            System.out.println("Tiempo de viaje desde la Tierra: " + tiempoViaje + " anos-luz (1 ano-luz = 356 dias)");
        } else {
            System.out.println("No se encontró información de distancia para el planeta " + planeta);
        }
    }

    public static void mostrarGravedad(String planeta) {
        // Mapa que contiene la gravedad de cada planeta en m/s^2
        Map<String, Double> gravedades = new HashMap<>();
        gravedades.put("Mercurio", 3.7);
        gravedades.put("Venus", 8.87);
        gravedades.put("Tierra", 9.81);
        gravedades.put("Marte", 3.71);
        gravedades.put("Jupiter", 24.79);
        gravedades.put("Saturno", 10.44);
        gravedades.put("Urano", 8.69);
        gravedades.put("Neptuno", 11.15);

        // Verificar si el planeta tiene información de gravedad almacenada
        if (gravedades.containsKey(planeta)) {
            double gravedad = gravedades.get(planeta);
            System.out.println("La gravedad de " + planeta + " es de : " + gravedad + " m/s^2");
        } else {
            System.out.println("No se encontró información de gravedad para el planeta " + planeta);
        }
    }

    public static void mostrarPosibilidadSupervivencia(String planeta) {
        // Mapa que contiene las explicaciones de por qué no se puede sobrevivir en cada planeta
        Map<String, String> explicaciones = new HashMap<>();
        explicaciones.put("Mercurio", "Temperaturas extremadamente altas y ausencia de atmosfera");
        explicaciones.put("Venus", "Atmosfera densa compuesta principalmente por dioxido de carbono y altas temperaturas");
        explicaciones.put("Júpiter", "Atmosfera gaseosa compuesta principalmente por hidrogeno y helio, sin superficie solida");
        explicaciones.put("Saturno", "Atmosfera gaseosa compuesta principalmente por hidrogeno y helio, sin superficie solida");
        explicaciones.put("Urano", "Temperaturas extremadamente bajas y atmosfera compuesta principalmente por hidrogeno, helio y metano");
        explicaciones.put("Neptuno", "Temperaturas extremadamente bajas y atmosfera compuesta principalmente por Atmosfera, helio y metano");
        explicaciones.put("Tierra", "Condiciones adecuadas para la vida, incluyendo una atmosfera con oxigeno, agua liquida y temperatura moderada");
        explicaciones.put("Marte", "Atmosfera muy delgada compuesta principalmente por dioxido de carbono, bajas temperaturas y radiacion dañina");
        // Verificar si el planeta tiene información de posibilidad de supervivencia almacenada
        if (explicaciones.containsKey(planeta)) {
            System.out.println("- " + explicaciones.get(planeta));
        } else {
            System.out.println("No se encontró informacion sobre por qué no se puede sobrevivir en el planeta " + planeta);
        }
    }

    public static void calcularPesoEnPlaneta(String planeta) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce tu peso en la Tierra (en kilogramos): ");
        double pesoEnTierra = sn.nextDouble();

        // Mapa que contiene la gravedad de cada planeta en m/s^2
        Map<String, Double> gravedades = new HashMap<>();
        gravedades.put("Mercurio", 3.7);
        gravedades.put("Venus", 8.87);
        gravedades.put("Tierra", 9.81);
        gravedades.put("Marte", 3.71);
        gravedades.put("Júpiter", 24.79);
        gravedades.put("Saturno", 10.44);
        gravedades.put("Urano", 8.69);
        gravedades.put("Neptuno", 11.15);

        // Verificar si el planeta tiene información de gravedad almacenada
        if (gravedades.containsKey(planeta)) {
            double gravedad = gravedades.get(planeta);
            double pesoEnPlaneta = pesoEnTierra * gravedad / gravedades.get("Tierra");
            System.out.println("Tu peso en " + planeta + " seria aproximadamente: " + pesoEnPlaneta + " kilogramos");
        } else {
            System.out.println("No se encontró información de gravedad para el planeta " + planeta);
        }
    }
}
