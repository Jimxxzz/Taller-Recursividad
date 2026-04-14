import java.util.Scanner;

public class SumaVector {
    public static long sumaVector(int[] vector, int indice) {
        if (indice >= vector.length) {
            return 0;
        }
        return vector[indice] + sumaVector(vector, indice + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los elementos del vector separados por espacios: ");
        String[] partes = scanner.nextLine().trim().split("\\s+");
        int[] vector = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            vector[i] = Integer.parseInt(partes[i]);
        }
        System.out.println("Suma del vector = " + sumaVector(vector, 0));
        scanner.close();
    }
}
