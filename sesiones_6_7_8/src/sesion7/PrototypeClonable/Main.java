package sesion7.PrototypeClonable;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.marca = "Ford";
        vehiculo.modelo = "Mondeo";

        try {
            Vehiculo vehiculo2 = vehiculo.clonar();
            System.out.println(vehiculo2.marca);
            vehiculo2.marca = "Honda";
            System.out.println(vehiculo2.marca);

            Vehiculo vehiculo3 = vehiculo.clonar();
            System.out.println(vehiculo3.marca);
        } catch (CloneNotSupportedException e) {
            System.out.println("No he podido clonar vehículo: " + e.getMessage());
        }

        try {
            Moto moto = new Moto();
            moto.setCilindrada(150);

            Moto moto2 = moto.clonar();
            System.out.println("La cilindrada de moto2 es: " + moto2.getCilindrada());
        } catch (CloneNotSupportedException e) {
            System.out.println("No he podido clonar la moto: " + e.getMessage());
        }
    }
}
