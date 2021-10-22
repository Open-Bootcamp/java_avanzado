package Sesion23.Ejemplo.Bien.ConInterface;

class Coche implements Vehiculo {
    String tipo;

    public Coche() {
        this.tipo = "Motor";
    }

    @Override
    public String getTipoVehiculo() {
        return tipo;
    }
}
