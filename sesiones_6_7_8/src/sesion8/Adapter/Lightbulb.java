package sesion8.Adapter;

public class Lightbulb {
    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        this.poweredOn = true;
        this.voltage = voltage;
    }

    public void turnOff() {
        this.poweredOn = false;
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }
}
