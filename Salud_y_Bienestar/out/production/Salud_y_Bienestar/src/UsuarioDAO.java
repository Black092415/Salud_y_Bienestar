import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO(Connection conn) {
        try {
            this.conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Salud_y_Bienestar",
                    "localhost",
                    "1192779563"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarUsuario(Usuario nuevoUsuario) {
    }
}
