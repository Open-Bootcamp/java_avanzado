package Sesion19;

public class main {
    public static void main(String []args) {
        argsDemo1(args);
        argsDemo2(args);
        argsDemo3(args);
        argsDemo4(args);
        argsDemo5(args);
    }

    public static void argsDemo1(String []args) {
        int parametros = args.length;
        System.out.println("Número de parámetros de entrada: " + parametros);
    }

    public static void argsDemo2(String []args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Parámetro en posición " + i + ": " + args[i]);
        }
    }

    public static void argsDemo3(String []args) {
        /*
         *   +----------+----+----------+-----+
         *   | 0        | 1  | 2        | 3   | ...
         *   +----------+----+----------+-----+
         *   | --minval | 10 | --maxval | 100 | ...
         *   +----------+----+----------+-----+
         */
        for (int i = 0; i < args.length; i++) {
            switch (args[i].toLowerCase()) {
                case "--minval":
                    System.out.println("Parametro --minval con valor: " + args[i+1]);
                    i++;
                    break;

                case "--maxval":
                    System.out.println("Parametro --maxval con valor: " + args[i+1]);
                    i++;
                    break;
            }
        }

    }

    public static void argsDemo4(String []args) {
        Options options = new Options();

        for (int i = 0; i < args.length; i++) {
            switch (args[i].toLowerCase()) {
                case "--minval":
                    System.out.println("Parámetro --minval con valor: " + args[i+1]);
                    options.setMinVal(Integer.valueOf(args[i+1]));
                    i++;
                    break;

                case "--maxval":
                    System.out.println("Parámetro --maxval con valor: " + args[i+1]);
                    options.setMinVal(Integer.valueOf(args[i+1]));
                    i++;
                    break;
            }
        }
    }


    public static void argsDemo5(String []args) {
        OptionsParser optionsParser = new OptionsParser(args);
        optionsParser.registerOption("minval");
        optionsParser.registerOption("maxval");
        optionsParser.parse();

        int minval = Integer.parseInt(optionsParser.getOption("minval"));
        int maxval = Integer.parseInt(optionsParser.getOption("maxval"));

        for (int i = minval; i <= maxval; i++) {
            System.out.println(i);
        }
    }
}
