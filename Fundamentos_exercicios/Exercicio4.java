package Fundamentos_exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String pessoa1_nome = scanner.nextLine();

        System.out.println("Digite a idade da primeira pessoa");
        int pessoa1_idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        String pessoa2_nome = scanner.nextLine();

        System.out.println("Digite a idade da segunda pessoa");
        int pessoa2_idade = scanner.nextInt();

        if ( pessoa1_idade > pessoa2_idade){
            System.out.printf("O ser humano de nome %s é %d anos mais velha que o ser humano de nome %s.\n", pessoa1_nome, (pessoa1_idade - pessoa2_idade), pessoa2_nome );
        }else if(pessoa2_idade > pessoa1_idade) {
            System.out.printf("O ser humano de nome %s é %d anos mais velha que o ser humano de nome %s.\n", pessoa2_nome, (pessoa2_idade - pessoa1_idade), pessoa1_nome );
        }else {
            System.out.println("Os dois tem a mesma idade!!!");
        }
    }
}
