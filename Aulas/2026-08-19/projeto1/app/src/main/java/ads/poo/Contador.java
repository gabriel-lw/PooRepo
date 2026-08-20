package ads.poo;

public class Contador {

    private int valorAtual =0;

    public void incrementar(){
        valorAtual++;
    }

    public void atribuir(int valor){

        if(valor >= 0){
            valorAtual = valor;
        }
    }

    public int obterValorAtual(){

        return valorAtual;
    }
}
