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
public class Empleados {

int idEmpleado;
String CodEmpleado;
String Nombre;
String Apellido;
Date FechaNacimiento;
String Sexo;
String EstadoCivil;
String TipoSanguineo;
boolean EstadoEmpleado;
String ContactoEmergencia;
String TelefonoEmergencia;
String Parentesco;
String Telefono;
String Correo;

    public Empleados(int idEmpleado,String CodEmpleado,String Nombre, String Apellido, Date FechaNacimiento, String Sexo, String EstadoCivil, String TipoSanguineo, boolean EstadoEmpleado, String ContactoEmergencia, String TelefonoEmergencia, String Parentesco, String Telefono, String Correo) {
        this.idEmpleado = idEmpleado;
        this.CodEmpleado=CodEmpleado;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaNacimiento = FechaNacimiento;
        this.Sexo = Sexo;
        this.EstadoCivil = EstadoCivil;
        this.TipoSanguineo = TipoSanguineo;
        this.EstadoEmpleado = EstadoEmpleado;
        this.ContactoEmergencia = ContactoEmergencia;
        this.TelefonoEmergencia = TelefonoEmergencia;
        this.Parentesco = Parentesco;
        this.Telefono=Telefono;
        this.Correo=Correo;
    }

     public Empleados(){
    
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
    
    
    public void setCodEmpleado(String CodEmpleado) {
        this.CodEmpleado = CodEmpleado;
    }

    public String getCodEmpleado() {
        return CodEmpleado;
    }

       
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public boolean getEstadoEmpleado() {
        return EstadoEmpleado;
    }

    public void setEstadoEmpleado(boolean EstadoEmpleado) {
        this.EstadoEmpleado = EstadoEmpleado;
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
