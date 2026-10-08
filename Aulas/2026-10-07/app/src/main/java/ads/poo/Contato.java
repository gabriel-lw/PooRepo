package ads.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {

    String nome;
    String sobrenome;
    LocalDate dataNasc;
    HashMap<String, Telefone> telefones;
    HashMap<String, Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;

    }

    public boolean addTelefone(String rotulo, String valor){

        if(telefones.get(rotulo) != null){
            return false;
        }
        telefones.put(rotulo, new Telefone(valor));
        return true;


    }

    public boolean removeTelefone(String rotulo){

        return telefones.remove(rotulo) != null;

    }

    public boolean addEmail(String rotulo, String valor){

        if(telefones.get(rotulo) != null){
            return false;
        }

        emails.put(rotulo, new Email(valor));
        return true;

    }

    public boolean removeEmail(String rotulo){
        
        return emails.remove(rotulo) != null;
    }


    public boolean updateTelefone(String rotulo, String valor){

        if(telefones.get(rotulo) == null){
            return false;
        }
        telefones.put(rotulo, new Telefone(valor));
        return true;
        


    }

    public boolean updateEmail(String rotulo, String valor){

        if(emails.get(rotulo) == null){
            return false;
        }

        emails.put(rotulo, new Email(valor));
        return true;


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contato{");
        sb.append("nome=").append(nome);
        sb.append(", sobrenome=").append(sobrenome);
        sb.append(", dataNasc=").append(dataNasc);
        sb.append(", telefones=").append(telefones);
        sb.append(", emails=").append(emails);
        sb.append('}');
        return sb.toString();
    }








}
