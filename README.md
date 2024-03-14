# Metodos_Numericos_Tema-3
<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> SALUDO </i> </b> </font> </h1>

¡Hola a todos! Soy Rubí Veloz Jiménez, estudiante de Ingeniería en Sistemas Computacionales. En esta ocasión, les presento un problemario relacionado con la materia de Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales( Eliminación Gaussiana, Método de Gauss-Jordan, Método de Gauss-Seidel y Método de Jacobi).

<h2 align = "center"> <font color = "darkorange" size = "+6"  font face = "bauhaus 93">  INDICE </font> </h2>
<header> <font color = "red" size="+1" font face = "aharoni">
                <nav class="navegacion">
                    <ul class="Indice">
                       <li> <a href="#Descripción del Problemario"> Descripción del Problemario. </a> <br> </li>
                        <li> <a href="#SOBRE LA MATERIA"> SOBRE LA MATERIA. </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Competencia de la Asignatura"> Competencia de la Asignatura. </a> </li>
                                <li> <a href="#Competencia del TEMA"> Competencia del TEMA. </a> </li>
                                <li> <a href="#TEMARIO"> TEMARIO. </a> </li>  
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

Claro, con gusto te proporciono una breve descripción de cada uno de los métodos solicitados:

1. **Eliminación Gaussiana**:
   - También conocido como **método de eliminación de Gauss**, este algoritmo se utiliza para resolver sistemas de ecuaciones lineales. Aquí están los pasos clave:
   - Se trabaja con la **matriz ampliada** del sistema (que incluye los coeficientes de las incógnitas y los términos independientes).
   - Mediante operaciones de fila (intercambio, suma y multiplicación), se transforma la matriz ampliada en una **forma escalonada** (matriz triangular superior).
   - Luego, se resuelve el sistema sustituyendo hacia atrás desde la última fila.
   - Si se llega a la **forma escalonada reducida**, se denomina **eliminación de Gauss-Jordan**.
   - La clasificación del sistema (compatible determinado, indeterminado o incompatible) se deduce de la forma escalonada de la matriz ampliada.

2. **Método de Gauss-Jordan**:
   - Este método es una variante de la eliminación de Gauss.
   - Después de obtener la forma escalonada, se continúa hasta alcanzar la **forma escalonada reducida** (similar a la matriz identidad).
   - La matriz resultante proporciona directamente las soluciones del sistema de ecuaciones.
   - Útil para encontrar la **inversa de una matriz** y resolver sistemas de ecuaciones lineales.

3. **¿Método de Gauss-Seidel**:
   - Este método se utiliza para resolver sistemas de ecuaciones lineales **iterativamente**.
   - Se basa en la descomposición de la matriz de coeficientes en una parte diagonal y una parte no diagonal.
   - En cada iteración, se actualizan las incógnitas utilizando los valores anteriores.
   - Adecuado para sistemas con **matrices simétricas y dominantes**.
   - Converge más rápido si la matriz es **diagonalmente dominante**.

4. **Método de Jacobi**:
   - Similar al método de Gauss-Seidel, es otra técnica iterativa para resolver sistemas de ecuaciones lineales.
   - Divide la matriz de coeficientes en una parte diagonal y una parte no diagonal.
   - En cada iteración, se actualizan las incógnitas utilizando los valores iniciales.
   - Adecuado para sistemas con **matrices diagonales dominantes**.
   - Puede ser menos eficiente que Gauss-Seidel en términos de convergencia.

