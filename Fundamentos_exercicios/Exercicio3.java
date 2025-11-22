package Fundamentos_exercicios;

import java.util.Scanner;

public class Exercicio3 {


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        int base = scanner.nextInt();
        System.out.println("Digite o valor da altura: ");
        int altura = scanner.nextInt();
        scanner.close();
        int area = base * altura;
        System.out.printf("A area do triangulo fornecido é:%d", area);
    }
    
}
