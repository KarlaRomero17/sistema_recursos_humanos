package GUI.Dependencias;


import Clase.*;
import Controlador.*;
import GUI.InicioForm;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author fjrod
 */
public final class UsersForm extends javax.swing.JInternalFrame {
    Usuarios usuarios = new Usuarios();
    DefaultComboBoxModel<String> Modelo;
    Encoder codificador = new Encoder();
    
    
    UsuarioController usuariosController = new UsuarioController();
    ArrayList<Usuarios> usuariosList = new ArrayList<>();
    int id_user;
    
    /**
     * Creates new form Puestoschanges
     * 
     */
    public UsersForm() {
        initComponents();
        CrearModelo();
        Preferences prefs = Preferences.userNodeForPackage(InicioForm.class);
        this.id_user = prefs.getInt("id", 0);
        Modelo = new DefaultComboBoxModel<>();
        deshabilitarBotones();
        txt_id.setEnabled(false);
        txt_contra.setEnabled(false);
        
        tbl_puestos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tbl_puestos.getSelectedRow();
                    btn_editar.setEnabled(selectedRow != -1); // Habilitar el botón 
                    //btn_enviar.setEnabled(true);
                }
            }
        });
    }
    public void deshabilitarBotones(){
        btn_enviar.setEnabled(false);
        btn_editar.setEnabled(false);
    }
    
    public void limpiarCampos(){
        txt_id.setText("");
        txt_nombrePuesto.setText("");
        txt_contra.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_userName = new javax.swing.JLabel();
        txt_nombrePuesto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_puestos = new javax.swing.JTable();
        btn_cerrar = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_id = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_nuevo = new javax.swing.JButton();
        btn_enviar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        txt_contra = new javax.swing.JPasswordField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(660, 533));
        setRequestFocusEnabled(false);

        lbl_userName.setText("Nombre de Usuario");

        jLabel2.setText("Contraseña");

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

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btn_enviar.setText("Guardar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        jLabel7.setText("Buscar:");

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_enviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar)
                        .addGap(107, 107, 107)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_enviar)
                    .addComponent(btn_editar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelId)
                                .addGap(9, 9, 9))
                            .addComponent(txt_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_userName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_cerrar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_userName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(65, 65, 65)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar)
                .addContainerGap(76, Short.MAX_VALUE))
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
        txt_contra.setEnabled(true);
        actualizarTablaLimpliarCampos();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void tbl_puestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_puestosMouseClicked
        // TODO add your handling code here:
        llenarTabla();
    }//GEN-LAST:event_tbl_puestosMouseClicked

    private void txt_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraActionPerformed

    
     public void insertar() throws Exception{
        String nombre = this.txt_nombrePuesto.getText(); 
        String contra = this.txt_contra.getText();
        if (nombre.isEmpty() || contra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ALERTA!!\n"
                        + "El campo Nombre no puede estar vacío\n"
                        + "El campo Contraseña no puede estar vacío");
        } else {
            usuarios.setUsuario(this.txt_nombrePuesto.getText());
            usuarios.setClave(codificador.encode(this.txt_contra.getText()));
            usuariosController.insertarUsuario(usuarios);
            JOptionPane.showMessageDialog(null, "Datos ingresados correctmente");
            //cleanAll();
        }
    }
    
    public void actualizar() throws Exception{
        usuarios.setUsuario(this.txt_nombrePuesto.getText());
        usuarios.setClave(codificador.encode(this.txt_contra.getText()));
        usuarios.setId(Integer.parseInt(this.txt_id.getText()));
            String nombre = this.txt_nombrePuesto.getText().trim(); 
            String contra = this.txt_contra.getText();
            if (nombre.isEmpty() || contra.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ALERTA!!\n"
                        + "El campo Nombre no puede estar vacío\n"
                        + "El campo Contraseña no puede estar vacío");
            }else{
                int msg_alert = JOptionPane.showConfirmDialog(this, "¿Esta seguro de modificar?", "Modificar Usuario", JOptionPane.YES_NO_OPTION);
                if(msg_alert==0){
                    usuariosController.editarUsuario(usuarios);
                    JOptionPane.showMessageDialog(rootPane, "Uusario modificado exitosamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE );
                    CrearModelo();
                    limpiarCampos();
                }
                limpiarCampos();     
            }  
    }
    
    public void eliminar(int id){
        try {
            int filaSeleccionada = tbl_puestos.getSelectedRow(); // Obtiene la fila seleccionada
            Object estadoActtual=0;
            if (filaSeleccionada != -1) { // Verifica si se ha seleccionado alguna fila
                estadoActtual = tbl_puestos.getValueAt(filaSeleccionada, 3); // Obtiene el valor de la columna 3 (índice 2)
            }
            //System.out.print(estadoActtual);
            boolean status=false;
            if(estadoActtual=="Inactivo"){
                status=true;
            }
            String msjPregunta = status ? "ACTIVAR" : "DESACTIVAR";
            String msjRespuesta = status ? "activado" : "desactivado";
           // dep.setId(Integer.parseInt(this.txt_id.getText()));
            usuarios.setId(id);
            Object[] options = {"Aceptar", "Cancelar"};
            int msg_alert = JOptionPane.showOptionDialog(this, "¿Está seguro de " + msjPregunta + "?", "Eliminar Puesto", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(msg_alert==0){
                usuariosController.eliminarUsuario(usuarios);
                JOptionPane.showMessageDialog(rootPane,"Usuario "+ msjRespuesta +" exitosamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE );
                CrearModelo();
                limpiarCampos();
            }
            limpiarCampos();
            validacion_botones();
        } catch (Exception e) {
        }
    }
        
    public void validacion_botones(){
        btn_enviar.setEnabled(true);
        btn_editar.setEnabled(false);
        if (tbl_puestos.getSelectedRow() != -1) {
            tbl_puestos.clearSelection();
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
        for (Usuarios usuario : usuariosList) {
            if (usuario.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    private static String getAsterisks(String originalValue) {
        // Lógica para reemplazar el valor con asteriscos
        return "********";
    }
    
    DefaultTableModel Model;
    private void CrearModelo() {
        Object[] obj = new Object[5];
        try {
            Model = (new DefaultTableModel(null, new String[]{
                "Código", "Usuario", "Clave", "Estado", "Eliminar"}) {});
            tbl_puestos.setModel(Model);
            
            List ls;
             String estado;
            ls = usuariosController.mostrarUsuarios(); // tal vez era aca xd
            for (int i = 0 ; i < ls.size() ; i++) {
                usuarios = (Usuarios)ls.get(i);
                obj[0] =usuarios.getId();  // Id
                obj[1]=usuarios.getUsuario(); //NOMBRE PUESTO
                if(usuarios.isEstado()){
                    estado="Activo" ;
                }else{
                    estado="Inactivo";
                }
                String clave = usuarios.getClave();
                obj[2]=getAsterisks(clave); //Dependencia
                obj[3]=estado; // Estado
                tbl_puestos.getColumnModel().getColumn(4).setCellRenderer(new UsersForm.btnEliminarTable());
                tbl_puestos.getColumnModel().getColumn(4).setCellEditor(new UsersForm.ButtonEditor());
                tbl_puestos.setRowHeight(25);
                
                Model.addRow(obj);
                
            }
            ls=usuariosController.mostrarUsuarios();
            this.tbl_puestos.setModel(Model);
            
            int NextId = usuarios.getId()+1;
            lbl_id.setText(String.valueOf(NextId));
            txt_id.setText(String.valueOf(NextId));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private class ButtonEditor extends DefaultCellEditor {
        private JButton button;
        private int clickedRow;

        public ButtonEditor() {
            super(new JTextField()); 

            button = new JButton(); // Creamos el botón sin un ícono inicialmente
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int row = tbl_puestos.getSelectedRow(); 
                    if (row != -1) {
                        int id = (int) tbl_puestos.getValueAt(row, 0);
                        try {
                            eliminar(id);
                        } catch (Exception er) {
                        }
                        //JOptionPane.showMessageDialog(null, "Button clicked at row " + row + ", ID: " + id);
                    }
                }
            });
            button.setFocusable(false);
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            clickedRow = row; 
            Object estadoActual = table.getValueAt(row, 3);
            if ("Activo".equals(estadoActual)) {
                button.setIcon(new ImageIcon("src/Imagenes/activar.png"));
            } else {
                button.setIcon(new ImageIcon("src/Imagenes/desactivar.png"));
            }

            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return null; 
        }
    }
    
    private class btnEliminarTable extends DefaultTableCellRenderer {
        private JButton button;

        public btnEliminarTable() {
            button = new JButton();
            button.setBorderPainted(false); // Para quitar el borde del botón
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Object estadoActual = table.getValueAt(row, 3); // Obtener el estado actual de la fila (columna 2)

            if ("Activo".equals(estadoActual)) {
                button.setIcon(new ImageIcon("src/Imagenes/activar.png"));
            } else {
                button.setIcon(new ImageIcon("src/Imagenes/desactivar.png"));
            }

            return button;
        }
    }
    
    private void cargarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) tbl_puestos.getModel();
    modelo.setRowCount(0); // Limpiar la tabla
        for (Usuarios usuario : usuariosList) {
            Object[] fila = {usuario.getId(), usuario.getUsuario(),usuario.getClave(), usuario.isEstado()};
            modelo.addRow(fila);
        }
    }
    public void llenarTabla(){
        int fila= this.tbl_puestos.getSelectedRow();
        this.txt_id.setText(String.valueOf(this.tbl_puestos.getValueAt(fila, 0)));
        this.txt_nombrePuesto.setText(String.valueOf(this.tbl_puestos.getValueAt(fila, 1)));
        this.txt_contra.setText(String.valueOf(this.tbl_puestos.getValueAt(fila, 2)));
        this.txt_contra.setEnabled(true);
        btn_enviar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_userName;
    private javax.swing.JTable tbl_puestos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombrePuesto;
    // End of variables declaration//GEN-END:variables

    private void actualizarTablaLimpliarCampos() {
        CrearModelo();
        txt_nombrePuesto.setText("");
        txt_contra.setText("");
    }
}
