public class Media {
    
    //argumentos em linha de comando

    public static void main(String[] args){

        System.out.println("\n");
        if(args.length == 2){
            
            try {
                double media = (Double.parseDouble(args[0]) + Double.parseDouble(args[1]))/2;
                System.out.println("Media: " + media);
                 if(Math.round(media) >= 6.0){
                    System.out.println("aprovado");
                }
                else{
                    System.out.println("reprovado");
                 }
                
            } catch (NumberFormatException e) {
                System.out.println("entre apenas com valores númericos como argumento");
            }
            
            
        }
        else{
            System.out.println("~~voce deve fornecer exatamente dois argumentos numéricos para duas notas~~");
        }
    }
}
