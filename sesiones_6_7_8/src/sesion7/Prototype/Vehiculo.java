package sesion7.Prototype;

public class Vehiculo {
    public String marca;
    public String modelo;
    int anyoFabricacion;

    public Vehiculo() {}

    public Vehiculo clonar() {
        Vehiculo clon = new Vehiculo();

        clon.modelo = this.modelo;
        clon.marca = this.marca;
        clon.anyoFabricacion = this.anyoFabricacion;

        return clon;
    }
}
