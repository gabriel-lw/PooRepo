package ads.poo;

public class Cavaleiro extends Personagem{

    public  Cavaleiro(){
        super(50, 3, 2);
    }

    @Override
    public String atacar(){
        return "Cavaleiro Atacou com dano:"+dano;
    }

    @Override
    public String andar(){
        return "Cavaleiro andou com velocidade:"+velocidade;
    }

}
