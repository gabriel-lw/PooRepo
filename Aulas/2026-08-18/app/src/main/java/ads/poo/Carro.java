package ads.poo;

public class Carro {

    //atributos
    private int velocidadeAtual;
    private int velocidadeMaxima = 100;

    public void acelerar(int incremento){

        if(velocidadeAtual + incremento <= velocidadeMaxima){
            velocidadeAtual += incremento;
    
        }
        else{
            velocidadeAtual += velocidadeMaxima - velocidadeAtual;
        }
        

        
    }
    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

}
