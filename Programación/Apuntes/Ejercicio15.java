import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num;
		int contador = 0;
		System.out.println("Introduce un número:");
		num = scanner.nextInt();

		while (num >= 0) {
			contador++;
			System.out.println("Introduce otro número:");
			num = scanner.nextInt();

		}
		System.out.println("Has introducido " + contador + " número/s.");

	}

}
