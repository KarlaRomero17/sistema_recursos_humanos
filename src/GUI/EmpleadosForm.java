/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

//import Clase.EstadoCivil;
//import Clase.TipoSanguineo;
//import Clase.Empleados;
import Clase.*;
import GUI.*;
import Controlador.PuestoController;
import Controlador.EmpleadosController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Time;
//import java.text.ParseException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
    Clase.Empleados emp ;
    EmpleadosView empv=new EmpleadosView();
    Clase.DetalleEmpleado detemp=new DetalleEmpleado();
    DocumentosView dcw =new DocumentosView();
    int id_user;
    int idSangre;
    int idEsCivil;
    int idDepartamento;
    int idDependencia;
    int idMunicipio;
    int idPuesto;
    int idTipoContratacion;
    String ItemIniCombo=null;
    int idDetalles;
    int idc;
    //long DateInicio;
    //long DateCumple;
    //long DateFin;
    
    /**
     * Creates new form EmpleadosForm
     */
    public EmpleadosForm() {
        initComponents();
        centrarEnPantalla();
       // Modelo = new DefaultComboBoxModel<>(); 
        //ccbEstadoCivil.setModel(Modelo); 
        //mostrarEstado();
        //mostrarTipoSangre();
        //mostrarDepartamentos();
        //mostrarTipoDocumentos(ItemIniCombo);
//        mostrarTipoContrata();
        //mostrarDependencias();
        
        
        //empController cc = new estados();
        
        
       
        
        Preferences prefs = Preferences.userNodeForPackage(InicioForm.class);
        this.id_user = prefs.getInt("id", 0);
    }
    
     public void mostrarEstado (String Ini) {
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
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarEstadoCivil(Ini));
        this.cbbEstadoCivil.setModel(modelEstado);    
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
     public void mostrarTipoSangre (String Ini) {
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
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarTipoSanguineo( Ini));
        this.cbbTipoSanguineo.setModel(modelEstado);
           
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

     
    public void mostrarDepartamentos (String Ini) {
        
        try { 
        
        EmpleadosController cc = new EmpleadosController();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarDepartamento(Ini));
        this.cbbDepartamento.setModel(modelEstado);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
        
    public void mostrarMuni(String Ini){
    
        try {
            EmpleadosController cc= new EmpleadosController();
            
            DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarMunicipios(0, Ini));
            this.cbbMunicipio.setModel(modelEstado);
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    
    public void mostrarTipoDocumentos (String Ini) {
       try { 
        
        EmpleadosController cc = new EmpleadosController();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarTipoDocumento(Ini));
        this.cbbTipoDoc.setModel(modelEstado);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
    
    public void mostrarInstit(String Ini){
        try {
            EmpleadosController cc=new EmpleadosController();
            
            DefaultComboBoxModel modelEstado=new DefaultComboBoxModel(cc.mostrarInstitucion(0,Ini));
            this.cbbInstitucion.setModel(modelEstado);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    }
            
    
    
    public void mostrarTipoContrata (String Ini) {
         try { 
        
        EmpleadosController cc = new EmpleadosController();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarTipoContrato(Ini));
        this.cbbTipoContratacion.setModel(modelEstado);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
    
    
    public void mostrarDependencias(String Ini){
       try { 
        
        EmpleadosController cc = new EmpleadosController();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.listaDependencias(Ini));
        this.cbbDependencia.setModel(modelEstado);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    }
    
    public void mostrarPuesto(String ItemIni){
    
        try {
            EmpleadosController cc= new EmpleadosController();
            
            DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarPuestos(0, ItemIni));
            this.cbbPuesto.setModel(modelEstado);
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }    
     

    
    public void showEmp(int id) {
        try {
            empv = empController.mostrarEmp(id);

            // Asumiendo que empController.mostrarEmp(id) devuelve un objeto Empleados válido
            // Si es necesario, configura los campos en tu formulario con los datos de 'emp'

            this.txtCodEmpleado.setText(empv.getCodEmpleado());
            this.txtNombre.setText(empv.getNombre());
            this.txtApellido.setText(empv.getApellido());
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fecha1=dateFormat.format(empv.getFechaNacimiento());
            Date nacimiento=null;
            nacimiento=dateFormat.parse(fecha1);
            this.dtcFechaNacimiento.setDate(nacimiento);
            //this.cbbSexo.addItem("Indefinido");
            this.cbbSexo.setSelectedItem((String)empv.getSexo());
            this.cbxEstado.setSelected(empv.isEstadoEmpleado());
            this.txtDui.setText(empv.getDui());
            
            ItemIniCombo=empv.getEstadoCivil();
            System.out.println(ItemIniCombo);
            mostrarEstado(ItemIniCombo);
            this.cbbEstadoCivil.setSelectedItem((String)empv.getEstadoCivil());
            
            
            ItemIniCombo=empv.getTipoSanguineo();
            mostrarTipoSangre(ItemIniCombo);
            this.cbbTipoSanguineo.setSelectedItem((String) empv.getTipoSanguineo());
            
            System.out.println(empv.getEstadoCivil());
            this.txtDireccion.setText(empv.getDireccion());
            
            String fecha2=dateFormat.format(empv.getFechaContratacion());
            Date inicio=null;
            inicio=dateFormat.parse(fecha2);
            this.dtcFechaInicio.setDate(inicio);
            
           
            
            this.txtSalario.setText(empv.getSalario().toString());
            this.txtTelefono.setText(empv.getTelefono());        
            this.txtCorreo.setText(empv.getCorreo());
            this.txtContactoEmergencia.setText(empv.getContactoEmergencia());
            this.txtParentesco.setText(empv.getParentesco());
            this.txtTelefonoEmergencia.setText(empv.getTelefonoEmergencia());
            
            ItemIniCombo=empv.getDepartamento();
            mostrarDepartamentos(ItemIniCombo);
            this.cbbDepartamento.setSelectedItem((String)empv.getDepartamento());
            
            ItemIniCombo=empv.getMunicipio();
            mostrarMuni(ItemIniCombo);
            this.cbbMunicipio.setSelectedItem((String)empv.getMunicipio());
            
            ItemIniCombo=empv.getTipoContratacion();
            mostrarTipoContrata(ItemIniCombo);
            this.cbbTipoContratacion.setSelectedItem((String)empv.getTipoContratacion());
            
            ItemIniCombo=empv.getDependencia();
            mostrarDependencias(ItemIniCombo);
            this.cbbDependencia.setSelectedItem((String)empv.getDependencia());
            
            ItemIniCombo=empv.getPuesto();
            mostrarPuesto(ItemIniCombo);
            this.cbbPuesto.setSelectedItem((String)empv.getPuesto());
            
            idDetalles=empv.getIdDet();
            
            ItemIniCombo=null;
           
            String fecha3=dateFormat.format(empv.getFechaTerminacion());
            Date fin=null;
            fin=dateFormat.parse(fecha3);
            if (fin==null){
                this.dtcFechaTermino.setDate(null);
            }else{
                this.dtcFechaTermino.setDate(fin);
            }
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        //LLENA LA TABLA DOCUMENTOS
         CrearModeloD();
        
        
    }
     
     public void InsertarEmpleado()throws Exception{
         int Id=0;
         
         
         
         String nombre = this.txtNombre.getText().trim();
         long DateInicio=this.dtcFechaInicio.getDate().getTime();
         long DateCumple=this.dtcFechaNacimiento.getDate().getTime();
         java.sql.Date mDateIni=new java.sql.Date(DateInicio);
         java.sql.Date mDateCump=new java.sql.Date(DateCumple);
         
         java.sql.Date mDateFin=null;
         
         if(this.dtcFechaTermino.getDate()==null){
            mDateFin=null;
         }else{
            long DateFin=this.dtcFechaTermino.getDate().getTime();
            mDateFin=new java.sql.Date(DateFin);
                 
         }
         
         
         
         
         
            if (DateInicio==0){
                mDateIni=null;
            }
            
            if (DateCumple==0){
                mDateCump=null;
            }

         
         
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
            this.txtCodEmpleado.setText(emp.getCodEmpleado());
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
         //long DateFin=this.dtcFechaTermino.getDate().getTime();
         java.sql.Date mDateIni=new java.sql.Date(DateInicio);
         java.sql.Date mDateCump=new java.sql.Date(DateCumple);
         //java.sql.Date mDateFin=new java.sql.Date(DateFin);
           
         
         java.sql.Date mDateFin=null;
         
         if(this.dtcFechaTermino.getDate()==null){
            mDateFin=null;
         }else{
            long DateFin=this.dtcFechaTermino.getDate().getTime();
            mDateFin=new java.sql.Date(DateFin);
                 
         }
         
         
            if (DateInicio==0){
                mDateIni=null;
            }
            
            if (DateCumple==0){
                mDateCump=null;
            }

            //if (DateFin==0){
            //    mDateFin=null;
            //}
            
            
            boolean chk = this.cbxEstado.isSelected();
            int activo;
            if (chk=true){
                activo=1;
            }else{
                activo=0;
            }
            
           
            String ESCV; 
            EstadoCivil est = (EstadoCivil) this.cbbEstadoCivil.getSelectedItem();
            ESCV=est.getNombre();
            
            String SANG; 
            TipoSanguineo san = (TipoSanguineo) this.cbbTipoSanguineo.getSelectedItem();
            SANG=san.getTipo();
            
            String DEP; 
            Departamentos deptos = (Departamentos) this.cbbDepartamento.getSelectedItem();
            DEP=deptos.getNombre();
            
            String DEPC; 
            Dependencias depcia = (Dependencias) this.cbbDependencia.getSelectedItem();
            DEPC=depcia.getNombre();
            
            String MU; 
            Municipios mum = (Municipios) this.cbbMunicipio.getSelectedItem();
            MU=mum.getNombre();
            
            String PU; 
            Puestos pue = (Puestos) this.cbbPuesto.getSelectedItem();
            PU=pue.getNombre();
            
            String TCON; 
            TipoContrato tc = (TipoContrato) this.cbbTipoContratacion.getSelectedItem();
            TCON=tc.getTipo();
            
            //EL ERROR SE DEBE A QUE LA SELECCION DEVUELVE EL ID Y NO EL TEXTO, PERO POSIBLEMENTE PORQUE EL FORM TIENE CARGADO
            //EL MODELO DE DATOS POR LA SELECCION DEL COMBOBOX, HAY QUE PROBAR SI EL FORM SE CARGA DES DE BUSQUEDA DE EMPLEADO
            
            //System.out.println(seleccion);
            empController.ActualizarEmpleados(this.txtCodEmpleado.getText(),this.txtNombre.getText(), this.txtApellido.getText(), (String)this.cbbSexo.getSelectedItem(), activo,ESCV,SANG, this.txtDireccion.getText(),this.txtDui.getText(),mDateIni, mDateCump,mDateFin,this.txtContactoEmergencia.getText(),this.txtParentesco.getText(),Double.parseDouble( this.txtSalario.getText()),this.txtTelefono.getText(),this.txtTelefonoEmergencia.getText(),DEP,DEPC,MU,PU,TCON,this.txtCorreo.getText());
                                            
            JOptionPane.showMessageDialog(null, "Empleado actualizado correctamente");
           
        }
         
     }
     
          
     DefaultTableModel ModeloD;
    private void CrearModeloD(){
        
        Object[] obj=new Object[4];
        
        try{
            ModeloD = (new DefaultTableModel(null, new String[] {
            "ID","Tipo Documento","Numero Documento", "Institucion" }) {} );
            this.tblDocumentos.setModel(ModeloD);
            System.out.println("modelo creado");
            List ls;
            ls=empController.buscarDocumentos(this.txtCodEmpleado.getText());
            System.out.println("Consulta ejecutada");
            for(int i =0; i<ls.size();i++){
                dcw=(DocumentosView)ls.get(i);
                obj[0]=dcw.getIdDocumento();
                obj[2]=dcw.getNumDoc();
                obj[1]=dcw.getTipoDoc();
                obj[3]=dcw.getInstituc();
                
                ModeloD.addRow(obj);
            }
            
            
            ls=empController.buscarDocumentos(this.txtCodEmpleado.getText());
            this.tblDocumentos.setModel(ModeloD);
            
            this.tblDocumentos.getColumnModel().getColumn(0).setMaxWidth(0);
            this.tblDocumentos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(-1);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
    }
     
     
    public void NuevoDocumento()throws Exception{
    
        //String numdoc =this.txtNumDoc.getText();
        //String tipodoc=this.cbbTipoDoc.getSelectedItem().toString();
        //String institu=this.cbbInstitucion.getSelectedItem().toString();
        //String codemp= this.txtCodEmpleado.getText().trim();
        
        //System.out.println(numdoc+" "+" "+tipodoc+" "+institu+" "+codemp);
        
        
        
        //if(codemp.isEmpty() || numdoc.isEmpty() || tipodoc.isEmpty() ||institu.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos en la seccion documentos");
        //}else{
            empController.InsertarDocumento(this.txtCodEmpleado.getText(), this.txtNumDoc.getText(), this.cbbTipoDoc.getSelectedItem().toString(), this.cbbInstitucion.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "Documento Ingresado");
       // }
    
    
    }
    
    
    public void recarganuevo(){
        String IdCod=this.txtCodEmpleado.getText().replace("E", "0");
        int idc= Integer.parseInt(IdCod);
            
        showEmp(idc);
        vistaBloquearCampos();
        
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
        btnAgregarTbl = new javax.swing.JButton();
        btnEliminaTbl = new javax.swing.JButton();
        msgDocumentos = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtIdDoc = new javax.swing.JTextField();
        lblIdDoc = new javax.swing.JLabel();
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
        btnGuardarCambios = new javax.swing.JButton();
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

        jLabel13.setText("Departamento*");

        jLabel14.setText("Municipio*");

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

        jLabel15.setText("Direccion*");

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
                .addContainerGap(447, Short.MAX_VALUE))
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
                .addContainerGap(92, Short.MAX_VALUE))
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
        tblDocumentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDocumentosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDocumentos);

        jLabel22.setText("Tipo Documento*");

        cbbTipoDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTipoDocItemStateChanged(evt);
            }
        });

        jLabel23.setText("Número*");

        jLabel24.setText("Institucion*");

        cbbInstitucion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbInstitucionItemStateChanged(evt);
            }
        });

        btnAgregarTbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnAgregarTbl.setText("Agregar");
        btnAgregarTbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTblActionPerformed(evt);
            }
        });

        btnEliminaTbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminaTbl.setText("Eliminar");
        btnEliminaTbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaTblActionPerformed(evt);
            }
        });

        msgDocumentos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        msgDocumentos.setForeground(new java.awt.Color(204, 0, 0));
        msgDocumentos.setText("Para ingresar documentos primero debe guardar el empleado y luego seleccione editar");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtIdDoc.setOpaque(true);

        lblIdDoc.setText("id");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnAgregarTbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminaTbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24)
                                    .addComponent(lblIdDoc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNumDoc)
                                    .addComponent(cbbTipoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbbInstitucion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIdDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(msgDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(cbbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(cbbInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarTbl)
                            .addComponent(btnEliminaTbl)
                            .addComponent(btnLimpiar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgDocumentos)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel8);

        jTabbedPane1.addTab("Documentos", jScrollPane1);

        jLabel16.setText("Tipo Contratacion*");

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

        jLabel17.setText("Fecha Inicio*");

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
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cbbTipoContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtcFechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel6);

        jTabbedPane1.addTab("Contrato", jScrollPane6);

        jLabel19.setText("Dependencia*");

        jLabel20.setText("Puesto*");

        jLabel21.setText("Salario*");

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
                .addContainerGap(658, Short.MAX_VALUE))
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
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel7);

        jTabbedPane1.addTab("Puesto", jScrollPane7);

        jLabel10.setText("Contacto Emergencia*");

        jLabel11.setText("Telefono Emergencia*");

        txtTelefonoEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEmergenciaActionPerformed(evt);
            }
        });

        jLabel12.setText("Parentesco*");

        jLabel9.setText("Telefono*");

        lblCorreo.setText("Correo*");

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
                        .addGap(27, 27, 27))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefonoEmergencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtContactoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtContactoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefonoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCorreo)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)))
                .addContainerGap(89, Short.MAX_VALUE))
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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
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

        btnGuardarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardarNuevo.setText("Guardar");
        btnGuardarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevoActionPerformed(evt);
            }
        });

        btnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnGuardarNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCambios)
                .addGap(183, 183, 183)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo)
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
                    .addComponent(btnGuardarCambios))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Codigo Empleado");

        txtCodEmpleado.setEditable(false);

        jLabel2.setText("Nombre*");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido*");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Nacimiento*");

        jLabel5.setText("Sexo*");

        cbbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        jLabel6.setText("Estado Civil");

        cbbEstadoCivil.setOpaque(true);
        cbbEstadoCivil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbEstadoCivilItemStateChanged(evt);
            }
        });
        cbbEstadoCivil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbEstadoCivilMouseClicked(evt);
            }
        });
        cbbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbEstadoCivilActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo Sanguineo*");

        cbbTipoSanguineo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTipoSanguineoItemStateChanged(evt);
            }
        });

        jLabel8.setText("Estado Empleado");

        cbxEstado.setText("Activo");

        jLabel25.setText("DUI*");

        dtcFechaNacimiento.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbTipoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dtcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(2, 2, 2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
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
                .addContainerGap()
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbEstadoCivilActionPerformed

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
       // vistaNuevo();
       System.out.println((String) this.cbbTipoDoc.getSelectedItem()+"+"+this.txtNumDoc.getText()+"+"+(String)this.cbbInstitucion.getSelectedItem() );
       
       
       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevoActionPerformed
        // TODO add your handling code here:
        try {
            InsertarEmpleado();
            //vistaBloquearCampos();
            recarganuevo();
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
            Departamentos est = (Departamentos) this.cbbDepartamento.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            DefaultComboBoxModel modelMunicipio = new DefaultComboBoxModel(mun.mostrarMunicipios(est.getId(),ItemIniCombo));
            this.cbbMunicipio.setModel(modelMunicipio);
            this.idDepartamento=est.getId();
           
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
            TipoDocumento est = (TipoDocumento) this.cbbTipoDoc.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            DefaultComboBoxModel modelInstitucion = new DefaultComboBoxModel(mun.mostrarInstitucion(est.getId(),ItemIniCombo));
            this.cbbInstitucion.setModel(modelInstitucion);
           System.out.println( this.cbbTipoDoc.getSelectedItem()+"+"+this.txtCodEmpleado.getText()+"+"+this.txtNumDoc.getText()+"+"+this.cbbInstitucion.getSelectedItem());
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cbbTipoDocItemStateChanged

    private void cbbDependenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbDependenciaItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            Dependencias est = (Dependencias) this.cbbDependencia.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            DefaultComboBoxModel modelPuestos = new DefaultComboBoxModel(mun.mostrarPuestos(est.getId(),ItemIniCombo));
            this.cbbPuesto.setModel(modelPuestos);
            this.idDependencia=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_cbbDependenciaItemStateChanged

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        vistaEditar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        try {
            // TODO add your handling code here:
            ActualizarEmpleado();
            vistaBloquearCampos();
        } catch (Exception ex) {
            Logger.getLogger(EmpleadosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void cbbEstadoCivilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbEstadoCivilItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            EstadoCivil est = (EstadoCivil) this.cbbEstadoCivil.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            this.idEsCivil=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cbbEstadoCivilItemStateChanged

    private void cbbTipoSanguineoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTipoSanguineoItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            TipoSanguineo est = (TipoSanguineo) this.cbbTipoSanguineo.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            this.idSangre=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_cbbTipoSanguineoItemStateChanged

    private void cbbMunicipioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbMunicipioItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            Municipios est = (Municipios) this.cbbMunicipio.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            this.idMunicipio=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }//GEN-LAST:event_cbbMunicipioItemStateChanged

    private void cbbTipoContratacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTipoContratacionItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            TipoContrato est = (TipoContrato) this.cbbTipoContratacion.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            this.idTipoContratacion=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cbbTipoContratacionItemStateChanged

    private void cbbPuestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbPuestoItemStateChanged
        // TODO add your handling code here:
        try { 
          
           
          if (evt.getStateChange() == ItemEvent.SELECTED) {
            Puestos est = (Puestos) this.cbbPuesto.getSelectedItem();
            EmpleadosController mun = new EmpleadosController();
            this.idPuesto=est.getId();
        }
      
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cbbPuestoItemStateChanged

    private void cbbEstadoCivilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbEstadoCivilMouseClicked
        // TODO add your handling code here:
        
        //cbbEstadoCivil.removeAllItems();
        //mostrarEstado(null);
    }//GEN-LAST:event_cbbEstadoCivilMouseClicked

    private void btnAgregarTblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTblActionPerformed
        
        try {
            
            insertarDoc();
        } catch (Exception ex) {
            Logger.getLogger(EmpleadosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        actualizatabla();
       
    }//GEN-LAST:event_btnAgregarTblActionPerformed

    private void tblDocumentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocumentosMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = this.tblDocumentos.getSelectedRow();
        try { 
            llenarCampos(filaSeleccionada);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tblDocumentosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbbInstitucionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbInstitucionItemStateChanged
        // TODO add your handling code here:
        System.out.println( this.cbbTipoDoc.getSelectedItem()+"+"+this.txtCodEmpleado.getText()+"+"+this.txtNumDoc.getText()+"+"+this.cbbInstitucion.getSelectedItem());
        
    }//GEN-LAST:event_cbbInstitucionItemStateChanged

    private void btnEliminaTblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaTblActionPerformed
        try {
            // TODO add your handling code here:
            elminaDocumento();
            JOptionPane.showMessageDialog(null,"Documento eliminado");
        } catch (Exception ex) {
            Logger.getLogger(EmpleadosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         actualizatabla();
        
    }//GEN-LAST:event_btnEliminaTblActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTbl;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminaTbl;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnGuardarNuevo;
    private javax.swing.JButton btnLimpiar;
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
    private javax.swing.JLabel lblIdDoc;
    private javax.swing.JLabel msgDocumentos;
    private javax.swing.JTable tblDocumentos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodEmpleado;
    private javax.swing.JTextField txtContactoEmergencia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtIdDoc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumDoc;
    private javax.swing.JTextField txtParentesco;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoEmergencia;
    // End of variables declaration//GEN-END:variables



    
    
    public void vistaCrear(){
        //JOptionPane.showMessageDialog(null, " 1°Complete la cabecera -> 2° Guardar-> 3° Complete los tabs");
        
        this.tblDocumentos.setEnabled(false);
        this.btnGuardarNuevo.setEnabled(true);
        this.btnGuardarCambios.setEnabled(false);
        this.btnEditar.setEnabled(false);
        mostrarEstado(ItemIniCombo);
        mostrarTipoSangre(ItemIniCombo);
        mostrarDepartamentos(ItemIniCombo);
        mostrarTipoContrata(ItemIniCombo);
        mostrarDependencias(ItemIniCombo);
        mostrarTipoDocumentos(ItemIniCombo);
        this.btnEliminaTbl.setEnabled(false);
        this.btnAgregarTbl.setEnabled(false);
        this.btnLimpiar.setEnabled(false);
        this.tblDocumentos.setEnabled(false);
        this.cbbTipoDoc.setEnabled(false);
        this.txtNumDoc.setEnabled(false);
        this.cbbInstitucion.setEnabled(false);
        this.btnNuevo.setVisible(false);
        this.btnEditar.setVisible(false);
        this.btnBuscar.setVisible(false);
        this.btnGuardarCambios.setVisible(false);
        this.lblIdDoc.setVisible(false);
        this.txtIdDoc.setVisible(false);
        
                
        
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
        this.btnGuardarCambios.setEnabled(true);
        this.btnGuardarNuevo.setEnabled(false);
        this.btnEditar.setEnabled(true);
        this.lblIdDoc.setVisible(false);
        this.txtIdDoc.setVisible(false);
    
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
        this.txtNumDoc.setEnabled(true);
        this.dtcFechaInicio.setEnabled(true);
        this.dtcFechaTermino.setEnabled(true);
        this.tblDocumentos.setEnabled(true);
        this.btnAgregarTbl.setEnabled(true);
        this.btnEliminaTbl.setEnabled(true);
        this.btnGuardarCambios.setVisible(true);
        this.btnGuardarCambios.setEnabled(true);
        this.btnGuardarNuevo.setVisible(false);
        this.msgDocumentos.setVisible(false);
        this.btnLimpiar.setEnabled(true);
        mostrarTipoDocumentos(ItemIniCombo);
        this.lblIdDoc.setVisible(false);
        this.txtIdDoc.setVisible(false);
    
    }
    
    public void vistaNuevo(){
        this.txtCodEmpleado.setText("");
        this.txtNombre.setEnabled(true);
        this.txtNombre.setText("");
        this.txtApellido.setEnabled(true);
        this.txtApellido.setText("");
        this.cbbEstadoCivil.setEnabled(true);
        mostrarEstado(ItemIniCombo);
        this.dtcFechaNacimiento.setEnabled(true);
        this.dtcFechaNacimiento.setDate(null);
        this.cbbSexo.setEnabled(true);
        this.cbbSexo.addItem("Seleecionar");
        this.cbbSexo.addItem("Femenino");
        this.cbbSexo.addItem("Masculino");
        this.txtDui.setEnabled(true);
        this.txtDui.setText("");
        this.cbbTipoSanguineo.setEnabled(true);
        mostrarTipoSangre(ItemIniCombo);
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
        mostrarDepartamentos(ItemIniCombo);
        this.cbbDependencia.setEnabled(true);
        mostrarDependencias(ItemIniCombo);
        this.cbbInstitucion.setEnabled(true);
        this.cbbInstitucion.addItem("Seleccionar");
        this.cbbMunicipio.setEnabled(true);
        this.cbbMunicipio.addItem("Seleccionar");
        this.cbbPuesto.setEnabled(true);
        this.cbbPuesto.addItem("Seleccinar");
        this.cbbTipoContratacion.setEnabled(true);
        mostrarTipoContrata(ItemIniCombo);
        this.cbbTipoDoc.setEnabled(true);
        //mostrarTipoDocumentos();
        this.dtcFechaInicio.setEnabled(true);
        this.dtcFechaInicio.setDate(null);
        this.dtcFechaTermino.setEnabled(true);
        this.dtcFechaTermino.setDate(null);
        //this.dtcFechaTermino.setDate(new java.sql.Date(System.currentTimeMillis()));
        this.tblDocumentos.setEnabled(true);this.lblIdDoc.setVisible(false);
        this.txtIdDoc.setVisible(false);
    
    }
    
    
    public void vistaBloquearCampos(){
    
        this.txtNombre.setEditable(false);
        this.txtApellido.setEditable(false);
        this.cbbEstadoCivil.setEnabled(false);
        this.dtcFechaNacimiento.setEnabled(false);
        this.dtcFechaNacimiento.setForeground(Color.BLACK);
        this.cbbSexo.setEnabled(false);
        this.cbbSexo.setForeground(Color.BLACK);
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
        this.btnAgregarTbl.setEnabled(false);
        this.btnEliminaTbl.setEnabled(false);
        this.btnGuardarCambios.setVisible(false);
        this.btnGuardarNuevo.setVisible(false);
        this.btnBuscar.setEnabled(false);
        this.btnBuscar.setVisible(false);
        this.btnEditar.setEnabled(true);
        this.btnEditar.setVisible(true);
        this.btnNuevo.setEnabled(false);
        this.btnNuevo.setVisible(false);
        this.btnLimpiar.setEnabled(false);
        this.msgDocumentos.setVisible(false);
        this.lblIdDoc.setVisible(false);
        this.txtIdDoc.setVisible(false);
    
    }
  
    
    
    private void llenarCampos(int filaSeleccionada) throws Exception {
        if (filaSeleccionada != -1) { // Seleccionó alguna fila
            
            String tdoc=String.valueOf(this.tblDocumentos.getValueAt(filaSeleccionada,1));
            
            ItemIniCombo=tdoc;
            mostrarTipoDocumentos(ItemIniCombo);
            //this.cbbPuesto.setSelectedItem((String)empv.getPuesto());
            
            //this.cbbTipoDoc.setSelectedItem(tdoc );
            this.txtIdDoc.setText(String.valueOf(this.tblDocumentos.getValueAt(filaSeleccionada, 0)));
            
            this.txtNumDoc.setText(String.valueOf(this.tblDocumentos.getValueAt(filaSeleccionada, 2)));
            
            String inst=String.valueOf(this.tblDocumentos.getValueAt(filaSeleccionada,3));
            ItemIniCombo=inst;
            mostrarInstit(inst);
            //this.cbbInstitucion.setSelectedItem(inst );
            
            //String sexo = String.valueOf(this.tblPersona.getValueAt(filaSeleccionada,3));
            //cbbSexo.getModel().setSelectedItem(sexo);
            
           
        }
    }

    private void limpiar(){
        cbbTipoDoc.setSelectedIndex(0);
        txtNumDoc.setText(null);
        cbbInstitucion.setSelectedIndex(0);
    
    }
    
    public void insertarDoc()throws Exception{
        Documentos documento=new Documentos();
        Institucion ins = (Institucion) this.cbbInstitucion.getSelectedItem();
        int tpdoc=this.cbbTipoDoc.getSelectedIndex();
        int idins=ins.getId();
        String num=this.txtNumDoc.getText();
        
        documento.setId_Detalle(idDetalles);
        documento.setId_Institucion(idins);
        documento.setId_TipoDoc(tpdoc);
        documento.setNumeroDoc(num);
        empController.nuevoDoc(documento);
        
        JOptionPane.showMessageDialog(null, "Documento agredado");
    
    }

    
    public void elminaDocumento()throws Exception{
        
        int Doc=Integer.parseInt(this.txtIdDoc.getText().trim());
        
        empController.eliminarDoc(Doc);
    
        
        
    }
    
    
    public void actualizatabla(){
    
    CrearModeloD();
    txtNumDoc.setText("");
        mostrarTipoDocumentos(null);
        mostrarInstit(null);
    
    }



private void centrarEnPantalla() {
    // Obtener el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

       // Obtener el tamaño del JFrame
        Dimension ventana = this.getSize();
        // Calcular la posición para centrar el JFrame
        int posX = (pantalla.width - ventana.width) / 2;
        int posY = (pantalla.height - ventana.height) / 2;

        // Establecer la posición del JFrame en el centro
        this.setLocation(posX, posY);
    }

    
    
    
}
