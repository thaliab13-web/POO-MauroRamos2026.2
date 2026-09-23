package MaoNaMassa1;

public class Modelo {
    private int id;
    private String descricao;
    private Marca marca;
    //atributo de associação unidirecional com a classe Marca


    public Modelo() {

    }

    public Modelo(Marca marca, String descricao) {
        this.marca = marca;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Modelo{");
        sb.append("id=").append(id);
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
}
