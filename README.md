# Caso_Final_Integrador_Tema5

Link con acceso al repositorio con el código:

https://github.com/GabriHR/Caso_Final_Integrador_Tema5.git


# RÚBRICA DEL TRABAJO

## Estructura de clases:

En el package Análisis Genómico aparecen dos clases: Conteo_Genes y Combinaciones_Geneticas.
  - La clase CONTEO_GENES tiene un método estático llamado countGenes que cuenta el número de veces que aparece el codón "ATG" en una cadena de ADN. Este método toma una cadena de ADN y un índice como parámetros. Verifica si hay suficientes nucleótidos restantes para formar un codón y si el codón actual es "ATG". Si es así, incrementa el contador y avanza al siguiente codón. Si no, avanza al siguiente nucleótido. Este proceso continúa recursivamente hasta que se examinan todos los nucleótidos, devolviendo el número total de codones "ATG" encontrados.
    
  - La clase COMBINACIONES_GENETICAS tiene dos métodos estáticos para calcular el coeficiente binomial: calcularCombinacionesRecursivo y calcularCombinacionesIterativo.
calcularCombinacionesRecursivo utiliza un enfoque recursivo para calcular el coeficiente binomial, siguiendo la identidad matemática C(n, k) = C(n-1, k-1) + C(n-1, k). Retorna 1 si k es 0 o igual a n, de            lo contrario, llama recursivamente al método.
calcularCombinacionesIterativo utiliza un enfoque iterativo que llena una matriz C de tamaño (n+1) x (k+1) y calcula los valores basándose en la misma identidad matemática. Retorna C[n][k].
Ambos métodos proporcionan el mismo resultado, pero el enfoque iterativo suele ser más eficiente ya que evita la sobrecarga de las llamadas recursivas.
