package ads.poo;

public class Personagem {

    private String nome;
    private double vidaMaxima;
    private double vidaAtual;
    private double danoBase;

    public Personagem(String nome, int vidaMaxima, int danoBase) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.danoBase = danoBase;
        this.vidaAtual = vidaMaxima;
    }

    

    public void Curar(double cura){

        vidaAtual = Math.min(vidaAtual+cura, vidaMaxima);
    }

    public double Atacar(){
        return danoBase;
    }

    public void definirNome(String nome){
        if( ! nome.isEmpty()){
            this.nome = nome;
        }
    }

    public String obterNome(){
        return nome;
    }
}
