package sesion8.Decorator;

public class Main {
    public static void main(String []args) {
        Telefono telefonoBasico = new TelefonoBase();
        telefonoBasico.crear();

        Telefono telefonoInteligente = new TelefonoInteligente(new TelefonoBase());
        telefonoInteligente.crear();

        Telefono telefonoNextGen = new TelefonoNextGen(
                new TelefonoInteligente(
                        new TelefonoBase()
                )
        );
        telefonoNextGen.crear();

        Telefono telefonoNextGen2 = new TelefonoNextGen(new TelefonoBase());
        telefonoNextGen2.crear();

    }
}
