package FormasGeometricas;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void desenhar() {
        IO.println("Desenhando um circulo");
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
