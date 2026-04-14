import java.util.Scanner;

public class AckermannFuncion {
    public static long ackermann(long m, long n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese m: ");
        long m = scanner.nextLong();
        System.out.print("Ingrese n: ");
        long n = scanner.nextLong();
        System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
        scanner.close();
    }
}
