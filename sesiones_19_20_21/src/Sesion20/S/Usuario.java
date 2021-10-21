package Sesion20.S;

class Usuario {
    String username;

    Usuario(String username) {
        this.username = username;
    }

    String getMarcaUsuario() {
        return username;
    }

    void guardarUsuarioDB(Usuario usuario){
        // Código
    }
}

class Usuario2 {
    String username;

    Usuario2(String username){ this.username = username; }

    String getMarcaUsuario(){ return username; }
}

class Usuario2DB{
    void guardarUsuarioDB(Usuario2 usuario){
        // Codigo
    }
    void eliminarUsuarioDB(Usuario2 usuario) {
        // Codigo
    }
}