public class Carro {
    private Boolean ligado;
    private Integer velocidade;
    private Integer marcha;
    private final Integer velocidadeMaxima = 120;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    // Getters
    public Boolean getLigado() {
        return ligado;
    }
    public Integer getVelocidade() {
        return velocidade;
    }
    public Integer getMarcha() {
        return marcha;
    }

    //Métodos
    public void virar(String direcao){
        if(this.velocidade > 0 && this.velocidade <=40)
            System.out.println("Virando para a " + direcao);
        else
            System.out.println("Velocidade insuficiente para virar.");

    }
    public void ligar() {
        if (this.ligado == false){
            this.ligado = true;
            System.out.println("Carro ligado.");
        }else{
            System.out.println("O carro já está ligado.");
        }
    }
    public void desligar(){
        if(this.velocidade==0 && this.marcha==0){
            this.ligado = false;
            System.out.println("Carro desligado.");
        }else{
            System.out.println("Não é possível desligar o carro em movimento ou em marcha.");
        }
    }

    public void acelerar(){
        if(this.ligado && this.velocidade < velocidadeMaxima){
                this.velocidade += 1;
                atualizarMarcha();
                System.out.println("Carro acelerado. Velocidade atual: " + this.velocidade + " km/h, Marcha: " + this.marcha);         
            }else{
                System.out.println("Não é possível acelerar. Verifique se o carro está ligado ou se atingiu a velocidade máxima.");
            }
        }
    
    public void frear(){
        if(this.ligado && this.velocidade > 0){
                this.velocidade -= 1;
                atualizarMarcha(); 
                System.out.println("Carro freado. Velocidade atual: " + this.velocidade + " km/h, Marcha: " + this.marcha);             
        }else{
            System.out.println("Não é possível frear. Verifique se o carro está ligado ou se já está parado.");
        }
    }



    public void atualizarMarcha(){
        if(this.velocidade == 0){
            this.marcha = 0;
        } else if(this.velocidade > 0 && this.velocidade <= 20){
            this.marcha = 1;
        } else if(this.velocidade > 20 && this.velocidade <= 40){
            this.marcha = 2;
        } else if(this.velocidade > 40 && this.velocidade <= 60){
            this.marcha = 3;
        } else if(this.velocidade > 60 && this.velocidade <= 80){
            this.marcha = 4;
        } else if(this.velocidade > 80 && this.velocidade <= 100){
            this.marcha = 5;
        } else{
            this.marcha = 6;
        }

    }
}