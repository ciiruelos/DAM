import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num1;
		int num2;
		int num3;

		System.out.println("Introduce el primer número: ");
		num1 = scanner.nextInt();

		System.out.println("Introduce el segundo número: ");
		num2 = scanner.nextInt();
		
		System.out.println("Introduce el tercer número: ");
		num3 = scanner.nextInt();

		if (num1 > num2 && num2 > num3) {
			System.out.println(+num1 + ", " + num2+" y "+num3);
		} else {
			System.out.println();

		}
	}

}
