import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro1 = new Carro();
        String opcao;
        
        do {System.out.println("Escolha a função do carro: \n 1 - Ligar\n 2 - Acelerar\n 3 - Frear\n 4 - Virar\n 5 - Desligar \n");
        opcao = scanner.nextLine();
        switch (opcao) {
            case "1":
                carro1.ligar();
                break;
            case "2":
                carro1.acelerar();
                break;
            case "3":
                carro1.frear();
                break;
            case "4":
                System.out.println("Para qual lado deseja virar? (esquerda/direita)");
                String direcao = scanner.nextLine();
                carro1.virar(direcao);
                break;
            case "5":
                carro1.desligar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }while(!opcao.equals("5"));
    }
}
