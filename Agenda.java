package ads.poo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addContato(Contato contato) {
        if (!contatos.contains(contato)) {
            this.contatos.add(contato);
            return true;
        }
        return false;

    }

    public ArrayList<Contato> buscarContato(String nome, String sobreNome) {
        ArrayList<Contato> encontrados = new ArrayList<>();

        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome) && contato.getSobreNome().equalsIgnoreCase(sobreNome)) {
                encontrados.add(contato);

            }
        }
        return encontrados;
    }

    public boolean removerContato(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            contatos.remove(indice);
            return true;
        }
        return false;
    }

    public boolean addTelefone(String rotulo, String valor, int indice) {

        if(indice >= 0 && indice < contatos.size()) {
            var contato = contatos.get(indice);
            return contato.addTelefone(rotulo, valor);

        }
        return false;
    }

    public boolean addEmail(String rotulo, String valor, int indice) {

        if (indice >= 0 && indice < contatos.size()) {
            var contato = contatos.get(indice);
           return contato.addEmail(rotulo, valor);

        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String valor, int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            var telefoneExistente = contatos.get(indice);
            return telefoneExistente.updateTelefone(rotulo, valor);

        }
        return false;
    }

    public boolean updateEmail(String rotulo, String valor, int indice) {

        if (indice >= 0 && indice < contatos.size()) {
            var emailExistente = contatos.get(indice);
            return emailExistente.updateEmail(rotulo, valor);

        }
        return false;
    }
    public boolean removerTelefone(String rotulo, int indice) {
        if (indice>=0 && indice < contatos.size()) {
            var c = contatos.get(indice);
            return c.removerTelefone(rotulo);
        }
        return false;
    }
    public boolean removerEmail(String rotulo, int indice) {
        if (indice>=0 && indice < contatos.size()) {
            var c = contatos.get(indice);
          return  c.removerEmail(rotulo);
        }
        return false;
    }


    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agenda{");
        sb.append("contatos=").append(contatos);
        sb.append('}');
        return sb.toString();
    }
}

