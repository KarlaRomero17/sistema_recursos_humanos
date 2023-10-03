/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clase.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import Clase.*;
/**
 *
 * @author Sergio Gomez
 */
public class EmpleadosController extends Conection{
    
     
     public void  mostrarEstadoCivil(JComboBox combo) throws Exception{
     
    ResultSet res;
     String sql="";
     sql="selct * from estado_civl";
     PreparedStatement st;
     
     try{
     
        this.conectar();
        
         st=this.getCon().prepareStatement(sql);
         st.setString(1, sql);
         res=st.executeQuery(sql);
     
     combo.removeAllItems();
     
     while(res.next()){
         combo.addItem(res.getString("nombre"));
     }
     
     
     } catch (Exception e){
        throw e; 
        //JOptionPane.showMessageDialog(null, "ERROR"+e.toString());
     } finally {
            // Desconectar la conexión aquí si es necesario
        }
     
     }






}
