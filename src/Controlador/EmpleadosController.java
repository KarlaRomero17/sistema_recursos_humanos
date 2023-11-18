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
import java.sql.CallableStatement;
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
     
    
    /*public List<TipoContrato>  mostrarTipoContrato() throws Exception{
     
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
    */
    
      
      public Vector<TipoContrato>  mostrarTipoContrato() throws Exception{
        PreparedStatement st = null;
        ResultSet rs = null;
     
        Vector<TipoContrato> datos = new Vector<TipoContrato>();
        TipoContrato dat = null;
        try {
            
            this.conectar();
           
            String sql = "select * from tipo_contrato";
            st = this.getCon().prepareStatement(sql);
            rs = st.executeQuery();

            dat = new TipoContrato();
            dat.setId(0);
            dat.setTipo("Seleccionar");
            datos.add(dat);

            while (rs.next()) {
                dat = new TipoContrato();
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
                   // empl.setCorreo(res.getString("correo"));
                    //empl.setContactoEmergencia(res.getString("nombre_contacto"));
                    //empl.setTelefonoEmergencia(res.getString("telefono_contacto"));
                    //empl.setParentesco(res.getString("parentesco_contacto"));
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
    
    /*
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
              
            
            java.util.Date utilDate = emp.getFechaNacimiento();
            java.sql.Date sqlFechaNac = new java.sql.Date(utilDate.getTime());
            st.setDate(14, sqlFechaNac);
            st.setString(15, emp.getSexo());
            st.executeUpdate();
        }  catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    */
    
    
    public void InsertarEmpleados(String nombre, String apellido, String sexo, int estado, int createdby, int idestdociv,int idsangre,
            String direccion,String dui ,java.sql.Date fechacontrata, java.sql.Date fechanacimiento,java.sql.Date fechatermino,String nombrecontacto, 
            String parentescontac,double salario ,String telefono,String telecontacto,int iddepart,int iddependencia,int idmunicipio,
            int idpuesto,int idtipocontrat,int idusuario,String correo)throws Exception{
    
                
        try {
            this.conectar();
            String query="call insertar_empleados(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            CallableStatement callable=this.getCon().prepareCall(query);
            callable.setString(1, nombre);
            callable.setString(2, apellido);
            callable.setString(3,sexo);
            callable.setInt(4, estado);
            callable.setInt(5,createdby);
            callable.setDate(6, new java.sql.Date(System.currentTimeMillis()));
            callable.setInt(7, idestdociv);
            callable.setInt(8, idsangre);
            callable.setString(9, direccion);
            callable.setString(10, dui);
            callable.setDate(11, fechacontrata);
            callable.setDate(12, fechanacimiento);
            callable.setDate(13, fechatermino);
            callable.setString(14, nombrecontacto);
            callable.setString(15, parentescontac);
            callable.setDouble(16, salario);
            callable.setString(17, telefono);
            callable.setString(18, telecontacto);
            callable.setInt(19, iddepart);
            callable.setInt(20, iddependencia);
            callable.setInt(21, idmunicipio);
            callable.setInt(22, idpuesto);
            callable.setInt(23,idtipocontrat);
            callable.setInt(24, idusuario);
            callable.setString(25, correo);
            
            callable.executeUpdate();
            
        }  catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
    
    
        }
    }
       
    
    public Empleados codEmpleado() throws Exception{
        this.conectar();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Empleados empleado = null;

        try {
            
            preparedStatement = this.getCon().prepareCall("call codemp()");
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                empleado = new Empleados();
                empleado.setCodEmpleado(resultSet.getString("codigo_empleado"));
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            this.desconectar();
        }
        return empleado;
    }
    
    
    public void ActualizarEmpleados(String codempleado,String nombre, String apellido, String sexo, int estado,String estdociv,
            String sangre,String direccion,String dui ,java.sql.Date fechacontrata, java.sql.Date fechanacimiento,
            java.sql.Date fechatermino,String nombrecontacto, String parentescontac,double salario ,String telefono,
            String telecontacto,String depart,String dependencia,String municipio, String puesto,String tipocontrat,String correo)throws Exception{
    
        try {
            this.conectar();
            String query="call actualiza_empleados(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            CallableStatement callable=this.getCon().prepareCall(query);
            callable.setString(1, codempleado);
            callable.setString(2, nombre);
            callable.setString(3, apellido);
            callable.setString(4,sexo);
            callable.setInt(5,estado);
            callable.setString(6, estdociv);
            callable.setString(7,sangre);
            callable.setString(8, direccion);
            callable.setString(9, dui);
            callable.setDate(10, fechacontrata);
            callable.setDate(11, fechanacimiento);
            callable.setDate(12, fechatermino);
            callable.setString(13, nombrecontacto);
            callable.setString(14, parentescontac);
            callable.setDouble(15, salario);
            callable.setString(16, telefono);
            callable.setString(17, telecontacto);
            callable.setString(18,depart);
            callable.setString(19,dependencia);
            callable.setString(20,municipio);
            callable.setString(21,puesto);
            callable.setString(22,tipocontrat);
            callable.setString(23,correo);
            callable.executeUpdate();
            
            
        }  catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
    
    
        }
        
    }
    
    
    public void ActualizarEmpleadosxxx(String codempleado,String nombre, String apellido, String sexo, int estado, int idestdociv,int idsangre)throws Exception{
        
        try {
            this.conectar();
            String query="call update_empleado(?,?,?,?,?,?)";

            CallableStatement callable=this.getCon().prepareCall(query);
            callable.setString(1, codempleado);
            callable.setString(2, nombre);
            callable.setString(3, apellido);
            callable.setString(4,sexo);
            callable.setInt(5, estado);
            callable.setInt(6, idestdociv);
            callable.setInt(7, idsangre);
            callable.executeUpdate();
            
        }  catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
                
            //MODIFICAR EL PROCEDIMIENTO PARA QUE OBTENGA LOS CODIGOS DE ESTADO CIVIL Y TIPO SANGRE
    
        }
        
        
    }
    
    
    public Empleados mostrarEmp(int id) throws Exception{
        this.conectar();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Empleados empleado = null;
        
        EstadoCivil estadociv=null;
        TipoSanguineo tiposangre=null;
        Departamentos departamento=null;
        Municipios municipio=null;
        TipoContrato tipcontrato=null;
        Dependencias dependencia=null;
        Puestos puesto=null;
        
        
        
     
        try {
            String sql = "SELECT * FROM empleados_view WHERE id = ?";
            preparedStatement = this.getCon().prepareStatement(sql);
            preparedStatement.setInt(1, id); // Establece el valor del parámetro ID
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                empleado = new Empleados();
                empleado.setIdEmpleado(resultSet.getInt("id"));
                empleado.setCodEmpleado(resultSet.getString("codigo_empleado"));
                empleado.setNombre(resultSet.getString("nombre"));
                empleado.setApellido(resultSet.getString("apellidos"));
                empleado.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
                empleado.setSexo(resultSet.getString("sexo"));
                
                estadociv=new EstadoCivil();
                estadociv.setNombre(resultSet.getString("estado_civil"));
                tiposangre=new TipoSanguineo();
                tiposangre.setTipo(resultSet.getString("tipo_sanguineo"));
                empleado.setEstadoEmpleado(resultSet.getBoolean("estado_empl"));
                empleado.setDui(resultSet.getString("dui"));
                
                departamento=new Departamentos();
                departamento.setNombre(resultSet.getString("departamento"));
                
                municipio=new Municipios();
                municipio.setNombre(resultSet.getString("municipio"));
                
                empleado.setDireccion(resultSet.getString("direccion"));
                
                tipcontrato=new TipoContrato();
                tipcontrato.setTipo(resultSet.getString("Tipo_contratacion"));
                                
                empleado.setFecha_contratacion(resultSet.getDate("fecha_contratacion"));
                empleado.setFecha_terminacion(resultSet.getDate("fecha_terminacion"));
                
                dependencia=new Dependencias();
                dependencia.setNombre(resultSet.getString("dependencia"));
                
                puesto=new Puestos();
                puesto.setNombre(resultSet.getString("puesto"));
                
                empleado.setSalario(resultSet.getDouble("salario"));
                
                empleado.setTelefono(resultSet.getString("telefono"));
                empleado.setCorreo(resultSet.getString("correo"));
                empleado.setContactoEmergencia(resultSet.getString("nombre_contacto"));
                empleado.setTelefonoEmergencia(resultSet.getString("telefono_contacto"));
                empleado.setParentesco(resultSet.getString("parentesco_contacto"));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            this.desconectar();
        }
        return empleado;
    }

}
