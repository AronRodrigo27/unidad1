import javax.swing.JOptionPane;

public class CalculoIMC {
    public static void main(String[] args) {
        // Entrada de datos
        String pesoStr = JOptionPane.showInputDialog("Ingrese su peso en kilogramos:");
        String estaturaStr = JOptionPane.showInputDialog("Ingrese su estatura en metros:");

        // Conversión a valores numéricos
        double peso = Double.parseDouble(pesoStr);
        double estatura = Double.parseDouble(estaturaStr);

        // Cálculo del IMC
        double imc = peso / (estatura * estatura);

        // Determinar categoría
        String categoria;
        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 25) {
            categoria = "Normal";
        } else if (imc < 30) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        // Mostrar resultado
        String mensaje = String.format("Tu IMC es: %.2f\nCategoría: %s", imc, categoria);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
