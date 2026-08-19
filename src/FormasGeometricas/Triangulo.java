package FormasGeometricas;

public class Triangulo {
    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public void desenhar() {
        IO.println("Desenhando um triangulo");
    }

    public double calcularArea() {
        return (altura * base) / 2;
    }

}
