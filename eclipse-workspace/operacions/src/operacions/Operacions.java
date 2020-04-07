package operacions;

import java.util.Scanner;

public class Operacions2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		factorialIterativo(sc);

	}

	private static void factorialIterativo(Scanner sc) {
		System.out.println("Este programa sirve para calcular el factorial de un entero positivo de manera iterativa");
		System.out.println("De que numero quieres calcular el factorial: ");
		int numeroACaluclar = sc.nextInt();

		Factorial fact = new Factorial();
		try {
			double valor = fact.getIterativa(numeroACaluclar);
			System.out.println(valor);
		} catch (IllegalArgumentException e) {
			System.out.println("No se pueden utilizar nombres negativos.");
		}
	}

}
