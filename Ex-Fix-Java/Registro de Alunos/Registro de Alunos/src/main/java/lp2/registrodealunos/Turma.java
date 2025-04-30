package lp2.registrodealunos;

import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public class Turma {

    private int turmaId;
    private List<Aluno> alunos;
    private String descricao;
    private int quantidadeMaxima;

    public Turma(int turmaId, List<Aluno> alunos, String descricao, int quantidadeMaxima) {
        this.turmaId = turmaId;
        this.alunos = alunos != null ? alunos : new ArrayList<>();
        this.descricao = descricao;
        this.quantidadeMaxima = quantidadeMaxima;
    };

    public boolean addAluno(Aluno aluno) {

        if (alunos.size() >= quantidadeMaxima) {
            System.out.println("A turma já está cheia.");
            return false;
        }

        if (validarMatricula(aluno.getMatricula())) {
            System.out.println("Matrícula já existente.");
            return false;
        }

        else {
            alunos.add(aluno);
            return true;
        }
    }

    public boolean validarMatricula(int matricula) {
        return alunos.stream().anyMatch(a -> a.getMatricula() == matricula);
    }

    public boolean removeAlunoPorNome(String nome) {
        return alunos.removeIf(a -> a.getNome().equalsIgnoreCase(nome));
    }

    public Aluno consultarPorMatricula(int matricula) {
        return alunos.stream()
                .filter(a -> a.getMatricula() == matricula)
                .findFirst()
                .orElse(null);
    }

    public List<Aluno> consultarPorNome(String nome, boolean retornarTodos) {
        List<Aluno> encontrados = alunos.stream()
                .filter(a -> a.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toList());
        return retornarTodos ? encontrados : encontrados.stream().limit(1).collect(Collectors.toList());
    }

    public void imprimirAlunosOrdemInsercao() {
        alunos.forEach(System.out::println);
    }

    public void imprimirAlunosOrdenadosPorNome() {
        alunos.stream()
                .sorted(Comparator.comparing(Aluno::getNome))
                .forEach(System.out::println);
    }

}
