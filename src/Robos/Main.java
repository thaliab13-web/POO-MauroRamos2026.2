package Robos;

public class Main {
    static void main(String[] args) {

        Robo r1 = new Robo("ze");
        Robo r2 = new Robo("lulu");
        Robo r3 = new Robo("fefe");
        Robo r4 = new Robo("cu");
        Robo r5 = new Robo("po");
        Robo r6 = new Robo("ll");
        Robo r7 = new Robo("iop");
        Robo r8 = new Robo("poi");

        int total = Robo.getTotalObjetosCriado();
        IO.println("Total de robos criado com essa clase Robo \n" + total);

        IO.println("ID do r8\n " + r8.getID());

        IO.println(r8);

        IO.println(r7.getNome());
        r4.setNome("manu");
        IO.println(r4.getNome());
    }
}
