package Sesion22.Ejemplo.Bien;

public class Main {
    public static void main(String []args) {
        Vehiculo vehiculo = new Vehiculo("Coche");

        VehiculoDB vehiculoDB = new VehiculoDB();
        vehiculoDB.guardarVehiculo(vehiculo);
    }
}
