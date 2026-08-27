package org.example;

public class Pessoa {
    private int id;
    private static int countID= 0;
    private String nome;
    private String email;

    public Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
        increaseCounter();
        this.id = countID;
        
        
    }

    public static int getCountID(){
        return countID;
    }

    private void increaseCounter(){
        countID++;
    }

    public int getId() {
        return id;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ");
        sb.append(this.id);
        sb.append("\nNome: ");
        sb.append(this.nome);
        sb.append("\nEmail: ");
        sb.append(this.email);

        //ou usar string format

        return sb.toString();
    }
}
