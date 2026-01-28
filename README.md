# 🏭 Sistema de Gestión de Productos Agroalimentarios

[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

Sistema de gestión orientado a objetos para una empresa agroalimentaria que maneja diferentes tipos de productos alimenticios: frescos, refrigerados y congelados, con sus respectivas especificaciones técnicas.

## 📋 Tabla de Contenidos

- [Descripción](#-descripción)
- [Características](#-características)
- [Arquitectura del Proyecto](#-arquitectura-del-proyecto)
- [Jerarquía de Clases](#-jerarquía-de-clases)
- [Estructura del Código](#-estructura-del-código)
- [Instalación y Uso](#-instalación-y-uso)
- [Conceptos de POO Implementados](#-conceptos-de-poo-implementados)

## 🎯 Descripción

Este proyecto implementa un sistema de gestión de productos para una empresa agroalimentaria utilizando los principios de la Programación Orientada a Objetos (POO). El sistema permite categorizar y gestionar productos según su método de conservación y características específicas.

### Tipos de Productos Soportados:

- **Productos Frescos**: Producción reciente sin procesamiento especial
- **Productos Refrigerados**: Conservación a temperatura controlada
- **Productos Congelados**: Almacenados a temperaturas bajo cero
  - Por agua (salinidad)
  - Por aire (composición atmosférica)
  - Por nitrógeno (método y tiempo de exposición)

## ✨ Características

- ✅ **Herencia multinivel** hasta 4 niveles de profundidad
- ✅ **Encapsulamiento** completo con getters/setters
- ✅ **Polimorfismo** mediante sobrescritura del método `toString()`
- ✅ **Abstracción** de propiedades comunes en clases base
- ✅ Gestión especializada para diferentes métodos de congelación
- ✅ Trazabilidad completa: fecha de caducidad, lote, origen y envasado

## 🏗️ Arquitectura del Proyecto

```
Empresa-Agroalimentaria/
│
├── src/
│   ├── Producto.java          # Clase base
│   ├── Int1.java              # Capa intermedia 1
│   ├── Int2.java              # Capa intermedia 2
│   ├── Fresco.java            # Producto fresco
│   ├── Refigerado.java        # Producto refrigerado
│   ├── Congelado.java         # Producto congelado base
│   ├── Agua.java              # Congelado por agua
│   ├── Aire.java              # Congelado por aire
│   ├── Nitrogeno.java         # Congelado por nitrógeno
│   └── App.java               # Punto de entrada
│
├── bin/                       # Archivos compilados (.class)
├── lib/                       # Dependencias externas
└── README.md                  # Este archivo

```

## 🌳 Jerarquía de Clases

```
Producto (Base)
    │
    └── Int1 (Intermedia)
            │
            ├── Fresco
            │
            └── Int2 (Intermedia)
                    │
                    ├── Refigerado
                    │
                    └── Congelado
                            │
                            ├── Agua
                            ├── Aire
                            └── Nitrogeno
```

### Flujo de Herencia:

```
Producto → Int1 → Fresco
Producto → Int1 → Int2 → Refigerado
Producto → Int1 → Int2 → Congelado → Agua/Aire/Nitrogeno
```

## 📚 Estructura del Código

### 1️⃣ **Producto.java** - Clase Base

```java
public class Producto {
    String fecha_Caducidad;
    int num_lote;
    // Getters, setters y toString()
}
```

**Responsabilidades:**

- Define las propiedades básicas comunes a **todos** los productos
- `fecha_Caducidad`: Control de vida útil del producto
- `num_lote`: Trazabilidad de producción
- Proporciona el método `toString()` base que será extendido por las subclases

---

### 2️⃣ **Int1.java** - Clase Intermedia Nivel 1

```java
public class Int1 extends Producto {
    String pais_Origen;
    String fecha_Envasado;
}
```

**Responsabilidades:**

- Hereda de `Producto` y añade información de **origen y envasado**
- `pais_Origen`: Trazabilidad geográfica
- `fecha_Envasado`: Control de frescura desde el envasado
- **Extiende** el `toString()` para incluir esta nueva información
- Actúa como clase padre para productos frescos y refrigerados/congelados

---

### 3️⃣ **Fresco.java** - Producto Fresco

```java
public class Fresco extends Int1 {
    public Fresco(String fecha_Caducidad, int num_lote,
                  String fecha_Envasado, String pais_Origen) {
        super.fecha_Caducidad = fecha_Caducidad;
        // ...asignaciones directas a propiedades heredadas
    }
}
```

**Características clave:**

- Hereda directamente de `Int1`
- No añade atributos nuevos (solo usa los heredados)
- Constructor que inicializa todas las propiedades mediante acceso directo a campos `super`
- Sobrescribe `toString()` para identificar el tipo: `"Producto Fresco"`

---

### 4️⃣ **Int2.java** - Clase Intermedia Nivel 2

```java
public class Int2 extends Int1 {
    double temperatura;
}
```

**Responsabilidades:**

- Añade control de **temperatura** para productos que requieren refrigeración/congelación
- Crea una rama especializada en la jerarquía para productos con temperatura controlada
- Base común para `Refigerado` y `Congelado`

---

### 5️⃣ **Refigerado.java** - Producto Refrigerado

```java
public class Refigerado extends Int2 {
    public Refigerado(String fecha_Caducidad, int num_lote,
                      String fecha_Envasado, String pais_Origen,
                      double temperatura) {
        super.fecha_Caducidad = fecha_Caducidad;
        // ...
        super.temperatura = temperatura;
    }
}
```

**Características:**

- Productos que requieren almacenamiento en frío (generalmente 0-8°C)
- Utiliza todas las propiedades heredadas sin añadir nuevas
- El `toString()` indica: `"Congelado Refigerado"`

---

### 6️⃣ **Congelado.java** - Producto Congelado Base

```java
public class Congelado extends Int2 {
    // Constructor similar a Refigerado
}
```

**Función:**

- Clase base para los **tres tipos específicos de congelación**
- Representa productos almacenados a temperaturas bajo 0°C
- Actúa como interfaz común para `Agua`, `Aire` y `Nitrogeno`

---

### 7️⃣ **Agua.java** - Congelación por Agua

```java
public class Agua extends Congelado {
    double salinidad;

    public Agua(String fecha_Caducidad, int num_lote,
                String fecha_Envasado, String pais_Origen,
                double temperatura, double salinidad) {
        super(fecha_Caducidad, num_lote, fecha_Envasado,
              pais_Origen, temperatura);
        this.salinidad = salinidad;
    }
}
```

**Detalles técnicos:**

- Añade el atributo `salinidad` (nivel de sal en el agua de congelación)
- Importante para productos marinos congelados
- Utiliza `super()` para llamar al constructor de `Congelado`

---

### 8️⃣ **Aire.java** - Congelación por Aire

```java
public class Aire extends Congelado {
    double nitrogeno;
    double oxigeno;
    double co2;
    double vapor_Agua;
}
```

**Detalles técnicos:**

- Controla la **composición atmosférica** del aire de congelación
- `nitrogeno`, `oxigeno`, `co2`, `vapor_Agua`: Porcentajes de gases
- Método común en congelación industrial rápida (IQF - Individually Quick Frozen)

---

### 9️⃣ **Nitrogeno.java** - Congelación por Nitrógeno

```java
public class Nitrogeno extends Congelado {
    String metodo_Empleado;
    double tiempo_Expuesto;
}
```

**Detalles técnicos:**

- `metodo_Empleado`: Técnica de aplicación del nitrógeno (inmersión, spray, etc.)
- `tiempo_Expuesto`: Duración del proceso de congelación
- Utilizado para congelación ultra-rápida (-196°C con nitrógeno líquido)

---

### 🔟 **App.java** - Punto de Entrada

```java
public class App {
    public static void main(String[] args) throws Exception {
        Fresco f1 = new Fresco("18 Noviembre", 1, "10 Enero", "Spain");
        // ...
        System.out.println(f1);
    }
}
```

**Funcionalidad:**

- Crea instancias de prueba de cada tipo de producto
- Demuestra el polimorfismo mediante `toString()`
- Muestra la salida formateada de todos los productos

**Ejemplo de salida:**

```
*** Empresa Agroalimenticia ***
Tipo Producto: Producto Fresco
Fecha Caducidad: 18 Noviembre
Num Lote: 1
Fecha Envasado: 10 Enero
Pais de Origen: Spain
```

## 🚀 Instalación y Uso

### Prerrequisitos

- Java JDK 8 o superior
- Visual Studio Code (recomendado) o cualquier IDE Java

### Compilación y Ejecución

1. **Clonar el repositorio:**

   ```bash
   git clone [URL_DEL_REPOSITORIO]
   cd Empresa-Agroalimentaria
   ```

2. **Compilar el proyecto:**

   ```bash
   javac -d bin src/*.java
   ```

3. **Ejecutar la aplicación:**
   ```bash
   java -cp bin App
   ```

### Usando Visual Studio Code

1. Abrir la carpeta del proyecto en VSCode
2. Presionar `F5` o click en "Run" → "Run Without Debugging"
3. Visualizar la salida en la terminal integrada

## 🎓 Conceptos de POO Implementados

### 🔹 1. Herencia Multinivel

El proyecto demuestra herencia en **4 niveles**:

- `Producto` → `Int1` → `Int2` → `Congelado` → `Agua/Aire/Nitrogeno`

**Ventaja:** Reutilización de código y estructura jerárquica clara.

### 🔹 2. Encapsulamiento

Cada clase utiliza:

- Atributos con visibilidad por defecto (package-private)
- Métodos **getter** y **setter** para acceso controlado
- Ejemplo: `getFecha_Caducidad()` / `setFecha_Caducidad(String)`

### 🔹 3. Polimorfismo

El método `toString()` es sobrescrito en cada nivel:

```java
// En Producto
public String toString() {
    return "Fecha Caducidad: " + getFecha_Caducidad() + ...;
}

// En Int1
@Override
public String toString() {
    return super.toString() + "\nFecha Envasado: " + ...;
}

// En Fresco
@Override
public String toString() {
    return "Tipo Producto: Producto Fresco\n" + super.toString();
}
```

**Resultado:** Cada clase añade información específica manteniendo la de sus padres.

### 🔹 4. Abstracción

Las clases intermedias (`Int1`, `Int2`) **abstraen** propiedades comunes:

- `Int1`: Datos de origen y envasado
- `Int2`: Control de temperatura

Esto evita duplicación de código en clases especializadas.

### 🔹 5. Reutilización de Código

Beneficios observados:

- ✅ Los atributos básicos se definen **una sola vez** en `Producto`
- ✅ Cada nivel añade **solo** lo necesario
- ✅ Mantenimiento simplificado (cambio en `Producto` afecta a todos)

## 📝 Notas Técnicas

### Decisiones de Diseño

1. **Clases Intermedias (Int1, Int2):**
   - Facilitan la extensibilidad futura
   - Agrupan atributos por categoría funcional

2. **Acceso Directo a Campos (`super.campo`):**
   - Usado en constructores para inicialización directa
   - Alternativa: usar setters heredados

3. **Métodos `toString()` Encadenados:**
   - Cada nivel llama a `super.toString()` y añade su información
   - Genera salidas completas automáticamente

### Mejoras Potenciales

- [ ] Implementar interfaces para comportamientos comunes
- [ ] Añadir validación de datos en setters
- [ ] Crear clases abstractas para forzar implementación de métodos
- [ ] Implementar persistencia de datos (BD o archivos)
- [ ] Añadir manejo de excepciones personalizado

## 📄 Licencia

Este proyecto es parte de material educativo para aprendizaje de POO en Java.

---

**Desarrollado como proyecto académico - Programación Orientada a Objetos**

> 💡 **Nota**: Este proyecto es ideal para comprender herencia multinivel, polimorfismo y diseño orientado a objetos en contextos reales.
