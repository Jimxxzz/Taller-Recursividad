import java.util.Scanner;

public class SumatoriaHastaN {
    public static long sumaHastaN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumaHastaN(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        System.out.println("Sumatoria hasta " + n + " = " + sumaHastaN(n));
        scanner.close();
    }
}
