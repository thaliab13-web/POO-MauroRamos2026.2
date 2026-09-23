package AssociacaoBidirecional;

import PontoCartesiano.Ponto;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private int id;
    private String nome;
    private String email;
    private String fone;

    private List<Produto> produtos = new ArrayList<>();
    // Associação Bidirecional 0..* fornecedor pode ter nenhum ou muitos produtos, e produtos pertence a 1 fornecedor


    public Fornecedor() {
    }

    public Fornecedor(int id, String fone, String email, String nome) {
        this.id = id;
        this.fone = fone;
        this.email = email;
        this.nome = nome;
    }

    public void addProdutos(Produto produto) {
        produtos.add(produto);
        produto.setFornecedor(this);
    }

    public void removerProdutos(Produto produto) {
        produtos.remove(produto);
        produto.setFornecedor(null);
        // se remove o produto fica sem fornecedor
    }

    public void transferir(Fornecedor novoFornecedor, Produto produto) {
        this.produtos.remove(produto);
        novoFornecedor.getProdutos().add(produto);
        produto.setFornecedor(novoFornecedor);
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("Fornecedor: \n");
        sb.append("ID: ").append(this.id).append(",").append("\n");
        sb.append("Nome: ").append(this.nome).append(",").append("\n");
        sb.append("email: ").append(this.email).append(",").append("\n");
        sb.append("fone: ").append(this.fone).append(",\n");
        sb.append(produtos);

        return sb.toString();
    }
}
