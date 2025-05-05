public class ejercicio05 {
        public static void main(String[] args) {
            String str1 = "Me gusta Java";
            String str2 = "Me gusta Kotlin";
            printNonCommon(str1, str2);
        }
    
        public static void printNonCommon(String str1, String str2) {
            String out1 = "";
            String out2 = "";
            for (char c : str1.toCharArray()) {
                if (!str2.contains(String.valueOf(c))) {
                    out1 += c;
                }
            }
            for (char c : str2.toCharArray()) {
                if (!str1.contains(String.valueOf(c))) {
                    out2 += c;
                }
            }
            System.out.println("out1: " + out1);
            System.out.println("out2: " + out2);
        }
    }
    

