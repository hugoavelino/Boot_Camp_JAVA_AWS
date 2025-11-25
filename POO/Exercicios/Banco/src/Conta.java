package src;

import java.math.BigDecimal;

public class Conta {
    //Atributos
    private BigDecimal saldo;
    private BigDecimal chequeEspecial;
    private Cliente titular;


    public Conta(BigDecimal saldo, Cliente titular){
        this.saldo = saldo;
        this.titular = titular;
        if (saldo.compareTo(new BigDecimal("500.00")) <= 0) {
            this.chequeEspecial = new BigDecimal("50.00");
        }else{
            this.chequeEspecial = saldo.multiply(new BigDecimal ("0.50"));
        }
        

    }


    //Métodos Acessores
    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + saldo); 
    }
    public void consultarChequeEspecial() {
        System.out.println("Seu limite de cheque especial é: " + chequeEspecial);
    }
    public void consultarTitular() {
        System.out.println("O nome do titular da conta é: " + titular.getNome());
    }

    //Métodos Modificadores

    //Metódo sacar
    public void sacar(BigDecimal valor) {
        BigDecimal saldoTotalDisponivel = saldo.add(chequeEspecial);
        if(saldoTotalDisponivel.compareTo(valor)>=0){
            this.saldo = this.saldo.subtract(valor);
            System.out.println("Saque realizado com sucesso. Saldo atual: " + this.saldo);
        }else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    //Método depositar
    public void depositar(BigDecimal valor){
        if(usandoChequeEspecial()){
            BigDecimal divida = saldo.abs();
            BigDecimal taxa = divida.multiply(new BigDecimal("0.20"));
            valor = valor.subtract(taxa);
            System.out.println("Taxa de 20% cobrada com sucesso. " + taxa + " foi deduzida do valor depositado.");
        }
        this.saldo = this.saldo.add(valor);
    }

    //Método pagar boleto
    public void pagarBoleto(BigDecimal valor) {
        sacar(valor);
    }

    //Verificar se está usando cheque especial
    public boolean usandoChequeEspecial() {
        return saldo.compareTo(BigDecimal.ZERO) < 0;
    }

    
}
