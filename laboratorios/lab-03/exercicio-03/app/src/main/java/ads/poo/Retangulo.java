package ads.poo;

public class Retangulo {

    
    private double largura;
    private double altura;
    private String codificacao;

    public Retangulo(){
        this.largura = 4;
        this.altura = 3;
        codificacao = "ASCII";
    }

    public Retangulo(double largura, double altura, String codificacao) {
        
        this.largura = largura;
        this.altura = altura;
        this.setCodificacao(codificacao);
        
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public String getCodificacao() {
        return codificacao;
    }

    public boolean setLargura(double largura) {

        if(largura > 0){
            this.largura = largura;
            return true;
        }else{
            return false;
        }

        
    }

    public boolean setAltura(double altura) {

        if(altura > 0){
            this.altura = altura;
            return true;
        }else{
            return false;
        }

    }

    public boolean  setCodificacao(String codificacao) {

        codificacao = codificacao.toUpperCase();
        if(codificacao.equals("UTF8") || codificacao.equals("ASCII")){
            this.codificacao = codificacao;
            return true;
        }else{
            return false;
        }
    }

    public double Area(){
        return this.getLargura() * this.getAltura();
    }

    public double Perimetro(){
        return 2*(this.getAltura() + this.getLargura());
    }

    @Override
    public String toString() {
        String representacao="";

        //código feio, depois eu arrumo

        
        if(this.codificacao.equals("ASCII")){
            for(int l=0; l<altura; l++){

                for(int c=0; c<largura; c++){
                    if(c ==0 || c == largura-1){
                        if(l == 0 || l == altura-1){
                            representacao+="+";
                        }else{
                            representacao+="|";
                        }

                        if(c == largura-1){
                            representacao+= "\n";
                        }
                    }else{
                        if(l == 0 || l == altura-1){
                            representacao+="-";
                        }else{
                            representacao+=" ";
                        }
                    }
                }
            }
        }else{
        
            for(int l=0; l<altura; l++){

                for(int c=0; c<largura; c++){
                    if(c ==0 || c == largura-1){
                        if(l == 0){
                            //cima

                            if(c ==0){
                                //esquerda cima
                                representacao+="\u250c";
                            }
                            else{
                                //direita cima
                                representacao +="\u2510";
                            }
                           
                            
                        }
                        else if(l ==altura-1){
                            //baixo

                            if(c ==0){
                                //esquerda baixo
                                representacao+="\u2514";
                            }
                            else{
                                //direita baixo
                                representacao+="\u2518";
                            }
                        }
                        else{
                            representacao+="\u2502";
                        }

                        if(c == largura-1){
                            representacao+= "\n";
                        }
                    }else{
                        if(l == 0 || l == altura-1){
                            representacao+="\u2500";
                        }else{
                            representacao+=" ";
                        }
                    }
                }
            }

        }  
        return representacao;
    }


    


    

    


    
}
