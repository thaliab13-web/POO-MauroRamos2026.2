package Datas;

public class Main {
    static void main(String[] args) {
        Data d1 = new Data(1,1,2010);
        IO.println("toString com StringBuilder (append)");
        IO.println(d1);
        IO.println("---------------------------");
        IO.println("Data por extenso");
        IO.println(d1.imprimirExtenso());
        IO.println("---------------------------");

        Data d2 = new Data(6);
        IO.println("Construtor para dia, mes e ano ficam com o valor do padrão");
        IO.println(d2);
        IO.println("-------------------------------------------------");
       Data d3 = new Data(3,2);
        IO.println("Construtor dia e mes");
        IO.println(d3);
        d3.setDia(19);
        d3.setMes(6);
        IO.println("Dia " + d3.getDia() + " mes " + d3.getMes());

        d3.setAno(0);
        IO.println("Ano == 0");
        IO.println(d3.getAno());
        IO.println("----------------------");

        Data d4 = new Data(1,1,2020);
        IO.println(d4.mesExtenso(8));

        IO.println("Nao e bi \n " + d4.ehBissexto(2026));

        IO.println("Quantidade de dias entre " + d1 + " - " + d4 + ": "  + d1.diferencaEmDias(d4));
    }


}
