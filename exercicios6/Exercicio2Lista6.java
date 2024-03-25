package exercicios6;

import java.util.Scanner;

public class Exercicio2Lista6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor inteiro: ");
		int numero = sc.nextInt();

		int modulo = Math.abs(numero);

		System.out.println("O módulo do número é: " + modulo);

		sc.close();
	}
}
