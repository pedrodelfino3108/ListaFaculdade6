package exercicios6;

import java.util.Scanner;

public class Exercicio7Lista6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quatro números inteiros:");
		int[] numeros = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("Números divisíveis por 2 e 3:");
		for (int num : numeros) {
			if (num % 2 == 0 && num % 3 == 0) {
				System.out.println(num);
			}
		}

		sc.close();
	}
}