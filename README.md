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
Funcionalidades implementadas en esta tercera etapa:

RF01: Registro de calles e intersecciones
  Permite registrar intersecciones y conectarlas mediante calles dentro del grafo de la ciudad.
  Demostrado en: MainPrueba.java

RF02: Consulta de rutas entre distintos puntos de la ciudad

  Permite consultar la conectividad entre puntos y rutas viables a través de toda la red de calles de la ciudad.

  Demostrado en: MainPrueba.java

RF03: Determinación de caminos mínimos

  Se implementó el algoritmo Dijkstra para establecer las rutas mas rapidas entre un origen y un destino en cada consulta de rutas para asi obtener siempre el resultado mas optimo

  Demostrado en: MainPrueba.java


RF04: Registro y priorización de emergencias mediante una cola de prioridad.
  Probado en: 
  TestEmergencias.java
  MainPrueba.java
RF05: Administración de dispositivos inteligentes

  Permite registrar, buscar, eliminar y actualizar dispositivos inteligentes mediante un diccionario.

  Demostrado en: MainPrueba.java

RF06: Organización territorial de la ciudad:
Probado en:
  TestCiudad.java
RF07: Gestión del flujo vehicular en intersecciones mediante una cola FIFO.
  Probado en: 
  TestIntersecciones.java
  MainPrueba.java

RF08: Consulta de la emergencia más grave utilizando el método verFrente().
  Probado en: 
  TestCiudad.java
  TestGestionRutas.java
  TestIntersecciones.java
  TestEmergencias.java
  TestDispositivos.java
  TestCiudadInteligente.java
  Main.java


RF09: Control de errores al intentar operar sobre estructuras vacías.
  Probado en:
    TestEmergencias.java
    TestIntersecciones.java
    MainPrueba.java

RF10: Integración de los módulos del sistema
Permite simular el flujo completo de una emergencia desde su reporte, registro en la central, cálculo de rutas gestión de dispositivos, liberación del flujo vehicular y despacho de unidades de emergencia.

Probado en:
TestCiudadInteligente.java

Link del repositorio: https://github.com/sharon021/progra2.git
