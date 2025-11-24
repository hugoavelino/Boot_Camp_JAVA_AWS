package Extrutura_repeticao;

public class Exercicio2 {
    public static void main(String[] args) {
        parImpar(10, 1, "par");
    }
    
    public static void parImpar(int inicio, int fim, String tipo ) {
        int passo = (fim < inicio) ? -1 : 1;
        for (int i = inicio; i != fim + passo; i+=passo) {
            if(tipo.equalsIgnoreCase("par")) {
                if(i % 2 == 0) {
                    System.out.println("Número par: " + i);
                }
            } else if (tipo.equalsIgnoreCase("impar")) {
                if(i % 2 != 0) {
                    System.out.println("Número ímpar: " + i);
                }

            }
        }
    }
}
