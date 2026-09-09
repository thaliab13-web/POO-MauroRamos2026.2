package HorarioData;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    public Horario(int hora) {
        if (hora >= 0 && hora <= 25) {
            this.hora = hora;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }
    public Horario(int hora, int minuto) {
        if ((hora >= 0 && hora <= 25) && (minuto >= 0 && minuto <= 59)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = 0;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }
    public Horario(int hora, int minuto, int segundo) {

        if(((hora >= 0 && hora <= 25) && (minuto >= 0 && minuto <= 59) && (segundo >= 0 && segundo <= 59))) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }

    }

    public boolean setHora(int hora) {
        if(hora >= 0 && hora <= 23) {
            this.hora = hora;
            return true;
        } else {
            return false;
        }
    }

    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSegundo(int segundo) {
        if (segundo >=0 && segundo <= 59) {
            this.segundo = segundo;
            return true;
        } else {
            return false;
        }

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.hora).append(":");
        sb.append(this.minuto).append(":");
        sb.append(this.segundo);
        return sb.toString();
    }

    public String numeroPorExtenso(int n) {
        switch(n) {
            case 0: return "zero";
            case 1: return "um";
            case 2: return "dois";
            case 3: return "tres";
            case 4: return "quatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "sete";
            case 8: return "oito";
            case 9: return "nove";
            case 10: return "dez";
            case 11: return "onze";
            case 12: return "doze";
            case 13: return "treze";
            case 14: return "quatorze";
            case 15: return "quinze";
            case 16: return "dezesseis";
            case 17: return "dezessete";
            case 18: return "dezoito";
            case 19: return "dezenove";

        }
        int dezena = n / 10;
        int unidade = n % 10;
         String extensoDezena = "";
         switch(dezena) {
             case 2 -> extensoDezena = "vinte";
             case 3 -> extensoDezena = "trinta";
             case 4 -> extensoDezena = "quarenta";
             case 5 -> extensoDezena = "cinquenta";
         }

         return (unidade == 0) ? extensoDezena : extensoDezena + " e " + numeroPorExtenso(unidade);

    }
    public String porExtenso() {
        return numeroPorExtenso(hora) + " horas e " + numeroPorExtenso(minuto) + " minutos e " + numeroPorExtenso(segundo) +  " segundos";

    }


    public long emSegundo() {
        return hora * 3600 + minuto * 60 + segundo;
    }
    public long diferenca(Horario outro) {
        return emSegundo() - outro.emSegundo();
    }
}
