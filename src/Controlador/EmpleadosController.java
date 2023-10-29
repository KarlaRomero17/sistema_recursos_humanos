/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import Clase.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sergio Gomez
 */
public class EmpleadosController extends Conection{
    
     
    public List<EstadoCivil>  mostrarEstadoCivil() throws Exception{
     
        ResultSet res;
        String sql="";
        sql="select * from estado_civil";
        PreparedStatement st;
              // combo.removeAllItems();
        List<EstadoCivil> estadosCiviles = new ArrayList<>();
        try{
           this.conectar();
           st=this.getCon().prepareStatement(sql);
            res=st.executeQuery(sql);

            while(res.next()){
               // combo.addItem(res.getString("nombre"));
               EstadoCivil estado = new EstadoCivil();
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
    
    public List<TipoSanguineo>  mostrarTipoSanguineo() throws Exception{
     
        ResultSet res;
        String sql="";
        sql="select * from tipo_sangre";
        PreparedStatement st;
              // combo.removeAllItems();
        List<TipoSanguineo> TipoSangre = new ArrayList<>();
        try{

           this.conectar();
           st=this.getCon().prepareStatement(sql);
            res=st.executeQuery(sql);

            while(res.next()){
               // combo.addItem(res.getString("nombre"));
               TipoSanguineo tipo = new TipoSanguineo();
               tipo.setTipo(res.getString("tipo"));
               TipoSangre.add(tipo);

            }
            return TipoSangre;
        } catch (Exception e){
           throw e; 
           //JOptionPane.showMessageDialog(null, "ERROR"+e.toString());
        } finally {
               // Desconectar la conexión aquí si es necesario
        }
    }
      
    public List<Empleados> buscarEmpleados(String valor, String filtro) throws Exception{
        String criterio;

        switch (filtro) {
            case "Codigo": criterio="codigo_empleado";
                break;
            case "Nombre": criterio="nombre";
                break;
            case "Apellido":criterio="apellidos";
                break;
            default:
                throw new AssertionError();
        }


        ResultSet res;
        List<Empleados> lst = new ArrayList();

        try{

            this.conectar();

            String sql="select id, codigo_empleado, nombre, apellidos from empleados where "+criterio+" like '%"+valor+"%';";

            PreparedStatement st=this.getCon().prepareStatement(sql);
            res=st.executeQuery();

            while(res.next()){
                Empleados empl=new Empleados();
                empl.setIdEmpleado(res.getInt("id"));
                empl.setCodEmpleado(res.getString("codigo_empleado"));
                empl.setNombre(res.getString("nombre"));
                empl.setApellido(res.getString("apellidos"));
                lst.add(empl);

            }

        }catch (Exception e){
          throw e;
        } finally{
            this.desconectar();
        }      
        return lst;
    }
      
    
      
    public List<Empleados> mostrarEmpleados(int IdEmpleado)throws Exception{
            ResultSet res;
            List<Empleados> lst = new ArrayList();

            try{
                this.conectar();

                String sql="select * from empleados where id="+IdEmpleado;
                PreparedStatement st=this.getCon().prepareStatement(sql);
                res=st.executeQuery();

                while(res.next()){
                    Empleados empl=new Empleados();
                    empl.setIdEmpleado(res.getInt("id"));
                    empl.setCodEmpleado(res.getString("codigo_empleado"));
                    empl.setNombre(res.getString("nombre"));
                    empl.setApellido(res.getString("apellidos"));
                    empl.setTelefono(res.getString("telefono"));
                    empl.setCorreo(res.getString("correo"));
                    empl.setContactoEmergencia(res.getString("nombre_contacto"));
                    empl.setTelefonoEmergencia(res.getString("telefono_contacto"));
                    empl.setParentesco(res.getString("parentesco_contacto"));
                    //empl.setEstadoEmpleado(res.getBoolean("estado"));
                   // empl.setSexo(res.getString("sexo"));
                    //empl.setFechaNacimiento(res.getDate("fecha_nacimiento"));
                    lst.add(empl);
                }
            }catch (Exception e){
              throw e;
            } finally{
                this.desconectar();
            }      
            return lst;
    }
    
    
    public void insertarEmpleado(Empleados emp, int id_user) throws Exception{
        try {
            this.conectar();
            String query ="insert into empleados (codigo_empleado, nombre, apellidos, telefono, correo, nombre_contacto, telefono_contacto, parentesco_contacto, created_by, created_at) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = this.getCon().prepareStatement(query);
            st.setString(1, emp.getCodEmpleado());
            st.setString(2, emp.getNombre());
            st.setString(3, emp.getApellido());
            st.setString(4, emp.getTelefono());
            st.setString(5, emp.getCorreo());
            st.setString(6, emp.getContactoEmergencia());
            st.setString(7, emp.getTelefonoEmergencia());
            st.setString(8, emp.getParentesco());
            //st.setBoolean(9, emp.getEstadoEmpleado());
            //st.setString(9, emp.getSexo());
            st.setInt(9, id_user);
            st.setDate(10, new java.sql.Date(System.currentTimeMillis()));
            st.executeUpdate();
        }  catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    
    
}
