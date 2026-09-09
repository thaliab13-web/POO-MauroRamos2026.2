package Canetas;

public class Main {
    static void main(String[] args) {

        Caneta c1 = new Caneta("preta", 0.95f, 0.5f, true);
        Caneta c2 = new Caneta("vermelha", 0.78f);
        Caneta c3 = new Caneta("azul", 0.66f, 0.4f, false);
        IO.println();
        IO.println("Caneta 1");
        IO.println("Cor: " + c1.getCor());
        IO.println("Ponta (mm): " + c1.getPonta());
        IO.println("Tampada: " + c1.isTampada());
        IO.println("Tamanho (cm) : " + c1.getTamanho());
        IO.println("Carga (%): " + c1.getCarga());
        c1.escrever("Texto para minha amada");
        c1.destampar();
        c1.escrever("Meu benzinho");
        c1.consumirCarga(1);
        IO.println("Carga %: " + c1.getCarga());
        c1.tampar();
        IO.println("Tampada: " + c1.isTampada());
        IO.println();
        IO.println("Utilizando StringBuilder " + c1);
        IO.println("=====================================");

        IO.println("Caneta 2");
        c2.setPonta(0.3f);
        c2.setTampada(true);


        IO.println("Cor: " + c2.getCor());
        IO.println("Ponta (mm): " + c2.getPonta());
        IO.println("Tampada: " + c2.isTampada());
        IO.println("Tamanho (cm): " + c2.getTamanho());
        IO.println("Carga %: " + c2.getCarga());
        c2.destampar();
        c2.pintar();
        c2.consumirCarga(5);
        IO.println("Carga %: " + c2.getCarga());
        IO.println("=====================================");

        IO.println("Caneta 3");
        IO.println("Cor: " + c3.getCor());
        IO.println("Ponta (mm): " + c3.getPonta());
        IO.println("Tampada: " + c3.isTampada());
        IO.println("Tamanho (cm):  " + c3.getTamanho());
        IO.println("Carga %: " + c3.getCarga());
        c3.escrever("Minha flor");
        IO.println("Carga %: " + c3.getCarga());
        c3.consumirCarga(10);
        IO.println("Carga %: " + c3.getCarga());

        IO.println("=====================================");







    }
}
