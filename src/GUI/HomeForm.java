/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Controlador.*;
import Clase.*;
import GUI.Dependencias.*;
import java.awt.Image;
import java.util.prefs.Preferences;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Lissette
 */
public class HomeForm extends javax.swing.JFrame {
    //private String name;
    /**
     * Creates new form Home
     */
    public HomeForm() {
        initComponents(); 
        setExtendedState(this.MAXIMIZED_BOTH);  
        //agregar img del menu
        
        Preferences prefs = Preferences.userNodeForPackage(InicioForm.class);
        String username = prefs.get("username", "Error");
        int id = prefs.getInt("id", 0);
        txt_user_log.setText("Bienvenido/a " + username);
    } 
    
    //parametros personalizados
    /*public void setData(Usuarios usuario) {
          this.log_name_user = usuario.getUsuario();
        //this.usuario = usuario;
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEscritorio = new javax.swing.JDesktopPane();
        txt_user_log = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuItem_crearDependencia = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");

        jPanelEscritorio.setLayer(txt_user_log, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanelEscritorioLayout = new javax.swing.GroupLayout(jPanelEscritorio);
        jPanelEscritorio.setLayout(jPanelEscritorioLayout);
        jPanelEscritorioLayout.setHorizontalGroup(
            jPanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEscritorioLayout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(txt_user_log, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelEscritorioLayout.setVerticalGroup(
            jPanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEscritorioLayout.createSequentialGroup()
                .addComponent(txt_user_log, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 287, Short.MAX_VALUE))
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleados.png"))); // NOI18N
        jMenu3.setText("Empleados");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jMenuItem2.setText("Crear");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jMenuItem1.setText("Buscar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Dependencias");

        menuItem_crearDependencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        menuItem_crearDependencia.setText("Crear");
        menuItem_crearDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_crearDependenciaActionPerformed(evt);
            }
        });
        jMenu4.add(menuItem_crearDependencia);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Puestos");

        jMenuItem3.setText("Crear");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        jMenu1.setText("Reportes");

        jMenu2.setText("Reportes");
        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        jMenu7.setText("Salir");
        jMenu7.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu7MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_crearDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_crearDependenciaActionPerformed
        // TODO add your handling code here:
        DependenciaForm ventana = new DependenciaForm();
        jPanelEscritorio.add(ventana);
        ventana.show();
        //ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_crearDependenciaActionPerformed

    private void jMenu7MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu7MenuSelected
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu7MenuSelected

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        PuestoForm ventana = new PuestoForm();
        jPanelEscritorio.add(ventana);
        ventana.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
       // Empleados  ventana = new Empleados();
        EmpleadosForm ventana = new EmpleadosForm();
        jPanelEscritorio.add(ventana);
        ventana.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        BuscarEmpleadoForm ventana = new BuscarEmpleadoForm();
        jPanelEscritorio.add(ventana);
        ventana.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void cargarFormEmpleados(){
        
        BuscarEmpleadoForm ventana = new BuscarEmpleadoForm();
        jPanelEscritorio.add(ventana);
        ventana.show();
    }
    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
        cerrarSesion();
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void cerrarSesion() {
        // Aquí puedes realizar cualquier acción necesaria para cerrar la sesión, como limpiar datos de usuario, etc.
        // Luego, cierra la ventana actual y abre la ventana de inicio de sesión.
        HomeForm home = new HomeForm();
        home.setVisible(true);
        dispose(); // Cierra la ventana principal
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    public javax.swing.JDesktopPane jPanelEscritorio;
    private javax.swing.JMenuItem menuItem_crearDependencia;
    private javax.swing.JLabel txt_user_log;
    // End of variables declaration//GEN-END:variables

    private void setImageLabel(JLabel lblImagen, String root) {
        // Nuevo JLabel para la imagen
        ImageIcon imagen = new ImageIcon(root);
        if (imagen.getImageLoadStatus() == java.awt.MediaTracker.ERRORED) {
            System.out.println("Error al cargar la imagen: " + root);
        } else {
            Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(),
            lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(icon);
            this.repaint();
        }
    }
}
