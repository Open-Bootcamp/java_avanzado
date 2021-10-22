package Sesion24.Ejemplo.Bien;

public class AritmeticaMejorada extends Aritmetica {
    @Override
    public int suma(int A, int B) {
        return A + B;
    }

    @Override
    public int multiplicacion(int A, int B) {
        return A * B;
    }

    @Override
    public int resta(int A, int B) {
        return A - B;
    }

    @Override
    public int division(int A, int B) {
        return A / B;
    }
}
