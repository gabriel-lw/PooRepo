package ads.poo;

public enum PlanetaDoSistemaSolar {

    Mercurio(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    public final int posicao;

    private PlanetaDoSistemaSolar(int posicao) {
        this.posicao = posicao;
    }




}
