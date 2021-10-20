package Sesion17.DTO;

import java.util.ArrayList;

public class Usuarios {
    ArrayList<Usuario> usuarios = new ArrayList();

    public Usuario obtenerUsuario(String name) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombre == name) {
                return usuario;
            }
        }

        return null;
    }

    public void añadirUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
