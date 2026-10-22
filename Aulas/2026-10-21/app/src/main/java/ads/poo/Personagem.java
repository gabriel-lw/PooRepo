package ads.poo;

public class Personagem {
    
    double vida;
    double dano;
    double velocidade;

    public Personagem(double dano, double velocidade, double vida) {
        this.dano = dano;
        this.velocidade = velocidade;
        this.vida = vida;
    }

    

     public String atacar(){
        return "Personagem Atacou com dano:"+dano;
    }

    public String andar(){
        return "Personagem andou com velocidade:"+velocidade;
    }










    



    public double getVida() {
        return vida;
    }



    public void setVida(double vida) {
        this.vida = vida;
    }



    public double getDano() {
        return dano;
    }



    public void setDano(double dano) {
        this.dano = dano;
    }



    public double getVelocidade() {
        return velocidade;
    }



    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }





    

    
}
