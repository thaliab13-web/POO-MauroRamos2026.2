package ads.poo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.concurrent.TimeoutException;

public class Contato {

    private String nome;
    private String sobreNome;
    private LocalDate dataNasc;

    private HashMap<String, Telefone> telefones = new HashMap<>();
    private HashMap<String, Email> emails = new HashMap<>();


    public Contato(LocalDate dataNasc, String sobreNome, String nome) {
        this.dataNasc = dataNasc;
        this.sobreNome = sobreNome;
        this.nome = nome;
    }

    public boolean addTelefone(String rotulo, String valor) {

        if (!telefones.containsKey(rotulo)) {
            telefones.put(rotulo, new Telefone(valor));

            return true;
        }

        return false;
    }

    public boolean addEmail(String rotulo, String valor) {

        if(!emails.containsKey(rotulo)) {
            emails.put(rotulo, new Email(valor));
            return true;
        }
        return false;
    }

    public boolean removerTelefone(String rotulo) {

       return telefones.remove(rotulo) != null;
    }

    public boolean removerEmail(String rotulo) {

        return emails.remove(rotulo) != null;
    }


    public boolean updateTelefone(String rotulo, String valor) {

        if (telefones.containsKey(rotulo)) {
            Telefone telefoneExistente = telefones.get(rotulo);

            // modificando justamente o valor correto
            telefoneExistente.setValor(valor);

            return true;
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String valor) {

        if (emails.containsKey(rotulo)) {

            // acessando diretamente o valor
            Email emailExistente = emails.get(rotulo);

            emailExistente.setValor(valor);
            return true;

        }
        return false;

    }

    public HashMap<String, Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(HashMap<String, Telefone> telefones) {
        this.telefones = telefones;
    }

    public HashMap<String, Email> getEmails() {
        return emails;
    }

    public void setEmails(HashMap<String, Email> emails) {
        this.emails = emails;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contato{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", sobreNome='").append(sobreNome).append('\'');
        sb.append(", dataNasc=").append(dataNasc);
        sb.append(", telefones=").append(telefones);
        sb.append(", emails=").append(emails);
        sb.append('}');
        return sb.toString();
    }
}
