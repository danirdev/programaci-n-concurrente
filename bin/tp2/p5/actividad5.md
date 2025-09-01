### Consigna:

[cite_start]Cuáles son los posibles valores de `x`[cite: 41].

global int y = 0, z = 0;

thread {
y = 1;
}

thread {
z = 2;
}

int x;
x = y + z;

