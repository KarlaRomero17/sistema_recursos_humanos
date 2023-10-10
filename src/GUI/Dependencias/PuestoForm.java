package GUI.Dependencias;


import Clase.*;
import Controlador.*;
import GUI.InicioForm;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author fjrod
 */
public final class PuestoForm extends javax.swing.JInternalFrame {
    
    EmpleadosController empController = new EmpleadosController();
    Clase.Dependencias instancia_estado = new Clase.Dependencias();
    Puestos puesto = new Puestos();
    DefaultComboBoxModel<String> Modelo;
    
    
    
    PuestoController puestoController = new PuestoController();
    ArrayList<Puestos> puestosList = new ArrayList<>();
    int id_user;
    
    private AdministradorPuestos adminPuestos;
    private AdministradorDependencias adminDep;
    /**
     * Creates new form Puestoschanges
     * 
     */
    public PuestoForm() {
        initComponents();
        CrearModelo();
        Preferences prefs = Preferences.userNodeForPackage(InicioForm.class);
        this.id_user = prefs.getInt("id", 0);
        adminDep = new AdministradorDependencias();
        adminPuestos = new AdministradorPuestos();
        
        Modelo = new DefaultComboBoxModel<>();
        deshabilitarBotones();
        
        txt_id.setEnabled(false);
        cmb_dependencia.setEnabled(false);
        
        tbl_puestos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tbl_puestos.getSelectedRow();
                    btn_editar.setEnabled(selectedRow != -1); // Habilitar el botón 
                    btn_eliminar.setEnabled(selectedRow != -1); 
                    btn_restaurar.setEnabled(selectedRow != -1); 
                    //btn_enviar.setEnabled(true);
                }
            }
        });
        llenarComboBox();
    }
    public void deshabilitarBotones(){
        btn_enviar.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_restaurar.setEnabled(false);
    }
    
    public void limpiarCampos(){
        txt_id.setText("");
        txt_nombrePuesto.setText("");
        cmb_dependencia.setSelectedIndex(0);
    }
    public void llenarComboBox(){
        try { 
            List<Clase.Dependencias> dependencias = puestoController.mostrarDependencias();
            String[] nombresDependencias;
            nombresDependencias = new String[dependencias.size()];
            cmb_dependencia.addItem("Seleccionar");
            for (int i = 0; i < dependencias.size(); i++) {
                Clase.Dependencias dep = dependencias.get(i);
                nombresDependencias[i] = dep.getNombre();
                cmb_dependencia.addItem(nombresDependencias[i]);
            }

        Modelo = new DefaultComboBoxModel<>(nombresDependencias);
        //cmb_dependencia.addItem("Seleccionar");
        //cmb_dependencia.setModel(Modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombrePuesto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmb_dependencia = new javax.swing.JComboBox<>();
        btn_enviar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_puestos = new javax.swing.JTable();
        btn_cerrar = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        btn_restaurar = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();

        jLabel1.setText("Nombre del Puesto");

        jLabel2.setText("Sleccione una Dependencia");

        btn_enviar.setText("Guardar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        jLabel7.setText("Buscar:");

        tbl_puestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_puestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_puestosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_puestos);

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        jLabelId.setText("Next Id");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_restaurar.setText("Restaurar");
        btn_restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_nombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmb_dependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_enviar)))
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelId)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_nuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_restaurar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_dependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_enviar)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_editar)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_restaurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        String textoBusqueda = txt_buscar.getText().trim();
        buscarPuesto(textoBusqueda);
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        try {
            insertar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        actualizarTablaLimpliarCampos();
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
       try {
            eliminar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        actualizarTablaLimpliarCampos();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        try {
            actualizar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        actualizarTablaLimpliarCampos();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        deshabilitarBotones();
        btn_enviar.setEnabled(true);
        cmb_dependencia.setEnabled(true);
        actualizarTablaLimpliarCampos();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_restaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaurarActionPerformed
        // TODO add your handling code here:
        try {
            restaurar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        actualizarTablaLimpliarCampos();
    }//GEN-LAST:event_btn_restaurarActionPerformed

    private void tbl_puestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_puestosMouseClicked
        // TODO add your handling code here:
        llenarTabla();
    }//GEN-LAST:event_tbl_puestosMouseClicked

    
     public void insertar() throws Exception{
        String nombre = this.txt_nombrePuesto.getText(); 
        int index = this.cmb_dependencia.getSelectedIndex();
        if (nombre.isEmpty() || index == 0) {
            JOptionPane.showMessageDialog(null, "El campo Nombre no puede estar vacío y"
                    + "debe seleccionar un valor para departamento");
        } else {
            puesto.setNombre(this.txt_nombrePuesto.getText());
            puesto.setDependencia(cmb_dependencia.getSelectedIndex());
            puestoController.insertarPuesto(puesto, this.id_user);
            JOptionPane.showMessageDialog(null, "Datos ingresados correctmente");
            //cleanAll();
        }
    }
    
    public void actualizar() throws Exception{
        puesto.setNombre(this.txt_nombrePuesto.getText());
        puesto.setDependencia(this.cmb_dependencia.getSelectedIndex());
        puesto.setId(Integer.parseInt(this.txt_id.getText()));
            String nombre = this.txt_nombrePuesto.getText().trim(); 
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo Nombre no puede estar vacío");
            } else {
                int msg_alert = JOptionPane.showConfirmDialog(this, "¿Esta seugro de modificar?", "Modificar Dependencia", JOptionPane.YES_NO_OPTION);
                if(msg_alert==0){
                    puestoController.editarPuesto(puesto);
                    JOptionPane.showMessageDialog(rootPane, "Dependencia modificada exitosamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE );
                    CrearModelo();
                    limpiarCampos();
                }
                limpiarCampos();     
            }  
    }
    
    public void eliminar() throws Exception{
        puesto.setId(Integer.parseInt(this.txt_id.getText()));
            int msg_alert = JOptionPane.showConfirmDialog(this, "¿Esta seugro de eliminar?"
                    , "Eliminar Puesto", JOptionPane.YES_NO_OPTION);
            if(msg_alert==0){
                puestoController.eliminarPuesto(puesto);
                JOptionPane.showMessageDialog(rootPane, "Puesto eliminado exitosamente"
                        , "Confirmación", JOptionPane.INFORMATION_MESSAGE );
                CrearModelo();
                limpiarCampos();
            }
            limpiarCampos();
        
    }
    
    public void restaurar() throws Exception{
        puesto.setId(Integer.parseInt(this.txt_id.getText()));
            int msg_alert = JOptionPane.showConfirmDialog(this, "¿Esta seugro de Restaurar?"
                    , "Restaurar Puesto", JOptionPane.YES_NO_OPTION);
            if(msg_alert==0){
                puestoController.restaurarPuesto(puesto);
                JOptionPane.showMessageDialog(rootPane, "Puesto Restaurado exitosamente"
                        , "Confirmación", JOptionPane.INFORMATION_MESSAGE );
                CrearModelo();
                limpiarCampos();
            }
            limpiarCampos();
        
    }
    
    private void buscarPuesto(String textoBusqueda) {
        DefaultTableModel modelo = (DefaultTableModel) tbl_puestos.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        tbl_puestos.setRowSorter(sorter);
        if (textoBusqueda.trim().length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoBusqueda));
        }
    }
    
    private boolean existeContactoConID(int id) {
        for (Puestos puesto : puestosList) {
            if (puesto.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    DefaultTableModel Model;
    private void CrearModelo() {
        Object[] obj = new Object[5];
        try {
            Model = (new DefaultTableModel(null, new String[]{
                "#", "Puesto", "Estado", "Creado por", "Fecha_registro"}) {});
            tbl_puestos.setModel(Model);
            
            List ls;
             String estado;
            ls = puestoController.mostrarPuestos(); // tal vez era aca xd
            for (int i = 0 ; i < ls.size() ; i++) {
                puesto = (Puestos)ls.get(i);
                obj[0] =puesto.getId();
                obj[1]=puesto.getNombre(); 
                if(puesto.isEstado()){
                    estado="Activo" ;
                }else{
                    estado="Inactivo";
                }
                obj[2]=estado; 
                obj[3]=puesto.getCreated_by(); 
                obj[4]=puesto.getCreated_at(); 
                
                
                Model.addRow(obj);
                
            }
            ls=puestoController.mostrarDependencias();
            this.tbl_puestos.setModel(Model);
            
            int NextId = puesto.getId()+1;
            lbl_id.setText(String.valueOf(NextId));
            txt_id.setText(String.valueOf(NextId));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void cargarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tbl_puestos.getModel();
    modelo.setRowCount(0); // Limpiar la tabla
        for (Puestos puesto : puestosList) {
            Object[] fila = {puesto.getId(), puesto.getNombre(),puesto.getDependencia()};
            modelo.addRow(fila);
        }
    }
    public void llenarTabla(){
        int fila= this.tbl_puestos.getSelectedRow();
        this.txt_id.setText(String.valueOf(this.tbl_puestos.getValueAt(fila, 0)));
        this.txt_nombrePuesto.setText(String.valueOf(this.tbl_puestos.getValueAt(fila, 1)));
        this.cmb_dependencia.setEnabled(true);
        btn_enviar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_restaurar;
    private javax.swing.JComboBox<String> cmb_dependencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tbl_puestos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombrePuesto;
    // End of variables declaration//GEN-END:variables

    private void actualizarTablaLimpliarCampos() {
        CrearModelo();
        txt_nombrePuesto.setText("");
        cmb_dependencia.setSelectedIndex(0);
    }
}