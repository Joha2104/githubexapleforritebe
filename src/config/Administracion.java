package config;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.ini4j.*;

/**
 *
 * @author Esmeralda
 */
public class Administracion {

    public String[] leer(String ruta) {
        String vect[] = new String[5];

        try {
            System.out.println("ruta al leer:" + ruta);

            Wini ini = new Wini(new File(ruta));
            String servidor = ini.get("database", "servidor", String.class);
            String usuario = ini.get("database", "usuario", String.class);
            String contraseña = ini.get("database", "contraseña", String.class);
            String motor = ini.get("database", "motor", String.class);
            String basededatos = ini.get("database", "basededatos", String.class);

            System.out.println("motor: " + motor);
            System.out.println("basededatos: " + basededatos);
            System.out.println("servidor: " + servidor);
            System.out.println("usuario: " + usuario);
            System.out.println("contraseña: " + contraseña);

            vect[0] = motor;
            vect[1] = basededatos;
            vect[2] = servidor;
            vect[3] = usuario;
            vect[4] = contraseña;
            return vect;

            // Para atrapar excepciones
        } catch (IOException ex) {
            System.out.println("Error al crear el archivo wini");
            System.out.println("verifique que tenga instalado la libreria correspondiente");

        } catch (Exception ex) {

            System.out.println("error al leer el archivo config.ini ubicado en los recursos ");

        }

        return null;
    }

    public String[] leer() {
        String vect[] = new String[5];

        try {
            //obtenemos la ubicacion del archivo y quitamos los caracteres del inicio inecesarios.
            String ruta = (String.valueOf(ClassLoader.getSystemResource("config.ini")).substring(6));
            System.out.println("ruta al leer:" + ruta);

            Wini ini = new Wini(new File(ruta));
            String servidor = ini.get("database", "servidor", String.class);
            String usuario = ini.get("database", "usuario", String.class);
            String contraseña = ini.get("database", "contraseña", String.class);
            String motor = ini.get("database", "motor", String.class);
            String basededatos = ini.get("database", "basededatos", String.class);

            System.out.println("motor: " + motor);
            System.out.println("basededatos: " + basededatos);
            System.out.println("servidor: " + servidor);
            System.out.println("usuario: " + usuario);
            System.out.println("contraseña: " + contraseña);

            vect[0] = motor;
            vect[1] = basededatos;
            vect[2] = servidor;
            vect[3] = usuario;
            vect[4] = contraseña;
            return vect;

            // Si hay un error se atrapa en este try
        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("No se encrontro el archivo en la ruta");
            System.out.println("verifique la libreria necesaria para la conexion");
            System.out.println("Intente crear de nuevo el archivo config");

        } catch (IOException ex) {
            System.out.println("Error al crear el archivo wini");
            System.out.println("verifique que tenga instalado la libreria correspondiente");

        } catch (Exception ex) {

            System.out.println("Error al leer archivo");
        }
        return null;
    }
}
