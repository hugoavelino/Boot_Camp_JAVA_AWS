package src;
import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Hugo Motta", "123.456.789-00", 30);
        Conta conta1 = new Conta(new BigDecimal("600.00"), cliente1);
        conta1.consultarTitular();
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
        

        
        
    }
}
