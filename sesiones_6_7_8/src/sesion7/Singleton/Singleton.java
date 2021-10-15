package sesion7.Singleton;

public class Singleton {
    private static Singleton instancia;
    public int contador = 0;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }

        return instancia;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }
}
