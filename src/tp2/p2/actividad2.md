### Consigna:

[cite_start]Considerando el siguiente programa concurrente, calcular para él, el conjunto de los posibles valores finales para la variable `x`[cite: 13].

**Variables:**
* `x: Ent := 0`
* `s1: sem := 1`
* `s2: sem := 0`

**Procesos:**
* **P1::**
    * `wait(s1)`
    * `x := x * x`
    * `send(s1)`
* **P2::**
    * `wait(s2)`
    * `wait(s1)`
    * `x := 2 * x`
    * `send(s1)`
* **P3::**
    * `wait(s1)`
    * `x := x + 3`
    * `send(s2)`
    * `send(s1)`