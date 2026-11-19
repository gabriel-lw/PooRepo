package ads.poo;

public class CartaGrafica extends Carta {

    private double x;
    private double y;

    public String getNomeImagem(){
        return this.valor.simbulo+this.naipe+".png";
    }

    public CartaGrafica(Naipe naipe, ValorCarta valorCarta, double x, double y) {
        super(naipe, valorCarta);
        this.x = x;
        this.y = y;
    }

    /*public void desenhar(Draw draw){
        draw.picture(this.x,this.y, "cartas/"+this.getNomeImagem());
    }*/

    


}
