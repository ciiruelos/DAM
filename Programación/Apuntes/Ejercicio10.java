package a;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Introduce el año: ");
        int year = scanner.nextInt();

        boolean fechaValida = true;

        if (mes < 1 || mes > 12 || year < 0) {
            fechaValida = false;
        } else {
            int diasDelMes;

            switch (mes) {
                case 2:  
                    diasDelMes = 28;
                    break;
                case 4: case 6: case 9: case 11:  
                    diasDelMes = 30;
                    break;
                default:  
                    diasDelMes = 31;
                    break;
            }

            if (dia < 1 || dia > diasDelMes) {
                fechaValida = false;
            }
        }

        if (fechaValida) {
            System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + year);
        } else {
            System.out.println("La fecha es incorrecta.");
        }

        scanner.close();
    }
}
