package exercicios6;

import java.util.Scanner;

public class Exercicio12Lista6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = sc.next().charAt(0);
        
        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Ilmo Sr. " + nome);
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Ilma Sra. " + nome);
        } else {
            System.out.println("Sexo inválido. Por favor, insira M para masculino ou F para feminino.");
        }
        
        sc.close();
	}
}
