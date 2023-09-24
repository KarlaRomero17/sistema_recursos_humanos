/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 * @author Lissette
 */
public class AdministradorDependencias {
    private ArrayList<Dependencias> listaContactos = new ArrayList<>();
    private final String archivoCSV = "contactos2.csv"; // Nombre del archivo CSV
    private List<Dependencias> contactosList;//private final String archivoCSV = "contactos.csv"; // Nombre del archivo CSV
    
    //private List<Contactos> contactosList;
    //private final String archivoCSV = "contactos.csv"; // Nombre del archivo CSV
    public AdministradorDependencias() {
        listaContactos = new ArrayList<>();
    }
    public void agregarContacto(Dependencias contacto) {
        listaContactos.add(contacto);
    }
    public void eliminarContacto(Dependencias contacto) {
        listaContactos.remove(contacto);
    }
    public List<Dependencias> getContactos() {
        return listaContactos;
    }
    public void guardarContactosEnCSV() throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(archivoCSV))) {
        for (Dependencias contacto : listaContactos) {
            // Supongamos que quieres guardar los campos en orden: id, nombre, apellidos,direccion
            String[] linea = {
            String.valueOf(contacto.getId()),
            contacto.getNombre()
            };
            writer.writeNext(linea);
            }
        }
    }
    /*public void cargarContactosDesdeCSV() throws CsvValidationException, IOException {
        try (CSVReader reader = new CSVReader(new FileReader(archivoCSV))) {
            String[] linea;
            while ((linea = reader.readNext()) != null) {
                // Supongamos que el archivo CSV tiene el formato: id, nombre, apellidos, direccion
                int id = Integer.parseInt(linea[0]);
                String nombre = linea[1];
                String estado = linea[2];
                Dependencias contacto = new Dependencias(id, nombre, estado );
                listaContactos.add(contacto);
            }
        }
    }*/

}
