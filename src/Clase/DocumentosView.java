/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author Sergio Gomez
 */
public class DocumentosView {
    
    int IdEmp;
    String CodEmp;
    int IdDetalle;
    int IdDocumento;
    String NumDoc;
    int IdTipoDoc;
    String TipoDoc;
    int IdInstituc;
    String Instituc;

    public DocumentosView(int IdEmp, String CodEmp, int IdDetalle, int IdDocumento, String NumDoc, int IdTipoDoc, String TipoDoc, int IdInstituc, String Instituc) {
        this.IdEmp = IdEmp;
        this.CodEmp = CodEmp;
        this.IdDetalle = IdDetalle;
        this.IdDocumento = IdDocumento;
        this.NumDoc = NumDoc;
        this.IdTipoDoc = IdTipoDoc;
        this.TipoDoc = TipoDoc;
        this.IdInstituc = IdInstituc;
        this.Instituc = Instituc;
    }

    
    public DocumentosView() {
 
    }
    
    public int getIdEmp() {
        return IdEmp;
    }

    public void setIdEmp(int IdEmp) {
        this.IdEmp = IdEmp;
    }

    public String getCodEmp() {
        return CodEmp;
    }

    public void setCodEmp(String CodEmpe) {
        this.CodEmp = CodEmpe;
    }

    public int getIdDetalle() {
        return IdDetalle;
    }

    public void setIdDetalle(int IdDetalle) {
        this.IdDetalle = IdDetalle;
    }

    public int getIdDocumento() {
        return IdDocumento;
    }

    public void setIdDocumento(int IdDocumento) {
        this.IdDocumento = IdDocumento;
    }

    public String getNumDoc() {
        return NumDoc;
    }

    public void setNumDoc(String NumDoc) {
        this.NumDoc = NumDoc;
    }

    public int getIdTipoDoc() {
        return IdTipoDoc;
    }

    public void setIdTipoDoc(int IdTipoDoc) {
        this.IdTipoDoc = IdTipoDoc;
    }

    public String getTipoDoc() {
        return TipoDoc;
    }

    public void setTipoDoc(String TipoDoc) {
        this.TipoDoc = TipoDoc;
    }

    public int getIdInstituc() {
        return IdInstituc;
    }

    public void setIdInstituc(int IdInstituc) {
        this.IdInstituc = IdInstituc;
    }

    public String getInstituc() {
        return Instituc;
    }

    public void setInstituc(String Instituc) {
        this.Instituc = Instituc;
    }
    
    
    
    
    
    
}
