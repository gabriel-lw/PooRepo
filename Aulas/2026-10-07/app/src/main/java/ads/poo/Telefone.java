package ads.poo;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Telefone {

    String numero;

    public Telefone(String numero){
        if(numero.matches("^[0-9]")){
            this.numero = numero;

        }else{
            /// numero invalido
        }
    }


    private String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }


    @Override
    public String toString() {
        return formata("(##) #####-####", this.numero);
    }




}
