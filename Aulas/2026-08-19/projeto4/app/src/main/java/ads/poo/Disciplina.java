package ads.poo;

public class Disciplina {

    private String nome;
    private String codigo;
    private String unidadeResponsavel;
    private String[] docentes;
    private int cargaHorariaTotal;
    private int cargaHorariaTeorica;
    private int cargaHorariaPratica;

    //metodos para alterar os campos
    public Disciplina(String nome, String codigo, String unidadeResponsavel, String[] docentes, int cargaHorariaTeorica, int cargaHorariaPratica)
    {
        this.nome = nome;
        ////.....
        cargaHorariaTotal = cargaHorariaPratica + cargaHorariaTeorica;

    }

    

    
}
