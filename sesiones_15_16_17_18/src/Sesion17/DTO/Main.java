package Sesion17.DTO;

public class Main {
    public static void main(String []args) {
        Usuario usuario = new Usuario("pepe");
        usuario.añadirVehiculo(new Vehiculo("Coche"));

        Usuario usuario2 = new Usuario("juan");
        usuario2.añadirVehiculo(new Vehiculo("Moto "));
        usuario2.añadirVehiculo(new Vehiculo("Coche "));

        Usuarios usuarios = new Usuarios();
        usuarios.añadirUsuario(usuario);
        usuarios.añadirUsuario(usuario2);

        Usuario userInfo = usuarios.obtenerUsuario("juan");
        System.out.println("Listando informacion de: " + userInfo.nombre);
        for (Vehiculo vehiculo : userInfo.vehiculos) {
            System.out.println(vehiculo.nombre);
        }
    }
}
