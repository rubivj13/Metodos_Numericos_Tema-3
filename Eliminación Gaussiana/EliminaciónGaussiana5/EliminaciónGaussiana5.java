/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eliminacióngaussiana5;

/**
 *
 * @author Rub_1
 */
public class EliminaciónGaussiana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] A = {{3, -1, 2}, {-1, 4, 2}, {2, 3, 2}};
        double[] b = {5, 11, 12};

        double[] xyz = gaussElimination(A, b);

        System.out.println("Solución del sistema de ecuaciones:");
        System.out.println("x = " + xyz[0]);
        System.out.println("y = " + xyz[1]);
        System.out.println("z = " + xyz[2]);
    }

    public static double[] gaussElimination(double[][] A, double[] b) {
        int n = A.length;

        // Eliminación hacia adelante
        for (int k = 0; k < n-1; k++) {
            for (int i = k+1; i < n; i++) {
                double factor = A[i][k] / A[k][k]; 
                for (int j = k+1; j < n; j++) {
                    A[i][j] -= factor * A[k][j];
                }
                b[i] -= factor * b[k];
            }
        }

        // Sustitución hacia atrás
        double[] xyz = new double[n];
        for (int i = n-1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i+1; j < n; j++) {
                sum += A[i][j] * xyz[j];
            }
            xyz[i] = (b[i] - sum) / A[i][i];
        }

        return xyz;
    }
}
