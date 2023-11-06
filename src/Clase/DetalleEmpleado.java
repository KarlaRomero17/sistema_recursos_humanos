/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author Sergio Gomez
 */
public class DetalleEmpleado {
    
  int idt;
  int id_empleado;
  int id_tipo_contratacion;
  int id_tipo_sangre;
  int id_usuario;
  int id_tipo_documento;
  int id_puesto;
  int id_dependencia;
  int id_estado_civil;
  int id_documento;
  int id_departamento;
  int id_municipio;

    public DetalleEmpleado(int idt, int id_empleado, int id_tipo_contratacion, int id_tipo_sangre, int id_usuario, int id_tipo_documento, int id_puesto, int id_dependencia, int id_estado_civil, int id_documento, int id_departamento, int id_municipio) {
        this.idt = idt;
        this.id_empleado = id_empleado;
        this.id_tipo_contratacion = id_tipo_contratacion;
        this.id_tipo_sangre = id_tipo_sangre;
        this.id_usuario = id_usuario;
        this.id_tipo_documento = id_tipo_documento;
        this.id_puesto = id_puesto;
        this.id_dependencia = id_dependencia;
        this.id_estado_civil = id_estado_civil;
        this.id_documento = id_documento;
        this.id_departamento = id_departamento;
        this.id_municipio = id_municipio;
    }
  
    public DetalleEmpleado(){

    }

    public int getIdt() {
        return idt;
    }

    public void setIdt(int idt) {
        this.idt = idt;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_tipo_contratacion() {
        return id_tipo_contratacion;
    }

    public void setId_tipo_contratacion(int id_tipo_contratacion) {
        this.id_tipo_contratacion = id_tipo_contratacion;
    }

    public int getId_tipo_sangre() {
        return id_tipo_sangre;
    }

    public void setId_tipo_sangre(int id_tipo_sangre) {
        this.id_tipo_sangre = id_tipo_sangre;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_tipo_documento() {
        return id_tipo_documento;
    }

    public void setId_tipo_documento(int id_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
    }

    public int getId_puesto() {
        return id_puesto;
    }

    public void setId_puesto(int id_puesto) {
        this.id_puesto = id_puesto;
    }

    public int getId_dependencia() {
        return id_dependencia;
    }

    public void setId_dependencia(int id_dependencia) {
        this.id_dependencia = id_dependencia;
    }

    public int getId_estado_civil() {
        return id_estado_civil;
    }

    public void setId_estado_civil(int id_estado_civil) {
        this.id_estado_civil = id_estado_civil;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public int getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(int id_municipio) {
        this.id_municipio = id_municipio;
    }
  
    
    
}
