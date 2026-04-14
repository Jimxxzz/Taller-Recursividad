import java.util.Scanner;

public class CocienteDivisionEntera {
    public static long cocienteDivisionEntera(long dividendo, long divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("División por cero");
        }
        boolean negativo = (dividendo < 0) ^ (divisor < 0);
        long a = Math.abs(dividendo);
        long b = Math.abs(divisor);
        long resultado = cocienteDivisionEnteraPositivo(a, b);
        return negativo ? -resultado : resultado;
    }

    private static long cocienteDivisionEnteraPositivo(long dividendo, long divisor) {
        if (dividendo < divisor) {
            return 0;
        }
        return 1 + cocienteDivisionEnteraPositivo(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        long dividendo = scanner.nextLong();
        System.out.print("Ingrese el divisor: ");
        long divisor = scanner.nextLong();
        System.out.println("Cociente = " + cocienteDivisionEntera(dividendo, divisor));
        scanner.close();
    }
}
