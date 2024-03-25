package exercicios6;

import java.util.Scanner;

public class Exercicio8Lista6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite cinco números inteiros:");
		int[] numeros = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		int maior = numeros[0];
		int menor = numeros[0];

		for (int i = 1; i < 5; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);

		sc.close();
	}
}
