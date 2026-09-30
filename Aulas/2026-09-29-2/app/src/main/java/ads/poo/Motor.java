package ads.poo;

public class Motor {

    String tipo;
    boolean ligado;

    Motor(String tipo){
        this.tipo = tipo;
    }

    public void LigarDesligar(boolean estado){
        this.ligado = estado;
    }

}
