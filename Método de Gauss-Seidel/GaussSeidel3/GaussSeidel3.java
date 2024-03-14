/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gaussseidel3;

/**
 *
 * @author Rub_1
 */
public class GaussSeidel3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] coeficientes = {
            {3, -0.1, -0.2, 7.85},
            {0.1, 7, -0.3, -19.3},
            {0.3, -0.2, 10, 71.4}
        };
        
        
        double[] valoresIniciales = {0, 0, 0}; // Valores iniciales de las incógnitas
        double tolerancia = 0.0001; // Tolerancia para el criterio de convergencia
        int iteracionesMaximas = 1000; // Número máximo de iteraciones
        
        double[] solucion = gaussSeidel(coeficientes, valoresIniciales, tolerancia, iteracionesMaximas);
        
        if (solucion != null) {
            System.out.println("Solución del sistema de ecuaciones:");
            System.out.println("x = " + solucion[0]);
            System.out.println("y = " + solucion[1]);
            System.out.println("z = " + solucion[2]);
        } else {
            System.out.println("El método no converge.");
        }
    }
    
    public static double[] gaussSeidel(double[][] coeficientes, double[] valoresIniciales, double tolerancia, int iteracionesMaximas) {
        int n = valoresIniciales.length;
        double[] solucion = new double[n];
        double[] solucionAnterior = new double[n];
        int iteraciones = 0;
        double error = tolerancia + 1;
        
        // Inicializar la solución con los valores iniciales
        System.arraycopy(valoresIniciales, 0, solucion, 0, n);
        
        // Iterar hasta que se alcance la tolerancia o el número máximo de iteraciones
        while (error > tolerancia && iteraciones < iteracionesMaximas) {
            // Copiar la solución anterior
            System.arraycopy(solucion, 0, solucionAnterior, 0, n);
            
            // Calcular la nueva solución
            for (int i = 0; i < n; i++) {
                double suma = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += coeficientes[i][j] * solucion[j];
                    }
                }
                solucion[i] = (coeficientes[i][n] - suma) / coeficientes[i][i];
            }
            
            // Calcular el error
            error = 0;
            for (int i = 0; i < n; i++) {
                error += Math.abs(solucion[i] - solucionAnterior[i]);
            }
            
            iteraciones++;
        }
        
        // Verificar la convergencia
        if (error <= tolerancia) {
            return solucion;
        } else {
            return null; // No converge
        }
    }
}
