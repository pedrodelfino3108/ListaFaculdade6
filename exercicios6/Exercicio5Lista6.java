package exercicios6;

import java.util.Scanner;

public class Exercicio5Lista6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Digite os valores A, B e C da equação de segundo grau:");
        System.out.print("A: ");
        double A = sc.nextDouble();
        
        System.out.print("B: ");
        double B = sc.nextDouble();
        
        System.out.print("C: ");
        double C = sc.nextDouble();
        
        if (A == 0) {
            System.out.println("A variável A deve ser diferente de zero para uma equação de segundo grau.");
        } else {
            double discriminante = B * B - 4 * A * C;
            
            if (discriminante < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (discriminante == 0) {
                double raiz = -B / (2 * A);
                System.out.println("A equação possui uma única raiz: " + raiz);
            } else {
                double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
                System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
            }
        }
        
        sc.close();
	}
}
