package Sesion18.SRP;

import java.util.ArrayList;

public class Usuarios {
    ArrayList<String> usuarios = new ArrayList();

    public void crearUsuario(String nombre) { usuarios.add(nombre); }
    public void enviarEmail(String nombre) {
        for (String usuario : usuarios) {
            if (usuario == nombre) {
                // Código para enviar email
            }
        }
    }
}
