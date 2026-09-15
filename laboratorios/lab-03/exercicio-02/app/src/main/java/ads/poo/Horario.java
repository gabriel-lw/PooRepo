package ads.poo;

import java.time.LocalTime;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    

    public Horario(int hora) {
        //deixar o limite como 23 ou 99? já que não há dias
        if(hora >= 0 && hora<=23){
            this.hora = hora;
        }else{
            this.hora = 0;
        }
    }

    public Horario(int hora, int minuto) {
        this(hora);
        if(minuto >= 0 && minuto<60){
            this.minuto = minuto;
        }
        else{
            this.minuto = 0;

        }
    }

    public Horario(int hora, int minuto, int segundo) {
        this(hora,minuto);
        if(segundo >= 0 && segundo<60){
            this.segundo = segundo;
        }else{
            this.segundo = 0;
        } 
    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if(hora >= 0 && hora<60){
            this.hora = hora;
            return true;
        }else{
            return false;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setMinuto(int minuto) {
        if(minuto >= 0 && minuto<60){
            this.minuto = minuto;
            return true;
        }else{
            return false;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public boolean setSegundo(int segundo) {
        if(segundo >= 0 && segundo<60){
            this.segundo = segundo;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {

        LocalTime horario = LocalTime.of(getHora(),getMinuto(),getSegundo());
        return horario.toString();

    }

    public long calcSegundos(){
        long total = 0;
        total += getHora()*60*60;
        total += getMinuto()*60;
        total += getSegundo();

        return total;
    }

    public static long difHorarios(Horario h1, Horario h2){

        return Math.abs( (h1.calcSegundos()) - (h2.calcSegundos()));
    }


    public String extensoHorario(){

        //ter que fazer um dicionario com os numeros e sua forma extensa
        //a partir do 21, ter que usar resto da divisão por 10 para separar 21 = 21-(21%10) e 21%10 = 20 e 1 = vinte e um
        return "";
    }

    

    

    






    

}
