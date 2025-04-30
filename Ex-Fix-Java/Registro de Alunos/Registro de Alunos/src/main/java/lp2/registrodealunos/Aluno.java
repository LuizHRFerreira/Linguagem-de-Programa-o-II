package lp2.registrodealunos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Aluno {

    private int matricula;
    private String nome;
    private String curso;
    private List<Integer> notas;
    private List<Integer> notaCalculada = new ArrayList<>();

    public Aluno(int matricula, String nome, String curso, List<Integer> notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;

        // Validate and assign notes
        if (notas == null) {
            this.notas = notas = new ArrayList<>();
        }else {
                this.notas = PesoNota(notas, new double[]{0.2, 0.3, 0.4, 0.1});
        }
    }

    public List<Integer> PesoNota(List<Integer> notas, double[] pesos) {
        if (notas.size() > pesos.length) {
            throw new IllegalArgumentException("Informe o peso de todas as notas.");
        }

        List<Integer> calculadas = new ArrayList<>();
        for (int i = 0; i < notas.size(); i++) {
            double notaPonderada = Math.round(notas.get(i) * pesos[i]);
            calculadas.add((int) notaPonderada);
        }
        return calculadas;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", notas=" + notas;
    }
}