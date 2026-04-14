import java.util.Scanner;

public class CopiarCadena {
    public static String copiarCadena(String cadena) {
        if (cadena.isEmpty()) {
            return "";
        }
        return cadena.charAt(0) + copiarCadena(cadena.substring(1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String texto = scanner.nextLine();
        System.out.println("Copia: " + copiarCadena(texto));
        scanner.close();
    }
}
