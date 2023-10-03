/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Clase.*;
import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author fjrod
 */
public class PuestoController extends Conection {
    List<Puestos> lstPuesto;
    ArrayList<Dependencias> lstDep;
    
    
    public void listado_deptos(){
        lstDep = new ArrayList<>();
    }
    
    /*
    Metodo inconcluso aun.
    deberia mandar a llamar solo el ID y/o nombre? para que se muestre en mi Cmb
    */
    public List<Dependencia> mostrarDependencias() throws Exception{
     
        ResultSet res;
        String sql="";
        sql="select * from dependencia";
        PreparedStatement st;
              // combo.removeAllItems();
        List<Dependencia> estadosCiviles = new ArrayList<>();
        try{

           this.conectar();
           st=this.getCon().prepareStatement(sql);
            res=st.executeQuery(sql);

            while(res.next()){
               // combo.addItem(res.getString("nombre"));
               Dependencia estado = new Dependencia();
               estado.setNombre(res.getString("nombre"));
               estadosCiviles.add(estado);

            }
            return estadosCiviles;
        } catch (Exception e){
           throw e; 
           //JOptionPane.showMessageDialog(null, "ERROR"+e.toString());
        } finally {
               // Desconectar la conexión aquí si es necesario
        }
     
    }
    
    public List<Puestos> mostrarPuestos() throws Exception {
        ResultSet res;
        lstPuesto = new ArrayList();
        try {
            this.conectar();
            String sql = "select * from puestos";
            PreparedStatement st = this.getCon().prepareStatement(sql);
            res = st.executeQuery();

            // Procesar los resultados
            while (res.next()) {
                Puestos puesto = new Puestos(); //Cree COnst Vacio para esto.
                puesto.setId(res.getInt("id"));
                puesto.setNombre(res.getString("nombre"));
                puesto.setDependencia(res.getInt("id_dependencia"));
                puesto.setEstado(res.getBoolean("estado"));
                lstPuesto.add(puesto);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            // Desconectar la conexión aquí si es necesario
        }
        return lstPuesto;
    }
}
