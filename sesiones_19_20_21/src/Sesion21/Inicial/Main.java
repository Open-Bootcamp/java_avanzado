package Sesion21.Inicial;

import Sesion21.Final.Usuario;
import Sesion21.Final.Usuarios;

public class Main {
    public static void main(String []args) {
        Sesion21.Final.Usuario usuario = new Sesion21.Final.Usuario();
        usuario.nombreUsuario = "openbootcamp";
        usuario.nombre = "Open";
        usuario.apellidos = "Bootcamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 10;

        Sesion21.Final.Usuarios usuarios = new Usuarios();
        usuarios.crearUsuario(usuario);

        Sesion21.Final.Usuario usuario2 = new Sesion21.Final.Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open";
        usuario2.apellidos = "Bootcamp";
        usuario2.email = "ejemplos@open-bootcamp.com";
        usuario2.nivelAcceso = 10;
        usuarios.crearUsuario(usuario2);

        Sesion21.Final.Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp2");
        System.out.println(openbootcamp.email);

        usuarios.borrarUsuario("openbootcamp2");
        for (Usuario a : usuarios.listarUsuarios()) {
            System.out.println(a.nombreUsuario);
        }
    }
}
