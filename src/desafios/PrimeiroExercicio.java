package desafios;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		double salario;
		double abono;
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		salario = leitura.nextDouble();
		
		System.out.print("Digite o abono: ");
		abono = leitura.nextDouble();
		leitura.close();
		
		double novoSalario = salario + abono;
		
		System.out.println("Novo salário: " + novoSalario);
		
		

	}

}
