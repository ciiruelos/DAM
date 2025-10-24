package a;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el día: ");
		int dia = scanner.nextInt();

		System.out.print("Introduce el mes: ");
		int mes = scanner.nextInt();

		System.out.print("Introduce el año: ");
		int year = scanner.nextInt();

		boolean fechaValida = true;

		if (year < 0) {
			fechaValida = false;
		} else if (mes < 1 || mes > 12) {
			fechaValida = false;
		} else if (dia < 1 || dia > 30) {
			fechaValida = false;
		}

		if (fechaValida) {
			System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + year);
		} else {
			System.out.println("La fecha es incorrecta.");
		}

		scanner.close();
	}
}
