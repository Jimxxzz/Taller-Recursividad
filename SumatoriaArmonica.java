import java.util.Scanner;

public class SumatoriaArmonica {
    public static double sumatoriaArmonica(int n) {
        if (n <= 0) {
            return 0.0;
        }
        return 1.0 / n + sumatoriaArmonica(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero n: ");
        int n = scanner.nextInt();
        System.out.println("Sumatoria 1 + 1/2 + ... + 1/" + n + " = " + sumatoriaArmonica(n));
        scanner.close();
    }
}
