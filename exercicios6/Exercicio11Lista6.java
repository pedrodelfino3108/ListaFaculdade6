package exercicios6;

import java.util.Scanner;

public class Exercicio11Lista6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor inteiro: ");
		int valor = sc.nextInt();

		if (valor <= 3) {
			System.out.println("O valor digitado é: " + valor);
		}

		sc.close();
	}
}
