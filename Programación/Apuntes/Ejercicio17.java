import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numAdivinar = 6;
		int num;
		System.out.println("Introduce un número");
		num = scanner.nextInt();

		while (num != numAdivinar) {
			if (num < numAdivinar) {
				System.out.println("El número que has introducido es menor, vuelve a introducir otro número.");
				num = scanner.nextInt();
			} else {
				System.out.println("El número que has introducido es mayor, vuelve a introducir otro número.");
				num = scanner.nextInt();
			}
		}
		System.out.println("Correcto.");
	}

}
