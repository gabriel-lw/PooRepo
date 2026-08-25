package org.example;

public class Caneta {
    private String cor;
    private int nivelTinta;
    private final double CONSUMO_POR_UNIDADE = 0.01;

    public Caneta(){
        this("azul", 100);
    }

    public Caneta(int nivelTinta){
        
        this("azul", nivelTinta);
    }


    public Caneta(String cor, int nivelTinta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }


    public String getCor() {
        return cor;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    public double desenhar(int x1, int y1, int x2, int y2){

        double distancia = 0;

        if(x1 == x2 || y1 == y2){
            //em alguma reta
            if(x1 == x2){
                distancia = y2-y1;
            }
            else{
                distancia = x2-x1;
            }

        }else{
            //diagonal
            //usar pitágoras
            distancia = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)));
        }

        if((getNivelTinta() - distancia * CONSUMO_POR_UNIDADE) >= 0 ){

                return (distancia * 0.01);

            }
            else{
                return -1;
            }
    }

    

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();

        sb.append("cor: ");
        sb.append(cor);
        sb.append("\n");
        sb.append("nivel de Tinta: ");
        sb.append(nivelTinta);

        return sb.toString();


    }

   

    



}
