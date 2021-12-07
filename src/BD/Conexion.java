package BD;

import config.Administracion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Esmeralda
 */
public class Conexion {

    Administracion manejoconfig = new Administracion();
    private Statement sentencia;
    private ResultSet datos;
    private Connection conn;

    public Administracion getManejoconfig() {
        return manejoconfig;
    }

    public void setManejoconfig(Administracion manejoconfig) {
        this.manejoconfig = manejoconfig;
    }

    public Statement getSentencia() {
        return sentencia;
    }

    public void setSentencia(Statement sentencia) {
        this.sentencia = sentencia;
    }

    public ResultSet getDatos() {
        return datos;
    }

    public void setDatos(ResultSet datos) {
        this.datos = datos;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void Conectar() {
        String datos[] = manejoconfig.leer();
        if (datos != null) {
            //motor-basededatos-servidor-usuario-contraseña
            String user = datos[3];
            String password = datos[4];
            String url = "jdbc:" + datos[0] + "://" + datos[2] + "/" + datos[1] + "?useServerPrepStmts=true";
            conn = null;
            try {
                conn = DriverManager.getConnection(url, user, password);
                this.sentencia = this.conn.createStatement();
                if (conn != null) {
                    System.out.println("Se conecto la madre");
                }
            } catch (SQLException ex) {
                System.out.println("No conecto la madre");
            }
        }
    }

    public void Desconectar() {
        conn = null;
        if (conn == null) {
            System.out.println("Desconectamos la madre");
        }
    }
}
