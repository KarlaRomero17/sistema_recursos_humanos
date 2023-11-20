/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Clase.*;
import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author fjrod
 */
public class PuestoController extends Conection {
    List<Puestos> lstPuesto;
    ArrayList<Dependencias> lstDep;
    
    public Vector<Dependencias>  mostrarDependencias() throws Exception{
        PreparedStatement st = null;
        ResultSet rs = null;
     
        Vector<Dependencias> datos = new Vector<Dependencias>();
        Dependencias dat = null;
        try {
            
            this.conectar();
           
            String sql = "select * from dependencia";
            st = this.getCon().prepareStatement(sql);
            rs = st.executeQuery();

            dat = new Dependencias();
            dat.setId(0);
            dat.setNombre("Seleccionar");
            datos.add(dat);

            while (rs.next()) {
                dat = new Dependencias();
                dat.setId(rs.getInt("id"));
                dat.setNombre(rs.getString("nombre"));
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    public List<Puestos> mostrarPuestos() throws Exception{
     
        ResultSet res;
        String sql="";
        sql= "SELECT p.id, p.nombre, p.id_dependencia, d.nombre, p.created_by, u.usuario, p.estado FROM puestos p "
                + "JOIN dependencia d ON p.id_dependencia = d.id JOIN usuarios u ON p.created_by = u.id;";
        PreparedStatement st;
              // combo.removeAllItems();
        List<Puestos> estadosCiviles = new ArrayList<>();
        try{
           this.conectar();
           st=this.getCon().prepareStatement(sql);
            res=st.executeQuery(sql);

            while(res.next()){
               // combo.addItem(res.getString("nombre"));
               Puestos puesto = new Puestos();
               puesto.setId(res.getInt("id"));
               puesto.setNombre(res.getString("nombre"));
               puesto.setDependencia(res.getString("d.nombre"));
               //puesto.setCreated_at(res.getDate("created_at"));
               puesto.setCreated_by(res.getString("u.usuario"));
               puesto.setEstado(res.getBoolean("estado"));
               estadosCiviles.add(puesto);
            }
            return estadosCiviles;
        } catch (Exception e){
           throw e; 
           //JOptionPane.showMessageDialog(null, "ERROR"+e.toString());
        } finally {
               // Desconectar la conexión aquí si es necesario
        }
     
    }    
    
    public void insertarPuesto(Puestos puesto, int id_user) throws Exception{
        try {
            this.conectar();
            String query ="insert into puestos (nombre, estado, created_by, created_at, id_dependencia) values (?,?,?,?,?)";
            PreparedStatement st = this.getCon().prepareStatement(query);
            st.setString(1, puesto.getNombre());
            st.setBoolean(2, true);
            st.setInt(3, id_user);
            st.setDate(4, new java.sql.Date(System.currentTimeMillis()));
            st.setInt(5, puesto.getIntDependencia());
            st.executeUpdate();
        }  catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    
    public void editarPuesto(Puestos puesto) throws Exception{
        try {
            this.conectar();
            String query ="UPDATE puestos SET nombre=?, id_dependencia=? WHERE id=?";
            PreparedStatement st = this.getCon().prepareStatement(query);
            st.setString(1, puesto.getNombre());
            st.setInt(2, puesto.getIntDependencia());
            st.setInt(3, puesto.getId());
            st.executeUpdate();
        } catch (Exception e) { 
            throw e;
        } finally {
            this.desconectar();
        }
    }
    
    public void eliminarPuesto(Puestos puesto) throws Exception{
        try {
            this.conectar();
            //validar estado
            String obtenerEstado = "SELECT estado from puestos WHERE id=?";
            PreparedStatement obtenerEstadoStatement = this.getCon().prepareStatement(obtenerEstado);
            obtenerEstadoStatement.setInt(1, puesto.getId());
            ResultSet resultSet = obtenerEstadoStatement.executeQuery();

            boolean estadoActual = false; // Valor predeterminado en caso de que no se encuentre ninguna dependencia con ese ID

            if (resultSet.next()) {
                estadoActual = resultSet.getBoolean("estado"); // Obtener el estado actual de la dependencia
               
            }
            
            String query ="UPDATE puestos SET estado=? WHERE id=?"; 
            PreparedStatement st = this.getCon().prepareStatement(query);
            st.setBoolean(1, !estadoActual);
            st.setInt(2, puesto.getId());
            st.executeUpdate();
        } catch (Exception e) { 
            throw e;
        } finally {
            this.desconectar();
        }
    }
    
    public void restaurarPuesto(Puestos puesto) throws Exception{
        try {
            this.conectar();
            String query ="UPDATE puestos SET estado=? WHERE id=?"; 
            PreparedStatement st = this.getCon().prepareStatement(query);
            st.setBoolean(1, true);
            st.setInt(2, puesto.getId());
            st.executeUpdate();
        } catch (Exception e) { 
            throw e;
        } finally {
            this.desconectar();
        }
    }
}
