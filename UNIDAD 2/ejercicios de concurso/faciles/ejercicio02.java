import java.util.Map;

public class ejercicio02 {

    public static double calcularArea(Map<String, Object> poligono) {
        String tipo = (String) poligono.get("tipo");

        if ("triangulo".equals(tipo)) {
            double base = (double) poligono.get("base");
            double altura = (double) poligono.get("altura");
            return (base * altura) / 2;
        } else if ("rectangulo".equals(tipo)) {
            double ancho = (double) poligono.get("ancho");
            double alto = (double) poligono.get("alto");
            return ancho * alto;
        } else if (tipo != null) {
            System.out.println("Tipo de polígono no soportado: " + tipo);
            return 0;
        } else {
            System.out.println("No se especificó el tipo de polígono.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Map<String, Object> triangulo = Map.of(
            "tipo", "triangulo",
            "base", 10.0,
            "altura", 5.0
        );

        Map<String, Object> rectangulo = Map.of(
            "tipo", "rectangulo",
            "ancho", 8.0,
            "alto", 4.0
        );

        System.out.println("Área del triángulo: " + calcularArea(triangulo));
        System.out.println("Área del rectángulo: " + calcularArea(rectangulo));
    }
}
