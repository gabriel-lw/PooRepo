package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Livro {

    private final String ISBN;
    private String titulo;
    private String autor;
    private String anoDePublicacao;


    public Livro(String ISBN, String titulo, String autor, String anoDePublicacao) {
        this.ISBN = ISBN;
        if(! validarISBN(ISBN)){
            throw new IllegalArgumentException("Falha ao tentar construir objeto Livro, ISBN invalido: "+ISBN);
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getISBN(){
        return ISBN;
    }

    public static boolean validarISBN(String ISBN){
        if(ISBN.length() == 12){
            for(char c : ISBN.toCharArray()){
                if(!Character.isDigit(c)){
                    System.out.println("---ISBN DEVE CONTER APENAS DIGITOS---");
                    return false;
                }
                    
            }
            return true;

        }else{
            System.out.println("---ISBN DEVE CONTER 12 ALGARISMOS---");
            return false;
        }

    }


    public String getTitulo() {
        return titulo;
    }


    public boolean setTitulo(String titulo) {

        if(! titulo.isBlank()){
            this.titulo = titulo;
            return true;
        }else{
            
            System.out.println("---NOME DO LIVRO NÃO PODE SER VAZIO---");
            return false;

        }
        
        //fazer as verificações e retornar um boolean
    }


    public String getAutor() {
        return autor;
    }


    public boolean setAutor(String autor) {
        if(! autor.isBlank()){
            this.autor = titulo;
            return true;
        }else{
            System.out.println("---NOME DO AUTOR NÃO PODE SER VAZIO---");
            return false;
        }
    }


    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }


    public boolean setAnoDePublicacao(String anoDePublicacao) {
        
        
        final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

        if(! anoDePublicacao.isBlank()){
            this.anoDePublicacao = anoDePublicacao;
            try {
                LocalDate.parse(anoDePublicacao, FORMATADOR);
                return true;
            } catch (DateTimeParseException | NullPointerException e) {
                System.out.println("---DATA INVÁLIDA---");
                return false;
            }
           
        }else{
            System.out.println("---DATA NÃO PODE SER VAZIA---");
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("ISBN=").append(ISBN);
        sb.append(", titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", anoDePublicacao=").append(anoDePublicacao);
        sb.append('}');
        return sb.toString();
    }


    

    

}