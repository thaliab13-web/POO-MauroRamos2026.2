package AssosiacaoUnidirecional;

public class Main {
    static void main(String[] args) {

        Categoria categoria1  = new Categoria();
        Categoria categoria2 = new Categoria(2, "Vestuario");
        Categoria categoria3 = new Categoria(3, "Moveis");

        categoria1.setId(1);
        categoria1.setDescricao("Eletronico");
        IO.println(categoria1);

        IO.println();

        Produto produto1 = new Produto(5, "Blusa", "Regata", 25.5, categoria2);
        Produto produto2 = new Produto(6,"Sofa", "MDF", 30, categoria3);

        IO.println(produto1);
        IO.println();
        IO.println(produto2);







    }
}
