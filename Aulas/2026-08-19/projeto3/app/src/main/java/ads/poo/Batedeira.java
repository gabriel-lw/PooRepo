package ads.poo;

public class Batedeira {

    private String espatula = "padrão";
    private boolean ligada =false;


    public boolean retornarEstado(){
        return ligada;
    }

    public String retornarEspatula(){
        return espatula;
    }

    public void ligarDesligar(){
        
        ligada = ! ligada;
    }

    public boolean bater(){
        return ligada;
    }

    public void trocarEspatula(String espatula){
        
        if( ! espatula.isEmpty() && ! ligada){
            this.espatula = espatula;
        }
    }
}
