package Sesion23.Ejemplo.Bien.ConAbstractClass;

class CocheElectrico extends Vehiculo {
    String bateria;

    public CocheElectrico() {
        super("Electrico");
        this.bateria = "si";
    }

    public String getBaterias() {
        return this.bateria;
    }
}