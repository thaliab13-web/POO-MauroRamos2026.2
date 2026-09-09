package PontoCartesiano;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }
    public double calculoDistancia(Ponto outroPonto) {
        return Math.round(Math.sqrt(Math.pow(outroPonto.getX() - this.x,2) + Math.pow(outroPonto.getY() - this.y,2)));

    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Ponto cartesiano: ").append("\n");
        sb.append("X: ").append(this.x).append("\n");
        sb.append("Y: " ).append(this.y);

        return sb.toString();
    }
}
