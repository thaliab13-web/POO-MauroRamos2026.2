package ads.poo;

public class App {
    private Agenda agenda;

    public App() {
        this.agenda = new Agenda();
    }

    void menu() {
        int opcao;

        do {
            IO.println("1 - Adicionar ");
            IO.println("2 - Remover ");
            IO.println("3 - Atualizar ");
            IO.println("4 - Listar contato ");
            IO.println("5 - Listar todos contatos ");
            IO.println("6 - sair");
             opcao = Integer.parseInt("opcao: ");

             switch (opcao) {
                 case 1 -> ;
             }


        } while (opcao != 6);
    }
}
