package Sesion24.Ejemplo.Bien;

public class Main {
    public static void main(String []args) {
        Aritmetica ari = new AritmeticaMejorada();
        ari.suma(2, 2);

        Aritmetica arimejor = new AritmeticaMejoradaChivata();
        arimejor.suma(2, 2);
    }
}
