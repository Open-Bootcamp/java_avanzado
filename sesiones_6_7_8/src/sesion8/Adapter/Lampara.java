package sesion8.Adapter;

public class Lampara implements Enchufable {
    boolean corriente = false;

    public void enciende() {
        corriente = true;
    }

    public void apaga() {
        corriente = false;
    }

    public boolean tieneCorriente() {
        return corriente;
    }
}
