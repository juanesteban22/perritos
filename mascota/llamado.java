package mascota;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class llamado {

	public static void main(String[] args) {
        HashMap<String, Mascota> mapaMascotas = new HashMap<>();
        ArrayList<Mascota> listaMascotas = new ArrayList<>();
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de mascotas "));
        for (int i = 0; i < n; i++) {
            Mascota mascota = new Mascota();
            mascota.ingresarDatos();
            mapaMascotas.put(mascota.getIdentificacion(), mascota);
            listaMascotas.add(mascota);
        }

        int opcion;
        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    consultarMascota(mapaMascotas);
                    break;
                case 2:
                    consultarListaMascotas(listaMascotas);
                    break;
                case 3:
                    modificarMascota(mapaMascotas);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "¡Gracias por utilizar el programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 4);
    }

    public static int mostrarMenu() {
        String opcionStr = JOptionPane.showInputDialog(
                "----- MENÚ -----\n" +
                "1. Consultar mascota individual\n" +
                "2. Consultar lista de mascotas\n" +
                "3. Modificar una mascota\n" +
                "4. Salir\n" +
                "Ingrese el número de la opción deseada:"
        );
        return Integer.parseInt(opcionStr);
    }

    public static void consultarMascota(HashMap<String, Mascota> mapaMascotas) {
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación de la mascota:");
        Mascota mascota = mapaMascotas.get(identificacion);
        if (mascota != null) {
            JOptionPane.showMessageDialog(null, "Información de la mascota:\n" +
                    "Identificación: " + mascota.getIdentificacion() + "\n" +
                    "Nombre: " + mascota.getNombre() + "\n" +
                    "Especie: " + mascota.getEspecie() + "\n" +
                    "Edad: " + mascota.getEdad()
            );
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna mascota con la identificación proporcionada.");
        }
    }

    public static void consultarListaMascotas(ArrayList<Mascota> listaMascotas) {
        StringBuilder lista = new StringBuilder();
        for (Mascota mascota : listaMascotas) {
            lista.append("Identificación: ").append(mascota.getIdentificacion()).append("\n");
            lista.append("Nombre: ").append(mascota.getNombre()).append("\n");
            lista.append("Especie: ").append(mascota.getEspecie()).append("\n");
            lista.append("Edad: ").append(mascota.getEdad()).append("\n");
            lista.append("---------------------------\n");
        }
        JOptionPane.showMessageDialog(null, "Lista de mascotas:\n" + lista.toString());
    }

    public static void modificarMascota(HashMap<String, Mascota> mapaMascotas) {
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación de la mascota a modificar:");
        Mascota mascota = mapaMascotas.get(identificacion);
        if (mascota != null) {
            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la mascota:");
            mascota.setNombre(nuevoNombre);
            JOptionPane.showMessageDialog(null, "La mascota ha sido modificada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna mascota con la identificación proporcionada.");
        }

		
	}

}
