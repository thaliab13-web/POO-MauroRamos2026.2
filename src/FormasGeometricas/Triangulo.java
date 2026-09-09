package FormasGeometricas;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }
    public void desenhar() {
        IO.println("Desenhando triangulo");
    }

    public double calcularArea() {
        return (altura * base) / 2;
    }

}
