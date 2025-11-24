package Extrutura_repeticao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o divisor :");
        int divisor = scanner.nextInt();
        int dividendo;
        
        do {
            System.out.println("Digite o dividendo (0 para sair):");
            dividendo = scanner.nextInt();
            if (dividendo != 0) {
                int resultado = dividendo / divisor;
                int resto = dividendo % divisor;
                System.out.println("Resultado: " + resultado + ", Resto: " + resto);
            } else {
                System.out.println("Erro divisão por zero não é permitida.");
            }
        }while(dividendo % divisor == 0);
        scanner.close();


    }
}
