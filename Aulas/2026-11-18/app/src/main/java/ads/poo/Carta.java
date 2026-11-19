package ads.poo;

public class Carta {

    protected  Naipe naipe;
    protected  ValorCarta valor;

    public Carta(Naipe naipe, ValorCarta valorCarta) {
        this.naipe = naipe;
        this.valor = valorCarta;
    }

    

    public Naipe getNaipe() {
        return naipe;
    }

    public ValorCarta getValor() {
        return valor;
    }

    

    


}
