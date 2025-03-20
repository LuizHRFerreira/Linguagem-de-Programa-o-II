package lp2.exercicios_fixacao_java.ex5;

import java.time.LocalDate;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public boolean isBissexto(int ano) {
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }

    public Data(int dia, int mes, int ano) {

        if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || (mes == 2 && dia > 28 && !isBissexto(ano)) || (mes == 2 && dia > 29 && isBissexto(ano)) || (mes != 2 && dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))) {
            throw new IllegalArgumentException("Dia ou mês inválidos");
        }

        else {

            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

    }

    public void dataAtual(){

        LocalDate hoje = LocalDate.now();

        this.dia = hoje.getDayOfMonth();
        this.mes = hoje.getMonthValue();
        this.ano = hoje.getYear();
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

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public String proxDia() {
        int[] diasNoMes = {31, (isBissexto(ano) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        dia++;

        if (dia > diasNoMes[mes - 1]) {
            dia = 1;
            mes++;
        }

        if (mes > 12) {
            mes = 1;
            ano++;
        }

        return dia + "/" + mes + "/" + ano;
    }


}