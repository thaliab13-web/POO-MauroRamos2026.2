package MaoNaMassa1;

public class Marca {
    private int id;
    private String nome;

    public Marca() {

    }
    public Marca(String nome) {
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Marca { ");
        sb.append("id: ").append(id).append("\n");
        sb.append("nome: ").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
