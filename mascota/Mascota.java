package mascota;

import javax.swing.JOptionPane;

public class Mascota {

	private String nombre;
    private String especie;
    private int edad;
    private String identificacion;

    public Mascota() {

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }
    
    
    public void ingresarDatos() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota:");
        especie = JOptionPane.showInputDialog(null, "Ingrese la especie de la mascota:");
        String edadStr = JOptionPane.showInputDialog(null, "Ingrese la edad de la mascota:");
        edad = Integer.parseInt(edadStr);
        identificacion = JOptionPane.showInputDialog(null, "Ingrese la identificación de la mascota:");
    }

    public void mostrarInformacion() {
        String informacion = "Nombre: " + nombre + "\n" +
                "Especie: " + especie + "\n" +
                "Edad: " + edad + "\n" +
                "Identificación: " + identificacion;
        JOptionPane.showMessageDialog(null, informacion);
    }
    
    public void hacerSonido() {
        String sonido = "";
        if (especie.equalsIgnoreCase("Perro")) {
            sonido = "¡Guau guau!";
        } else if (especie.equalsIgnoreCase("Gato")) {
            sonido = "¡Miau miau!";
        } else {
            sonido = "No se ha implementado un sonido para esta especie.";
        }
        JOptionPane.showMessageDialog(null, sonido);
    }

  
    public void incrementarEdad() {
        edad++;
    }

}
