package Sesion20;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {
    public String ficheroDatos = "usuarios.txt";

    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String []partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellidos = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);

                usuarios.add(usuario);
            }

            scanner.close();
        } catch (Exception e) {
        }

        return usuarios;
    }

    public Usuario obtenerUsuario(String username) {
        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));
            ArrayList<String> usuarios = new ArrayList();

            while (scanner.hasNext()) {
                usuarios.add(scanner.next());
            }

            scanner.close();

            for (String usuario : usuarios) {
                String []partes = usuario.split(",");
                String nombreUsuarioActual = partes[0];
                System.out.println(username + " " + nombreUsuarioActual);

                if (!nombreUsuarioActual.equalsIgnoreCase(username)) {
                    continue;
                }

                Usuario usuarioRetorno = new Usuario();
                usuarioRetorno.nombreUsuario = partes[0];
                usuarioRetorno.nombre = partes[1];
                usuarioRetorno.apellidos = partes[2];
                usuarioRetorno.email = partes[3];
                usuarioRetorno.nivelAcceso = Integer.parseInt(partes[4]);
                return usuarioRetorno;
            }

        } catch (Exception e) {
        }

        return null;
    }

    public void crearUsuario(Usuario usuario) {
        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));
            ArrayList<String> usuarios = new ArrayList();

            while (scanner.hasNext()) {
                usuarios.add(scanner.next());
            }

            scanner.close();

            for (String usuarioActual : usuarios) {
                String []partes = usuarioActual.split(",");
                String nombreUsuarioActual = partes[0];

                if (nombreUsuarioActual.toLowerCase().equals(usuario.nombreUsuario.toLowerCase())) {
                    return;
                }
            }
        } catch (Exception e) {
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);
            String buffer = "";

            for (Usuario usuarioExistente : listarUsuarios()) {
                buffer += usuarioExistente.nombreUsuario + ","
                        + usuarioExistente.nombre + ","
                        + usuarioExistente.apellidos + ","
                        + usuarioExistente.email + ","
                        + usuarioExistente.nivelAcceso;
            }

            buffer += usuario.nombreUsuario + ","
                + usuario.nombre + ","
                + usuario.apellidos + ","
                + usuario.email + ","
                + usuario.nivelAcceso;

            printStream.println(buffer);
        } catch (Exception e) {

        }
    }

    public void crearUsuarioOld(Usuario usuario) {
        try {
            PrintStream printStream = new PrintStream(ficheroDatos);
            printStream.println(usuario.nombreUsuario + ","
                    + usuario.nombre + ","
                    + usuario.apellidos + ","
                    + usuario.email + ","
                    + usuario.nivelAcceso);

        } catch (Exception e) {
        }
    }

    public void borrarUsuario(String username) {
        ArrayList<String> usuarios = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                usuarios.add(scanner.next());
            }

            scanner.close();
        } catch (Exception e) {
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (String usuarioActual : usuarios) {
                String[] partes = usuarioActual.split(",");
                String nombreUsuarioActual = partes[0];

                if (nombreUsuarioActual.toLowerCase().equals(username)) {
                    continue;
                }

                printStream.println(partes[0] + ","
                        + partes[1] + ","
                        + partes[2] + ","
                        + partes[3] + ","
                        + partes[4]);
            }
        } catch (Exception e) {
        }
    }
}
