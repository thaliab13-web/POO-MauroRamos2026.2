package AssociacaoBidirecional;


public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    // produto deve ter a relação com 1 (uma) categoria
    // associação unidirecional
    private Categoria categoria; // categoria <- Produto
    private Fornecedor fornecedor;

    public Produto(int id, String nome, String descricao, double preco, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;

    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Produto: \n");
        sb.append("ID..... ").append(this.id).append(",").append("\n");
        sb.append("Nome..... ").append(this.nome).append(",").append("\n");
        sb.append("Descricao..... ").append(this.descricao).append(",").append("\n");

        sb.append("categoria..... ").append(this.categoria).append(",\n");
        sb.append("Nome fornecedor: ").append(this.fornecedor.getNome()).append("\n");

        return sb.toString();
    }
}
