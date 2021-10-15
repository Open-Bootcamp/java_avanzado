package sesion8.Decorator;

public class TelefonoInteligente extends TelefonoDecorator {
    public TelefonoInteligente(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear() {
        super.crear();

        System.out.println("Características extra: ");
        this.tengo4G();
    }

    public void tengo4G() {
        System.out.println("    -> Tengo 4G");
    }
}
