/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.Dependencias;


import Clase.AdministradorDependencias;
import Clase.AdministradorPuestos;
import Clase.Dependencias;
import Clase.Puestos;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;

import java.awt.event.ItemEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author fjrod
 */
public class Puesto extends javax.swing.JInternalFrame {
    
    ArrayList<Dependencia> dependenciasList = new ArrayList<>();
    ArrayList<Puestos> puestosList = new ArrayList<>();
    
    private AdministradorPuestos adminPuestos;
    private AdministradorDependencias adminDep;
    /**
     * Creates new form Puestos
     */
    public Puesto() {
        initComponents();
        CrearModelo();
        adminDep = new AdministradorDependencias();
        adminPuestos = new AdministradorPuestos();
        llenarCmb();
    }
    
    public void cleanAll(){
        txt_id.setText("");
        txt_nombrePuesto.setText("");
        cmb_dependencia.setSelectedIndex(0);
    }
    public void habilitar(){
        txt_nombrePuesto.setEnabled(true);
        cmb_dependencia.setEnabled(true);
        btn_enviar.setEnabled(true);
    }
    
    public void llenarCmb(){
        cmb_dependencia.removeAllItems(); //Limpiar el CmB
        String [] deptos = {"Seleccionar Opcion", "IT", "Administracion", "Ventas", "Finanzas", "Logistica"};
        cmb_dependencia.setModel(new DefaultComboBoxModel<>(deptos));
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
        btn_mostrar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_puestos = new javax.swing.JTable();
        btn_cerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        jLabel1.setText("Nombre del Puesto");

        jLabel2.setText("Sleccione una Dependencia");

        cmb_dependencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_enviar.setText("Guardar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        btn_mostrar.setText("Mostrar");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
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
        jScrollPane1.setViewportView(tbl_puestos);

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Id");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmb_dependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_enviar)))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_mostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_eliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_cerrar))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_mostrar)
                            .addComponent(btn_eliminar)
                            .addComponent(btn_editar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
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
                        .addGap(105, 105, 105)))
                .addComponent(btn_cerrar)
                .addContainerGap())
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
        // TODO add your handling code here:
        String id = txt_id.getText().trim();
        String nombre = txt_nombrePuesto.getText().trim();
        String depto = cmb_dependencia.getSelectedItem().toString();
        boolean estado = true;
        if (id.isEmpty() || nombre.isEmpty() || cmb_dependencia.getSelectedIndex() == 0 ) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int idNum = Integer.parseInt(id);
                if (existeContactoConID(idNum)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un puesto con el mismo ID.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    Puestos miContacto = new Puestos(idNum, nombre, depto, estado);
                    puestosList.add(miContacto);
                    JOptionPane.showMessageDialog(null, "Dependencia guardada");
                    cleanAll();
                    // Código para agregar un contacto a la lista y luego guardar en CSV
                    adminPuestos.agregarPuesto(miContacto);
                    adminPuestos.guardarPuestoEnCSV();// Guardar en el archivo CSV
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El campo Id debe ser un número válido.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(Dependencias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tbl_puestos.getModel();
        modelo.setRowCount(0); // Borra todas las filas existentes en la tabla
        for (Puestos puesto : puestosList) {
            Object[] fila = {puesto.getId(), puesto.getNombre(), puesto.getDependencia()};
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tbl_puestos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una dependencia para eliminar.",
                "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar esta dependencia?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) tbl_puestos.getModel();
            modelo.removeRow(filaSeleccionada);
            puestosList.remove(filaSeleccionada);
            JOptionPane.showMessageDialog(this, "Dependencia eliminado correctamente.");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tbl_puestos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una dependencia para editar.",
                "Error", JOptionPane.ERROR_MESSAGE);
        }  else {
            String id = txt_id.getText().trim();
            String nombre = txt_nombrePuesto.getText().trim();
            String depto = cmb_dependencia.getSelectedItem().toString();
            boolean estado = true;

            if (id.isEmpty() || nombre.isEmpty() || cmb_dependencia.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    int idNum = Integer.parseInt(id);
                    // Verifica si el ID ingresado coincide con el ID del contacto seleccionado
                    Puestos puestoSeleccionado = (Puestos) puestosList.get(filaSeleccionada);
                    if (idNum != puestoSeleccionado.getId() && existeContactoConID(idNum)) {
                        JOptionPane.showMessageDialog(null, "Ya existe un puesto con el mismo ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Actualiza los datos del contacto seleccionado
                        puestoSeleccionado.setId(idNum);
                        puestoSeleccionado.setNombre(nombre);
                        puestoSeleccionado.setDependencia(depto);
                        puestoSeleccionado.setEstado(estado);
                        // Actualiza la tabla
                        cargarTabla();
                        JOptionPane.showMessageDialog(null, "Puesto editado");
                        cleanAll();
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El campo Id debe ser un número válido.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    
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
    
    DefaultTableModel Modelo;
    private void CrearModelo() {
        try {
            Modelo = (new DefaultTableModel(null, new String[]{
                "#", "Puesto", "Dependencia"}) {});
            tbl_puestos.setModel(Modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JComboBox<String> cmb_dependencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_puestos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombrePuesto;
    // End of variables declaration//GEN-END:variables
}
