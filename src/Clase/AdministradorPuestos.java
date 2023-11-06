package Clase;

import java.io.FileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author fjrod
 */
public class AdministradorPuestos {
    private ArrayList<Puestos> listaPuestos = new ArrayList<>();
    private final String archivoCSV = "contactos2.csv"; // Nombre del archivo CSV
    private List<Puestos> PuestosList;
    
    public AdministradorPuestos() {
        listaPuestos = new ArrayList<>();
    }
    public void agregarPuesto(Puestos puesto) {
        listaPuestos.add(puesto);
    }
    public void eliminarPuesto(Puestos puesto) {
        listaPuestos.remove(puesto);
    }
    public List<Puestos> getPuestos() {
        return listaPuestos;
    }
    
/*    public void cargarPuestosDesdeCSV() throws CsvValidationException, IOException {
        try (CSVReader reader = new CSVReader(new FileReader(archivoCSV))) {
            String[] linea;
            while ((linea = reader.readNext()) != null) {
            // Supongamos que el archivo CSV tiene el formato: id, nombre, dependencia, estado
                int id = Integer.parseInt(linea[0]);
                String nombre = linea[1];
                int dependencia = Integer.parseInt(linea[2]);
                boolean estado = Boolean.parseBoolean(linea[3]);
                
                    Puestos puesto = new Puestos(id, nombre, dependencia, estado);
                    listaPuestos.add(puesto);
            }
        }
    }*/
}
