package PontoCartesiano;

public class Main {
    static void main(String[] args) {

        Ponto p1 = new Ponto(2.2, 3.1);
        Ponto p2 = new Ponto(1.0, 2.0);

        IO.println("Ponto 1: ");
        IO.println(p1);
        IO.println("==================");
        IO.println("Ponto 2: ");
        IO.println(p2);
        IO.println("==================");

        double distancia = p1.calculoDistancia(p2);
        IO.println("distancia entre p1 e p2 ->  " + distancia);


    }
}
