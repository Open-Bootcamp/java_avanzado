package sesion7.PrototypeClonable;

import sesion7.PrototypeClonable.Vehiculo;

public class Moto extends Vehiculo implements Cloneable {
    private int cilindrada;

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }

    public Moto clonar() throws CloneNotSupportedException {
        return (Moto) this.clone();
    }

}
