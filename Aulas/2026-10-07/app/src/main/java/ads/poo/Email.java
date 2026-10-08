package ads.poo;

public class Email {

    String email;

    public Email(String email){

        if(email.matches( "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$")){
            this.email = email;
        }
    }

    @Override
    public String toString() {
        
        return email;
    }

    

}
