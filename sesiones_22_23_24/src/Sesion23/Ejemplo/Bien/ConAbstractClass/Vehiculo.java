package Sesion23.Ejemplo.Bien.ConAbstractClass;

abstract class Vehiculo {
    String tipo;

    protected Vehiculo() {}
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoVehiculo() {
        return tipo;
    }
}

