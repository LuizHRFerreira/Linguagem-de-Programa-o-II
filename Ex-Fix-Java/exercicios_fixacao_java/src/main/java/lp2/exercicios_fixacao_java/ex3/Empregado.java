package lp2.exercicios_fixacao_java.ex3;

public class Empregado {

    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = Math.max(salarioMensal, 0.0);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double getSalarioAnual() {
        return salarioMensal*12;
    }

    public double getSalarioAnualComAumento() {
        return (salarioMensal*1.10)*12;
    }

}
