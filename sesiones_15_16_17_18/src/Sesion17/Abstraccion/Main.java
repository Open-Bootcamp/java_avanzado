package Sesion17.Abstraccion;

public class Main {
    public static void main(String []args) {
        FacturaElectricaEmpresa factura = new FacturaElectricaEmpresa();
        System.out.println(factura.calcular());

        FacturaElectricaUsuario factura2 = new FacturaElectricaUsuario();
        System.out.println(factura2.calcular());
    }
}
