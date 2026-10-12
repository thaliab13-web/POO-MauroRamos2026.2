package ads.poo.PrimeiraProva;

public class Conta {
    private  final int numConta;
    private final String nome;
    private double saldoInicial;


    public Conta(int numConta, String nome, double  saldoInicial) {
        this.numConta = numConta;
        this.nome = nome;

        if (saldoInicial > 0) {
                this.saldoInicial = saldoInicial;
        } else {
            throw new IllegalArgumentException("erro");
        }
    }

    public void depositar(int valor) {
        if (valor > 0) {
            this.saldoInicial =+ valor;
        }
    }

    public void sacar(int valor) {
        if (valor > 0 && valor <= saldoInicial) {
            this.saldoInicial -= valor;
        }
    }
    public void setSaldoInicial(double saldoInicial) {
        if (saldoInicial > 0) {
            this.saldoInicial = saldoInicial;
        }
    }


    public int getNumConta() {
        return numConta;
    }
    public String getNome(){
        return nome;
    }
    public double getSaldoInicial() {
        return saldoInicial;
    }
    @Override
    public String toString() {

        final StringBuilder  sb = new StringBuilder("Conta Bancaria ");

        sb.append("\n").append(" { \n");
        sb.append("Numero da conta..........:").append(numConta).append("\n");
        sb.append("Titular..................:").append(nome).append("\n");
        sb.append("Saldo....................:").append(saldoInicial).append("\n");
        sb.append("\n").append(" } \n");

        return sb.toString();
    }

}
