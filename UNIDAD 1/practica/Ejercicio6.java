import javax.swing.JOptionPane;


public class Ejercicio6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 1:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 2:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 3:"));
        
        // Ordenar los números de menor a mayor
        int[] nums = {a, b, c};
        java.util.Arrays.sort(nums);
        
        // Imprimir los números ordenados
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
        
       
    }
}
