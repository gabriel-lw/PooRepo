package ads.poo;

public class Aldeao extends Personagem{

    public  Aldeao(){
        super(25, 1, 0.8);
    }

    @Override 
    public String atacar(){
        return "Aldeao Atacou com dano:"+dano;
    }

    @Override 
    public String andar(){
        return "Aldeao andou com velocidade:"+velocidade;
    }


    

}