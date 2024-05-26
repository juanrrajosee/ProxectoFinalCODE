package ProyectoCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase delvuelve informacion que no necesita hacer calculos matematicos
 */
public class InformacionPlaneta {

    /**
     * Muestra la temperatura del planeta especificado.
     *
     * @param planeta El nombre del planeta del que se desea conocer la temperatura.
     */
    public static void mostrarTemperatura(String planeta) {
        // Inicialización de temperaturas
        Map<String, Double> temperaturas = new HashMap<>();
        temperaturas.put("Mercurio", 167.0);
        temperaturas.put("Venus", 462.0);
        temperaturas.put("Tierra", 15.0);
        temperaturas.put("Marte", -50.0);
        temperaturas.put("Júpiter", -110.0);
        temperaturas.put("Saturno", -140.0);
        temperaturas.put("Urano", -195.0);
        temperaturas.put("Neptuno", -200.0);

        // Mostrar la temperatura del planeta especificado
        if (temperaturas.containsKey(planeta)) {
            double temperatura = temperaturas.get(planeta);
            System.out.println("La temperatura de " + planeta + " es de : " + temperatura + " grados Celsius");
        } else {
            System.out.println("No se encontró información de temperatura para el planeta " + planeta);
        }
    }

    /**
     * Muestra información sobre la superficie del planeta especificado.
     *
     * @param planeta El nombre del planeta del que se desea conocer la información de la superficie.
     */
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

    /**
     * Muestra la distancia desde la Tierra al planeta especificado y el tiempo estimado de viaje.
     *
     * @param planeta El nombre del planeta del que se desea conocer la distancia y el tiempo de viaje.
     */
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

    /**
     * Muestra la gravedad del planeta especificado.
     *
     * @param planeta El nombre del planeta del que se desea conocer la gravedad.
     */
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


    /**
     * Muestra información sobre por qué no se puede sobrevivir en el planeta especificado.
     *
     * @param planeta El nombre del planeta del que se desea conocer la información de supervivencia.
     */
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
}

