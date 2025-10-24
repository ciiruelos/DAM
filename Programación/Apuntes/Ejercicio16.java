import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int cantidad = 0;

		System.out.println("Introduce una cantidad de números:");
		cantidad = scanner.nextInt();

		int cont1 = 0; // positivo
		int cont2 = 0; // negativo
		int cont3 = 0; // igual

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce un número:");
			int num;
			num = scanner.nextInt();

			if (num > 0) {
				cont1++;
			} else if (num < 0) {
				cont2++;
			} else {
				cont3++;
			}
		}
		System.out.println(+cont1 + " número/s positivos.");
		System.out.println(+cont2 + " número/s negativos.");
		System.out.println(+cont3 + " número/s iguales a 0.");
	}

}
