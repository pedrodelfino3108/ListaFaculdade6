package exercicios6;

import java.util.Scanner;

public class Exercicio4Lista6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as quatro notas do aluno:");
		System.out.print("Nota 1: ");
		double nota1 = sc.nextDouble();

		System.out.print("Nota 2: ");
		double nota2 = sc.nextDouble();

		System.out.print("Nota 3: ");
		double nota3 = sc.nextDouble();

		System.out.print("Nota 4: ");
		double nota4 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7.0) {
			System.out.println("O aluno foi aprovado com média " + media);
		} else {
			System.out.println("O aluno não foi aprovado com média " + media);
			System.out.println("Digite a nota do exame: ");
			double notaExame = sc.nextDouble();

			double novaMedia = (media + notaExame) / 2;

			if (novaMedia >= 5.0) {
				System.out.println("O aluno foi aprovado em exame com nova média " + novaMedia);
			} else {
				System.out.println("O aluno foi reprovado em exame com nova média " + novaMedia);
			}
		}

		sc.close();
	}
}
