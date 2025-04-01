
package banescodiego;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LeerArchivo {
             public static void leerArchivo(String ruta, Lista listaClientes) {
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datosCliente = linea.split(",");
                String nombre = datosCliente[0];
                String apellido = datosCliente[1];
                Cliente cliente = new Cliente(nombre, apellido);

                for (int i = 2; i < datosCliente.length; i++) {
                    cliente.agregarSolicitud(datosCliente[i]);
                }

                listaClientes.agregar(cliente);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
