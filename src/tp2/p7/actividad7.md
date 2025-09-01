### Consigna:

Considere los siguientes hilos:

// Hilo 1
thread {
print("R");
print("ok");
}

// Hilo 2
thread {
print("I");
print("OK");
}

// Hilo 3
thread {
print("O");
print("OK");
}

[cite_start]Empleando semáforos, se debe asegurar que el resultado final de la impresión sea **"RIO OK OK OK"**[cite: 77].