package tp1.p3;

public interface IOperacionesComunes {
    // En interfaces los atributos son implícitamente public static final
    String banco = "Banco Ejemplo";
    String moneda = "ARS";
    double costoServicio = 500;

    void pagarServicio();
    void cambiarAlias(String nuevoAlias);
}
