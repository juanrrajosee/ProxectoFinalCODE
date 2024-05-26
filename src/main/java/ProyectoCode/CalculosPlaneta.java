package ProyectoCode;


        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;
/**
 * Esta clase realiza las operaciones que lleven calculos matematicos
 */

public class CalculosPlaneta {

    /**
     * Calcula y muestra el peso de una persona en el planeta especificado.
     *
     * @param planeta El nombre del planeta en el que se desea calcular el peso.
     */
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
