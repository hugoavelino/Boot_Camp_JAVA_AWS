import java.math.BigDecimal;
public class IngressoFamilia extends Ingresso {
    private Integer pessoas;
    public IngressoFamilia(BigDecimal preco, String nomeFilme, boolean dublado, Integer pessoas ){
        super(preco, nomeFilme, dublado);
        this.pessoas = pessoas;
    }
    @Override
    public BigDecimal getValorReal(){
        if(pessoas <=3 ){
            return super.getValorReal().multiply(new BigDecimal(pessoas));
        }else {
            BigDecimal desconto = new BigDecimal("0.05");
            BigDecimal valorComDesconto = super.getValorReal().multiply(new BigDecimal(pessoas)).multiply(new BigDecimal("1").subtract(desconto));
            return valorComDesconto;
        }
        
    }
}
