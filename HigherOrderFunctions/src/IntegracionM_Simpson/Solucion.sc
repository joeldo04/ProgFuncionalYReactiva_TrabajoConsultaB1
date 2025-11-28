// Metodo de Integración Simpson 1/3
def integracion(f: Double => Double, a: Double, b: Double): Double =
  (b - a) * (f(a) + 4 * f((a + b) / 2) + f(b)) / 6

// Función para calcular error 
def calcularError(esperado: Double, obtenido: Double): Double =
  math.abs(esperado - obtenido)

// Ejercicio 1
val funcion1: Double => Double = x => -math.pow(x, 2) + 8 * x - 12
val esperado1: Double = 7.33
val obtenido1: Double = integracion(funcion1, 3, 5)
val error1: Double = calcularError(esperado1, obtenido1)

// Ejercicio 2
val funcion2: Double => Double = x => 3 * math.pow(x, 2)
val esperado2: Double = 8.0
val obtenido2: Double = integracion(funcion2, 0, 2)
val error2: Double = calcularError(esperado2, obtenido2)

// Ejercicio 3
val funcion3: Double => Double = x => x + 2 * math.pow(x, 2) - math.pow(x, 3) + 5 * math.pow(x, 4)
val esperado3: Double = 3.333
val obtenido3: Double = integracion(funcion3, -1, 1)
val error3: Double = calcularError(esperado3, obtenido3)

// Ejercicio 4
val funcion4: Double => Double = x => (2 * x + 1) / (math.pow(x, 2) + x)
val esperado4: Double = 1.09861
val obtenido4: Double = integracion(funcion4, 1, 2)
val error4: Double = calcularError(esperado4, obtenido4)

// Ejercicio 5
val funcion5: Double => Double = x => math.exp(x)
val esperado5: Double = 1.71828
val obtenido5: Double = integracion(funcion5, 0, 1)
val error5: Double = calcularError(esperado5, obtenido5)

// Ejercicio 6
val funcion6: Double => Double = x => 1 / math.sqrt(x - 1)
val esperado6: Double = 0.828427
val obtenido6: Double = integracion(funcion6, 2, 3)
val error6: Double = calcularError(esperado6, obtenido6)

// Ejercicio 7
val funcion7: Double => Double = x => 1 / (1 + math.pow(x, 2))
val esperado7: Double = 0.785398
val obtenido7: Double = integracion(funcion7, 0, 1)
val error7: Double = calcularError(esperado7, obtenido7)