package ads.poo;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;

    }

    public Data(int dia){
        
        //janeiro ate 31
        if(dia>0 && dia<=31){
            this.dia = dia;
        }else{
            this.dia = 1;
        }
        //padroes
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(int dia, int mes){

        
    }



    public boolean ehBissexto(int ano){

        if((ano %4 ==0) && (ano%100 ==0 && ano %400 ==0)){
            return true;
        }else{
            return false;
        }
    }

    

    

}
