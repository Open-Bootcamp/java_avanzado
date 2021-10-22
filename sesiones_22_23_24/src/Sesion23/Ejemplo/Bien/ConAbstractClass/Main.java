package Sesion23.Ejemplo.Bien.ConAbstractClass;

public class Main {
    public static void main(String []args) {
        CocheMotor coche = new CocheMotor();
        System.out.println(coche.getTipoVehiculo());

        CocheElectrico cocheElectrico = new CocheElectrico();
        System.out.println(cocheElectrico.getTipoVehiculo());
    }
}
