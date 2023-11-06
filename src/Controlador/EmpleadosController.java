/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import Clase.*;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.*;
/**
 *
 * @author Sergio Gomez
 */
public class EmpleadosController extends Conection{
    
     
    /*public List<EstadoCivil>  mostrarEstadoCivil() throws Exception{
     
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
     
    }*/
    
     public Vector<EstadoCivil>  mostrarEstadoCivil() throws Exception{
     	PreparedStatement st = null;
        ResultSet rs = null;
     
        Vector<EstadoCivil> datos = new Vector<EstadoCivil>();
        EstadoCivil dat = null;
        try {
            
            this.conectar();
           
            String sql = "select * from estado_civil";
            st = this.getCon().prepareStatement(sql);
            rs = st.executeQuery();

            dat = new EstadoCivil();
            dat.setId(0);
            dat.setNombre("Seleccionar");
            datos.add(dat);

            while (rs.next()) {
                dat = new EstadoCivil();
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
    
    /*public List<TipoSanguineo>  mostrarTipoSanguineo() throws Exception{
     
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
    }*/
      
     public Vector<TipoSanguineo>  mostrarTipoSanguineo() throws Exception{
     	PreparedStatement st = null;
        ResultSet rs = null;
     
        Vector<TipoSanguineo> datos = new Vector<TipoSanguineo>();
        TipoSanguineo dat = null;
        try {
            
            this.conectar();
           
            String sql = "select * from tipo_sangre";
            st = this.getCon().prepareStatement(sql);
            rs = st.executeQuery();

            dat = new TipoSanguineo();
            dat.setId(0);
            dat.setTipo("Seleccionar");
            datos.add(dat);

            while (rs.next()) {
                dat = new TipoSanguineo();
                dat.setId(rs.getInt("id"));
                dat.setTipo(rs.getString("tipo"));
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    
     public Vector<Departamentos>  mostrarDepartamento() throws Exception{
     PreparedStatement st = null;
        ResultSet rs = null;
     
        Vector<Departamentos> datos = new Vector<Departamentos>();
        Departamentos dat = null;
        try {
            
            this.conectar();
           
            String sql = "select * from departamentos";
            st = this.getCon().prepareStatement(sql);
            rs = st.executeQuery();

            dat = new Departamentos();
            dat.setId(0);
            dat.setNombre("Seleccionar");
            datos.add(dat);

            while (rs.next()) {
                dat = new Departamentos();
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
    
    
    
     
      public Vector<Municipios> mostrarMunicipios(int idDep)  throws Exception{

        PreparedStatement ps = null;
        ResultSet rs = null;
    

        Vector<Municipios> datos = new Vector<Municipios>();
        Municipios dat = null;
        try {
            this.conectar();
            String sql = "SELECT * FROM municipios WHERE id_departamento=" + idDep;
            ps = this.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new Municipios();
            dat.setId(0);
            dat.setNombre("Seleccionar");
            datos.add(dat);

            while (rs.next()) {
                dat = new Municipios();
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
     
    

      public Vector<Institucion> mostrarInstitucion(int idDoc)  throws Exception{

        PreparedStatement ps = null;
        ResultSet rs = null;


        Vector<Institucion> datos = new Vector<Institucion>();
        Institucion dat = null;
        try {
            this.conectar();
            String sql = "SELECT * FROM institucion WHERE id_tipo_documento=" + idDoc;
            ps = this.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new Institucion();
            dat.setId(0);
            dat.setNombre("Seleccionar");
            datos.add(dat);

            while (rs.next()) {
                dat = new Institucion();
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
     
    
    public List<TipoContrato>  mostrarTipoContrato() throws Exception{
     
        ResultSet res;
        String sql="";
        sql="select * from tipo_contrato";
        PreparedStatement st;
              
        List<TipoContrato> TipoCont = new ArrayList<>();
        try{

           this.conectar();
           st=this.getCon().prepareStatement(sql);
            res=st.executeQuery(sql);

            while(res.next()){
               // combo.addItem(res.getString("nombre"));
               TipoContrato tc = new TipoContrato();
               tc.setTipo(res.getString("tipo"));               
               TipoCont.add(tc);

            }
            return TipoCont;
        } catch (Exception e){
           throw e; 
           //JOptionPane.showMessageDialog(null, "ERROR"+e.toString());
        } finally {
               // Desconectar la conexión aquí si es necesario
        }
    }
    
    
    
    public Vector<TipoDocumento>  mostrarTipoDocumento() throws Exception{
     PreparedStatement st = null;
        ResultSet rs = null;
        //Conection conn = new Conection();
      

        Vector<TipoDocumento> datos = new Vector<TipoDocumento>();
        TipoDocumento dat = null;
        try {
            
            this.conectar();
           
            String sql = "select * from tipo_documento";
            st = this.getCon().prepareStatement(sql);
            rs = st.executeQuery();
            
            
            dat = new TipoDocumento();
            dat.setId(0);
            dat.setNombre("Seleccionar");
            datos.add(dat);

            while (rs.next()) {
                dat = new TipoDocumento();
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
     
    
    
    public Vector<Dependencias>  listaDependencias() throws Exception{
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
    
    
    
    public Vector<Puestos> mostrarPuestos(int idDep)  throws Exception{

        PreparedStatement ps = null;
        ResultSet rs = null;

        Vector<Puestos> datos = new Vector<Puestos>();
        Puestos dat = null;
        try {
            this.conectar();
            String sql = "SELECT * FROM puestos WHERE id_dependencia=" + idDep;
            ps = this.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new Puestos();
            dat.setId(0);
            dat.setNombre("Seleccionar");
            datos.add(dat);

            while (rs.next()) {
                dat = new Puestos();
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
    
    //private static ResultSet Resultado;
    
    public void insertarEmpleado(Empleados emp, DetalleEmpleado detemp, int id_user) throws Exception{
        //int Id=0;
        
        try {
            this.conectar();
            String query ="insert into empleados (codigo_empleado, nombre, apellidos, fecha_nacimiento, sexo, estado, created_by, created_at) values (?,?,?,?,?,?,?,?) " +
            "SET @IdEmpleado=last_insert_id(); " +
            "insert into detalle_empleado( id_empleado, id_estado_civil, id_tipo_sangre) values(@IdEmpleado,?,?);";
            PreparedStatement st =this.getCon().prepareStatement(query);
            st.setString(1, emp.getCodEmpleado());
            st.setString(2, emp.getNombre());
            st.setString(3, emp.getApellido());
            //st.setDate(4,(Date) affiliate.emp.getFechaNacimiento());
            st.setDate(4,new  java.sql.Date(emp.getFechaNacimiento().getTime()));
            st.setString(5, emp.getSexo());
            st.setBoolean(6, emp.getEstadoEmpleado());
            st.setInt(7, id_user);
            st.setDate(8, new java.sql.Date(System.currentTimeMillis()));
            st.setInt(9,detemp.getId_estado_civil());
            st.setInt(10,detemp.getId_tipo_sangre());
            st.executeUpdate();
            /*
            Resultado= (ResultSet) st.getGeneratedKeys();
            if(Resultado.next()){
                Id=Resultado.getIn(1);
            }
            */
                              
            
        }  catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        
        //  return Id;
    }
    
    
    
}
