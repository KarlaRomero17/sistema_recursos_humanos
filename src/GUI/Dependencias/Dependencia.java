/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.Dependencias;;
import Clase.AdministradorDependencias;
import Clase.Dependencias;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;

 

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Lissette
 */
public class Dependencia extends javax.swing.JInternalFrame {
    ArrayList<Dependencias> area = new ArrayList<Dependencias>();
    private AdministradorDependencias administradorDependencias;

    /**
     * Creates new form Dependencia
     */
    public Dependencia() {
        initComponents(); 
        CrearModelo();
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

        jButtonMostrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jLabelBuscar = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonCerrar = new javax.swing.JButton();
        jPanelDatos = new javax.swing.JPanel();
        jLabelAgenda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContactos = new javax.swing.JTable();
        jLabelImagen = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Dependencias");
        setFocusable(false);

        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jLabelBuscar.setText("Buscar:");

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

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jLabelAgenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAgenda.setText("Dependencias");

        jLabel2.setText("ID:");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabelNombre.setText("Nombre:");

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelNombre)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jButtonGuardar)
                        .addGap(81, 81, 81)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNombre))
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButtonGuardar)
                .addContainerGap(119, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(jTableContactos);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCerrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonMostrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonEliminar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEliminar)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonMostrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonCerrar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTableContactos.getModel();
        modelo.setRowCount(0); // Borra todas las filas existentes en la tabla
        for (Dependencias dependencia : area) {
            Object[] fila = {dependencia.getId(), dependencia.getNombre()};
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTableContactos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una dependencia para editar.",
                "Error", JOptionPane.ERROR_MESSAGE);
        }  else {
            String id = jTextFieldId.getText().trim();
            String nombre = jTextFieldNombre.getText().trim();
            boolean estado = true;

            if (id.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    int idNum = Integer.parseInt(id);
                    // Verifica si el ID ingresado coincide con el ID del contacto seleccionado
                    Dependencias contactoSeleccionado = (Dependencias) area.get(filaSeleccionada);
                    if (idNum != contactoSeleccionado.getId() && existeContactoConID(idNum)) {
                        JOptionPane.showMessageDialog(null, "Ya existe una dependencia con el mismo ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Actualiza los datos del contacto seleccionado
                        contactoSeleccionado.setId(idNum);
                        contactoSeleccionado.setNombre(nombre);
                        contactoSeleccionado.setEstado(estado);
                        // Actualiza la tabla
                        cargarTabla();
                        JOptionPane.showMessageDialog(null, "Dependencia editado");
                        limpiarCampos();
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El campo Id debe ser un número válido.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
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
        //this.dispose();
        JOptionPane.showMessageDialog(null, administradorDependencias.obtenerNombres());
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        String id = jTextFieldId.getText().trim();
        String nombre = jTextFieldNombre.getText().trim();
        boolean estado = true;
        if (id.isEmpty() || nombre.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int idNum = Integer.parseInt(id);
                if (existeContactoConID(idNum)) {
                    JOptionPane.showMessageDialog(null, "Ya existe una dependencia  con el mismo ID.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    Dependencias miContacto = new Dependencias(idNum, nombre, estado);
                    area.add(miContacto);
                    JOptionPane.showMessageDialog(null, "Dependencia guardada");
                    limpiarCampos();
                    // Código para agregar un contacto a la lista y luego guardar en CSV
                    administradorDependencias.agregarContacto(miContacto);
                    administradorDependencias.guardarContactosEnCSV(); // Guardar en el archivo CSV
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El campo Id debe ser un número válido.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(Dependencias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTableContactos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una dependencia para eliminar.",
                "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar esta dependencia?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) jTableContactos.getModel();
            modelo.removeRow(filaSeleccionada);
            area.remove(filaSeleccionada);
            JOptionPane.showMessageDialog(this, "Dependencia eliminado correctamente.");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed


    DefaultTableModel Modelo;
    private void CrearModelo() {
        try {
            Modelo = (new DefaultTableModel(null, new String[]{
                "#", "Dependencia"}) {});
            jTableContactos.setModel(Modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
    }
    
    private void cargarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) jTableContactos.getModel();
    modelo.setRowCount(0); // Limpiar la tabla
        for (Dependencias dependencia : area) {
            Object[] fila = {dependencia.getId(), dependencia.getNombre()};
            modelo.addRow(fila);
        }
    }
    
    private void limpiarCampos() {
        jTextFieldId.setText("");
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContactos;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
