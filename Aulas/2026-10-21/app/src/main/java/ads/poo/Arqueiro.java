package ads.poo;

public class Arqueiro extends Personagem{

    public  Arqueiro(){
        super(35, 2, 1);
    }

    @Override
    public String atacar(){
        return "Arqueiro Atacou com dano:"+dano;
    }

    @Override
    public String andar(){
        return "Arqueiro andou com velocidade:"+velocidade;
    }

}
