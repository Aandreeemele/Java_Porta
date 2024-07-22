package calculadora;
import java.util.Scanner;

public class Mate {
    public static void calculadora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opciones:");
        System.out.println("[1] Suma           [2] Resta");
        System.out.println("[3] Multiplicación [4] División");
        System.out.print("Elija una opción: ");
        int opcion = scanner.nextInt();
        System.out.print("Ingrese un número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        String operacion = "";
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                operacion = "Suma";
                break;
            case 2:
                resultado = num1 - num2;
                operacion = "Resta";
                break;
            case 3:
                resultado = num1 * num2;
                operacion = "Multiplicación";
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    operacion = "División";
                } else {
                    System.out.println("ERROR!!! No se puede dividir por cero");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Opción no válida");
                scanner.close();
                return;
        }

        System.out.println("El resultado de la " + operacion + " es: " + resultado);
        scanner.close();
    }

    public static void Calculadora() {
        calculadora();
    }
}
