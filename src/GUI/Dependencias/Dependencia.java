/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.Dependencias;;
import Clase.*;
import Controlador.DependenciasController;

import Clase.AdministradorDependencias;
import Clase.Dependencias;
import GUI.Inicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.prefs.Preferences;
import Clase.*;
import Controlador.DependenciasController;
import Clase.AdministradorDependencias;
import Clase.Dependencias;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.prefs.Preferences;
import Clase.*;
import Controlador.DependenciasController;
import Clase.AdministradorDependencias;
import Clase.Dependencias;
import GUI.Inicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.prefs.Preferences;
import Clase.*;
import Controlador.DependenciasController;
import Clase.AdministradorDependencias;
import Clase.Dependencias;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.prefs.Preferences;
import Clase.*;
import Controlador.DependenciasController;
import Clase.AdministradorDependencias;
import Clase.Dependencias;
import GUI.Inicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.prefs.Preferences;
import Clase.*;
import Controlador.DependenciasController;
import Clase.AdministradorDependencias;
import Clase.Dependencias;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.prefs.Preferences;
import Clase.*;
import Controlador.DependenciasController;
import Clase.AdministradorDependencias;
import Clase.Dependencias;
import GUI.Inicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.prefs.Preferences;
import Clase.*;
import Controlador.DependenciasController;
import Clase.AdministradorDependencias;
import Clase.Dependencias;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.prefs.Preferences;
/**
 *
 * @author Lissette
 */
public class Dependencia extends javax.swing.JInternalFrame {
    ArrayList<Dependencias> area = new ArrayList<Dependencias>();
    private AdministradorDependencias administradorDependencias;
    int id_user;
    Dependencias dep = new Dependencias();
    DependenciasController depController = new DependenciasController();
    /**
     * Creates new form Dependencia
     */
    public Dependencia() {
        initComponents(); 
        CrearModelo(); 
        Preferences prefs = Preferences.userNodeForPackage(Inicio.class);
        this.id_user = prefs.getInt("id", 0);
        administradorDependencias = new AdministradorDependencias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContactos = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelBuscar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelAgenda = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Dependencias");
        setFocusable(false);

        jTableContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableContactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableContactos);

        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });
        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyReleased(evt);
            }
        });

        jLabelBuscar.setText("Buscar:");

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButtonGuardar)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditar)
                .addGap(34, 34, 34)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jButtonCerrar)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonCerrar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabelAgenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAgenda.setText("Dependencias");

        jLabelId.setText("ID:");

        txt_id.setEnabled(false);

        jLabelNombre.setText("Nombre:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAgenda)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        try {
            dep.setNombre(this.jTextFieldNombre.getText());
            dep.setId(Integer.parseInt(this.txt_id.getText()));
            int msg_alert = JOptionPane.showConfirmDialog(this, "¿Esta seugro de modificar?", "Modificar Dependencia", JOptionPane.YES_NO_OPTION);
            if(msg_alert==0){
                depController.editarDependencia(dep);
                JOptionPane.showMessageDialog(rootPane, "Dependencia modificada exitosamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE );
                CrearModelo();
                limpiarCampos();
            }
            limpiarCampos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased
        // TODO add your handling code here:
        String textoBusqueda = jTextFieldBuscar.getText().trim();
        buscarContacto(textoBusqueda);
    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        try {
            insertar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        try {
            eliminar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContactosMouseClicked
        // TODO add your handling code here:
        llenarTabla();
    }//GEN-LAST:event_jTableContactosMouseClicked
    //borrado logico
    public void eliminar(){
        try {
            dep.setId(Integer.parseInt(this.txt_id.getText()));
            int msg_alert = JOptionPane.showConfirmDialog(this, "¿Esta seugro de eliminar?", "Eliminar Dependencia", JOptionPane.YES_NO_OPTION);
            if(msg_alert==0){
                depController.eliminarDependencia(dep);
                JOptionPane.showMessageDialog(rootPane, "Dependencia eliminada exitosamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE );
                CrearModelo();
                limpiarCampos();
            }
            limpiarCampos();
        } catch (Exception e) {
        }
    }

    DefaultTableModel Modelo;
    private void CrearModelo() {
       // String [] col = {"ID", "Nombre" };
        Object[] obj = new Object[5];
        try {
            Modelo = (new DefaultTableModel(null, new String[]{
                "#", "Dependencia", "Estado", "Creado por", "Fecha_registro"}) {});
            jTableContactos.setModel(Modelo);
            
            List ls;
             String estado;
            ls = depController.mostrarDependencias();
            for (int i = 0 ; i < ls.size() ; i++) {
                dep = (Dependencias)ls.get(i);
                obj[0] =dep.getId();
                obj[1]=dep.getNombre(); 
                if(dep.isEstado()){
                    estado="Activo" ;
                }else{
                    estado="Inactivo";
                }
                obj[2]=estado; 
                obj[3]=dep.getCreated_by(); 
                obj[4]=dep.getCreated_at(); 
                
                
                Modelo.addRow(obj);
                
            }
            ls=depController.mostrarDependencias();
            this.jTableContactos.setModel(Modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       /* try {
            Modelo = (new DefaultTableModel(null, new String[]{
                "#", "Dependencia"}) {});
            jTableContactos.setModel(Modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }*/
    }
    
    private void limpiarCampos() {
        jTextFieldNombre.setText("");
    }
    private boolean existeContactoConID(int id) {
        for (Dependencias dependencia : area) {
            if (dependencia.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    
    private void buscarContacto(String textoBusqueda) {
        DefaultTableModel modelo = (DefaultTableModel) jTableContactos.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        jTableContactos.setRowSorter(sorter);
        if (textoBusqueda.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoBusqueda));
        }
    }
    public void llenarTabla(){
        int fila= this.jTableContactos.getSelectedRow();
        this.txt_id.setText(String.valueOf(this.jTableContactos.getValueAt(fila, 0)));
        this.jTextFieldNombre.setText(String.valueOf(this.jTableContactos.getValueAt(fila, 1)));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContactos;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables

    public void insertar() throws Exception{
        dep.setNombre(this.jTextFieldNombre.getText());
        depController.insertarDependencias(dep, this.id_user);
        JOptionPane.showMessageDialog(null, "Datos ingresados correctmente");
        limpiarCampos();
    }
    


}
