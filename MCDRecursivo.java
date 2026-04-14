import java.util.Scanner;

public class MCDRecursivo {
    public static long mcdEuclides(long m, long n) {
        if (n == 0) {
            return Math.abs(m);
        }
        return mcdEuclides(n, m % n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número (M): ");
        long m = scanner.nextLong();
        System.out.print("Ingrese el segundo número (N): ");
        long n = scanner.nextLong();
        System.out.println("MCD(" + m + ", " + n + ") = " + mcdEuclides(m, n));
        scanner.close();
    }
}
