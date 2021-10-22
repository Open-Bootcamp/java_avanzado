package Sesion22.Ejemplo.Mal;

import java.util.ArrayList;

class Vehiculo {
    ArrayList<String> vehiculos = new ArrayList();
    String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoVehiculo() {
        return tipo;
    }

    void guardarVehiculoDB(Vehiculo vehiculo) {
        vehiculos.add(vehiculo.tipo);
    }
}
