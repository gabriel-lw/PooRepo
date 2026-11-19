package ads.poo;

import java.util.ArrayList;

public class Baralho {

    ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho() {

        for (Naipe naip : Naipe.values()) {
            for(int i=1; i<=13;i++){
                cartas.add(new Carta(naip, ValorCarta.getPorValor(i)));
            }
            
        }
    }
       

    

}
