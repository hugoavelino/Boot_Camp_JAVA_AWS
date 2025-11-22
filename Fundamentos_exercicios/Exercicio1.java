package Fundamentos_exercicios;
import java.util.Scanner;

public class Exercicio1 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        String anoNascimento = scanner.nextLine();

        scanner.close();

        System.out.printf("Olá %s você tem %s anos ", nome, anoNascimento);
    
      
    }
}
