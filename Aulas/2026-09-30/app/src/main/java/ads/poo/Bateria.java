package ads.poo;

public class Bateria {

    int capacidadeMaxima;
    int cargaAtual;

    public Bateria(int capacidadeMaximaBateria, int cargaAtual) {
        this.capacidadeMaxima = capacidadeMaximaBateria;
        this.cargaAtual = cargaAtual;
    }

    public boolean consumirCarga(int carga){
        if(cargaAtual-carga<0){
            return false;
        }
        return true;
    }

    

}
