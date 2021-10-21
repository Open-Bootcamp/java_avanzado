package Sesion19;

import java.util.HashMap;

public class OptionsParser {
    private HashMap<String, String> options = new HashMap();
    private String []args;

    private OptionsParser(){};
    public OptionsParser(String []args) {
        this.args = args;
    }

    public void registerOption(String optionName) {
        options.put(optionName, "");
    }

    public String getOption(String optionName) {
        return options.get(optionName);
    }

    public void setValue(String optionName, String value) {
        options.replace(optionName, value);
    }

    public void parse() {
        for (int i = 0; i < args.length; i++) {
            // Saca los "--" del valor actual
            String optionName = args[i].replace("--", "");

            // Buscamos la opcion en el hashMap. Si existe, extraemos el valor que es
            // la siguiente posición e incrementamos el contador.
            if (options.containsKey(optionName)) {
                setValue(optionName, args[i + 1]);
                i++;
            }
        }
    }

}
