package a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una nota del 0 al 10: ");
		int nota = scanner.nextInt();

		switch (nota) {
		case 0, 1, 2, 3, 4:
			System.out.println("Insuficiente.");
			break;
		case 5:
			System.out.println("Suficiente.");
			break;
		case 6:
			System.out.println("Bien.");
			break;
		case 7,8:
			System.out.println("Notable.");
			break;
		case 9,10:
			System.out.println("Sobresaliente.");
			break;
		default:
			System.out.println("Nota inválida. Debe estar entre 0 y 10.");
		}

		scanner.close();
	}
}
