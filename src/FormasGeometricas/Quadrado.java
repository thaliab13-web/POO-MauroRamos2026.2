package FormasGeometricas;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    public void desenhar() {
        IO.println("Desenhando um quadrado");
    }

    public double calcularArea() {
        return lado * lado;
    }
}
