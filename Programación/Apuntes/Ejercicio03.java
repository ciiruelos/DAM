import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Introduce el primer número: ");
		num1 = scanner.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("El número "+num1+" es mayor.");
		}
		else {
			if (num1 < num2) {
				System.out.println("El número "+num2+" es mayor.");
			}
			else {
				System.out.println("Ambos números son iguales.");
			}
		} 
	}

}
