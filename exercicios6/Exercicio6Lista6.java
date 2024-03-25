package exercicios6;

import java.util.Scanner;

public class Exercicio6Lista6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores de A, B e C:");
		System.out.print("A: ");
		double A = sc.nextDouble();

		System.out.print("B: ");
		double B = sc.nextDouble();

		System.out.print("C: ");
		double C = sc.nextDouble();

		double menor, meio, maior;

		if (A <= B && A <= C) {
			menor = A;
			if (B <= C) {
				meio = B;
				maior = C;
			} else {
				meio = C;
				maior = B;
			}
		} else if (B <= A && B <= C) {
			menor = B;
			if (A <= C) {
				meio = A;
				maior = C;
			} else {
				meio = C;
				maior = A;
			}
		} else {
			menor = C;
			if (A <= B) {
				meio = A;
				maior = B;
			} else {
				meio = B;
				maior = A;
			}
		}

		System.out.println("Os valores em ordem crescente são: " + menor + ", " + meio + ", " + maior);

		sc.close();
	}
}
