Nombre del proyecto: Ciudad Inteligente

Integrantes del grupo: 
Sharon Melanie Flores Garcia
– LU11718813
Valentin Alejandro Nillcon
– LU1213259
Brian Federico Masiero
– LU1168672

Alternativa elegida: B - Sistema Inteligente de Tráfico y Emergencias

Estructuras de datos utilizadas:

Lista simplemente enlazada para la gestión de calles (ListaCalles).
Lista simplemente enlazada para la gestión de intersecciones (ListaIntersecciones).
Cola FIFO para la administración del flujo vehicular en intersecciones (ColaVehiculos).
Cola de prioridad implementada mediante lista enlazada ordenada para la gestión de emergencias (ColaDePrioridadDeEmergencia).
Diccionario implementado mediante lista enlazada de clave-valor para la gestión de dispositivos (DiccionariosDeDispositivos).
Estructura jerárquica enlazada para la organización territorial de la ciudad (Ciudad, Zona, Barrio y Manzana).
Funcionalidades implementadas en esta segunda etapa:

RF01: Registro de calles e intersecciones
  Permite registrar intersecciones y conectarlas mediante calles dentro del grafo de la ciudad.
  Demostrado en: MainPrueba.java

RF02: Consulta de rutas entre distintos puntos de la ciudad

  Permite consultar rutas entre intersecciones conectadas.

  Demostrado en: MainPrueba.java

RF03: Determinación de caminos mínimos

  Se implementó la estructura del grafo para calcular rutas entre intersecciones.

  Demostrado en: MainPrueba.java


RF04: Registro y priorización de emergencias mediante una cola de prioridad.
  Probado en: 
  TestEmergencias.java
  MainPrueba.java
RF05: Administración de dispositivos inteligentes

  Permite registrar, buscar y actualizar dispositivos inteligentes mediante un diccionario.

  Demostrado en: MainPrueba.java


RF07: Gestión del flujo vehicular en intersecciones mediante una cola FIFO.
  Probado en: 
  TestIntersecciones.java
  MainPrueba.java

RF08: Consulta de la emergencia más grave utilizando el método verFrente().
  Probado en: 
  TestEmergencias.java
  MainPrueba.java


RF09: Control de errores al intentar operar sobre estructuras vacías.
  Probado en:
    TestEmergencias.java
    TestIntersecciones.java
    MainPrueba.java

Link del repositorio: https://github.com/sharon021/progra2.git