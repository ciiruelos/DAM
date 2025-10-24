import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número: ");
		numero = scanner.nextInt();
		
		
		if (numero >=0) {
			System.out.println("El número "+numero+" es positivo.");
		}
		else {
			System.out.println("El número "+numero+" es negativo.");

		}
	}

}
