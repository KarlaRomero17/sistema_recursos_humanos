/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

import java.util.Date;

/**
 *
 * @author fjrod
 */
public class Puestos {
    /*
        Para mostrar El nombre del departamento pero insertar el Id del depto.
            1) int intDependencia; es el valor que se va a guardar a la base de datos.
                Por lo que es el que va en el Constructior
    
            2) String dependencia; Es el valor que se rescata para mostrarse usando la query previamente
                provada en MySQL usando los JOIN
    
            3) Ir a modificar las acciones del COntroller para mostrar las tablas que se desean
                Y llamar al metodo del modelo correcto.
    
            4) int intDependencia; sera a quien llamaremos en el form para la actualizacion de datos
    */
    
    int id;
    String nombre;
    String dependencia;
    int intDependencia;
    boolean estado;
    Date created_at;
    private String created_by;

    public int getIntDependencia() {
        return intDependencia;
    }

    public void setIntDependencia(int intDependencia) {
        this.intDependencia = intDependencia;
    }
    
    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Puestos(int id, String nombre, int intDependencia, boolean estado, Date created_at, String created_by) {
        this.id = id;
        this.nombre = nombre;
        this.intDependencia = intDependencia;
        this.estado = estado;
        this.created_at = created_at;
        this.created_by = created_by;
    }

    public Puestos() {
        
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

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }
}
