package Sesion23.Ejemplo.Mal;

class Vehiculo {
    String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoVehiculo() {
        return tipo;
    }
}

// Luego:
/*
class Vehiculo {
    String tipo;
    String bateria;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
        this.bateria = "si";
    }

    public String getTipoVehiculo() {
        return tipo;
    }

    public String getBaterias() {
        return this.bateria;
    }
}
*/