
import java.math.BigDecimal;

public class Ingresso {
    private BigDecimal preco;
    private String nomeFilme;
    private boolean dublado;

    public Ingresso(BigDecimal preco, String nomeFilme, boolean dublado){
        this.preco = preco;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public BigDecimal getValorReal() {
        return this.preco;
    }
}