/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author Sergio Gomez
 */
public class Documentos {
    
    int Id_Documento;
    int Id_Detalle;
    int Id_Institucion;
    int Id_TipoDoc;
    String NumeroDoc;

    public Documentos(int Id_Documento, int Id_Detalle, int Id_Institucion, int Id_TipoDoc, String NumeroDoc) {
        this.Id_Documento = Id_Documento;
        this.Id_Detalle = Id_Detalle;
        this.Id_Institucion = Id_Institucion;
        this.Id_TipoDoc = Id_TipoDoc;
        this.NumeroDoc = NumeroDoc;
    }

    public Documentos(){
    
    }
    
    public int getId_Documento() {
        return Id_Documento;
    }

    public void setId_Documento(int Id_Documento) {
        this.Id_Documento = Id_Documento;
    }

    public int getId_Detalle() {
        return Id_Detalle;
    }

    public void setId_Detalle(int Id_Detalle) {
        this.Id_Detalle = Id_Detalle;
    }

    public int getId_Institucion() {
        return Id_Institucion;
    }

    public void setId_Institucion(int Id_Institucion) {
        this.Id_Institucion = Id_Institucion;
    }

    public int getId_TipoDoc() {
        return Id_TipoDoc;
    }

    public void setId_TipoDoc(int Id_TipoDoc) {
        this.Id_TipoDoc = Id_TipoDoc;
    }

    public String getNumeroDoc() {
        return NumeroDoc;
    }

    public void setNumeroDoc(String NumeroDoc) {
        this.NumeroDoc = NumeroDoc;
    }
    
    
    
    
}
