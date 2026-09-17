package ads.poo;

public class Livro {

    private final String ISBN;
    private String titulo;
    private String autor;
    private String anoDePublicacao;


    public Livro(String ISBN, String titulo, String autor, String anoDePublicacao) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getISBM(){
        return ISBN;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }


    public void setAnoDePublicacao(String anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
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
