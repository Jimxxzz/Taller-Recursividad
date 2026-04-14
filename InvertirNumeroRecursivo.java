import java.util.Scanner;

public class InvertirNumeroRecursivo {
    public static int invertirNumero(int n) {
        return invertirNumeroRec(Math.abs(n), 0) * (n < 0 ? -1 : 1);
    }

    private static int invertirNumeroRec(int n, int invertido) {
        if (n == 0) {
            return invertido;
        }
        return invertirNumeroRec(n / 10, invertido * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        System.out.println("Invertido: " + invertirNumero(n));
        scanner.close();
    }
}
