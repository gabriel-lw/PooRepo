package ads.poo;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<Contato>();
    }

    public boolean addContato(Contato c){
        if(c.nome.isBlank()){
            return false;
        }

        contatos.add(c);
        return true;
    }

    public boolean findContato(String nome, String sobrenome){
        return false; ////////....
    }

}
