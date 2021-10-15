package sesion7.Builder;

public class Main {
    public static void main(String []args) {
        Vehiculo coche = new CocheBuilder("Filostro")
                .setTipo("Diesel")
                .setMotor("Combustion")
                .setPuertas(5)
                .build();

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Tipo: " + coche.getTipo());
        System.out.println("Motor: " + coche.getMotor());
        System.out.println("Puertas: " + coche.getPuertas());

    }
}
