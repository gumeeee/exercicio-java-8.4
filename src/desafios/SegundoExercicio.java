package desafios;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leitura.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leitura.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leitura.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = leitura.nextFloat();
		leitura.close();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média é: " + media);

	}

}
