import java.util.Scanner;

public class MultiplicacionSumas {
    public static long multiplicacionSumas(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        boolean negativo = (a < 0) ^ (b < 0);
        long x = Math.abs(a);
        long y = Math.abs(b);
        long resultado = multiplicacionSumasPositiva(x, y);
        return negativo ? -resultado : resultado;
    }

    private static long multiplicacionSumasPositiva(long a, long b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplicacionSumasPositiva(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        long a = scanner.nextLong();
        System.out.print("Ingrese el segundo número: ");
        long b = scanner.nextLong();
        System.out.println("Multiplicación = " + multiplicacionSumas(a, b));
        scanner.close();
    }
}
