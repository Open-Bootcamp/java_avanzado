package Sesion23.Codigo.Final;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosDBEstadisticas extends UsuariosDB{
    private int totalInserciones = 0;
    private int totalEliminaciones = 0;

    public UsuariosDBEstadisticas(String ficheroDatos) {
        super(ficheroDatos);
    }

    public int contarTotal() {
        return obtener().size();
    }

    @Override
    public void insertar(Usuario usuario) {
        super.insertar(usuario);
        totalInserciones++;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        return super.buscar(usuario);
    }

    @Override
    public void borrar(Usuario usuario) {
        super.borrar(usuario);
        totalEliminaciones++;
    }

    public int getTotalInserciones() {
        return totalInserciones;
    }

    public int getTotalEliminaciones() {
        return totalEliminaciones;
    }
}
