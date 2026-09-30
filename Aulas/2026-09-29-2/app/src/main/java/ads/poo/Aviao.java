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

        for(int i =0; i <numeroDeMotores; i++){
            motores.add(new Motor(tipoDeMotor));
        }
    }

    public void ligarAviao(){
        this.ligado = true;
        for (Motor motor : motores) {
            motor.LigarDesligar(true);
            
        }
    }

    public void desligarAviao(){
        this.ligado = false;
        for (Motor motor : motores) {
            motor.LigarDesligar(false);
            
        }
    }

    public void ligarMotorN(int n){
        motores.get(n).LigarDesligar(true);
    }

    public void desligarMotorN(int n){
        motores.get(n).LigarDesligar(false);
    }

}
