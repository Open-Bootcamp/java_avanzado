package sesion8.Decorator;

public class TelefonoNextGen extends TelefonoDecorator {
    public TelefonoNextGen(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear() {
        super.crear();

        System.out.println("Características de próxima generación: ");
        this.tengo5G();
        this.pantallaPlegable();
    }

    public void tengo5G() {
        System.out.println("    -> Tengo 5G");
    }

    public void pantallaPlegable() {
        System.out.println("    -> Pantalla plegable");
    }
}
