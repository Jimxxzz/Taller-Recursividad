import java.util.Scanner;

public class PotenciaRecursiva {
    public static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        if (exponente < 0) {
            return 1.0 / potencia(base, -exponente);
        }
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        System.out.println("Potencia = " + potencia(base, exponente));
        scanner.close();
    }
}
