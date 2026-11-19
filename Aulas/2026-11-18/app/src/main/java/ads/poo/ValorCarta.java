package ads.poo;



public enum ValorCarta {

    A(1, "A"),
    DOIS(2, "2"),
    TRES(3, "3"),
    QUATRO(4, "4"),
    CINCO(5, "5"),
    SEIS(6, "6"),
    SETE(7, "8"),
    OITO(8, "8"),
    NOVE(9, "9"),
    DEZ(10, "10"),
    J(11, "J"),
    Q(12, "Q"),
    K(13, "K");

    public final int valor;
    public final String simbulo;

    public static ValorCarta getPorValor(int valor){

        
        for (ValorCarta val : ValorCarta.values()) {
            if(valor == val.valor ){
                return val;

            }
            
            
        }
       
        throw new IllegalArgumentException("código inválido");
    }

    private ValorCarta(int valor, String simbulo) {
        this.valor = valor;
        this.simbulo = simbulo;
    }

    


}
