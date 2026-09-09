package Retangulos;

public class Main {
    static void main(String[] args) {

        Retangulo r1 = new Retangulo(5,10, "pp");
        IO.println("primeiro");
        IO.println(r1);

        r1.setAlterarAltura(3);
        r1.setAlterarLargura(4);
        IO.println(r1);

        IO.println("Area: " + r1.calcularArea());
        IO.println("Perimetro: " + r1.calcularPerimetro());
        IO.println(r1.getCodificacao());
        IO.println("Altura: " + r1.getAltura());
        IO.println("Largura: " + r1.getLargura());

        Retangulo r2 = new Retangulo();
        IO.println();
        IO.println("segundo construtor");
        IO.println(r2);
        IO.println(r2.calcularArea());
        IO.println(r2.calcularPerimetro());
        r2.setAlterarAltura(6);
        r2.setAlterarLargura(4);
        r2.setAlterarCodificacao("utf");
        IO.println("Altura: " + r2.getAltura());
        IO.println("Largura: " + r2.getLargura());
        IO.println("Codi: " + r2.getCodificacao());
        IO.println(r2);

    }
}
