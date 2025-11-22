package Fundamentos_exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado: ");
        int lado = scanner.nextInt();
        int resultado = lado * lado;
        System.out.printf("A area do quadro que você informou é %d;", resultado);
    }
}
