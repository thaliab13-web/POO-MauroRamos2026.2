package Robos;

public class Robo {

    private String nome;
    private final int ID;
    private static int contador = 1;

    public Robo(String nome) {
        this.nome = nome;
        this.ID = contador++;
        // contador é incrementado toda vez que robo é instaciando
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public int getID() {
        return ID;
    }

    // metodo com static fala diretamente da classe e não do objeto

    public static int getTotalObjetosCriado() {
        return contador;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Robo ").append("{ \n ");
        sb.append("Nome: ").append(this.nome).append("\n ");
        sb.append("ID: ").append(this.ID).append("\n ");
        sb.append(" \n}");

        return sb.toString();
    }



}
