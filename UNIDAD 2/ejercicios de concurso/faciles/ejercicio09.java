public class ejercicio09 {
    public static void main(String[] args) {
        System.out.println(timeToMillis(2, 5, 45, 10));  // Salida: 193510000
    }

    public static long timeToMillis(int days, int hours, int minutes, int seconds) {
        return (days * 24 * 60 * 60 * 1000) + (hours * 60 * 60 * 1000) +
               (minutes * 60 * 1000) + (seconds * 1000);
    }
}
