/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Clase.EstadoCivil;
import Clase.TipoSanguineo;
import Clase.Empleados;
import Clase.*;
import GUI.*;
import Controlador.PuestoController;
import Controlador.EmpleadosController;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Time;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lissette
 */
@SuppressWarnings("unchecked")
public class EmpleadosForm extends javax.swing.JInternalFrame {
    ArrayList<Empleados> emplead= new ArrayList<Empleados>();
    EmpleadosController empController = new EmpleadosController();
    PuestoController puestoController=new PuestoController();
    EstadoCivil instancia_estado = new EstadoCivil();
    TipoSanguineo instancia_TSangre=new TipoSanguineo();
    DefaultComboBoxModel<String> Modelo;
    Clase.Empleados emp =new Empleados();
    Clase.DetalleEmpleado detemp=new DetalleEmpleado();
    int id_user;
    int idSangre;
    int idEsCivil;
    int idDepartamento;
    int idDependencia;
    int idMunicipio;
    int idPuesto;
    int idTipoContratacion;
    //long DateInicio;
    //long DateCumple;
    //long DateFin;
    
    /**
     * Creates new form EmpleadosForm
     */
    public EmpleadosForm() {
        initComponents();
        Modelo = new DefaultComboBoxModel<>(); 
        //ccbEstadoCivil.setModel(Modelo); 
        mostrarEstado();
        mostrarTipoSangre();
        mostrarDepartamentos();
        mostrarTipoDocumentos();
        mostrarTipoContrata();
        mostrarDependencias();
        
        
        //empController cc = new estados();
        
       
        
        Preferences prefs = Preferences.userNodeForPackage(InicioForm.class);
        this.id_user = prefs.getInt("id", 0);
    }
    
     public void mostrarEstado () {
        try { 
            /*List<EstadoCivil> estadosCiviles = empController.mostrarEstadoCivil();
            String[] nombresEstados = new String[estadosCiviles.size()];

            for (int i = 0; i < estadosCiviles.size(); i++) {
                EstadoCivil estadoCivil = estadosCiviles.get(i);
                nombresEstados[i] = estadoCivil.getNombre();
            }

        Modelo = new DefaultComboBoxModel<>(nombresEstados);
        cbbEstadoCivil.setModel(Modelo);*/
            
        EmpleadosController cc = new EmpleadosController();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarEstadoCivil());
        cbbEstadoCivil.setModel(modelEstado);    
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
     public void mostrarTipoSangre () {
        try { 
           /* List<TipoSanguineo> TipoSangre = empController.mostrarTipoSanguineo();
            String[] TipoSang = new String[TipoSangre.size()];

            for (int i = 0; i < TipoSangre.size(); i++) {
                TipoSanguineo tipoSanguineo = TipoSangre.get(i);
                TipoSang[i] = tipoSanguineo.getTipo();
            }

        Modelo = new DefaultComboBoxModel<>(TipoSang);
        cbbTipoSanguineo.setModel(Modelo);*/
        EmpleadosController cc = new EmpleadosController();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarTipoSanguineo());
        cbbTipoSanguineo.setModel(modelEstado);
           
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

     
    public void mostrarDepartamentos () {
        
        try { 
        
        EmpleadosController cc = new EmpleadosController();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarDepartamento());
        cbbDepartamento.setModel(modelEstado);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
        

    
    
    public void mostrarTipoDocumentos () {
       try { 
        
        EmpleadosController ccc = new EmpleadosController();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(ccc.mostrarTipoDocumento());
        cbbTipoDoc.setModel(modelEstado);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
    
    
    
    public void mostrarTipoContrata () {
         try { 
        
        EmpleadosController cc = new EmpleadosController();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarTipoContrato());
        cbbTipoContratacion.setModel(modelEstado);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
    
    
    public void mostrarDependencias(){
       try { 
        
        EmpleadosController cc = new EmpleadosController();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.listaDependencias());
        cbbDependencia.setModel(modelEstado);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    }
    
    
     
     
     public void mostrarEmpleado(){
     int Valorx=1;
        try{
            
            List ls;
            //ls=empController.mostrarEmpleados(Valorx);

            emp=(Empleados) empController.mostrarEmpleados(Valorx);
            
            txtCodEmpleado.setText(emp.getCodEmpleado());
            txtNombre.setText(emp.getNombre());
            txtApellido.setText(emp.getApellido());

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
     }
    
    public void showEmp(int id) {
        try {
            emp = empController.mostrarEmp(id);

            // Asumiendo que empController.mostrarEmp(id) devuelve un objeto Empleados válido
            // Si es necesario, configura los campos en tu formulario con los datos de 'emp'

            txtCodEmpleado.setText(emp.getCodEmpleado());
            txtNombre.setText(emp.getNombre());
            txtApellido.setText(emp.getApellido());
            
            /*
            Date fechaNacimiento = emp.getFechaNacimiento();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String fechaNacimientoStr = dateFormat.format(fechaNacimiento);
            System.out.println(emp.getNombre() + " - " + emp.getFechaNacimiento() + " - " + fechaNacimientoStr);
            */
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fecha1=dateFormat.format(emp.getFechaNacimiento());
            Date nacimiento=null;
            nacimiento=dateFormat.parse(fecha1);
            dtcFechaNacimiento.setDate(nacimiento);
            
            cbbSexo.setSelectedItem((String)emp.getSexo());
            cbxEstado.setSelected(emp.getEstadoEmpleado());
            txtDui.setText(emp.getDui());
            //cbbEstadoCivil.setSelectedItem((String) emp.get);
            txtDireccion.setText(emp.getDireccion());
            
            String fecha2=dateFormat.format(emp.getFecha_contratacion());
            Date inicio=null;
            inicio=dateFormat.parse(fecha2);
            dtcFechaInicio.setDate(inicio);
            
            String fecha3=dateFormat.format(emp.getFecha_terminacion());
            Date fin=null;
            fin=dateFormat.parse(fecha3);
            dtcFechaTermino.setDate(fin);
            
            txtSalario.setText(emp.getSalario().toString());
            txtTelefono.setText(emp.getTelefono());        
            txtCorreo.setText(emp.getCorreo());
            txtContactoEmergencia.setText(emp.getContactoEmergencia());
            txtParentesco.setText(emp.getParentesco());
            txtTelefonoEmergencia.setText(emp.getTelefonoEmergencia());
            
          //  instancia_estado=empController.mostrarEmp(id);
            
            
            
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
     public void InsertarEmpleado()throws Exception{
         int Id=0;
         
         String nombre = this.txtNombre.getText().trim();
         long DateInicio=this.dtcFechaInicio.getDate().getTime();
         long DateCumple=this.dtcFechaNacimiento.getDate().getTime();
         long DateFin=this.dtcFechaTermino.getDate().getTime();
         java.sql.Date mDateIni=new java.sql.Date(DateInicio);
         java.sql.Date mDateCump=new java.sql.Date(DateCumple);
         java.sql.Date mDateFin=new java.sql.Date(DateFin);
         
         //System.out.println(mDateIni);
         
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Nombre no puede estar vacío");
        } else {
           
            empController.InsertarEmpleados(this.txtNombre.getText(), this.txtApellido.getText(), (String)this.cbbSexo.getSelectedItem(), 1, this.id_user, idEsCivil, idSangre,this.txtDireccion.getText(),this.txtDui.getText(),mDateIni,mDateCump,mDateFin,this.txtContactoEmergencia.getText(),this.txtParentesco.getText(),Double.parseDouble(this.txtSalario.getText()),this.txtTelefono.getText(),this.txtTelefonoEmergencia.getText(),this.idDepartamento,this.idDependencia, this.idMunicipio, this.idPuesto, this.idTipoContratacion, this.id_user, this.txtCorreo.getText());
            
            //empController.insertarEmpleado(emp, detemp,this.id_user);
            asignarCodEmp();
            //JOptionPane.showMessageDialog(null, "Empleado ingresado correctmente");
            
            System.out.print(mDateIni);
        }
     
     }
     
     
    public void asignarCodEmp() {
        try {
            emp = empController.codEmpleado();
            txtCodEmpleado.setText(emp.getCodEmpleado());
            JOptionPane.showMessageDialog(null, " Empleado ingresado correctamente\n codigo asignado al empleado: "+emp.getCodEmpleado());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
     
     public void ActualizarEmpleado()throws Exception{
     
         int Id=0;
          String nombre = this.txtNombre.getText().trim(); 
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Nombre no puede estar vacío");
        } else {
                    
         /*   SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                  
            String Dft = this.dtcFechaTermino.getDate().toString().trim();
            String Dfc=this.dtcFechaInicio.getDate().toString().trim();
            String Dfn=this.dtcFechaNacimiento.getDate().toString().trim();
            Date DfechaTerm;
            Date DfechaContrata;
            Date DfechaNac;
           */ 
         long DateInicio=this.dtcFechaInicio.getDate().getTime();
         long DateCumple=this.dtcFechaNacimiento.getDate().getTime();
         long DateFin=this.dtcFechaTermino.getDate().getTime();
         java.sql.Date mDateIni=new java.sql.Date(DateInicio);
         java.sql.Date mDateCump=new java.sql.Date(DateCumple);
         java.sql.Date mDateFin=new java.sql.Date(DateFin);
            
            if (DateInicio==0){
                mDateIni=null;
            }
            
            if (DateCumple==0){
                mDateCump=null;
            }

            if (DateFin==0){
                mDateFin=null;
            }
            
            
            boolean chk = this.cbxEstado.isSelected();
            int activo;
            if (chk=true){
                activo=1;
            }else{
                activo=0;
            }
            
           
            String ESCV; 
            EstadoCivil est = (EstadoCivil) cbbEstadoCivil.getSelectedItem();
            ESCV=est.getNombre();
            
            String SANG; 
            TipoSanguineo san = (TipoSanguineo) cbbTipoSanguineo.getSelectedItem();
            SANG=san.getTipo();
            
            String DEP; 
            Departamentos deptos = (Departamentos) cbbDepartamento.getSelectedItem();
            DEP=deptos.getNombre();
            
            String DEPC; 
            Dependencias depcia = (Dependencias) cbbDependencia.getSelectedItem();
            DEPC=depcia.getNombre();
            
            String MU; 
            Municipios mum = (Municipios) cbbMunicipio.getSelectedItem();
            MU=mum.getNombre();
            
            String PU; 
            Puestos pue = (Puestos) cbbPuesto.getSelectedItem();
            PU=pue.getNombre();
            
            String TCON; 
            TipoContrato tc = (TipoContrato) cbbTipoContratacion.getSelectedItem();
            TCON=tc.getTipo();
            
            //EL ERROR SE DEBE A QUE LA SELECCION DEVUELVE EL ID Y NO EL TEXTO, PERO POSIBLEMENTE PORQUE EL FORM TIENE CARGADO
            //EL MODELO DE DATOS POR LA SELECCION DEL COMBOBOX, HAY QUE PROBAR SI EL FORM SE CARGA DES DE BUSQUEDA DE EMPLEADO
            
            //System.out.println(seleccion);
            empController.ActualizarEmpleados(this.txtCodEmpleado.getText(),this.txtNombre.getText(), this.txtApellido.getText(), (String)this.cbbSexo.getSelectedItem(), activo,ESCV,SANG, this.txtDireccion.getText(),this.txtDui.getText(),mDateIni, mDateCump,mDateFin,this.txtContactoEmergencia.getText(),this.txtParentesco.getText(),Double.parseDouble( this.txtSalario.getText()),this.txtTelefono.getText(),this.txtTelefonoEmergencia.getText(),DEP,DEPC,MU,PU,TCON,this.txtCorreo.getText());
                                            
            JOptionPane.showMessageDialog(null, "Empleado actualizado correctamente");
           
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

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbbDepartamento = new javax.swing.JComboBox<>();
        cbbMunicipio = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDocumentos = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        cbbTipoDoc = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cbbInstitucion = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cbbTipoContratacion = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        dtcFechaInicio = new com.toedter.calendar.JDateChooser();
        dtcFechaTermino = new com.toedter.calendar.JDateChooser();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbbDependencia = new javax.swing.JComboBox<>();
        cbbPuesto = new javax.swing.JComboBox<>();
        txtSalario = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtContactoEmergencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefonoEmergencia = new javax.swing.JTextField();
        txtParentesco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnGuardarNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodEmpleado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbbEstadoCivil = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbbTipoSanguineo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        txtDui = new javax.swing.JTextField();
        dtcFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTabbedPane1.setToolTipText("");

        jLabel13.setText("Departamento");

        jLabel14.setText("Municipio");

        cbbDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbDepartamentoItemStateChanged(evt);
            }
        });
        cbbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDepartamentoActionPerformed(evt);
            }
        });

        cbbMunicipio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbMunicipioItemStateChanged(evt);
            }
        });

        jLabel15.setText("Direccion");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(421, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel5);

        jTabbedPane1.addTab("Direccion", jScrollPane5);

        tblDocumentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblDocumentos);

        jLabel22.setText("Tipo Documento");

        cbbTipoDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTipoDocItemStateChanged(evt);
            }
        });

        jLabel23.setText("Número");

        jLabel24.setText("Institucion");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(cbbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(cbbInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel8);

        jTabbedPane1.addTab("Documentos", jScrollPane1);

        jLabel16.setText("Tipo Contratacion");

        cbbTipoContratacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTipoContratacionItemStateChanged(evt);
            }
        });
        cbbTipoContratacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTipoContratacionActionPerformed(evt);
            }
        });

        jLabel17.setText("Fecha Inicio");

        jLabel18.setText("Fecha Terminacion");

        dtcFechaInicio.setDateFormatString("yyyy-MM-dd");

        dtcFechaTermino.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbTipoContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(dtcFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dtcFechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(572, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbbTipoContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(dtcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(dtcFechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel6);

        jTabbedPane1.addTab("Contrato", jScrollPane6);

        jLabel19.setText("Dependencia");

        jLabel20.setText("Puesto");

        jLabel21.setText("Salario");

        cbbDependencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbDependenciaItemStateChanged(evt);
            }
        });

        cbbPuesto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbPuestoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbDependencia, 0, 127, Short.MAX_VALUE)
                    .addComponent(cbbPuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSalario))
                .addContainerGap(632, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbbDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cbbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel7);

        jTabbedPane1.addTab("Puesto", jScrollPane7);

        jLabel10.setText("Contacto Emergencia");

        jLabel11.setText("Telefono Emergencia");

        txtTelefonoEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEmergenciaActionPerformed(evt);
            }
        });

        jLabel12.setText("Parentesco");

        jLabel9.setText("Telefono");

        lblCorreo.setText("Correo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefonoEmergencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtContactoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContactoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelefonoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contacto", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardarNuevo.setText("Guardar");
        btnGuardarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnBuscar)
                    .addComponent(btnGuardarNuevo)
                    .addComponent(btnGuardar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Codigo Empleado");

        txtCodEmpleado.setEditable(false);

        jLabel2.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Nacimiento");

        jLabel5.setText("Sexo");

        cbbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        jLabel6.setText("Estado Civil");

        cbbEstadoCivil.setOpaque(true);
        cbbEstadoCivil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbEstadoCivilItemStateChanged(evt);
            }
        });
        cbbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbEstadoCivilActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo Sanguineo");

        cbbTipoSanguineo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTipoSanguineoItemStateChanged(evt);
            }
        });

        jLabel8.setText("Estado Empleado");

        cbxEstado.setText("Activo");

        jLabel25.setText("DUI");

        dtcFechaNacimiento.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodEmpleado))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(cbbTipoSanguineo, 0, 104, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDui)
                                .addComponent(cbbEstadoCivil, 0, 128, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxEstado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(cbbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cbbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dtcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cbbTipoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxEstado)
                        .addComponent(jLabel8)
                        .addComponent(jLabel25))
                    .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbEstadoCivilActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        HomeForm home=new HomeForm();
        BuscarEmpleadoForm buscar=new BuscarEmpleadoForm();
        home.jPanelEscritorio.add(buscar);
        buscar.show();
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEmergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEmergenciaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       //mostrarEmpleado();
       //this.dispose();
        //EmpleadosForm ventana = new EmpleadosForm();
        //HomeForm.jPanelEscritorio.add(ventana);
        //ventana.show();
        vistaNuevo();
       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevoActionPerformed
        // TODO add your handling code here:
        try {
            InsertarEmpleado();
            vistaBloquearCampos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarNuevoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void cbbTipoContratacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTipoContratacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTipoContratacionActionPerformed

    private void cbbDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbDepartamentoItemStateChanged
        
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            Departamentos est = (Departamentos) cbbDepartamento.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            DefaultComboBoxModel modelMunicipio = new DefaultComboBoxModel(mun.mostrarMunicipios(est.getId()));
            cbbMunicipio.setModel(modelMunicipio);
            idDepartamento=est.getId();
           
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }//GEN-LAST:event_cbbDepartamentoItemStateChanged

    private void cbbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbDepartamentoActionPerformed

    private void cbbTipoDocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTipoDocItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            TipoDocumento est = (TipoDocumento) cbbTipoDoc.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            DefaultComboBoxModel modelInstitucion = new DefaultComboBoxModel(mun.mostrarInstitucion(est.getId()));
            cbbInstitucion.setModel(modelInstitucion);
           
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cbbTipoDocItemStateChanged

    private void cbbDependenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbDependenciaItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            Dependencias est = (Dependencias) cbbDependencia.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            DefaultComboBoxModel modelPuestos = new DefaultComboBoxModel(mun.mostrarPuestos(est.getId()));
            cbbPuesto.setModel(modelPuestos);
            idDependencia=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_cbbDependenciaItemStateChanged

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        vistaEditar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            // TODO add your handling code here:
            ActualizarEmpleado();
            vistaBloquearCampos();
        } catch (Exception ex) {
            Logger.getLogger(EmpleadosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbbEstadoCivilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbEstadoCivilItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            EstadoCivil est = (EstadoCivil) cbbEstadoCivil.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            idEsCivil=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cbbEstadoCivilItemStateChanged

    private void cbbTipoSanguineoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTipoSanguineoItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            TipoSanguineo est = (TipoSanguineo) cbbTipoSanguineo.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            idSangre=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_cbbTipoSanguineoItemStateChanged

    private void cbbMunicipioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbMunicipioItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            Municipios est = (Municipios) cbbMunicipio.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            idMunicipio=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }//GEN-LAST:event_cbbMunicipioItemStateChanged

    private void cbbTipoContratacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTipoContratacionItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            TipoContrato est = (TipoContrato) cbbTipoContratacion.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            idTipoContratacion=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cbbTipoContratacionItemStateChanged

    private void cbbPuestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbPuestoItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            Puestos est = (Puestos) cbbPuesto.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            idPuesto=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cbbPuestoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarNuevo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbbDepartamento;
    private javax.swing.JComboBox<String> cbbDependencia;
    private javax.swing.JComboBox<String> cbbEstadoCivil;
    private javax.swing.JComboBox<String> cbbInstitucion;
    private javax.swing.JComboBox<String> cbbMunicipio;
    private javax.swing.JComboBox<String> cbbPuesto;
    private javax.swing.JComboBox<String> cbbSexo;
    private javax.swing.JComboBox<String> cbbTipoContratacion;
    private javax.swing.JComboBox<String> cbbTipoDoc;
    private javax.swing.JComboBox<String> cbbTipoSanguineo;
    private javax.swing.JCheckBox cbxEstado;
    private com.toedter.calendar.JDateChooser dtcFechaInicio;
    private com.toedter.calendar.JDateChooser dtcFechaNacimiento;
    private com.toedter.calendar.JDateChooser dtcFechaTermino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JTable tblDocumentos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodEmpleado;
    private javax.swing.JTextField txtContactoEmergencia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumDoc;
    private javax.swing.JTextField txtParentesco;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoEmergencia;
    // End of variables declaration//GEN-END:variables



    
    
    public void vistaCrear(){
        //JOptionPane.showMessageDialog(null, " 1°Complete la cabecera -> 2° Guardar-> 3° Complete los tabs");
        //this.txtContactoEmergencia.setEditable(false);
        //this.txtCorreo.setEditable(false);
        //this.txtDireccion.setEditable(false);
        //this.txtNumDoc.setEditable(false);
        //this.txtParentesco.setEditable(false);
        //this.txtSalario.setEditable(false);
        //this.txtTelefonoEmergencia.setEditable(false);
        //this.txtTelefono.setEditable(false);
        //this.cbbDepartamento.setEnabled(false);
        //this.cbbDependencia.setEnabled(false);
        //this.cbbInstitucion.setEnabled(false);
        //this.cbbMunicipio.setEnabled(false);
        //this.cbbPuesto.setEnabled(false);
        //this.cbbTipoContratacion.setEnabled(false);
        //this.cbbTipoDoc.setEnabled(false);
        //this.dtcFechaInicio.setEnabled(false);
        //this.dtcFechaTermino.setEnabled(false);
        //this.tblDocumentos.setEnabled(false);
        //this.btnGuardarCabecera.setEnabled(true);
        //this.btnGuardar.setEnabled(false);
        //this.btnEditar.setEnabled(false);
                
        
    }
    
    public void vistaGuardarNuevo(){
    
        
        this.txtContactoEmergencia.setEditable(true);
        this.txtCorreo.setEditable(true);
        this.txtDireccion.setEditable(true);
        this.txtNumDoc.setEditable(true);
        this.txtParentesco.setEditable(true);
        this.txtSalario.setEditable(true);
        this.txtTelefonoEmergencia.setEditable(true);
        this.txtTelefono.setEditable(true);
        this.cbbDepartamento.setEnabled(true);
        this.cbbDependencia.setEnabled(true);
        this.cbbInstitucion.setEnabled(true);
        this.cbbMunicipio.setEnabled(true);
        this.cbbPuesto.setEnabled(true);
        this.cbbTipoContratacion.setEnabled(true);
        this.cbbTipoDoc.setEnabled(true);
        this.dtcFechaInicio.setEnabled(true);
        this.dtcFechaTermino.setEnabled(true);
        this.tblDocumentos.setEnabled(true);
        this.btnGuardar.setEnabled(true);
        this.btnGuardarNuevo.setEnabled(false);
        this.btnEditar.setEnabled(false);
    
    }
    
    public void vistaEditar(){
        this.txtNombre.setEditable(true);
        this.txtApellido.setEditable(true);
        this.cbbEstadoCivil.setEnabled(true);
        this.dtcFechaNacimiento.setEnabled(true);
        this.cbbSexo.setEnabled(true);
        this.cbbTipoSanguineo.setEnabled(true);
        this.cbxEstado.setEnabled(true);
        this.txtDui.setEditable(true);
        this.txtContactoEmergencia.setEditable(true);
        this.txtCorreo.setEditable(true);
        this.txtDireccion.setEditable(true);
        this.txtNumDoc.setEditable(true);
        this.txtParentesco.setEditable(true);
        this.txtSalario.setEditable(true);
        this.txtTelefonoEmergencia.setEditable(true);
        this.txtTelefono.setEditable(true);
        this.cbbDepartamento.setEnabled(true);
        this.cbbDependencia.setEnabled(true);
        this.cbbInstitucion.setEnabled(true);
        this.cbbMunicipio.setEnabled(true);
        this.cbbPuesto.setEnabled(true);
        this.cbbTipoContratacion.setEnabled(true);
        this.cbbTipoDoc.setEnabled(true);
        this.dtcFechaInicio.setEnabled(true);
        this.dtcFechaTermino.setEnabled(true);
        this.tblDocumentos.setEnabled(true);
        this.btnGuardar.setVisible(true);
        this.btnGuardarNuevo.setVisible(false);
    
    }
    
    public void vistaNuevo(){
        this.txtCodEmpleado.setText("");
        this.txtNombre.setEnabled(true);
        this.txtNombre.setText("");
        this.txtApellido.setEnabled(true);
        this.txtApellido.setText("");
        this.cbbEstadoCivil.setEnabled(true);
        mostrarEstado();
        this.dtcFechaNacimiento.setEnabled(true);
        this.dtcFechaNacimiento.setDate(null);
        this.cbbSexo.setEnabled(true);
        this.cbbSexo.addItem("Seleecionar");
        this.cbbSexo.addItem("Femenino");
        this.cbbSexo.addItem("Masculino");
        this.txtDui.setEnabled(true);
        this.txtDui.setText("");
        this.cbbTipoSanguineo.setEnabled(true);
        mostrarTipoSangre();
        this.cbxEstado.setEnabled(true);
        this.cbxEstado.setSelected(true);
        this.txtContactoEmergencia.setEnabled(true);
        this.txtContactoEmergencia.setText("");
        this.txtCorreo.setEnabled(true);
        this.txtCorreo.setText("");
        this.txtDireccion.setEnabled(true);
        this.txtDireccion.setText("");
        this.txtNumDoc.setEnabled(true);
        this.txtNumDoc.setText("");
        this.txtParentesco.setEnabled(true);
        this.txtParentesco.setText("");
        this.txtSalario.setEnabled(true);
        this.txtSalario.setText("");
        this.txtTelefonoEmergencia.setEnabled(true);
        this.txtTelefonoEmergencia.setText("");
        this.txtTelefono.setEnabled(true);
        this.txtTelefono.setText("");
        this.cbbDepartamento.setEnabled(true);
        mostrarDepartamentos();
        this.cbbDependencia.setEnabled(true);
        mostrarDependencias();
        this.cbbInstitucion.setEnabled(true);
        this.cbbInstitucion.addItem("Seleccionar");
        this.cbbMunicipio.setEnabled(true);
        this.cbbMunicipio.addItem("Seleccionar");
        this.cbbPuesto.setEnabled(true);
        this.cbbPuesto.addItem("Seleccinar");
        this.cbbTipoContratacion.setEnabled(true);
        mostrarTipoContrata();
        this.cbbTipoDoc.setEnabled(true);
        mostrarTipoDocumentos();
        this.dtcFechaInicio.setEnabled(true);
        this.dtcFechaInicio.setDate(null);
        this.dtcFechaTermino.setEnabled(true);
        this.dtcFechaTermino.setDate(null);
        //this.dtcFechaTermino.setDate(new java.sql.Date(System.currentTimeMillis()));
        this.tblDocumentos.setEnabled(true);
    
    }
    
    
    public void vistaBloquearCampos(){
    
        this.txtNombre.setEditable(false);
        this.txtApellido.setEditable(false);
        this.cbbEstadoCivil.setEnabled(false);
        this.dtcFechaNacimiento.setEnabled(false);
        this.cbbSexo.setEnabled(false);
        this.cbbTipoSanguineo.setEnabled(false);
        this.cbxEstado.setEnabled(false);
        this.txtDui.setEditable(false);
        this.txtContactoEmergencia.setEditable(false);
        this.txtCorreo.setEditable(false);
        this.txtDireccion.setEditable(false);
        this.txtNumDoc.setEditable(false);
        this.txtParentesco.setEditable(false);
        this.txtSalario.setEditable(false);
        this.txtTelefonoEmergencia.setEditable(false);
        this.txtTelefono.setEditable(false);
        this.cbbDepartamento.setEnabled(false);
        this.cbbDependencia.setEnabled(false);
        this.cbbInstitucion.setEnabled(false);
        this.cbbMunicipio.setEnabled(false);
        this.cbbPuesto.setEnabled(false);
        this.cbbTipoContratacion.setEnabled(false);
        this.cbbTipoDoc.setEnabled(false);
        this.dtcFechaInicio.setEnabled(false);
        this.dtcFechaTermino.setEnabled(false);
        this.tblDocumentos.setEnabled(false);
        this.btnGuardar.setVisible(false);
        this.btnGuardarNuevo.setVisible(false);
        this.btnBuscar.setEnabled(true);
        this.btnEditar.setEnabled(true);
        this.btnNuevo.setEnabled(true);
    
    }
    
    

}
