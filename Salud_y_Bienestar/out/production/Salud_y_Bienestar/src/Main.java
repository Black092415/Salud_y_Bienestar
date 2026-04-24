import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection database = new DatabaseConnection();
        Connection conn = database.connect();

        UsuarioDAO usuarioDAO = new UsuarioDAO(conn);
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre("Juan Pérez");
        nuevoUsuario.setEmail("juan.perez@example.com");
        nuevoUsuario.setFechaNacimiento("1990-01-01");
        nuevoUsuario.setSaludFisica("Buena");
        nuevoUsuario.setSaludMental("Estable");

        usuarioDAO.agregarUsuario(nuevoUsuario);
    }
}
