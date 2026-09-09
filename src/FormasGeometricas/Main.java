package FormasGeometricas;

public class Main {

    static void main(String[] args) {

        Quadrado q1 = new Quadrado(15.5);
        Triangulo t1 = new Triangulo(11.2,6.47);
        Circulo c1 = new Circulo(5.56);

        q1.desenhar();
        IO.println("Lado -> " + q1.getLado());
        IO.println("Area -> " + q1.calcularArea());
        IO.println("===================================");
        IO.println();


        t1.desenhar();
        IO.println("Base -> " + t1.getBase());
        IO.println("Altura -> " + t1.getAltura());
        IO.println("Area -> " + t1.calcularArea());
        IO.println("===================================");
        IO.println();

        c1.desenhar();
        IO.println("Raio -> " + c1.getRaio());
        IO.println("Area -> " + c1.calcularArea());
        IO.println("===================================");


    }
}
