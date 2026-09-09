package HorarioData;

public class Main {
    static void main(String[]args) {

        Horario h1 = new Horario();
        IO.println("Construtor padrao");
        IO.println(h1);
        h1.emSegundo();
        IO.println("==========================");

        Horario h2 = new Horario(2);
        IO.println("Construtor Hora");
        IO.println(h2);

        IO.println("==========================");
        IO.println("Construtor hora e minuto");
        Horario h3 = new Horario(5, 3);
        IO.println(h3);
        IO.println(h3.porExtenso());

        IO.println("==========================");
        IO.println("Construtor hora, minuto e segundo");
        Horario h4 = new Horario(19,25,33);
        IO.println(h4);
        IO.println(h4.emSegundo());
        IO.println(h4.porExtenso());
        IO.println(h4 + " em segundos " + h4.emSegundo());
        IO.println("Diferenca entre: " + h3 + " e " + h4 + " é " + h3.diferenca(h4));
        IO.println("==========================");
        IO.println("Construtor hora, minuto e segundo");
        Horario h5 = new Horario(13,30,55);
        IO.println(h5);
        IO.println(h5.porExtenso());
        IO.println(h5.emSegundo());
        IO.println(h5.diferenca(h4));

    }
}
