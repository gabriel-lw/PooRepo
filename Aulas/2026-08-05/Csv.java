import java.util.Scanner;

public class Csv {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        String aluno;
        
        leitor.hasNext(); //retorna bool
        

        while(leitor.hasNext()){
            aluno = leitor.nextLine();
            String[] campos = aluno.split(",");
            double media = Math.round( (Double.parseDouble(campos[1]) + Double.parseDouble(campos[2]) )/2 );
            System.out.print(campos[0]);
            if(media >= 6){
                System.out.print(": "+media+" Aprovado");
            }
            else{
                System.out.print(": "+media+" reprovado");
            }
            System.out.println();
        }

        leitor.close();

    }
}
