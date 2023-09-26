package Clase;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
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
    
    public void guardarPuestoEnCSV() throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(archivoCSV))) {
            for (Puestos puesto : listaPuestos) {
            // Supongamos que quieres guardar los campos en orden: id, nombre, estado, dependencia
                  String[] linea = {
                  String.valueOf(puesto.getId()),
                  puesto.getNombre(),
                  String.valueOf(puesto.getDependencia()),
                  String.valueOf(puesto.isEstado())
                   };
            writer.writeNext(linea);
            }
        }
    }
    
    public void cargarPuestosDesdeCSV() throws CsvValidationException, IOException {
        try (CSVReader reader = new CSVReader(new FileReader(archivoCSV))) {
            String[] linea;
            while ((linea = reader.readNext()) != null) {
            // Supongamos que el archivo CSV tiene el formato: id, nombre, dependencia, estado
                int id = Integer.parseInt(linea[0]);
                String nombre = linea[1];
                String dependencia = linea[2];
                boolean estado = Boolean.parseBoolean(linea[3]);
                
                    Puestos puesto = new Puestos(id, nombre, dependencia, estado);
                    listaPuestos.add(puesto);
            }
        }
    }
}
