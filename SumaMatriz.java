import java.util.Scanner;

public class SumaMatriz {
    public static long sumaMatriz(int[][] matriz, int fila, int columna) {
        if (fila >= matriz.length) {
            return 0;
        }
        if (columna >= matriz[fila].length) {
            return sumaMatriz(matriz, fila + 1, 0);
        }
        return matriz[fila][columna] + sumaMatriz(matriz, fila, columna + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Número de columnas: ");
        int columnas = scanner.nextInt();
        scanner.nextLine();

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            System.out.print("Ingrese los elementos de la fila " + (i + 1) + " separados por espacios: ");
            String[] valores = scanner.nextLine().trim().split("\\s+");
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Integer.parseInt(valores[j]);
            }
        }

        System.out.println("Suma de la matriz = " + sumaMatriz(matriz, 0, 0));
        scanner.close();
    }
}
