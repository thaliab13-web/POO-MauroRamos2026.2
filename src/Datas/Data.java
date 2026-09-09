package Datas;



public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }
    public boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        int limiteDia;
        switch(mes) {
            case 2 -> {
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    limiteDia = 29;
                } else {
                    limiteDia = 28;
                }
            }
            case 4, 6, 9, 11 -> limiteDia = 30;
            default -> limiteDia = 31;
        }
        return true;

    }
    public Data(int dia, int mes, int ano) {
        if(dataValida(dia,mes,ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
        }
    }
    public Data(int dia) {
        this(dia,1, 1970);
    }
    public Data(int dia, int mes) {
        this(dia, mes, 1970);
    }
    public boolean setDia(int dia) {
        if(dia >= 1 && dia <= 31) {
            this.dia = dia;
            return true;
        }
        return false;
    }

    public boolean setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
            return true;
        }
        return false;
    }

    public boolean setAno(int ano) {
        if (ano >= 1) {
            this.ano = ano;
            return true;
        }
        return false;
    }

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dia).append("/");
        sb.append(this.mes).append("/");
        sb.append(this.ano);
        return sb.toString();
    }
    public String mesExtenso(int mes) {

       switch (mes) {
           case 1: return "janeiro";
                case 2: return  "fevereiro";
                case 3: return "marco";
                case 4: return "abril";
                case 5: return  "maio";
                case 6: return  "junho";
                case 7: return  "julho";
                case 8: return "agosto";
                case 9: return  "setembro";
                case 10: return  "outubro";
                case 11: return  "novembro";
                case 12: return  "dezembro";
            default: return  "Valor incorreto";
       }
    }

    public String imprimirExtenso() {
        return (this.dia + " de " + mesExtenso(mes) + " de " + this.ano);
    }

    public static final int[] DIA_DO_MES = {31,28,31,30,31,30,31,30,31,31,30,30,31};

    public boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    private int converterParaDias() {
        int totalDias = 0;
        for (int i = 1; i < this.ano; i++) {
            totalDias += ehBissexto(i) ? 366 : 365;
        }

        for (int i = 1; i < this.mes; i++) {
            if (i == 2 && ehBissexto(this.ano)) {
                totalDias += 29;
            } else {
                totalDias = DIA_DO_MES[i];
            }
        }

        totalDias += this.dia;
        return totalDias;
    }
    public int diferencaEmDias(Data outro) {
        int diasData1 = this.converterParaDias();
        int diasData2 = outro.converterParaDias();
        return Math.abs(diasData1 - diasData2);
    }
}
