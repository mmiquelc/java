package matrius;

public class GenerarNumerosRandomDintreMatriu {

    public static void main(String[] args) {
        int m[][] = new int[5][5];
        
        // Llenar la matriz con números aleatorios
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 100); // Generar un número aleatorio entre 0 y 99
            }
        }

        // Imprimir la matriz
        System.out.println("La matriz és:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(); // Nueva línea al final de cada fila
        }
    }
}