# Actividad 1: Cuenta Bancaria

Empleando **Java**, cree una clase `CuentaBancaria` con los siguientes atributos:

- **Número de cuenta** (entero largo)
- **DNI del cliente** (entero largo)
- **Saldo actual** (`double`)
- **Interés anual** aplicado a la cuenta (porcentaje)

## Métodos requeridos

- **Constructor por defecto** y **constructor** con DNI, saldo e interés.
- `actualizarSaldo()`: actualizará el saldo de la cuenta aplicándole el interés diario (interés anual dividido entre 365 aplicado al saldo actual).
- `ingresar(double)`: permitirá ingresar una cantidad en la cuenta.
- `retirar(double)`: permitirá sacar una cantidad de la cuenta (si hay saldo).
- Método para **mostrar todos los datos** de la cuenta.
- El **número de cuenta** se asignará de forma correlativa a partir de `100001`, asignando el siguiente número al último asignado.