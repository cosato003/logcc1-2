import java.util.Scanner;

class logica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa operador 1:");
        int operador1 = scanner.nextInt();

        System.out.println("Ingresa operador 2:");
        int operador2 = scanner.nextInt();

        int suma = operador1 + operador2;
        System.out.println("El resultado de la suma es: " + suma);

        int resta = operador1 - operador2;
        System.out.println("El resultado de la resta es: " + resta);

        if (operador2 != 0) {
            double division = (double) operador1 / operador2;
            System.out.println("El resultado de la división es: " + division);
        } else {
            System.out.println("No es posible dividir por 0.");
        }

        int multiplicacion = operador1 * operador2;
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        scanner.close();
    }
}
