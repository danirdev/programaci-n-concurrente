# Actividad 3: Interfaces Bancarias

Cree una interfaz llamada **OperacionesComunes** con:

- **3 atributos**
- **2 métodos**: `pagarServicio()` y `cambiarAlias()`

Cree otra interfaz llamada **OperacionesImportantes** con:

- Un método: `transferenciaAltoMonto(double monto)`

La interfaz **OperacionesBancarias** hereda de **OperacionesComunes** y **OperacionesImportantes**.

Luego, la clase `CuentaSueldo` debe implementar la interfaz **OperacionesBancarias**.