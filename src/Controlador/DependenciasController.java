/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clase.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lissette
 */
public class DependenciasController extends Conection{
   public List<Dependencias> mostrar() throws Exception {
        ResultSet res;
        List<Dependencias> lst = new ArrayList();
        try {
            this.conectar();
            String sql = "select * from dependencia";
            PreparedStatement st = this.getCon().prepareStatement(sql);
            res = st.executeQuery();

            // Procesar los resultados
            while (res.next()) {
                Dependencias dependencia = new Dependencias();
                dependencia.setId(res.getInt("id"));
                dependencia.setNombre(res.getString("nombre"));
                dependencia.setEstado(true);
                lst.add(dependencia);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lst;
    }
    
    public void insertarDependencias(Dependencias dep, int id_user) throws Exception{
        try {
            this.conectar();
            String query ="insert into dependencia (nombre, estado, created_by, created_at) values (?,?,?,?)";
            PreparedStatement st = this.getCon().prepareStatement(query);
            st.setString(1, dep.getNombre());
            st.setBoolean(2, true);
            st.setInt(3, id_user);
            st.setDate(4, new java.sql.Date(System.currentTimeMillis()));
            st.executeUpdate();
        }  catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
}
