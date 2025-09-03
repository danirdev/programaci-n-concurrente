## Solución en pseudocódigo usando semáforos

```pseudo

// Semáforos para cada cuadrante
semaforo cuadrante1 = 1
semaforo cuadrante2 = 1
semaforo cuadrante3 = 1
semaforo cuadrante4 = 1

proceso Auto(sentido)

    si sentido == N entonces
        wait(cuadrante1)
        wait(cuadrante2)
        cruzar()
        signal(cuadrante2)
        signal(cuadrante1)
    fin si

    si sentido == O entonces
        wait(cuadrante2)
        wait(cuadrante3)
        cruzar()
        signal(cuadrante3)
        signal(cuadrante2)
    fin si

    si sentido == S entonces
        wait(cuadrante3)
        wait(cuadrante4)
        cruzar()
        signal(cuadrante4)
        signal(cuadrante3)
    fin si

    si sentido == E entonces
        wait(cuadrante4)
        wait(cuadrante1)
        cruzar()
        signal(cuadrante1)
        signal(cuadrante4)
    fin si

fin proceso

// Crear y lanzar autos (hilos)
iniciar hilo Auto(N)
iniciar hilo Auto(O)
iniciar hilo Auto(S)
iniciar hilo Auto(E)

```

**Nota:** Para evitar interbloqueo, todos los autos deben tomar los semáforos en el mismo orden (por ejemplo, primero el menor número y luego el mayor). Si se respeta este orden, no se producirá interbloqueo.
