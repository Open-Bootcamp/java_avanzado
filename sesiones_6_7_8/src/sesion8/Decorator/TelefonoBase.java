package sesion8.Decorator;

public class TelefonoBase implements Telefono {
    @Override
    public void crear() {
        System.out.println("Soy un teléfono basico. Mis carácteristicas son: ");

        this.tengoGSM();
        this.tengoSMS();
    }

    private void tengoGSM() {
        System.out.println("  -> Red 2G/3G");
    }

    private void tengoSMS() {
        System.out.println("  -> SMS/MMS");
    }
}
