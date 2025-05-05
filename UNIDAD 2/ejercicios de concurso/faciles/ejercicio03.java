public class ejercicio03 {
    //invertir texto
    
        public static String reverso(String texto){
            String treverso="";
            for(int i=texto.length()-1; i>=0;i--){
                treverso+=texto.charAt(i);
            }
            return treverso;
        }
        public static void main(String[] args) {
    
        
            System.out.println(reverso("INGENIERIA DE SISTEMAS"));
           
           
        }
        
    }
    