package ads.poo;

public class Motor {
    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor(int hp, int cilindros){
        this.hp = hp;
        this.cilindros = cilindros;
    }

    public void Acelerar(int v){
        this.giroAtual += v;
    }

}
