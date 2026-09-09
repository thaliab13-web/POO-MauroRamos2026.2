package FormasGeometricas;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }

    public void desenhar() {
        IO.println("Desenhando Circulo");
    }
    public double calcularArea() {
        return Math.round(Math.PI * Math.pow(raio, 2));
    }

}
