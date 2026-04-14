import java.util.Scanner;

public class SumarDigitos {
    public static int sumarDigitos(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumarDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        System.out.println("Suma de dígitos = " + sumarDigitos(n));
        scanner.close();
    }
}
