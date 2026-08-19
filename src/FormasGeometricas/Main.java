package FormasGeometricas;

public class Main {

    static void main(String[] args) {

        // Execução e construção dos objetos

        Circulo c1 = new Circulo(3);
        Quadrado q1 = new Quadrado(9);
        Triangulo t1 = new Triangulo(5.6, 6.0);

        c1.desenhar();
        IO.println("Area circulo: " + c1.calcularArea());
        IO.println();

        q1.desenhar();
        IO.println("Area circulo: " + q1.calcularArea());
        IO.println();

        t1.desenhar();
        IO.println("Area circulo: " + t1.calcularArea());


    }
}
