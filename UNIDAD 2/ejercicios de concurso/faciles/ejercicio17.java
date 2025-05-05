public class ejercicio17 {
    public static int binaryToDecimal(String bin) {
        int decimal = 0;
        for (int i = 0; i < bin.length(); i++) {
            decimal = decimal * 2 + (bin.charAt(i) - '0');
        }
        return decimal;
    }
}
