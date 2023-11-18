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
String numero_documento;
Double salario;
Date fecha_contratacion;
Date fecha_terminacion;
String Direccion;
String Dui;


    public Empleados(int idEmpleado,String CodEmpleado,String Nombre, String Apellido, 
            Date FechaNacimiento, String Sexo, String EstadoCivil, String TipoSanguineo, 
            boolean EstadoEmpleado, String ContactoEmergencia, String TelefonoEmergencia, 
            String Parentesco, String Telefono, String Correo, String numero_documento, 
            Double salario, Date fecha_contratacion,String Direccion, Date fecha_terminacion, String Dui) {
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
        this.numero_documento = numero_documento;
        this.salario = salario;
        this.fecha_contratacion = fecha_contratacion;
        this.Direccion = Direccion;
        this.fecha_terminacion=fecha_terminacion;
        this.Dui=Dui;
    }

    public String getDui() {
        return Dui;
    }

    public void setDui(String Dui) {
        this.Dui = Dui;
    }

    public Date getFecha_terminacion() {
        return fecha_terminacion;
    }

    public void setFecha_terminacion(Date fecha_terminacion) {
        this.fecha_terminacion = fecha_terminacion;
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

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(Date fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
}
