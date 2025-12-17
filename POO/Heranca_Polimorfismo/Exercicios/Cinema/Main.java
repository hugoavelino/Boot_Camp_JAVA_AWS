import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    public static void main(String[] args){
        Ingresso ingressoNormal = new Ingresso(new BigDecimal("20.00"), "Velozes e Furiosos", true);
        Ingresso meiaEntrada = new MeiaEntrada(new BigDecimal("20.00"), "Velozes e Furiosos", true);
        Ingresso ingressoFamiliaPequena = new IngressoFamilia(new BigDecimal("20.00"), "Velozes e Furiosos", true, 3);
        Ingresso ingressoFamiliaGrande = new IngressoFamilia(new BigDecimal("20.00"), "Velozes e Furiosos", true, 5);

        System.out.println("Valor do ingresso normal: R$ " + ingressoNormal.getValorReal());
        System.out.println("Valor do meia entrada: R$ " + meiaEntrada.getValorReal());
        System.out.println("Valor do ingresso família (3 pessoas): R$ " + ingressoFamiliaPequena.getValorReal());
        System.out.println("Valor do ingresso família (5 pessoas): R$ " + ingressoFamiliaGrande.getValorReal());
    }
}
