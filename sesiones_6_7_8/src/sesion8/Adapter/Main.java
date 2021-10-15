package sesion8.Adapter;

public class Main {
    public static void main(String []args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        AdaptadorIngles lightbulb = new AdaptadorIngles();

        enciende(horno);
        enciende(lampara);
        enciende(lightbulb);

        System.out.println("Tiene corriente el horno: " + horno.tieneCorriente());
        System.out.println("Tiene corriente la lampara: " + lampara.tieneCorriente());
        System.out.println("Tiene corriente la bombilla inglesa: " + lightbulb.tieneCorriente());

        apaga(horno);
        apaga(lampara);
        apaga(lightbulb);

        System.out.println("Tiene corriente el horno: " + horno.tieneCorriente());
        System.out.println("Tiene corriente la lampara: " + lampara.tieneCorriente());
        System.out.println("Tiene corriente la bombilla inglesa: " + lightbulb.tieneCorriente());

    }

    public static void enciende(Enchufable enchufable) {
        enchufable.enciende();
    }

    public static void apaga(Enchufable enchufable) {
        enchufable.apaga();
    }
}
