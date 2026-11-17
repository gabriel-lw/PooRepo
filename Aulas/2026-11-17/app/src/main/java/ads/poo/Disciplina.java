package ads.poo;

public class Disciplina {

    private String sigla;
    private  DiaDaSemana[] diasComAula;


    public Disciplina(String sigla, DiaDaSemana[] diasComAula) {
        this.sigla = sigla;
        this.diasComAula = diasComAula;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(sigla);
        str.append(": ");

        for (DiaDaSemana diaDaSemana : diasComAula) {
            switch (diaDaSemana) {
                case DOMINGO -> str.append("Domingo  ");
                case SEGUNDA -> str.append("Segunda-feira  ");
                case TERCA -> str.append("Terça-feira  ");
                case QUARTA -> str.append("Quarta-feira  ");
                case QUINTA -> str.append("Quinta-feira  ");
                case SEXTA -> str.append("Sexta-feira  ");
                case SABADO -> str.append("Sábado  ");
                
            }
        }


        return str.toString();
    }


    public String getSigla() {
        return sigla;
    }


    public DiaDaSemana[] getDiasComAula() {
        return diasComAula;
    }

    

    
    
    

    

}