package FormasGeometricas;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    public void setLado(double l) {
        this.lado = l;
    }
    public double getLado() {
        return lado;
    }

   public void desenhar() {
       IO.println("Desenhando quadrado");
   }
    public double calcularArea() {
        return lado * lado;
    }
}
