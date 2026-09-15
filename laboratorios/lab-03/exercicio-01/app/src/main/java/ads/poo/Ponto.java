package ads.poo;

public class Ponto {
    private double x;
    private double y;
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ponto(");
        sb.append(x).append(",");
        sb.append(y);
        sb.append(')');
        return sb.toString();
    }

    public static double distanciaPontos(Ponto a, Ponto b){

        double distancia = Math.sqrt((Math.pow(b.getX()-a.getX(), 2)) + (Math.pow(b.getY()-a.getY(), 2)));
        return distancia;
    }


    


    
}
