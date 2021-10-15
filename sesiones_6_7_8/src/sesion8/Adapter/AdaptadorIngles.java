package sesion8.Adapter;

public class AdaptadorIngles implements Enchufable {
    public Lightbulb lightbulb = new Lightbulb();

    public void enciende() {
        lightbulb.turnOn(110);
    }

    public void apaga() {
        lightbulb.turnOff();
    }

    public boolean tieneCorriente() {
        return lightbulb.isPoweredOn();
    }
}
