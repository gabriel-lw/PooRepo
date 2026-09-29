package ads.poo;

public class Endereco {

    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

    public Endereco(String numero, String bairro, String cidade, String estado, String pais, String cep){
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }

    public Endereco(Endereco endereco){
        this.numero = endereco.numero;
        this.bairro = endereco.bairro;
        this.cidade = endereco.cidade;
        this.estado = endereco.estado;
        this.pais = endereco.pais;
        this.cep = endereco.cep;

    }

}
