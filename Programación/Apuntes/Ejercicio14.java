import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num;
		int cuadrado = 0;
		System.out.println("Introduce un número:");
		num = scanner.nextInt();

		while (num >= 0) {
			cuadrado = num * num;
			System.out.println("El cuadrado de " + num + " es " + cuadrado);
			System.out.println("Introduce otro número:");
			num = scanner.nextInt();
		}

	}

}
