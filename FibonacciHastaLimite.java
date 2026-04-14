import java.util.Scanner;

public class FibonacciHastaLimite {
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el límite de la serie Fibonacci: ");
        int limite = scanner.nextInt();
        System.out.print("Serie Fibonacci hasta " + limite + ": ");
        int i = 0;
        while (true) {
            long valor = fibonacci(i);
            if (valor > limite) {
                break;
            }
            System.out.print(valor + (valor == limite ? "" : " "));
            i++;
        }
        System.out.println();
        scanner.close();
    }
}
