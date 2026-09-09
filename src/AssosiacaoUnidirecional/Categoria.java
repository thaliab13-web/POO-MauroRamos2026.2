package AssosiacaoUnidirecional;

public class Categoria {

    private int id;
    private String descricao;

    public Categoria() {
    }

    public Categoria(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Categoria: \n");
        sb.append("ID: ").append(this.id).append(",").append("\n");
        sb.append("Descricao: ").append(this.descricao);

        return sb.toString();
    }

}
