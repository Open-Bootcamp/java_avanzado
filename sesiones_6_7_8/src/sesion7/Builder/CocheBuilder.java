package sesion7.Builder;

public class CocheBuilder {
    Vehiculo vehiculo;

    private CocheBuilder() {};

    public CocheBuilder(String marca) {
        vehiculo = new Vehiculo(marca);
        vehiculo.marca = marca;
    }

    public CocheBuilder setPuertas(int puertas) {
        vehiculo.puertas = puertas;
        return this;
    }

    public CocheBuilder setMotor(String motor) {
        vehiculo.motor = motor;
        return this;
    }

    public CocheBuilder setTipo(String tipo) {
        vehiculo.tipo = tipo;
        return this;
    }

    public Vehiculo build() {
        return this.vehiculo;
    }
}