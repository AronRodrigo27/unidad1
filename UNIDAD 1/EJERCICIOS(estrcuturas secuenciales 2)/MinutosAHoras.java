import javax.swing.JOptionPane;

public class MinutosAHoras {
    public static void main(String[] args) {
        // Entrada de minutos
        String m = JOptionPane.showInputDialog("Ingrese el total de minutos:");

        // Conversión a número entero
        int totalMinutos = Integer.parseInt(m);

        // Cálculo de horas y minutos restantes
        int horas = totalMinutos / 60;
        int minutosRestantes = totalMinutos % 60;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, totalMinutos + " minutos equivalen a:\n" +
                horas + " hora(s) y " + minutosRestantes + " minuto(s)");
    }
}
