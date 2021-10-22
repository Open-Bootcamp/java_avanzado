package Sesion24.Codigo.Final;

import java.util.ArrayList;

abstract class UsuariosDB {

    private int totalInserciones = 0;
    private int totalEliminaciones = 0;

    public int getTotalInserciones() { return totalInserciones; }
    public int getTotalEliminaciones() { return totalEliminaciones; }

    protected void incrementarInserciones() { totalInserciones++; }
    protected void incrementarEliminaciones() { totalEliminaciones++; }

    abstract ArrayList<Usuario> obtener();
    abstract Usuario buscar(Usuario usuario);
    abstract void insertar(Usuario usuario);
    abstract void borrar(Usuario usuario);
}
