package Sesion23.Ejemplo.Bien.ConInterface;

class CocheElectrico implements Vehiculo {
    String tipo;
    String bateria;

    public CocheElectrico() {
        this.tipo = "Electrico";
        this.bateria = "si";
    }

    @Override
    public String getTipoVehiculo() {
        return tipo;
    }

    public String getBaterias() {
        return this.bateria;
    }
}
