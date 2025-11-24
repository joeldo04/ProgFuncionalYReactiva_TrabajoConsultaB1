# Programación Funcional y Reactiva
## Trabajo de Consulta: Higher Order Functions

### Objetivos
- Aplicar los conocimientos sobre funciones de orden superior
- Enviar una función como parámetro

---

### Descripción

Este proyecto implementa el método de **Simpson 1/3** para integración numérica. Este método permite aproximar el valor de una integral definida mediante la siguiente fórmula:

```
∫ᵇₐ f(x)dx ≅ (b - a) · [f(a) + 4f(x̄) + f(b)] / 6
```

Donde:
```
x̄ = (a + b) / 2
```

#### Ejemplo de aproximación:
```
I = ∫₃⁵ (-x² + 8x - 12)dx ≅ 7.33
```

---

###  Implementación

#### 1. Función `integracion`

Crear una función que utilice el método de Simpson para calcular el valor aproximado de cualquier función `f(x)`.

**Consideraciones:**
- Determinar el tipo de dato que devolverá la función
- Identificar los parámetros que recibe la función (límites de integración y función a integrar)

#### 2. Aproximaciones a calcular

Usar la función `integracion` para aproximar las siguientes integrales definidas:

**Integral 1:**
```
f(x) = -x² + 8x - 12
Límites: a = 3, b = 5
Valor esperado: 7.33

I = ∫₃⁵ (-x² + 8x - 12)dx ≅ 7.33
```

**Integral 2:**
```
f(x) = 3x²
Límites: a = 0, b = 2
Valor esperado: 8

I = ∫₀² 3x²dx ≅ 8
```

**Integral 3:**
```
f(x) = x + 2x² - x³ + 5x⁴
Límites: a = -1, b = 1
Valor esperado: 3.333

I = ∫₋₁¹ (x + 2x² - x³ + 5x⁴)dx ≅ 3.333
```

**Integral 4:**
```
f(x) = (2x + 1) / (x² + x)
Límites: a = 1, b = 2
Valor esperado: 1.09861

I = ∫₁² (2x + 1)/(x² + x)dx ≅ 1.09861
```

**Integral 5:**
```
f(x) = eˣ
Límites: a = 0, b = 1
Valor esperado: 1.71828

I = ∫₀¹ eˣdx ≅ 1.71828
```

**Integral 6:**
```
f(x) = 1 / (x - 1)
Límites: a = 2, b = 3
Valor esperado: 0.828427

I = ∫₂³ 1/(x - 1)dx ≅ 0.828427
```

**Integral 7:**
```
f(x) = 1 / (1 + x²)
Límites: a = 0, b = 1
Valor esperado: 0.785398

I = ∫₀¹ 1/(1 + x²)dx ≅ 0.785398
```

#### 3. Cálculo del error

Elaborar una función que calcule el error de cada aproximación mediante:

```
Error = |valorEsperado - valorObtenido|
```


### Uso

```
// Ejemplo de uso
resultado = integracion(f, a, b)
error = calcularError(valorEsperado, resultado)
```

---

### Documentación

La documentación completa del proyecto se encuentra en: 
