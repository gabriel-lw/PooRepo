package ads.poo;

public class Motor {

    String tipo;
    boolean ligado;

    Motor(String tipo){
        this.tipo = tipo;
        this.ligado = false;
    }

    public void ligarDesligar(boolean estado){
        this.ligado = estado;
    }

}
