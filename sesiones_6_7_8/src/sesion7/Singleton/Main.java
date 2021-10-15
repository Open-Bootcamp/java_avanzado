package sesion7.Singleton;

public class Main {
    public static void main(String []args) {
        Singleton misingleton = Singleton.getInstance();
        misingleton.setContador(15);

        Singleton miSingleton2 = Singleton.getInstance();
        System.out.println("El contador es: " + miSingleton2.getContador());
    }
}
