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
    int id;
    String nombre;
    int dependencia; //Cambie de String a int.
    boolean estado;
    Date created_at;
    private String created_by;

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

    public Puestos(int id, String nombre, int dependencia, boolean estado, Date created_at, String created_by) {
        this.id = id;
        this.nombre = nombre;
        this.dependencia = dependencia;
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

    public int getDependencia() {
        return dependencia;
    }

    public void setDependencia(int dependencia) {
        this.dependencia = dependencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
