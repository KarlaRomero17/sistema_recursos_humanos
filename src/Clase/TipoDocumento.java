/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author Sergio Gomez
 */
public class TipoDocumento {
    int id;
    String nombre;

    public TipoDocumento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public TipoDocumento(){
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        
    @Override
    public String toString() {
        return this.nombre;
    }
    
}
