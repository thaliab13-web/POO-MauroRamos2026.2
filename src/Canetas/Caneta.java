package Canetas;

public class Caneta {
    private String cor;
    private float ponta;
    private int carga = 100;
    private boolean tampada;
    private float tamanho;

    ///sobrecarga overloading
    public Caneta(String cor,float tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }
    public Caneta(String cor,float tamanho, float ponta, boolean tampada) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.ponta = ponta;
        this.tampada = tampada;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public String getCor() {
        return cor;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public float getTamanho() {
        return tamanho;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    public float getPonta() {
        return ponta;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public boolean isTampada() {
        return tampada;
    }

    public void escrever(String texto){
        if(tampada) {
            IO.println("Nao pode escrever, esta tampada");
        } else if (carga > 0) {
            IO.println("escrevendo: " + texto);
            consumirCarga(1);
        } else {
            IO.println("sem carga para escrever " + carga);
        }
    }

    public void pintar() {
        if(tampada) {
            IO.println("Nao pode escrever, esta tampada");
        } else if (carga > 0) {
            IO.println("pintando com a cor " + this.cor);
            consumirCarga(2);
        } else {
            IO.println("sem carga para pintar " + carga);
        }
    }
    public void tampar() {
        this.tampada = true;
        IO.println("tampada");
    }

    public void destampar() {
        this.tampada = false;
        IO.println("destampada");
    }
    public void consumirCarga(int qtd) {
        this.carga -= qtd;
    }
    public int getCarga() {
        return carga;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caneta { ").append(" \n ");
        sb.append("Cor: ").append(this.cor).append(" \n ");
        sb.append("Ponta: ").append(this.ponta).append(" \n ");
        sb.append("Tampada: ").append(this.tampada);
        sb.append(" \n }");
        return sb.toString();
    }
}
