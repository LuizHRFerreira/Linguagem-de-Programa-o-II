package lp2.registrodealunos;

import java.util.ArrayList;
import java.util.Arrays;

public class RegistroDeAlunosApplication {

	public static void main(String[] args) {


		// Cadastro de alunos novos
		Aluno aluno1 = new Aluno(1, "João", "", Arrays.asList());
		Aluno aluno2 = new Aluno(2, "Maria", "Banco de Dados", Arrays.asList(9, 8, 7, 6));
		Aluno aluno3 = new Aluno(3, "Carlos", "Banco de Dados", Arrays.asList(8, 7, 6, 5));
		Aluno aluno4 = new Aluno(4, "Ana", "Banco de Dados", Arrays.asList(7, 6, 5, 4));
		Aluno aluno5 = new Aluno(5, "Pedro", "Banco de Dados", Arrays.asList(6, 5, 4, 3));
		Aluno aluno6 = new Aluno(6, "Fernanda", "Banco de Dados", Arrays.asList(5, 4, 3, 2));
		Aluno aluno7 = new Aluno(7, "Lucas", "Banco de Dados", Arrays.asList(4, 3, 2, 1));
		Aluno aluno8 = new Aluno(8, "Juliana", "Banco de Dados", Arrays.asList(3, 2, 1, 0));
		Aluno aluno9 = new Aluno(9, "Rafael", "Banco de Dados", Arrays.asList(2, 1, 0, 0));
		Aluno aluno10 = new Aluno(10, "Beatriz", "Banco de Dados", Arrays.asList(1, 0, 0, 0));


		// Cadastrar turmas
		Turma LPII = new Turma(1, new ArrayList<>(), "LPII", 5);
		Turma LPIII = new Turma(2, new ArrayList<>(), "LPIII", 10);


		// Incluir Aluno à Turma
		LPII.addAluno(aluno1);
		LPII.addAluno(aluno2);
		LPII.addAluno(aluno3);
		LPII.addAluno(aluno4);
		LPII.addAluno(aluno5);
		LPIII.addAluno(aluno6);
		LPIII.addAluno(aluno7);
		LPIII.addAluno(aluno8);
		LPIII.addAluno(aluno9);
		LPIII.addAluno(aluno10);

		// :::::::::::::::::::::::::::::::::::::::::::: Funções de consulta ::::::::::::::::::::::::::::::::::::::::::::

		System.out.println("\n==================== Alterar os dados de um Aluno já registrado =====================");
		System.out.println("Nome antes da alteração -> Nome: " + aluno1.getNome() + ", Curso: " + aluno1.getCurso() + ", Notas: " + aluno1.getNotas());
		aluno1.setNome("João Silva");
		aluno1.setCurso("Banco de Dados");
		aluno1.setNotas(Arrays.asList(9, 8, 7, 6));
		System.out.println("Nome depois da alteração -> Nome: " + aluno1.getNome() + ", Curso: " + aluno1.getCurso() + ", Notas: " + aluno1.getNotas());
		System.out.println("=====================================================================================\n");


		System.out.println("\n========================= Consultando aluno por nome (Pedro) ======================= ");
		System.out.println(LPII.consultarPorNome("Pedro", false));
		System.out.println("=====================================================================================\n");


		System.out.println("\n======================= Consultando aluno por matrícula (3) =========================");
		System.out.println(LPII.consultarPorMatricula(3));
		System.out.println("=====================================================================================\n");


		System.out.println("\n===================== Excluir aluno com base no nome (Pedro) ========================");
		System.out.println("Antes da exclusão:");
		LPII.imprimirAlunosOrdemInsercao();
		System.out.println("\nDepois da exclusão:");
		LPII.removeAlunoPorNome("Pedro");
		LPII.imprimirAlunosOrdemInsercao();
		System.out.println("=====================================================================================\n");


		System.out.println("\n=============== Imprimir a lista de alunos na sua ordem de inserção =================");
		LPII.imprimirAlunosOrdemInsercao();
		System.out.println("=====================================================================================\n");


		System.out.println("\n==================== Imprimir a lista de alunos ordenada por nome ===================");
		System.out.println("Alunos na turma LPII (ordenados por nome):");
		LPII.imprimirAlunosOrdenadosPorNome();
		System.out.println("=====================================================================================\n");


		System.out.println("\n======================= Validando matrícula duplicada (Lucas) =======================");
		boolean added = LPIII.addAluno(aluno7);
		System.out.println("Foi adicionado? " + added);
		System.out.println("=====================================================================================\n");
	}
}