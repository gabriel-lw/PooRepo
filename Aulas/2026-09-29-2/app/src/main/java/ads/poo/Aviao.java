package ads.poo;

import java.util.ArrayList;

public class Aviao {

    int maxTripulantes;
    int maxPassageiros;
    int maxCombustivel;
    boolean ligado;
    ArrayList<Motor> motores;

    public Aviao(int maxTripulantes, int maxPassageiros, int maxCombustivel, int numeroDeMotores, String tipoDeMotor){
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.ligado = false;

        for(int i =0; i <numeroDeMotores; i++){
            motores.add(new Motor(tipoDeMotor));
        }
    }

    public void ligarDesligarAviao(boolean estado){
        this.ligado = estado;
        for (Motor motor : motores) {
            motor.ligarDesligar(estado);
            
        }
    }

    // public void desligarAviao(){
    //     this.ligado = false;
    //     for (Motor motor : motores) {
    //         motor.ligarDesligar(false);
            
    //     }
   // }

    public void ligarDesligarMotorN(int n, boolean estado){
        motores.get(n).ligarDesligar(estado);
    }

    // public void desligarMotorN(int n){
    //     motores.get(n).ligarDesligar(false);
    // }

}
