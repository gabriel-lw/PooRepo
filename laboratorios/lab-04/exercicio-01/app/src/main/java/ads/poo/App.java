
package ads.poo;

import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;

public class App {
   
    static HashMap<String, Livro> livrosCadastrados = new HashMap<>();

    public static void main(String[] args) {
       ///
       /// //
       /// //
       /// /
       
  
       App app = new  App();
       String op;
       do {
            System.out.println("\n\n");
            System.out.println("~~~~~~~~~~EXECUTAR AÇÃO~~~~~~~~~~");
            System.out.println("=".repeat(35));
            System.out.println(""" 
            1- Cadastrar Livro
            2- Remover Livro
            3- Atualizar livro
            4- Consultar ISBN
            5- Listar ISBN e Titulo
            6- Codigo de barras ISBN

            0 - exit
             ...
            """);
            op = IO.readln("~~~Opção: ");

            switch (op) {
                case "1"-> app.cadastrarLivro();
                case "2"-> app.removerLivro();
                case "3"-> app.atualizarLivro();
                case "4"-> app.consultarLivroISBN();
                case "5"-> app.listarIsbnETitulo();
                case "6"-> app.codigoDeBarrasISBN();
                case "0"-> System.out.println("\nAdeus!");
                        
                default ->
                    System.out.println("---OPÇÃO INVÁLIDA---");
            }
           
       } while (! op.equals("0"));
    }




    public void cadastrarLivro(){
        String ISBN = "";
        System.out.println("");
        System.out.println("~~~~~~~~~~CADASTRAR LIVRO~~~~~~~~~~");
        System.out.println("=".repeat(35));
        do {
            ISBN = IO.readln("ISBN: ");
            if (Livro.validarISBN(ISBN)){
                if(! livrosCadastrados.containsKey(ISBN)){
                    break;
                }else{
                    System.out.println("---ERRO: ISBN JÁ CADASTRADO---");
                }
            }
            
        } while (true);
        Livro livro = new Livro(ISBN, "", "", "");

        String titulo ="";
        do {titulo = IO.readln("Titulo: ");} while (! livro.setTitulo(titulo));
    
        String autor="";
        do {autor = IO.readln("Autor: ");}while(! livro.setAutor(autor));

       
        String dataDePublicacao = "";
        do {dataDePublicacao = IO.readln("Data de publicação(dd/mm/aa): ");} while (! livro.setAnoDePublicacao(dataDePublicacao));

        System.out.println("");
        livrosCadastrados.put(ISBN, livro);
        System.out.println("=".repeat(35));
        System.out.println("LIVRO CADASTRADO COM SUCESSO!");
        System.out.println("=".repeat(35));
    }

    public void removerLivro(){

        String ISBN;
        System.out.println("\n~~~~~~~~~~~REMOVER LIVRO~~~~~~~~~~~");
        System.out.println("=".repeat(35));
        do { 
            ISBN = IO.readln("ISBN do livro: ");
            if(Livro.validarISBN(ISBN)); //dá mais informações do erro se houver

        } while (livrosCadastrados.get(ISBN) == null); // ou usar contains key

        livrosCadastrados.remove(ISBN);
        System.out.println("=".repeat(35));
        System.out.println("Livro Removido!");
        System.out.println("=".repeat(35));
        
    }

    public void listarIsbnETitulo(){
        
       
        System.out.println("\n~~~~~~~~~~LISTA DE LIVROS~~~~~~~~~~");
        System.out.println("=".repeat(35));

        livrosCadastrados.forEach((k,v) -> System.out.println("ISBN:"+k+"  Título: "+v.getTitulo()));
        System.out.println("=".repeat(35));
    }

    public void consultarLivroISBN(){
        
        String ISBN;
        boolean consultando = true;
        System.out.println("");
        System.out.println("~~~~~~~~~~CONSULTAR LIVRO~~~~~~~~~~");
        System.out.println("=".repeat(35));
        
        do{
            ISBN = IO.readln("ISBN do livro:");
            if(livrosCadastrados.get(ISBN) != null){
                Livro livro = livrosCadastrados.get(ISBN);
                System.out.println(livro);
                consultando = false;
            }else{
                System.out.println("ISBN não encontrado!");
                consultando = (IO.readln("deseja tentar novamente?(y/n)").equals("y")? true:false);
            }
        }while(consultando);
    }

    public void consultarLivroAutor(){

        System.out.println("");
        System.out.println("~~~~~~~~~~CONSULTAR LIVRO~~~~~~~~~~");
        System.out.println("=".repeat(35));
        String autor = IO.readln("Autor:");
        livrosCadastrados.forEach((k,v) -> {
            if(v.getAutor().equals(autor)){
                System.out.println("ISBN:"+k+"  Título: "+v.getTitulo());
            }
        });
    }

    public void consultarAno(String anoDePublicação){

        livrosCadastrados.forEach((k,v) -> {
            if(v.getAnoDePublicacao().equals(anoDePublicação)){
                System.out.println("ISBN:"+k+"  Título: "+v.getTitulo());
            }
        });
    }

    public void atualizarLivro(){

        boolean atualizando = true;
        while(atualizando){
            System.out.println();
            System.out.println("=".repeat(35));
            String ISBN = IO.readln("ISBN do livro: ");
            if(livrosCadastrados.get(ISBN) != null){

                
                String novoTitulo = IO.readln("novo titulo: ");
                String novoAutor = IO.readln("novo autor: ");
                String novaData = IO.readln("Data de Publicação(dd/mm/yy): ");

                //funciona pra white space e vazio
                if(novoTitulo.isBlank() || novoAutor.isBlank() || novaData.isBlank()){
                    System.out.println("Dados inválidos");
                }
                else{
                    livrosCadastrados.get(ISBN).setTitulo(novoTitulo);
                    livrosCadastrados.get(ISBN).setAutor(novoAutor);
                    livrosCadastrados.get(ISBN).setAnoDePublicacao(novaData);
                    atualizando = false;
                }             

            }else{
                System.out.println("ISBN não encontrado!");
                atualizando = (IO.readln("deseja tentar novamente?(y/n)").equals("y")? true:false);
            } 
        }
    }

    public void codigoDeBarrasISBN(){

        int largura = 105;
        int altura = 5;
        String isbn ="";
        do { 
             isbn = IO.readln("ISBN: ");
        } while (! Livro.validarISBN(isbn));


        EAN13Writer writer = new EAN13Writer();
        // Gera a matriz de bits para o formato EAN_13
        BitMatrix bitMatrix = writer.encode(isbn, BarcodeFormat.EAN_13, largura, 1);
        // Renderiza o código de barras usando blocos cheios █ e espaços em branco
        // https://www.unicodepedia.com/unicode/block-elements/2588/full-block/
        for (int i = 0; i < altura; i++) {
        for (int x = 0; x < bitMatrix.getWidth(); x++) {
        if (bitMatrix.get(x, 0)) {
        System.out.print("\u2588");
        } else {
        System.out.print(" ");
        }
        }
        System.out.println(); // Quebra de linha para a próxima camada da barra
        }
        System.out.println("ISBN-13: " + isbn);


    }
}
