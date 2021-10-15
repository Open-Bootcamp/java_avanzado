package sesion7.Prototype;

public class Moto extends Vehiculo {
    private int cilindrada;

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }

    public Moto clonar() {
        Moto clon = new Moto();
        clon.cilindrada = this.cilindrada;

        return clon;
    }
}
