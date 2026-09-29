package ads.poo;

public class Carro {
    String marca;
    private Motor propulsor;

    public Carro(String marca, Motor motor){
        this.marca = marca;
        this.propulsor = motor;
    }

    void acelerar(int v){
        this.propulsor.Acelerar(v);
    }

}
