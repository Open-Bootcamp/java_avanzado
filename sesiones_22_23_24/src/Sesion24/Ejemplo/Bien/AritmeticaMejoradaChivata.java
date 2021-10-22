package Sesion24.Ejemplo.Bien;

public class AritmeticaMejoradaChivata extends Aritmetica {
    @Override
    public int suma(int A, int B) {
        System.out.println("Estoy en suma()");
        return A + B;
    }

    @Override
    public int multiplicacion(int A, int B) {
        System.out.println("Estoy en multiplicacion()");
        return A * B;
    }

    @Override
    public int resta(int A, int B) {
        System.out.println("Estoy en resta()");
        return A - B;
    }

    @Override
    public int division(int A, int B) {
        System.out.println("Estoy en division()");
        return A / B;
    }
}
