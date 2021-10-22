package Sesion22.Ejemplo.Bien;

import java.util.ArrayList;

public class VehiculoDB {
    ArrayList<String> vehiculos = new ArrayList();

    void guardarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo.tipo);
    }
}
