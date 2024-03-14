# Metodos_Numericos_Tema-3
<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> SALUDO </i> </b> </font> </h1>

¡Hola a todos! Soy Rubí Veloz Jiménez, estudiante de Ingeniería en Sistemas Computacionales. En esta ocasión, les presento un problemario relacionado con la materia de Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales( Eliminación Gaussiana, Método de Gauss-Jordan, Método de Gauss-Seidel y Método de Jacobi).

<h2 align = "center"> <font color = "darkorange" size = "+6"  font face = "bauhaus 93">  INDICE </font> </h2>
<header> <font color = "red" size="+1" font face = "aharoni">
                <nav class="navegacion">
                    <ul class="Indice">
                       <li> <a href="#Descripción del Problemario"> Descripción del Problemario. </a> <br> </li>
                        <li> <a href="#Sobre la materia"> Sobre la materia. </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Competencia de la Asignatura"> Competencia de la Asignatura. </a> </li>
                                <li> <a href="#Competencia del tema"> Competencia del tema. </a> </li>
                                <li> <a href="#Temario"> Temario. </a> </li>  
                            </ul>
                      <li> <a href="#Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales que se encuentran en nuestro repositorio."> Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales que se encuentran en nuestro repositorio. </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Eliminación Gaussiana"> Eliminación Gaussiana. </a> </li>
                                <li> <a href="#Método de Gauss-Jordan"> Método de Gauss-Jordan. </a> </li>
                                <li> <a href="#Método de Gauss-Seidel"> Método de Gauss-Seidel. </a> </li> 
                                <li> <a href="#Método de Jacobi"> Método de Jacobi. </a> </li> 
                            </ul>
                    </ul>
                </nav>
            </font> </header>
            

<h2 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción del Problemario"> Descripción del Problemario </a> </font> </h2>

En este conjunto de ejercicios, exploraremos cuatro métodos la solución de sistemas de ecuaciones lineales. Estos métodos son:

1. **Eliminación Gaussiana**:
   - Método para resolver sistemas de ecuaciones lineales.
   - Transforma la matriz ampliada en forma escalonada.
   - Luego, se resuelve sustituyendo hacia atrás.
   - Clasifica el sistema como compatible determinado, indeterminado o incompatible.

2. **Método de Gauss-Jordan**:
   - Variante de la eliminación de Gauss.
   - Llega a la forma escalonada reducida.
   - Proporciona directamente las soluciones del sistema.

3. **Método de Gauss-Seidel**:
   - Resuelve sistemas iterativamente.
   - Actualiza las incógnitas en cada iteración.
   - Adecuado para matrices simétricas y dominantes.

4. **Método de Jacobi**:
   - Otra técnica iterativa para sistemas lineales.
   - Actualiza las incógnitas con valores iniciales.
   - Adecuado para matrices diagonales dominantes.

Cada uno de estos métodos se encuentra organizado en carpetas específicas. Al ingresar a la carpeta correspondiente de cada método, encontrarás cinco ejercicios resueltos en el lenguaje de programación Java. 

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Sobre la materia"> Sobre la materia </a> </font> </h2>

<h3> <font font face = "forte"> <a name="Competencia de la Asignatura"> Competencia de la Asignatura </a> </h3>

    Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.

<h3> <font font face = "forte"> <a name="Competencia del tema"> Competencia del tema </a> </h3>

''

<h3> <font font face = "forte"> <a name="Temario"> Temario  </a> </h3>

''

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales que se encuentran en nuestro repositorio"> Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales que se encuentran en nuestro repositorio </a> </font> </h2>

<h3 align = "center"> <font font face = "forte"> <a name="Eliminación Gaussiana"> 1. Eliminación Gaussiana </a> </h3>

<h4> <font font face = "arial"> Descripción: </h4>

   - También conocido como **método de eliminación de Gauss**, este algoritmo se utiliza para resolver sistemas de ecuaciones lineales. Aquí están los pasos clave:
   - Se trabaja con la **matriz ampliada** del sistema (que incluye los coeficientes de las incógnitas y los términos independientes).
   - Mediante operaciones de fila (intercambio, suma y multiplicación), se transforma la matriz ampliada en una **forma escalonada** (matriz triangular superior).
   - Luego, se resuelve el sistema sustituyendo hacia atrás desde la última fila.
   - Si se llega a la **forma escalonada reducida**, se denomina **eliminación de Gauss-Jordan**.
   - La clasificación del sistema (compatible determinado, indeterminado o incompatible) se deduce de la forma escalonada de la matriz ampliada.


<h4> <font font face = "arial"> Algoritmo: </h4>

  1. Ir a la primera columna número cero de izquierda a derecha.
  2. Si la primera fila tiene un cero en esta columna, intercambiarlo con otra que no lo tenga.
  3. Luego, obtener ceros debajo de este elemento delantero, sumando múltiplos adecuados del renglón superior a los renglones debajo de él.
  4. Cubrir el renglón superior y repetir el proceso anterior con la submatriz restante.

Este método se basa en la manipulación de ecuaciones y utiliza operaciones elementales en las filas de la matriz asociada, como intercambiar filas, multiplicar por un escalar y sumar o restar múltiplos de filas, para lograr la forma escalonada.

Es importante mencionar que si finalizamos las operaciones al hallar la forma escalonada reducida (forma lo más parecida a la matriz identidad), entonces el método se denomina eliminación de Gauss-Jordan.

<h6> <font font face = "arial"> Ejemplo </h6>

![Captura de pantalla 2024-03-14 081648](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/6d5bf86d-d638-49b6-832f-35c46df56603)


<h6> <font font face = "arial"> Solución </h6>

La matriz a resolver:

![Captura de pantalla 2024-03-14 082025](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/267ac5c3-b5d2-429b-865f-96311a6a5a1e)


De la tercera fila se obtiene 2z=2, es decir, z=1. De la segunda fila obtenemos y=-1. Finalmente de la primera fila se obtiene x+2y+z=0, es deci, x=1.

Concluimos que la solución del sistema de ecuaciones es:

**x=1 
y=−1 
z=1**

<h4> <font font face = "arial"> Implementación: </h4>

<h5> <font font face = "arial"> Ejemplo a resolver. </h5>

![Captura de pantalla 2024-03-14 083239](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/34355e8a-75a4-4020-afda-458b3d5a78e0)

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package eliminacióngaussiana.pkg1;
    
    public class EliminaciónGaussiana1 {
    
        public static void main(String[] args) {
            double[][] A = {{1, 2, 1}, {1, 0, 1}, {0, 1, 2}};
            double[] b = {0, 2, 1};
    
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


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-03-14 083727](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/25c8adaf-641e-49ca-9632-fd2420bfb9ce)


Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/Metodos_Numericos_Tema-3/tree/main/Eliminaci%C3%B3n%20Gaussiana"> <font font face = "arial"> https://github.com/rubivj13/Metodos_Numericos_Tema-3/tree/main/Eliminaci%C3%B3n%20Gaussiana </font> </a>
