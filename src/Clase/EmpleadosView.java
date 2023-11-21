/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

import java.util.Date;

/**
 *
 * @author Sergio Gomez
 */
public class EmpleadosView {
    
 int idEmpleado;
String CodEmpleado;
String Nombre;
String Apellido;
Date FechaNacimiento;
String Sexo;
String EstadoCivil;
String TipoSanguineo;
boolean EstadoEmpleado;
String Dui;
String Departamento;
String Municipio;
String Direccion;
String TipoContratacion;
Date FechaContratacion;
Date FechaTerminacion;
String Dependencia;
String Puesto;
Double Salario;
String Telefono;
String Correo;
String ContactoEmergencia;
String TelefonoEmergencia;
String Parentesco;
int IdDet;

    public EmpleadosView(int idEmpleado, String CodEmpleado, String Nombre, String Apellido, Date FechaNacimiento, String Sexo, String EstadoCivil, String TipoSanguineo, boolean EstadoEmpleado, String Dui, String Departamento, String Municipio, String Direccion, String TipoContratacion, Date FechaContratacion, Date FechaTerminacion, String Dependencia, String Puesto, Double Salario, String Telefono, String Correo, String ContactoEmergencia, String TelefonoEmergencia, String Parentesco,int IdDet) {
        this.idEmpleado = idEmpleado;
        this.CodEmpleado = CodEmpleado;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaNacimiento = FechaNacimiento;
        this.Sexo = Sexo;
        this.EstadoCivil = EstadoCivil;
        this.TipoSanguineo = TipoSanguineo;
        this.EstadoEmpleado = EstadoEmpleado;
        this.Dui = Dui;
        this.Departamento = Departamento;
        this.Municipio = Municipio;
        this.Direccion = Direccion;
        this.TipoContratacion = TipoContratacion;
        this.FechaContratacion = FechaContratacion;
        this.FechaTerminacion = FechaTerminacion;
        this.Dependencia = Dependencia;
        this.Puesto = Puesto;
        this.Salario = Salario;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.ContactoEmergencia = ContactoEmergencia;
        this.TelefonoEmergencia = TelefonoEmergencia;
        this.Parentesco = Parentesco;
        this.IdDet=IdDet;
    }

    public int getIdDet() {
        return IdDet;
    }

    public void setIdDet(int IdDet) {
        this.IdDet = IdDet;
    }

    public EmpleadosView() {

    }    
    
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCodEmpleado() {
        return CodEmpleado;
    }

    public void setCodEmpleado(String CodEmpleado) {
        this.CodEmpleado = CodEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getTipoSanguineo() {
        return TipoSanguineo;
    }

    public void setTipoSanguineo(String TipoSanguineo) {
        this.TipoSanguineo = TipoSanguineo;
    }

    public boolean isEstadoEmpleado() {
        return EstadoEmpleado;
    }

    public void setEstadoEmpleado(boolean EstadoEmpleado) {
        this.EstadoEmpleado = EstadoEmpleado;
    }

    public String getDui() {
        return Dui;
    }

    public void setDui(String Dui) {
        this.Dui = Dui;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTipoContratacion() {
        return TipoContratacion;
    }

    public void setTipoContratacion(String TipoContratacion) {
        this.TipoContratacion = TipoContratacion;
    }

    public Date getFechaContratacion() {
        return FechaContratacion;
    }

    public void setFechaContratacion(Date FechaContratacion) {
        this.FechaContratacion = FechaContratacion;
    }

    public Date getFechaTerminacion() {
        return FechaTerminacion;
    }

    public void setFechaTerminacion(Date FechaTerminacion) {
        this.FechaTerminacion = FechaTerminacion;
    }

    public String getDependencia() {
        return Dependencia;
    }

    public void setDependencia(String Dependencia) {
        this.Dependencia = Dependencia;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContactoEmergencia() {
        return ContactoEmergencia;
    }

    public void setContactoEmergencia(String ContactoEmergencia) {
        this.ContactoEmergencia = ContactoEmergencia;
    }

    public String getTelefonoEmergencia() {
        return TelefonoEmergencia;
    }

    public void setTelefonoEmergencia(String TelefonoEmergencia) {
        this.TelefonoEmergencia = TelefonoEmergencia;
    }

    public String getParentesco() {
        return Parentesco;
    }

    public void setParentesco(String Parentesco) {
        this.Parentesco = Parentesco;
    }


    
}
