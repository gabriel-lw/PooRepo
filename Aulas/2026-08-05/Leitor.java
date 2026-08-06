import java.util.Scanner;
public class Leitor {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String linha;
        
        leitor.hasNext(); //retorna bool
        

        while(leitor.hasNext()){
            linha = leitor.nextLine();
            System.out.println(linha);
        }







        // //CSV
        // String aluno = "gabriel,10,10"
        // String[] campos = aluno.split(",");











        leitor.close();
    }
}
