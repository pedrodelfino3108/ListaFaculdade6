package exercicios6;

import java.util.Scanner;

public class Exercicio1Lista6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro valor inteiro: ");
		int valor1 = sc.nextInt();

		System.out.print("Digite o segundo valor inteiro: ");
		int valor2 = sc.nextInt();

		int diferenca = Math.abs(valor1 - valor2);

		int maior = Math.max(valor1, valor2);

		int menor = Math.min(valor1, valor2);

		System.out.println("A diferença entre " + maior + " e " + menor + " é: " + diferenca);

		sc.close();
	}

}
