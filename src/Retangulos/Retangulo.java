package Retangulos;

public class Retangulo {
    private int largura;
    private int altura;
    private String codificacao;

    public Retangulo(int largura, int altura, String codificacao) {
        if (largura <= 0 || altura <= 0) {
            this.largura = 4;
            this.altura = 3;
        } else {
            this.largura = largura;
            this.altura = altura;
        }
        if (codificacao != null && (codificacao.equalsIgnoreCase("ASCII") || codificacao.equalsIgnoreCase("UTF"))) {
            this.codificacao = codificacao.toUpperCase();
        } else {
            this.codificacao = "ASCII";
        }
    }

    public Retangulo() {
        this.largura = 4;
        this.altura = 3;
        this.codificacao = "ASCII";
    }

    public boolean setAlterarLargura(int largura){
        if(largura > 0) {
            this.largura = largura;
            return true;
        }
            return false;

    }

    public boolean setAlterarAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        }
        return false;

    }

    public boolean setAlterarCodificacao(String codificacao) {
        if (codificacao != null && (codificacao.equalsIgnoreCase("ASCII") || codificacao.equalsIgnoreCase("UTF"))) {
            this.codificacao = codificacao.toUpperCase();
            return true;
        }
            return false;

    }
    public int getAltura() {
        return altura;
    }
    public int getLargura() {
        return largura;
    }
    public String getCodificacao() {
        return codificacao;
    }

    public int calcularArea() {
        return this.altura * this.largura;
    }

    public int calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        String topo = "+" + "-".repeat(largura) + "+\n";
        sb.append(topo);

        String miolo = "|" + " ".repeat(largura) + "|\n";
        sb.append(miolo.repeat(altura));


        String embaixo = "+" + "-".repeat(largura) + "+\n";
        sb.append(embaixo);

        return sb.toString();
    }




}
