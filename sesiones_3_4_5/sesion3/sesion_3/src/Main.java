import sesion3.Sesion3;

public class Main {
    public static void main(String []args) {
        System.out.println(Sesion3.factorialIterativo(5));
        System.out.println(Sesion3.factorialRecursivo(5));
        System.out.println(Sesion3.factorialFuncional(5));

        System.out.println(Sesion3.sumaIterativa(5));
        System.out.println(Sesion3.sumaRecursiva(5));
        System.out.println(Sesion3.sumaFuncional(5));

        Sesion3 sesion3 = new Sesion3();
        System.out.println(sesion3.sumaFuncionalVariable.apply(5));
    }
}
