import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int numero1;
		int numero2;
		
		System.out.println("Introduce el primer número: ");
		numero1 = scanner.nextInt();
		System.out.println("El primer número es el "+numero1);
		
		System.out.println("Introduce el segundo número: ");
		numero2 = scanner.nextInt();
		System.out.println("El segundo número es el "+numero2);
		
		if (numero1 == numero2) {
			System.out.println("Ambos números son iguales.");
		}
		else {
			System.out.println("Los números "+numero1+" y "+numero2+" no son iguales.");
		}
	}
}	
	
	
