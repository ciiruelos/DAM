import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Introduce el primer número: ");
		num1 = scanner.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println(+num1+" y "+num2);
		}
		else {
			System.out.println(+num2+" y "+num1);

		}
	}
}
	


