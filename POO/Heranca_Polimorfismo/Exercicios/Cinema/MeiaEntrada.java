import java.math.BigDecimal;
import java.math.RoundingMode;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(BigDecimal preco, String nomeFilme, boolean dublado) {
        super(preco, nomeFilme, dublado);
        //TODO Auto-generated constructor stub
    }

    @Override
    public BigDecimal getValorReal(){
        return super.getValorReal().divide(new BigDecimal("2"), RoundingMode.HALF_UP);

    }
    
}