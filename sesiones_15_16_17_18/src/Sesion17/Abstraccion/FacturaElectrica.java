package Sesion17.Abstraccion;

abstract class FacturaElectrica
{
    double impuesto = 21;

    public FacturaElectrica() {
        System.out.println("Instancia de facturación creada");
    }

    double obtenerImpuesto(double precio) {
        return precio * impuesto / 100;
    }

    abstract double calcular();
}

class FacturaElectricaEmpresa extends FacturaElectrica
{
    @Override
    double calcular() {
        return 0.55 + obtenerImpuesto(0.55);
    }
}

class FacturaElectricaUsuario extends FacturaElectrica
{
    @Override
    double calcular() {
        return 0.10 + obtenerImpuesto(0.10);
    }
}