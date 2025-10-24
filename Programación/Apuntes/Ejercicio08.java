package a;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int num1 = scanner.nextInt();

		System.out.print("Introduce el segundo número: ");
		int num2 = scanner.nextInt();

		System.out.println("Números pares entre " + num1 + " y " + num2 + ":");
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		//if (i%2==0) detecta si el número es par o impar.
		scanner.close();
	}
}
