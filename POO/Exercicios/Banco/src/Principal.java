package src;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Cliente cliente1 = new Cliente("Hugo Motta", "123.456.789-00", 30);
        Conta conta1 = new Conta(new BigDecimal("600.00"), cliente1);
        /*conta1.consultarTitular();
        conta1.consultarSaldo();
        conta1.consultarChequeEspecial();
        conta1.depositar(new BigDecimal("100.00"));
        conta1.consultarSaldo();
        conta1.sacar(new BigDecimal("800.00"));
        conta1.consultarChequeEspecial();
        conta1.depositar(new BigDecimal("200.00"));
        conta1.consultarSaldo();
        conta1.pagarBoleto(new BigDecimal("75.00"));
        conta1.consultarSaldo();
        */

        
        String opcao ;
        do {
        System.out.println("Escolha uma opção:\n 1-CONSULTAR SALDO \n 2-SACAR \n 3-DEPOSITAR \n 4-PAGAR BOLETO \n 5-SAIR ");
        opcao = scanner.nextLine();
        
        switch (opcao) {
            case "1":
                conta1.consultarSaldo();
                break;
            case "2":
                System.out.println("Digite o valor desejado");
                BigDecimal valorSacar = scanner.nextBigDecimal();
                scanner.nextLine();
                conta1.sacar(valorSacar);
                break;
            case "3":
                System.out.println("Digite o valor do deposito");
                BigDecimal valorDeposito = scanner.nextBigDecimal();
                scanner.nextLine();
                conta1.depositar(valorDeposito);
                break;
            case "4":
                System.out.println("Digite o valor do boleto");
                BigDecimal valorBoleto = scanner.nextBigDecimal();
                scanner.nextLine();
                conta1.pagarBoleto(valorBoleto);
                break;
            case "5":
                System.out.printf("Obrigado %s por usar o Motta's Bank!!", cliente1.getNome());
                //System.exit(0);
                break;
                
            default:
                System.out.println("Digite uma opção válida!!");
                break;
        }
    } while (!opcao.equals("5"));
    scanner.close();
       
    }
}
