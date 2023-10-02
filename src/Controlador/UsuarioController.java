/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Clase.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author Lissette
 */
public class UsuarioController extends Conection {
    
     public Usuarios  validarInicioSesion(String usuario, String clave) throws Exception {
        ResultSet res;
        try {
            this.conectar();
            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?";
            PreparedStatement st = this.getCon().prepareStatement(sql);
            st.setString(1, usuario);
            st.setString(2, clave);
            res = st.executeQuery();

           // return res.next();
           if (res.next()) {
                Usuarios user = new Usuarios();
                user.setId(res.getInt("id"));
                user.setUsuario(res.getString("usuario"));
                user.setClave(res.getString("clave"));
                return user; 
            } else {
                return null; // Retorna null si la autenticación falla
            }
        } catch (Exception e) {
            throw e;
        } finally {
            // Desconectar la conexion
        }
    }
     
     public Usuarios obtenerUsuarioPorNombre(String usuario) throws Exception {
        ResultSet res;
        try {
            this.conectar();
            String sql = "SELECT * FROM usuarios WHERE usuario = ?";
            PreparedStatement st = this.getCon().prepareStatement(sql);
            st.setString(1, usuario);
            res = st.executeQuery();

            if (res.next()) {
                Usuarios user = new Usuarios();
                user.setId(res.getInt("id"));
                user.setUsuario(res.getString("usuario"));;
                return user; // Retorna el usuario encontrado
            } else {
                return null; // Retorna null si no se encuentra el usuario
            }
        } catch (Exception e) {
            throw e;
        } finally {
            // Desconectar la conexión aquí si es necesario
        }
    }


    public List<Usuarios> mostrarUsuarios() throws Exception {
        ResultSet res;
        List<Usuarios> lst = new ArrayList();
        try {
            this.conectar();
            String sql = "select * from usuarios";
            PreparedStatement st = this.getCon().prepareStatement(sql);
            res = st.executeQuery();

            // Procesar los resultados
            while (res.next()) {
                Usuarios user = new Usuarios();
                user.setId(res.getInt("id"));
                user.setUsuario(res.getString("usuario"));
                user.setClave(res.getString("clave"));
                lst.add(user);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            // Desconectar la conexión aquí si es necesario
        }
        return lst;
    }
    
    
}