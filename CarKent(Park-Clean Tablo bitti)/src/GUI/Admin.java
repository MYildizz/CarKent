package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import ProjectAir.Jip;
import ProjectAir.Lorry;
import ProjectAir.MotoBycycle;
import ProjectAir.*;
import Repair.DieselCar;
import Repair.ElectricCar;
import Repair.GasolineCar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.TimerTask;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import midtermproject.Cleaning;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 * @author Murat
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form frame2
     */
    
    GasolineCar gasolineCar;
    ElectricCar electricCar;
    DieselCar dieselCar;
    String RepairType;
   
    int CounterRepair=0;
    
    boolean CheckInfo=false;
    boolean CheckSearch=false;
    boolean CheckRepair=false;

    
    public Admin() {
        initComponents();
        
        parking.setVisible(false);
        washing.setVisible(false);
        repairing.setVisible(false);
        finance.setVisible(false);
        giris.setVisible(true);
        buttonSearch.setVisible(false);
        repairButton.setVisible(false);
        CancelButton.setVisible(false);
        cark.setVisible(false);
        
        
        finance();
    }
    
    public void finance()
    {
        String tl=""+MotherMain.getTotalMoney()+" TL";
        jTextField1.setText(tl);
        String Dollar=""+ MotherMain.getTotalDollarMoney()+" Dollar";
        jTextField2.setText(Dollar);
        String Euro=""+ MotherMain.getTotalEuroMoney()+ " Euro ";
        jTextField3.setText(Euro);
        
        Ftire.setText(" "+DieselCar.Tire);
        Fseat.setText(" "+DieselCar.Seat);
        Fwindow.setText(" "+DieselCar.window);
        Frim.setText(" "+DieselCar.rim);
        Fheadlight.setText(" "+DieselCar.headlight);
        
        
        FGbattery.setText(" "+GasolineCar.getGbattery());
        FGengine.setText(" "+GasolineCar.getGengine());
        FGgearbox.setText(" "+GasolineCar.getGGearBox());
        FGradiator.setText(" "+GasolineCar.getGRadiator());
        FGfuel.setText(" "+GasolineCar.getGfuel());
        
        FDbattery.setText(" "+DieselCar.getDbattery());
        FDengine.setText(" "+DieselCar.getDengine());
        FDgearbox.setText(" "+DieselCar.getDGearBox());
        FDradiator.setText(" "+DieselCar.getDRadiator());
        FDfuel.setText(" "+DieselCar.getDfuel());
        
        FEbattery.setText(" "+ElectricCar.getEbattery());
        FEengine.setText(" "+ElectricCar.getEengine());
        FEgearbox.setText(" "+ElectricCar.getEGearBox());
        FEradiator.setText(" "+ElectricCar.getERadiator());
        FECharge.setText(" "+ElectricCar.getEChargebattery());
    
        tax.setText(""+MotherMain.Tax);
    
    }
    
    
    public void ClearParking(){
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
        
        checkSpecial.setSelected(false);
    
}
    
    
    public void ClearRepair()
    {
        Name.setText("");
        Surname.setText("");
        Tc.setText("");
        Plate.setText("");
        Model.setText("");
        tespit.setText("\n\n\n\n\t     LÜTFEN KAYIT İŞLEMİNİ YAPINIZ ");
        jProgressBar1.setString("");
        jProgressBar1.setValue(0);
        
        CheckInfo=false;
        CheckSearch=false;
        CheckRepair=false;
        cark.setVisible(false);
    }
    
    public void ClearWashing()
    {
        tfName.setText("");
        tfSurname.setText("");
        tfPlate.setText("");
        tfIdentity.setText("");
        
        cbProfession.setSelectedIndex(-1);
        cbSpecialCond.setSelected(false);
        
        checkAuto.setSelected(false);
        checkExterior.setSelected(false);
        checkInterior.setSelected(false);
        checkWax.setSelected(false);
    }
    
    public void AddtoTableParking(){
        
        DefaultTableModel modelPC = (DefaultTableModel)REPAIR_CLEANING_PARK.ParkingTableCar.getModel();
        DefaultTableModel modelPL = (DefaultTableModel)REPAIR_CLEANING_PARK.ParkingTableLorry.getModel();
        DefaultTableModel modelPM = (DefaultTableModel)REPAIR_CLEANING_PARK.ParkingTableCycle.getModel();
        DefaultTableModel modelPA = (DefaultTableModel)REPAIR_CLEANING_PARK.ParkingTableAll.getModel();
        
        
        for (int i = 0; i < InfoClass.infoCustomer.size(); i++) {
            if(InfoClass.infoCustomer.get(i) instanceof Jip){
                Jip j = (Jip) InfoClass.infoCustomer.get(i);
                modelPC.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), j.getPerson().name , j.getPerson().surname, j.getPerson().Gender , j.getPerson().Profession , j.getPerson().IdentityNo, 
                    j.getEnteringtime(), j.getExitingTime(), j.getPrice()});
                
                modelPA.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), j.getPerson().name , j.getPerson().surname, j.getPerson().Gender , j.getPerson().Profession , j.getPerson().IdentityNo, "Automobile",
                    j.getEnteringtime(), j.getExitingTime(), j.getPrice()});
            }
                
            else if(InfoClass.infoCustomer.get(i) instanceof Lorry){
                Lorry L = (Lorry) InfoClass.infoCustomer.get(i);
                modelPL.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), L.getPerson().name, L.getPerson().surname, L.getPerson().Gender, L.getPerson().Profession,L.getPerson().IdentityNo, L.getEnteringtime(), 
                    L.getExitingTime(),L.getPrice()});
                
                modelPA.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), L.getPerson().name, L.getPerson().surname, L.getPerson().Gender, L.getPerson().Profession,L.getPerson().IdentityNo,"Lorry", L.getEnteringtime(), 
                    L.getExitingTime(),L.getPrice()});
            }
                 
            
            else if(InfoClass.infoCustomer.get(i) instanceof MotoBycycle){
                MotoBycycle M = (MotoBycycle) InfoClass.infoCustomer.get(i);
                
                modelPM.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), M.getPerson().name, M.getPerson().surname, M.getPerson().Gender, M.getPerson().Profession,M.getPerson().IdentityNo, M.getEnteringtime(), 
                    M.getExitingTime(),M.getPrice()});
                modelPA.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), M.getPerson().name, M.getPerson().surname, M.getPerson().Gender, M.getPerson().Profession,M.getPerson().IdentityNo,"Two-Wheels", M.getEnteringtime(), 
                    M.getExitingTime(),M.getPrice()});
            }
        }
        
    }
    
    public void AddtoWash(){
        DefaultTableModel cleanAll = (DefaultTableModel)REPAIR_CLEANING_PARK.CleanAllTable.getModel();
        DefaultTableModel cleanCar = (DefaultTableModel)REPAIR_CLEANING_PARK.CleanCarTable.getModel();
        DefaultTableModel cleanLorry = (DefaultTableModel)REPAIR_CLEANING_PARK.CleanLorryTable.getModel();
        DefaultTableModel cleanMoto = (DefaultTableModel)REPAIR_CLEANING_PARK.CleanMotoTable.getModel();
        
        for (int i = 0; i < InfoClass.cleaning.size(); i++) {
            
            String plate = InfoClass.cleaning.get(i).getID();
            String name = InfoClass.cleaning.get(i).getPerson().name;
            String surname = InfoClass.cleaning.get(i).getPerson().surname;
            String gender = InfoClass.cleaning.get(i).getPerson().Gender;
            String prof = InfoClass.cleaning.get(i).getPerson().Profession;
            String ide = InfoClass.cleaning.get(i).getPerson().IdentityNo;
            String typeWash = InfoClass.cleaning.get(i).getTypeOfwashing();
            double price = InfoClass.cleaning.get(i).getPrice();
            String typeVeh = InfoClass.cleaning.get(i).getVehicleType();
            
            if(InfoClass.cleaning.get(i).getVehicleType().equalsIgnoreCase("Automobile")){
                cleanCar.addRow(new Object[] {plate, name, surname, gender, ide, prof, typeWash, price} );
            }
            
            else if(InfoClass.cleaning.get(i).getVehicleType().equalsIgnoreCase("Lorry"))
                cleanLorry.addRow(new Object[] {plate, name, surname, gender, ide, prof, typeWash, price} );
            
            else if(InfoClass.cleaning.get(i).getVehicleType().equalsIgnoreCase("Two-Wheels"))
                cleanMoto.addRow(new Object[] {plate, name, surname, gender, ide, prof, typeWash, price} );
            
            
            cleanAll.addRow(new Object[] {plate, name, surname, gender, ide, prof, typeWash, typeVeh, price} );
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        parking = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        p2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        p3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        p4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        p5 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        p6 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        btDataPark = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        A21L = new javax.swing.JButton();
        A22L = new javax.swing.JButton();
        A23L = new javax.swing.JButton();
        A24L = new javax.swing.JButton();
        A25L = new javax.swing.JButton();
        A26L = new javax.swing.JButton();
        A27L = new javax.swing.JButton();
        A28L = new javax.swing.JButton();
        A11 = new javax.swing.JButton();
        A12 = new javax.swing.JButton();
        A13 = new javax.swing.JButton();
        A14 = new javax.swing.JButton();
        A15s = new javax.swing.JButton();
        A16s = new javax.swing.JButton();
        A8m = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A9m = new javax.swing.JButton();
        A10m = new javax.swing.JButton();
        A17m = new javax.swing.JButton();
        A18m = new javax.swing.JButton();
        A19m = new javax.swing.JButton();
        A20m = new javax.swing.JButton();
        A7m = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        b40 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        c9 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        c11 = new javax.swing.JButton();
        c12 = new javax.swing.JButton();
        c13 = new javax.swing.JButton();
        c14 = new javax.swing.JButton();
        c15 = new javax.swing.JButton();
        c16 = new javax.swing.JButton();
        c17 = new javax.swing.JButton();
        c18 = new javax.swing.JButton();
        c19 = new javax.swing.JButton();
        c20 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        c25 = new javax.swing.JButton();
        c26 = new javax.swing.JButton();
        c27 = new javax.swing.JButton();
        c28 = new javax.swing.JButton();
        c21 = new javax.swing.JButton();
        c22 = new javax.swing.JButton();
        c23 = new javax.swing.JButton();
        c24 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cbVehicleType = new javax.swing.JComboBox<>();
        cbPlate = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        checkSpecial = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        washing = new javax.swing.JPanel();
        btDataWash = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tfPrice = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        checkExterior = new javax.swing.JCheckBox();
        checkInterior = new javax.swing.JCheckBox();
        checkAuto = new javax.swing.JCheckBox();
        checkWax = new javax.swing.JCheckBox();
        cbSpecialCond = new javax.swing.JCheckBox();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfSurname = new javax.swing.JTextField();
        tfIdentity = new javax.swing.JTextField();
        tfPlate = new javax.swing.JTextField();
        cbGender = new javax.swing.JComboBox<>();
        cbProfession = new javax.swing.JComboBox<>();
        cbVehType = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        btInventory = new javax.swing.JButton();
        btWash = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        repairing = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tespit = new javax.swing.JTextArea();
        name = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        tc = new javax.swing.JLabel();
        plate = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        profission = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Surname = new javax.swing.JTextField();
        Tc = new javax.swing.JTextField();
        Plate = new javax.swing.JTextField();
        Model = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        Profission = new javax.swing.JComboBox<>();
        Type = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        btDataRep = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        cark = new javax.swing.JLabel();
        buttonSearch = new javax.swing.JButton();
        repairButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        type1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        giris = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        finance = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        ilk = new javax.swing.JComboBox<>();
        son = new javax.swing.JComboBox<>();
        miktar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        RepairingSalary = new javax.swing.JComboBox<>();
        tax = new javax.swing.JTextField();
        CleaningSalary = new javax.swing.JComboBox<>();
        ParkingSalary = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        dieselI = new javax.swing.JComboBox<>();
        gasolineI = new javax.swing.JComboBox<>();
        generalI = new javax.swing.JComboBox<>();
        electricI = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        Ftire = new javax.swing.JTextField();
        Fwindow = new javax.swing.JTextField();
        Frim = new javax.swing.JTextField();
        Fheadlight = new javax.swing.JTextField();
        Fseat = new javax.swing.JTextField();
        FGengine = new javax.swing.JTextField();
        FGbattery = new javax.swing.JTextField();
        FGradiator = new javax.swing.JTextField();
        FGgearbox = new javax.swing.JTextField();
        FDbattery = new javax.swing.JTextField();
        FGfuel = new javax.swing.JTextField();
        FDgearbox = new javax.swing.JTextField();
        FDradiator = new javax.swing.JTextField();
        FDengine = new javax.swing.JTextField();
        FDfuel = new javax.swing.JTextField();
        FEgearbox = new javax.swing.JTextField();
        FEbattery = new javax.swing.JTextField();
        FEradiator = new javax.swing.JTextField();
        FECharge = new javax.swing.JTextField();
        FEengine = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        dieselquantity = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        electricquantitiy = new javax.swing.JTextField();
        Generalquantity = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        gasolinequantity = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jTextField31 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        parking.setLayout(null);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("1. Floor");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        parking.add(jRadioButton1);
        jRadioButton1.setBounds(190, 250, 73, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("2. Floor");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        parking.add(jRadioButton2);
        jRadioButton2.setBounds(430, 250, 73, 25);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("3. Floor");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        parking.add(jRadioButton3);
        jRadioButton3.setBounds(680, 250, 73, 25);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NAME  :");
        parking.add(jLabel1);
        jLabel1.setBounds(980, 210, 90, 20);
        parking.add(p1);
        p1.setBounds(1150, 200, 130, 30);

        jLabel10.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("SURNAME     :");
        parking.add(jLabel10);
        jLabel10.setBounds(980, 250, 142, 20);
        parking.add(p2);
        p2.setBounds(1150, 240, 130, 30);

        jLabel11.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("T.C   :");
        parking.add(jLabel11);
        jLabel11.setBounds(980, 290, 60, 22);
        parking.add(p3);
        p3.setBounds(1150, 280, 130, 30);

        jLabel14.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("PLATE  :");
        parking.add(jLabel14);
        jLabel14.setBounds(980, 330, 100, 22);
        parking.add(p4);
        p4.setBounds(1150, 320, 130, 30);

        jLabel12.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("PROFESSION :");
        parking.add(jLabel12);
        jLabel12.setBounds(980, 410, 146, 22);

        p5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEACHER", "ACCOUNTANT", "SOLDIER", "STUDENT", "POLICE", "NO JOB", "OTHER", " " }));
        parking.add(p5);
        p5.setBounds(1150, 402, 130, 30);

        jLabel13.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("GENDER        :");
        parking.add(jLabel13);
        jLabel13.setBounds(980, 370, 160, 22);

        p6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        parking.add(p6);
        p6.setBounds(1150, 360, 130, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/Grafick.gif"))); // NOI18N
        parking.add(jLabel15);
        jLabel15.setBounds(1400, 210, 150, 130);

        btDataPark.setBackground(new java.awt.Color(51, 102, 255));
        btDataPark.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btDataPark.setForeground(new java.awt.Color(51, 51, 51));
        btDataPark.setText("DATA");
        btDataPark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDataParkActionPerformed(evt);
            }
        });
        parking.add(btDataPark);
        btDataPark.setBounds(1420, 90, 100, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/customer.gif"))); // NOI18N
        parking.add(jLabel9);
        jLabel9.setBounds(1340, 20, 230, 180);

        jButton4.setText("Statistics");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        parking.add(jButton4);
        jButton4.setBounds(1420, 350, 110, 25);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/exit.png"))); // NOI18N
        parking.add(jLabel17);
        jLabel17.setBounds(1030, 30, 100, 110);

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        parking.add(jButton5);
        jButton5.setBounds(940, 140, 120, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/car animated.gif"))); // NOI18N
        parking.add(jLabel18);
        jLabel18.setBounds(20, 90, 570, 130);

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(880, 460));
        jPanel4.setLayout(new java.awt.CardLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 460));
        jPanel1.setLayout(null);

        A21L.setBackground(java.awt.Color.green);
        A21L.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        A21L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A21LMouseClicked(evt);
            }
        });
        jPanel1.add(A21L);
        A21L.setBounds(180, 270, 40, 20);

        A22L.setBackground(java.awt.Color.green);
        A22L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A22LMouseClicked(evt);
            }
        });
        jPanel1.add(A22L);
        A22L.setBounds(320, 260, 40, 20);

        A23L.setBackground(java.awt.Color.green);
        A23L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A23LMouseClicked(evt);
            }
        });
        jPanel1.add(A23L);
        A23L.setBounds(470, 260, 40, 20);

        A24L.setBackground(java.awt.Color.green);
        A24L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A24LMouseClicked(evt);
            }
        });
        jPanel1.add(A24L);
        A24L.setBounds(620, 260, 40, 20);

        A25L.setBackground(java.awt.Color.green);
        A25L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A25LMouseClicked(evt);
            }
        });
        jPanel1.add(A25L);
        A25L.setBounds(170, 410, 40, 20);

        A26L.setBackground(java.awt.Color.green);
        A26L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A26LMouseClicked(evt);
            }
        });
        jPanel1.add(A26L);
        A26L.setBounds(320, 400, 40, 20);

        A27L.setBackground(java.awt.Color.green);
        A27L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A27LMouseClicked(evt);
            }
        });
        jPanel1.add(A27L);
        A27L.setBounds(470, 410, 40, 20);

        A28L.setBackground(java.awt.Color.green);
        A28L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A28LMouseClicked(evt);
            }
        });
        jPanel1.add(A28L);
        A28L.setBounds(620, 410, 40, 20);

        A11.setBackground(java.awt.Color.green);
        A11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A11MouseClicked(evt);
            }
        });
        jPanel1.add(A11);
        A11.setBounds(140, 200, 40, 20);

        A12.setBackground(java.awt.Color.green);
        A12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A12MouseClicked(evt);
            }
        });
        jPanel1.add(A12);
        A12.setBounds(210, 200, 40, 20);

        A13.setBackground(java.awt.Color.green);
        A13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A13MouseClicked(evt);
            }
        });
        jPanel1.add(A13);
        A13.setBounds(290, 200, 40, 20);

        A14.setBackground(java.awt.Color.green);
        A14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A14MouseClicked(evt);
            }
        });
        jPanel1.add(A14);
        A14.setBounds(360, 200, 40, 20);

        A15s.setBackground(java.awt.Color.green);
        A15s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A15sMouseClicked(evt);
            }
        });
        jPanel1.add(A15s);
        A15s.setBounds(440, 200, 40, 20);

        A16s.setBackground(java.awt.Color.green);
        A16s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A16sMouseClicked(evt);
            }
        });
        jPanel1.add(A16s);
        A16s.setBounds(510, 200, 40, 20);

        A8m.setBackground(java.awt.Color.green);
        A8m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A8mMouseClicked(evt);
            }
        });
        jPanel1.add(A8m);
        A8m.setBounds(620, 50, 20, 20);

        A1.setBackground(java.awt.Color.green);
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });
        jPanel1.add(A1);
        A1.setBounds(140, 60, 40, 20);

        A2.setBackground(java.awt.Color.green);
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });
        jPanel1.add(A2);
        A2.setBounds(220, 60, 40, 20);

        A3.setBackground(java.awt.Color.green);
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });
        jPanel1.add(A3);
        A3.setBounds(290, 60, 40, 20);

        A4.setBackground(java.awt.Color.green);
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
        });
        jPanel1.add(A4);
        A4.setBounds(360, 60, 40, 20);

        A5.setBackground(java.awt.Color.green);
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A5MouseClicked(evt);
            }
        });
        jPanel1.add(A5);
        A5.setBounds(440, 60, 40, 20);

        A6.setBackground(java.awt.Color.green);
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A6MouseClicked(evt);
            }
        });
        jPanel1.add(A6);
        A6.setBounds(510, 60, 40, 20);

        A9m.setBackground(java.awt.Color.green);
        A9m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A9mMouseClicked(evt);
            }
        });
        jPanel1.add(A9m);
        A9m.setBounds(660, 50, 20, 20);

        A10m.setBackground(java.awt.Color.green);
        A10m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A10mMouseClicked(evt);
            }
        });
        jPanel1.add(A10m);
        A10m.setBounds(690, 50, 20, 20);

        A17m.setBackground(java.awt.Color.green);
        A17m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A17mMouseClicked(evt);
            }
        });
        jPanel1.add(A17m);
        A17m.setBounds(580, 200, 20, 20);

        A18m.setBackground(java.awt.Color.green);
        A18m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A18mMouseClicked(evt);
            }
        });
        jPanel1.add(A18m);
        A18m.setBounds(620, 200, 20, 20);

        A19m.setBackground(java.awt.Color.green);
        A19m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A19mMouseClicked(evt);
            }
        });
        jPanel1.add(A19m);
        A19m.setBounds(660, 200, 20, 20);

        A20m.setBackground(java.awt.Color.green);
        A20m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A20mMouseClicked(evt);
            }
        });
        jPanel1.add(A20m);
        A20m.setBounds(700, 200, 20, 20);

        A7m.setBackground(java.awt.Color.green);
        A7m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A7mMouseClicked(evt);
            }
        });
        jPanel1.add(A7m);
        A7m.setBounds(580, 50, 20, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/0. Floor.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 880, 460);

        jPanel4.add(jPanel1, "card2");

        jPanel2.setLayout(null);

        b2.setBackground(java.awt.Color.green);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });
        jPanel2.add(b2);
        b2.setBounds(210, 50, 40, 20);

        b3.setBackground(java.awt.Color.green);
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });
        jPanel2.add(b3);
        b3.setBounds(290, 50, 40, 20);

        b4.setBackground(java.awt.Color.green);
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });
        jPanel2.add(b4);
        b4.setBounds(360, 50, 40, 20);

        b5.setBackground(java.awt.Color.green);
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });
        jPanel2.add(b5);
        b5.setBounds(440, 50, 40, 20);

        b6.setBackground(java.awt.Color.green);
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });
        jPanel2.add(b6);
        b6.setBounds(510, 50, 40, 20);

        b7.setBackground(java.awt.Color.green);
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
            }
        });
        jPanel2.add(b7);
        b7.setBounds(590, 50, 40, 20);

        b8.setBackground(java.awt.Color.green);
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b8MouseClicked(evt);
            }
        });
        jPanel2.add(b8);
        b8.setBounds(660, 50, 40, 20);

        b9.setBackground(java.awt.Color.green);
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b9MouseClicked(evt);
            }
        });
        jPanel2.add(b9);
        b9.setBounds(140, 200, 40, 20);

        b10.setBackground(java.awt.Color.green);
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b10MouseClicked(evt);
            }
        });
        jPanel2.add(b10);
        b10.setBounds(210, 200, 40, 20);

        b11.setBackground(java.awt.Color.green);
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b11MouseClicked(evt);
            }
        });
        jPanel2.add(b11);
        b11.setBounds(290, 200, 40, 20);

        b12.setBackground(java.awt.Color.green);
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b12MouseClicked(evt);
            }
        });
        jPanel2.add(b12);
        b12.setBounds(360, 200, 40, 20);

        b13.setBackground(java.awt.Color.green);
        b13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b13MouseClicked(evt);
            }
        });
        jPanel2.add(b13);
        b13.setBounds(440, 200, 40, 20);

        b14.setBackground(java.awt.Color.green);
        b14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b14MouseClicked(evt);
            }
        });
        jPanel2.add(b14);
        b14.setBounds(510, 200, 40, 20);

        b15.setBackground(java.awt.Color.green);
        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b15MouseClicked(evt);
            }
        });
        jPanel2.add(b15);
        b15.setBounds(590, 210, 40, 20);

        b16.setBackground(java.awt.Color.green);
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b16MouseClicked(evt);
            }
        });
        jPanel2.add(b16);
        b16.setBounds(660, 210, 40, 20);

        b17.setBackground(java.awt.Color.green);
        b17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b17MouseClicked(evt);
            }
        });
        jPanel2.add(b17);
        b17.setBounds(140, 260, 40, 20);

        b18.setBackground(java.awt.Color.green);
        b18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b18MouseClicked(evt);
            }
        });
        jPanel2.add(b18);
        b18.setBounds(220, 260, 40, 20);

        b19.setBackground(java.awt.Color.green);
        b19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b19MouseClicked(evt);
            }
        });
        jPanel2.add(b19);
        b19.setBounds(280, 260, 40, 20);

        b20.setBackground(java.awt.Color.green);
        b20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b20MouseClicked(evt);
            }
        });
        jPanel2.add(b20);
        b20.setBounds(370, 260, 40, 20);

        b21.setBackground(java.awt.Color.green);
        b21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b21MouseClicked(evt);
            }
        });
        jPanel2.add(b21);
        b21.setBounds(440, 260, 40, 20);

        b22.setBackground(java.awt.Color.green);
        b22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b22MouseClicked(evt);
            }
        });
        jPanel2.add(b22);
        b22.setBounds(510, 260, 40, 20);

        b23.setBackground(java.awt.Color.green);
        b23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b23MouseClicked(evt);
            }
        });
        jPanel2.add(b23);
        b23.setBounds(590, 260, 40, 20);

        b24.setBackground(java.awt.Color.green);
        b24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b24MouseClicked(evt);
            }
        });
        jPanel2.add(b24);
        b24.setBounds(660, 260, 40, 20);

        b25.setBackground(java.awt.Color.green);
        b25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b25MouseClicked(evt);
            }
        });
        jPanel2.add(b25);
        b25.setBounds(130, 410, 20, 20);

        b1.setBackground(java.awt.Color.green);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        jPanel2.add(b1);
        b1.setBounds(140, 50, 40, 20);

        b26.setBackground(java.awt.Color.green);
        b26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b26MouseClicked(evt);
            }
        });
        jPanel2.add(b26);
        b26.setBounds(170, 410, 20, 20);

        b27.setBackground(java.awt.Color.green);
        b27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b27MouseClicked(evt);
            }
        });
        jPanel2.add(b27);
        b27.setBounds(210, 410, 20, 20);

        b28.setBackground(java.awt.Color.green);
        b28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b28MouseClicked(evt);
            }
        });
        jPanel2.add(b28);
        b28.setBounds(240, 410, 20, 20);

        b29.setBackground(java.awt.Color.green);
        b29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b29MouseClicked(evt);
            }
        });
        jPanel2.add(b29);
        b29.setBounds(280, 410, 20, 20);

        b30.setBackground(java.awt.Color.green);
        b30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b30MouseClicked(evt);
            }
        });
        jPanel2.add(b30);
        b30.setBounds(320, 410, 20, 20);

        b31.setBackground(java.awt.Color.green);
        b31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b31MouseClicked(evt);
            }
        });
        jPanel2.add(b31);
        b31.setBounds(350, 410, 20, 20);

        b32.setBackground(java.awt.Color.green);
        b32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b32MouseClicked(evt);
            }
        });
        jPanel2.add(b32);
        b32.setBounds(390, 410, 20, 20);

        b33.setBackground(java.awt.Color.green);
        b33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b33MouseClicked(evt);
            }
        });
        jPanel2.add(b33);
        b33.setBounds(430, 410, 20, 20);

        b34.setBackground(java.awt.Color.green);
        b34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b34MouseClicked(evt);
            }
        });
        jPanel2.add(b34);
        b34.setBounds(470, 410, 20, 20);

        b35.setBackground(java.awt.Color.green);
        b35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b35MouseClicked(evt);
            }
        });
        jPanel2.add(b35);
        b35.setBounds(500, 410, 20, 20);

        b36.setBackground(java.awt.Color.green);
        b36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b36MouseClicked(evt);
            }
        });
        jPanel2.add(b36);
        b36.setBounds(540, 410, 20, 20);

        b37.setBackground(java.awt.Color.green);
        b37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b37MouseClicked(evt);
            }
        });
        jPanel2.add(b37);
        b37.setBounds(580, 410, 20, 20);

        b38.setBackground(java.awt.Color.green);
        b38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b38MouseClicked(evt);
            }
        });
        jPanel2.add(b38);
        b38.setBounds(620, 410, 20, 20);

        b39.setBackground(java.awt.Color.green);
        b39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b39MouseClicked(evt);
            }
        });
        jPanel2.add(b39);
        b39.setBounds(650, 410, 20, 20);

        b40.setBackground(java.awt.Color.green);
        b40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b40MouseClicked(evt);
            }
        });
        jPanel2.add(b40);
        b40.setBounds(690, 410, 20, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/1. Floor.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 880, 460);

        jPanel4.add(jPanel2, "card3");

        jPanel3.setLayout(null);

        c2.setBackground(java.awt.Color.green);
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2MouseClicked(evt);
            }
        });
        jPanel3.add(c2);
        c2.setBounds(220, 50, 40, 20);

        c3.setBackground(java.awt.Color.green);
        c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c3MouseClicked(evt);
            }
        });
        jPanel3.add(c3);
        c3.setBounds(290, 50, 40, 20);

        c4.setBackground(java.awt.Color.green);
        c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c4MouseClicked(evt);
            }
        });
        jPanel3.add(c4);
        c4.setBounds(360, 50, 40, 20);

        c5.setBackground(java.awt.Color.green);
        c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c5MouseClicked(evt);
            }
        });
        jPanel3.add(c5);
        c5.setBounds(440, 50, 40, 20);

        c6.setBackground(java.awt.Color.green);
        c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c6MouseClicked(evt);
            }
        });
        jPanel3.add(c6);
        c6.setBounds(510, 50, 40, 20);

        c7.setBackground(java.awt.Color.green);
        c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c7MouseClicked(evt);
            }
        });
        jPanel3.add(c7);
        c7.setBounds(140, 200, 40, 20);

        c8.setBackground(java.awt.Color.green);
        c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c8MouseClicked(evt);
            }
        });
        jPanel3.add(c8);
        c8.setBounds(210, 200, 40, 20);

        c9.setBackground(java.awt.Color.green);
        c9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c9MouseClicked(evt);
            }
        });
        jPanel3.add(c9);
        c9.setBounds(290, 200, 40, 20);

        c10.setBackground(java.awt.Color.green);
        c10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c10MouseClicked(evt);
            }
        });
        jPanel3.add(c10);
        c10.setBounds(360, 200, 40, 20);

        c11.setBackground(java.awt.Color.green);
        c11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c11MouseClicked(evt);
            }
        });
        jPanel3.add(c11);
        c11.setBounds(440, 200, 40, 20);

        c12.setBackground(java.awt.Color.green);
        c12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c12MouseClicked(evt);
            }
        });
        jPanel3.add(c12);
        c12.setBounds(510, 200, 40, 20);

        c13.setBackground(java.awt.Color.green);
        c13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c13MouseClicked(evt);
            }
        });
        jPanel3.add(c13);
        c13.setBounds(180, 260, 40, 20);

        c14.setBackground(java.awt.Color.green);
        c14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c14MouseClicked(evt);
            }
        });
        jPanel3.add(c14);
        c14.setBounds(330, 260, 40, 20);

        c15.setBackground(java.awt.Color.green);
        c15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c15MouseClicked(evt);
            }
        });
        jPanel3.add(c15);
        c15.setBounds(470, 260, 40, 20);

        c16.setBackground(java.awt.Color.green);
        c16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c16MouseClicked(evt);
            }
        });
        jPanel3.add(c16);
        c16.setBounds(620, 260, 40, 20);

        c17.setBackground(java.awt.Color.green);
        c17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c17MouseClicked(evt);
            }
        });
        jPanel3.add(c17);
        c17.setBounds(180, 410, 40, 20);

        c18.setBackground(java.awt.Color.green);
        c18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c18MouseClicked(evt);
            }
        });
        jPanel3.add(c18);
        c18.setBounds(320, 410, 40, 20);

        c19.setBackground(java.awt.Color.green);
        c19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c19MouseClicked(evt);
            }
        });
        jPanel3.add(c19);
        c19.setBounds(470, 410, 40, 20);

        c20.setBackground(java.awt.Color.green);
        c20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c20MouseClicked(evt);
            }
        });
        jPanel3.add(c20);
        c20.setBounds(620, 410, 40, 20);

        c1.setBackground(java.awt.Color.green);
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1MouseClicked(evt);
            }
        });
        jPanel3.add(c1);
        c1.setBounds(140, 50, 40, 20);

        c25.setBackground(java.awt.Color.green);
        c25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c25MouseClicked(evt);
            }
        });
        jPanel3.add(c25);
        c25.setBounds(570, 210, 20, 20);

        c26.setBackground(java.awt.Color.green);
        c26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c26MouseClicked(evt);
            }
        });
        jPanel3.add(c26);
        c26.setBounds(610, 210, 20, 20);

        c27.setBackground(java.awt.Color.green);
        c27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c27MouseClicked(evt);
            }
        });
        jPanel3.add(c27);
        c27.setBounds(650, 210, 20, 20);

        c28.setBackground(java.awt.Color.green);
        c28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c28MouseClicked(evt);
            }
        });
        jPanel3.add(c28);
        c28.setBounds(690, 210, 20, 20);

        c21.setBackground(java.awt.Color.green);
        c21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c21MouseClicked(evt);
            }
        });
        jPanel3.add(c21);
        c21.setBounds(580, 40, 20, 20);

        c22.setBackground(java.awt.Color.green);
        c22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c22MouseClicked(evt);
            }
        });
        jPanel3.add(c22);
        c22.setBounds(620, 40, 20, 20);

        c23.setBackground(java.awt.Color.green);
        c23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c23MouseClicked(evt);
            }
        });
        jPanel3.add(c23);
        c23.setBounds(660, 40, 20, 20);

        c24.setBackground(java.awt.Color.green);
        c24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c24MouseClicked(evt);
            }
        });
        jPanel3.add(c24);
        c24.setBounds(700, 40, 20, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/0. Floor.jpg"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, 0, 880, 460);

        jPanel4.add(jPanel3, "card4");

        parking.add(jPanel4);
        jPanel4.setBounds(80, 300, 880, 460);

        jLabel24.setFont(new java.awt.Font("Cooper Black", 1, 17)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 102));
        jLabel24.setText("VEHICLE TYPE : ");
        parking.add(jLabel24);
        jLabel24.setBounds(980, 440, 170, 30);

        cbVehicleType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lorry", "Automobile", "Two-Wheels", "Disabled Car" }));
        parking.add(cbVehicleType);
        cbVehicleType.setBounds(1150, 440, 130, 30);

        parking.add(cbPlate);
        cbPlate.setBounds(1100, 140, 120, 30);

        jLabel16.setFont(new java.awt.Font("Cooper Black", 1, 19)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Special Condition :");
        parking.add(jLabel16);
        jLabel16.setBounds(980, 490, 210, 23);
        parking.add(checkSpecial);
        checkSpecial.setBounds(1210, 490, 40, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/SON PARK TEMA.jpg"))); // NOI18N
        parking.add(jLabel8);
        jLabel8.setBounds(0, 0, 1700, 800);

        getContentPane().add(parking, "card2");

        washing.setLayout(null);

        btDataWash.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btDataWash.setForeground(new java.awt.Color(0, 153, 240));
        btDataWash.setText("DATA");
        btDataWash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDataWashActionPerformed(evt);
            }
        });
        washing.add(btDataWash);
        btDataWash.setBounds(1240, 160, 100, 40);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/car animated.gif"))); // NOI18N
        washing.add(jLabel20);
        jLabel20.setBounds(20, 140, 510, 8);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/Grafick.gif"))); // NOI18N
        washing.add(jLabel36);
        jLabel36.setBounds(990, 100, 139, 140);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/inventory.png"))); // NOI18N
        washing.add(jLabel38);
        jLabel38.setBounds(1430, 100, 160, 160);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/customer.gif"))); // NOI18N
        washing.add(jLabel37);
        jLabel37.setBounds(1160, 90, 260, 180);

        jLabel39.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 153, 240));
        jLabel39.setText("PLATE :");
        washing.add(jLabel39);
        jLabel39.setBounds(850, 430, 100, 22);

        jLabel40.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 153, 240));
        jLabel40.setText("NAME :");
        washing.add(jLabel40);
        jLabel40.setBounds(850, 310, 110, 22);

        jLabel41.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 153, 240));
        jLabel41.setText("SURNAME:");
        washing.add(jLabel41);
        jLabel41.setBounds(850, 350, 140, 22);

        jLabel42.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 153, 240));
        jLabel42.setText("IDENTITY NO:");
        washing.add(jLabel42);
        jLabel42.setBounds(850, 390, 150, 22);

        jLabel43.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 153, 240));
        jLabel43.setText("GENDER :");
        washing.add(jLabel43);
        jLabel43.setBounds(850, 470, 130, 22);

        jLabel22.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 240));
        jLabel22.setText("SPECIAL CONDITION:");
        washing.add(jLabel22);
        jLabel22.setBounds(850, 590, 230, 20);

        jLabel23.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 240));
        jLabel23.setText("VEHICLE TYPE:");
        washing.add(jLabel23);
        jLabel23.setBounds(850, 550, 170, 22);

        tfPrice.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        tfPrice.setForeground(new java.awt.Color(0, 0, 204));
        tfPrice.setText("0 TL");
        washing.add(tfPrice);
        tfPrice.setBounds(640, 640, 150, 40);

        jLabel28.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 30)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("PRICE :");
        washing.add(jLabel28);
        jLabel28.setBounds(520, 640, 110, 40);

        checkExterior.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        checkExterior.setForeground(new java.awt.Color(255, 255, 255));
        checkExterior.setText("EXTERIOR WASHING");
        checkExterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkExteriorActionPerformed(evt);
            }
        });
        washing.add(checkExterior);
        checkExterior.setBounds(40, 260, 171, 40);

        checkInterior.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        checkInterior.setForeground(new java.awt.Color(255, 255, 255));
        checkInterior.setText("INTERIOR WASHING");
        checkInterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInteriorActionPerformed(evt);
            }
        });
        washing.add(checkInterior);
        checkInterior.setBounds(250, 260, 180, 40);

        checkAuto.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        checkAuto.setForeground(new java.awt.Color(255, 255, 255));
        checkAuto.setText("AUTO HAIRDRESSER");
        checkAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAutoActionPerformed(evt);
            }
        });
        washing.add(checkAuto);
        checkAuto.setBounds(450, 260, 170, 40);

        checkWax.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        checkWax.setForeground(new java.awt.Color(255, 255, 255));
        checkWax.setText("WAX POLISH");
        checkWax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWaxActionPerformed(evt);
            }
        });
        washing.add(checkWax);
        checkWax.setBounds(640, 260, 150, 40);

        cbSpecialCond.setBackground(new java.awt.Color(0, 153, 240));
        cbSpecialCond.setForeground(new java.awt.Color(0, 153, 240));
        cbSpecialCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSpecialCondActionPerformed(evt);
            }
        });
        washing.add(cbSpecialCond);
        cbSpecialCond.setBounds(1090, 590, 25, 20);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/cleaning gif.gif"))); // NOI18N
        jLabel44.setFocusCycleRoot(true);
        washing.add(jLabel44);
        jLabel44.setBounds(20, 250, 790, 440);

        jLabel45.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 153, 240));
        jLabel45.setText("PROFESSION:");
        washing.add(jLabel45);
        jLabel45.setBounds(850, 510, 160, 22);

        tfName.setPreferredSize(new java.awt.Dimension(8, 22));
        washing.add(tfName);
        tfName.setBounds(1020, 302, 100, 30);
        washing.add(tfSurname);
        tfSurname.setBounds(1020, 342, 100, 30);
        washing.add(tfIdentity);
        tfIdentity.setBounds(1020, 382, 100, 30);
        washing.add(tfPlate);
        tfPlate.setBounds(1020, 422, 100, 30);

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        washing.add(cbGender);
        cbGender.setBounds(1020, 470, 100, 22);

        cbProfession.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOCTOR", "POLICE", "STUDENT", "JUDGE", "TEACHER", "ACCOUNTANT", "FIREMAN", "LABOURER", "TAXI DRIVER", "SOLDIER", "NO JOB" }));
        cbProfession.setSelectedIndex(-1);
        washing.add(cbProfession);
        cbProfession.setBounds(1020, 510, 100, 22);

        cbVehType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automobile", "Lorry", "Two-Wheels" }));
        cbVehType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVehTypeActionPerformed(evt);
            }
        });
        washing.add(cbVehType);
        cbVehType.setBounds(1020, 550, 100, 22);

        jButton12.setText("Statictics");
        washing.add(jButton12);
        jButton12.setBounds(1020, 240, 83, 25);

        btInventory.setText("Inventory");
        washing.add(btInventory);
        btInventory.setBounds(1460, 250, 87, 25);

        btWash.setBackground(new java.awt.Color(0, 153, 240));
        btWash.setFont(new java.awt.Font("Yu Gothic Medium", 1, 30)); // NOI18N
        btWash.setForeground(new java.awt.Color(255, 255, 255));
        btWash.setText("WASH");
        btWash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWashActionPerformed(evt);
            }
        });
        washing.add(btWash);
        btWash.setBounds(850, 650, 270, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/SON TEMİZLİK TEMA.jpg"))); // NOI18N
        washing.add(jLabel6);
        jLabel6.setBounds(0, 0, 1680, 800);

        getContentPane().add(washing, "card3");

        repairing.setLayout(null);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/car animated.gif"))); // NOI18N
        repairing.add(jLabel21);
        jLabel21.setBounds(30, 150, 540, 20);

        jProgressBar1.setBackground(new java.awt.Color(255, 51, 0));
        jProgressBar1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setAutoscrolls(true);
        jProgressBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jProgressBar1.setDoubleBuffered(true);
        jProgressBar1.setFocusCycleRoot(true);
        jProgressBar1.setFocusTraversalPolicyProvider(true);
        jProgressBar1.setOpaque(true);
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);
        repairing.add(jProgressBar1);
        jProgressBar1.setBounds(300, 390, 560, 60);

        tespit.setEditable(false);
        tespit.setBackground(new java.awt.Color(0, 255, 255));
        tespit.setColumns(20);
        tespit.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        tespit.setForeground(new java.awt.Color(102, 0, 51));
        tespit.setLineWrap(true);
        tespit.setRows(5);
        tespit.setText("\n\n\n            \n\n\tlutfen kayıt islemlerınızı yapınız ");
        tespit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(tespit);

        repairing.add(jScrollPane1);
        jScrollPane1.setBounds(300, 450, 560, 180);

        name.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 102, 102));
        name.setText("NAME :");
        repairing.add(name);
        name.setBounds(970, 330, 150, 20);

        surname.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        surname.setForeground(new java.awt.Color(0, 102, 102));
        surname.setText("SURNAME :");
        repairing.add(surname);
        surname.setBounds(970, 360, 120, 22);

        tc.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        tc.setForeground(new java.awt.Color(0, 102, 102));
        tc.setText("T.C :");
        repairing.add(tc);
        tc.setBounds(970, 390, 46, 22);

        plate.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        plate.setForeground(new java.awt.Color(0, 102, 102));
        plate.setText("PLATE :");
        repairing.add(plate);
        plate.setBounds(970, 420, 80, 22);

        gender.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 102, 102));
        gender.setText("GENDER :");
        repairing.add(gender);
        gender.setBounds(970, 450, 99, 22);

        profission.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        profission.setForeground(new java.awt.Color(0, 102, 102));
        profission.setText("PROFISSION :");
        repairing.add(profission);
        profission.setBounds(970, 480, 150, 22);

        model.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        model.setForeground(new java.awt.Color(0, 102, 102));
        model.setText("MODEL :");
        repairing.add(model);
        model.setBounds(970, 510, 84, 22);

        type.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        type.setForeground(new java.awt.Color(0, 102, 102));
        type.setText("TYPE :");
        repairing.add(type);
        type.setBounds(970, 540, 67, 22);
        repairing.add(Name);
        Name.setBounds(1120, 330, 100, 22);
        repairing.add(Surname);
        Surname.setBounds(1120, 360, 100, 22);
        repairing.add(Tc);
        Tc.setBounds(1120, 390, 100, 22);
        repairing.add(Plate);
        Plate.setBounds(1120, 420, 100, 22);
        repairing.add(Model);
        Model.setBounds(1120, 510, 100, 22);

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        repairing.add(Gender);
        Gender.setBounds(1120, 450, 100, 20);

        Profission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOCTOR", "POLICE", "STUDENT", "JUDGE", "TEACHER", "ACCOUNTANT", "FIREMAN", "LABOURER", "TAXI DRIVER", "SOLDIER", "NO JOB" }));
        repairing.add(Profission);
        Profission.setBounds(1120, 480, 100, 22);

        Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasoline", "Diesel", "Electric" }));
        repairing.add(Type);
        Type.setBounds(1120, 540, 100, 22);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/Grafick.gif"))); // NOI18N
        repairing.add(jLabel31);
        jLabel31.setBounds(1090, 70, 140, 120);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/customer.gif"))); // NOI18N
        repairing.add(jLabel32);
        jLabel32.setBounds(1240, 60, 250, 180);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/inventory.png"))); // NOI18N
        repairing.add(jLabel33);
        jLabel33.setBounds(1490, 70, 160, 140);

        jButton6.setText("Statistics");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        repairing.add(jButton6);
        jButton6.setBounds(1120, 200, 90, 25);

        btDataRep.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btDataRep.setForeground(new java.awt.Color(255, 153, 0));
        btDataRep.setText("DATA");
        repairing.add(btDataRep);
        btDataRep.setBounds(1310, 125, 110, 50);

        jButton8.setText("Inventory");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        repairing.add(jButton8);
        jButton8.setBounds(1510, 210, 100, 25);

        add.setText("Add Info");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        repairing.add(add);
        add.setBounds(1120, 620, 100, 25);

        cark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/çark büyük.gif"))); // NOI18N
        repairing.add(cark);
        cark.setBounds(170, 570, 160, 150);

        buttonSearch.setBackground(new java.awt.Color(0, 0, 0));
        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/SEARCH BUTTON.png"))); // NOI18N
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        repairing.add(buttonSearch);
        buttonSearch.setBounds(550, 630, 80, 60);

        repairButton.setBackground(new java.awt.Color(0, 0, 0));
        repairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/BUTON 2.png"))); // NOI18N
        repairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairButtonActionPerformed(evt);
            }
        });
        repairing.add(repairButton);
        repairButton.setBounds(660, 640, 190, 50);

        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/BUTON1.png"))); // NOI18N
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        repairing.add(CancelButton);
        CancelButton.setBounds(350, 640, 180, 50);

        type1.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        type1.setForeground(new java.awt.Color(0, 102, 102));
        type1.setText("SPECIAL CONDUTION :");
        repairing.add(type1);
        type1.setBounds(970, 570, 240, 30);
        repairing.add(jCheckBox1);
        jCheckBox1.setBounds(1180, 570, 30, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/TAMİR SON TEMA.jpg"))); // NOI18N
        repairing.add(jLabel7);
        jLabel7.setBounds(0, 0, 1680, 800);

        getContentPane().add(repairing, "card4");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/SON DEFAULT TEMA.jpg"))); // NOI18N

        javax.swing.GroupLayout girisLayout = new javax.swing.GroupLayout(giris);
        giris.setLayout(girisLayout);
        girisLayout.setHorizontalGroup(
            girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        girisLayout.setVerticalGroup(
            girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(giris, "card5");

        finance.setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 0, 51));
        finance.add(jTextField1);
        jTextField1.setBounds(70, 430, 170, 40);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 0, 51));
        finance.add(jTextField2);
        jTextField2.setBounds(70, 480, 170, 40);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 0, 51));
        finance.add(jTextField3);
        jTextField3.setBounds(70, 530, 170, 40);

        ilk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TL", "Dollar", "Euro" }));
        finance.add(ilk);
        ilk.setBounds(30, 640, 100, 40);

        son.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dollar", "Euro", "TL" }));
        finance.add(son);
        son.setBounds(190, 640, 100, 40);

        miktar.setText("quantitiy");
        finance.add(miktar);
        miktar.setBounds(30, 700, 100, 30);

        jButton1.setText("EXCHANGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        finance.add(jButton1);
        jButton1.setBounds(190, 700, 100, 30);

        jButton3.setText("PAY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        finance.add(jButton3);
        jButton3.setBounds(450, 390, 70, 20);

        RepairingSalary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Murat 10.000 TL", "Ali 5600 TL", "Mehmet 3.000 TL", "Osman 1600 TL", " " }));
        RepairingSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairingSalaryActionPerformed(evt);
            }
        });
        finance.add(RepairingSalary);
        RepairingSalary.setBounds(780, 350, 130, 30);

        tax.setBackground(new java.awt.Color(204, 204, 204));
        tax.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        finance.add(tax);
        tax.setBounds(1310, 320, 120, 40);

        CleaningSalary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cihat 3600 TL", "Berkan 1600 TL", "Aytac 300 TL" }));
        finance.add(CleaningSalary);
        CleaningSalary.setBounds(600, 350, 120, 30);

        ParkingSalary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gurkan 3600 TL", "Yavuz  1600 TL", "Oğuzhan 100 TL", " " }));
        finance.add(ParkingSalary);
        ParkingSalary.setBounds(420, 350, 130, 30);

        jButton9.setText("PAY TAX");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        finance.add(jButton9);
        jButton9.setBounds(1480, 320, 130, 40);

        jButton10.setText("PAY");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        finance.add(jButton10);
        jButton10.setBounds(620, 390, 70, 20);

        jButton11.setText("PAY ALL OF THEM");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        finance.add(jButton11);
        jButton11.setBounds(590, 440, 140, 25);

        jButton15.setText("PAY");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        finance.add(jButton15);
        jButton15.setBounds(800, 390, 70, 20);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel30.setText("TIRE          : ");
        finance.add(jLabel30);
        jLabel30.setBounds(340, 620, 80, 16);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel34.setText("SEAT         :");
        finance.add(jLabel34);
        jLabel34.setBounds(340, 650, 80, 16);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel35.setText("WINDOW    :");
        finance.add(jLabel35);
        jLabel35.setBounds(340, 680, 80, 16);

        dieselI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D. BATTERY  (39 €)", "D. ENGINE     (380 €)", "D. GEARBOX  (123 €)", "D. RADIATOR (357 €)", "D. FUEL         (374€ )" }));
        finance.add(dieselI);
        dieselI.setBounds(1250, 710, 170, 22);

        gasolineI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G. BATTERY  (30 €)", "G. ENGINE     (58 €)", "G. GEARBOX  (23 €)", "G. RADIATOR(24 €)", "G. FUEL         (87 €)" }));
        finance.add(gasolineI);
        gasolineI.setBounds(1250, 680, 170, 22);

        generalI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TIRE          ( 120 €)", "SEAT         ( 50 € )", "WINDOW    ( 20 € )", "RIM            (180 €)", "HEADLIGHT ( 12 € )" }));
        finance.add(generalI);
        generalI.setBounds(1250, 650, 170, 22);

        electricI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E. BATTERY (51 $ )", "E. ENGINE    (3.450 $ )", "E. GEARBOX (520  $ )", "E.RADIATOR (373 $ )", "E. CHARGE B.(2.620 $ )" }));
        finance.add(electricI);
        electricI.setBounds(1250, 740, 170, 22);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel46.setText("RIM            :");
        finance.add(jLabel46);
        jLabel46.setBounds(340, 710, 80, 16);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel47.setText("DIESEL RADIATOR:");
        finance.add(jLabel47);
        jLabel47.setBounds(730, 710, 120, 16);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel48.setText("GASOLINE BATTERY   :");
        finance.add(jLabel48);
        jLabel48.setBounds(520, 620, 140, 16);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel49.setText("DIESEL GEARBOX :");
        finance.add(jLabel49);
        jLabel49.setBounds(730, 680, 116, 16);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel50.setText("DIESEL FUEL          : ");
        finance.add(jLabel50);
        jLabel50.setBounds(730, 740, 130, 16);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel51.setText("GASOLINE FUEL          :");
        finance.add(jLabel51);
        jLabel51.setBounds(520, 740, 140, 16);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel52.setText("GASOLINE ENGINE      :");
        finance.add(jLabel52);
        jLabel52.setBounds(520, 650, 138, 16);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel53.setText("DIESEL ENGINE     : ");
        finance.add(jLabel53);
        jLabel53.setBounds(730, 650, 120, 16);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel54.setText("GASOLINE RADIATOR:");
        finance.add(jLabel54);
        jLabel54.setBounds(520, 710, 140, 16);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel55.setText("HEADLIGHT :");
        finance.add(jLabel55);
        jLabel55.setBounds(340, 740, 80, 16);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel56.setText("GASOLINE GEARBOX  :");
        finance.add(jLabel56);
        jLabel56.setBounds(520, 680, 140, 20);

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel57.setText("DIESEL BATTERY :");
        finance.add(jLabel57);
        jLabel57.setBounds(730, 620, 120, 16);

        Ftire.setEditable(false);
        Ftire.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(Ftire);
        Ftire.setBounds(430, 620, 40, 22);

        Fwindow.setEditable(false);
        Fwindow.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(Fwindow);
        Fwindow.setBounds(430, 680, 40, 22);

        Frim.setEditable(false);
        Frim.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(Frim);
        Frim.setBounds(430, 710, 40, 22);

        Fheadlight.setEditable(false);
        Fheadlight.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(Fheadlight);
        Fheadlight.setBounds(430, 740, 40, 22);

        Fseat.setEditable(false);
        Fseat.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(Fseat);
        Fseat.setBounds(430, 650, 40, 22);

        FGengine.setEditable(false);
        FGengine.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FGengine);
        FGengine.setBounds(670, 650, 40, 22);

        FGbattery.setEditable(false);
        FGbattery.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FGbattery);
        FGbattery.setBounds(670, 620, 40, 22);

        FGradiator.setEditable(false);
        FGradiator.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FGradiator);
        FGradiator.setBounds(670, 710, 40, 22);

        FGgearbox.setEditable(false);
        FGgearbox.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FGgearbox);
        FGgearbox.setBounds(670, 680, 40, 22);

        FDbattery.setEditable(false);
        FDbattery.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FDbattery);
        FDbattery.setBounds(860, 620, 40, 22);

        FGfuel.setEditable(false);
        FGfuel.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FGfuel);
        FGfuel.setBounds(670, 740, 40, 22);

        FDgearbox.setEditable(false);
        FDgearbox.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FDgearbox);
        FDgearbox.setBounds(860, 680, 40, 22);

        FDradiator.setEditable(false);
        FDradiator.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FDradiator);
        FDradiator.setBounds(860, 710, 40, 22);

        FDengine.setEditable(false);
        FDengine.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FDengine);
        FDengine.setBounds(860, 650, 40, 22);

        FDfuel.setEditable(false);
        FDfuel.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FDfuel);
        FDfuel.setBounds(860, 740, 40, 22);

        FEgearbox.setEditable(false);
        FEgearbox.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FEgearbox);
        FEgearbox.setBounds(1080, 680, 40, 22);

        FEbattery.setEditable(false);
        FEbattery.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FEbattery);
        FEbattery.setBounds(1080, 620, 40, 22);

        FEradiator.setEditable(false);
        FEradiator.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FEradiator);
        FEradiator.setBounds(1080, 710, 40, 22);

        FECharge.setEditable(false);
        FECharge.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FECharge);
        FECharge.setBounds(1080, 740, 40, 22);

        FEengine.setEditable(false);
        FEengine.setBackground(new java.awt.Color(204, 204, 204));
        finance.add(FEengine);
        FEengine.setBounds(1080, 650, 40, 22);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel58.setText("ELECTRİC RADIATOR :");
        finance.add(jLabel58);
        jLabel58.setBounds(920, 710, 140, 16);

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel59.setText("E. CHARGE BATTERY :");
        finance.add(jLabel59);
        jLabel59.setBounds(920, 740, 140, 16);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel60.setText("ELECTRİC GEARBOX  :");
        finance.add(jLabel60);
        jLabel60.setBounds(920, 680, 135, 16);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel61.setText("ELECTRİC ENGINE      :");
        finance.add(jLabel61);
        jLabel61.setBounds(920, 650, 140, 16);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel62.setText("ELECTRIC BATTERY  :");
        finance.add(jLabel62);
        jLabel62.setBounds(920, 620, 140, 16);

        dieselquantity.setText("quantitiy");
        finance.add(dieselquantity);
        dieselquantity.setBounds(1440, 710, 60, 22);
        finance.add(jTextField27);
        jTextField27.setBounds(1310, 480, 120, 40);

        electricquantitiy.setText("quantitiy");
        finance.add(electricquantitiy);
        electricquantitiy.setBounds(1440, 740, 60, 22);

        Generalquantity.setText("quantitiy");
        Generalquantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeneralquantityMouseClicked(evt);
            }
        });
        finance.add(Generalquantity);
        Generalquantity.setBounds(1440, 650, 60, 22);

        jButton16.setText("BUY");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        finance.add(jButton16);
        jButton16.setBounds(1530, 710, 90, 25);

        jButton17.setText("BUY");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        finance.add(jButton17);
        jButton17.setBounds(1530, 680, 90, 25);

        jButton18.setText("BUY");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        finance.add(jButton18);
        jButton18.setBounds(1530, 740, 90, 25);

        gasolinequantity.setText("quantitiy");
        gasolinequantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gasolinequantityMousePressed(evt);
            }
        });
        finance.add(gasolinequantity);
        gasolinequantity.setBounds(1440, 680, 60, 22);
        finance.add(jLabel63);
        jLabel63.setBounds(880, 520, 70, 10);

        jButton20.setText("BUY");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        finance.add(jButton20);
        jButton20.setBounds(1530, 650, 90, 25);
        finance.add(jTextField31);
        jTextField31.setBounds(1310, 400, 120, 40);

        jButton21.setText("PAY WATER");
        finance.add(jButton21);
        jButton21.setBounds(1480, 400, 130, 40);

        jButton22.setText("PAY ELECTRIC");
        finance.add(jButton22);
        jButton22.setBounds(1480, 480, 130, 40);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 0, 51));
        jLabel65.setText("GENERAL");
        finance.add(jLabel65);
        jLabel65.setBounds(1140, 650, 90, 22);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 0, 51));
        jLabel66.setText("GASOLINE");
        finance.add(jLabel66);
        jLabel66.setBounds(1140, 680, 110, 20);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 0, 51));
        jLabel67.setText("DIESEL");
        finance.add(jLabel67);
        jLabel67.setBounds(1140, 710, 70, 22);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 0, 51));
        jLabel68.setText("ELECTRIC");
        finance.add(jLabel68);
        jLabel68.setBounds(1140, 740, 100, 22);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/car animated.gif"))); // NOI18N
        finance.add(jLabel26);
        jLabel26.setBounds(10, 160, 540, 30);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/Finance-Free-PNG-Image.png"))); // NOI18N
        finance.add(jLabel27);
        jLabel27.setBounds(880, 60, 350, 200);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/financeEE.jpg"))); // NOI18N
        jLabel25.setText("jLabel25");
        finance.add(jLabel25);
        jLabel25.setBounds(0, 0, 1680, 800);

        getContentPane().add(finance, "card6");

        jMenuBar1.setBackground(new java.awt.Color(153, 51, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 3));
        jMenuBar1.setForeground(new java.awt.Color(255, 153, 153));
        jMenuBar1.setAlignmentX(0.0F);
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));
        jMenuBar1.setFocusCycleRoot(true);

        jMenu1.setBackground(new java.awt.Color(255, 255, 51));
        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/parking list.png"))); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(153, 0, 153));
        jMenuItem1.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem1.setText("                                           PARK SYSTEM                                                  ");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(102, 102, 102));
        jMenu2.setBorder(null);
        jMenu2.setForeground(new java.awt.Color(102, 0, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/cleaning list.png"))); // NOI18N

        jMenuItem2.setText("                                                 CAR WASHING                                           ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(102, 102, 102));
        jMenu3.setBorder(null);
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/repairing list.png"))); // NOI18N

        jMenuItem3.setText("                                                 Repairing                                                     ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(51, 51, 51));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/economy.png"))); // NOI18N

        jMenuItem4.setText("finance");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       jPanel1.setVisible(true);
       jPanel2.setVisible(false);
       jPanel3.setVisible(false);
       
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        parking.setVisible(false);
        washing.setVisible(false);
        repairing.setVisible(true);
        giris.setVisible(false);
        finance.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        parking.setVisible(false);
        washing.setVisible(true);
        repairing.setVisible(false);
        giris.setVisible(false);
        finance.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        parking.setVisible(true);
        washing.setVisible(false);
        repairing.setVisible(false);
        giris.setVisible(false);
        finance.setVisible(false);

        /*
        repairing.setVisible(false);
        washing.setVisible(false);
        jLayeredPane2.setVisible(true);
        jRadioButton1.setVisible(true);
        jRadioButton2.setVisible(true);
        jRadioButton3.setVisible(true);
        jLabel6.setVisible(false);
        */
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

  
    
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        if(CheckInfo==true)
        {
            if(CheckSearch==false)
            {
                 buttonSearch.setVisible(false);
                
                 if(RepairType.equalsIgnoreCase("Gasoline"))
             {
                  String ArizaTespit;
                     ArizaTespit=gasolineCar.faultDetection();
                 
                    Timer timer =new Timer(60,null);
                    timer.start();
                 
                 
                     timer.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         
                        CounterRepair++;
                        
                         jProgressBar1.setValue(CounterRepair);
                         jProgressBar1.setString("HASAR ORANI %"+CounterRepair);
                          tespit.setText("Arıza tespit ediliyor...");
                         
                         if(CounterRepair==gasolineCar.getDamage())
                         {
                             timer.stop();
                             
                             
                             jProgressBar1.setValue(gasolineCar.getDamage());
                             jProgressBar1.setString("HASAR ORANI %"+gasolineCar.getDamage());
                              tespit.setText(ArizaTespit);
                            
                 
                            CounterRepair=0;
                            repairButton.setVisible(true);
                            CancelButton.setVisible(true);
                             
                
                            CheckSearch=true;
                             
                            JOptionPane.showMessageDialog(Admin.this,"hasar tespiti yapildi");
                         }
                         
                     }
                 });
             
             }
             
             else if(RepairType.equalsIgnoreCase("Diesel"))
             {
                  String ArizaTespit;
                     ArizaTespit=dieselCar.faultDetection();
                 
                    Timer timer =new Timer(60,null);
                    timer.start();
                 
                 
                     timer.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         
                        CounterRepair++;
                        
                         jProgressBar1.setValue(CounterRepair);
                         jProgressBar1.setString("HASAR ORANI %"+CounterRepair);
                          tespit.setText("Arıza tespit ediliyor...");
                         
                         if(CounterRepair==dieselCar.getDamage())
                         {
                             timer.stop();
                             
                             
                             jProgressBar1.setValue(dieselCar.getDamage());
                             jProgressBar1.setString("HASAR ORANI %"+dieselCar.getDamage());
                              tespit.setText(ArizaTespit);
                            
                 
                            CounterRepair=0;
                            repairButton.setVisible(true);
                             CancelButton.setVisible(true);
                             
                
                            CheckSearch=true;
                             
                            JOptionPane.showMessageDialog(Admin.this,"hasar tespiti yapildi");
                         }
                         
                     }
                 });
                 
             }
             
             else if(RepairType.equalsIgnoreCase("Electric"))
             {
                   String ArizaTespit;
                     ArizaTespit=electricCar.faultDetection();
                 
                    Timer timer =new Timer(60,null);
                    timer.start();
                 
                 
                     timer.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         
                        CounterRepair++;
                        
                         jProgressBar1.setValue(CounterRepair);
                         jProgressBar1.setString("HASAR ORANI %"+CounterRepair);
                          tespit.setText("Arıza tespit ediliyor...");
                         
                         if(CounterRepair==electricCar.getDamage())
                         {
                             timer.stop();
                             
                             
                             jProgressBar1.setValue(electricCar.getDamage());
                             jProgressBar1.setString("HASAR ORANI %"+electricCar.getDamage());
                              tespit.setText(ArizaTespit);
                            
                                repairButton.setVisible(true);
                                CancelButton.setVisible(true);
                              
                 
                            CounterRepair=0;
                  
                
                            CheckSearch=true;
                             
                            JOptionPane.showMessageDialog(Admin.this,"hasar tespiti yapildi");
                         }
                         
                     }
                 });
                 
            
             }
             
             else
             {
                 JOptionPane.showMessageDialog(this,"motor tipi tespit edilemedi");
             }
                 
                 
            }
             
            else
            {
                JOptionPane.showMessageDialog(this,"Ariza tespiti zaten yapildi !!!!!");
            }
             
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Please fill in the informations and sing up !!!");
        }
            
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        String name,surname,tc,gender,profession,model,id;
        boolean special;
        name=Name.getText();
        surname=Surname.getText();
        tc=Tc.getText();
        id=Plate.getText();
        gender=Gender.getSelectedItem().toString();
        profession=Profission.getSelectedItem().toString();
        model=Model.getText();
        RepairType=Type.getSelectedItem().toString();
        special=jCheckBox1.isSelected();
        
        
        if(name.equals("") || surname.equals("") || tc.equals("") || model.equals(""))
        {
            
            JOptionPane.showMessageDialog(this,"There is a Empty Information !!!");
            CheckInfo=false;
        
        }
        else
        {
           if(CheckInfo==false)
           {
                if(RepairType.equalsIgnoreCase("Gasoline"))
             {
                gasolineCar=new GasolineCar(name,surname,tc,profession,gender,model,id,special);
                InfoClass.add(gasolineCar);
                
                
            }
            else if (RepairType.equalsIgnoreCase("Electric"))
            {
                electricCar=new ElectricCar(name,surname,tc,profession,gender,model,id,special);
                InfoClass.add(electricCar);
            
            }
            else if (RepairType.equalsIgnoreCase("Diesel"))
            {
               
                dieselCar=new DieselCar(name,surname,tc,profession,gender,model,id,special);
                InfoClass.add(dieselCar);
            
            }
            else
            {
                JOptionPane.showMessageDialog(this,"There is a wrong some thing!!!");
            }
            CheckInfo=true;
            JOptionPane.showMessageDialog(this,"Registration Completed.Vehicle can be directed to the garage and damage detection");
            
            buttonSearch.setVisible(true);
            repairButton.setVisible(false);
            CancelButton.setVisible(false);
            cark.setVisible(true);
            tespit.setText("\n\n\n\n\tVEHICLE CAN BE DIRECTED TO THE GARAGE");
           
            }
           else
           {
               JOptionPane.showMessageDialog(this,"the registration process has already been done.Vehicle can be directed to the garage and damage detection");
           }
            
            
        }
        
    }//GEN-LAST:event_addActionPerformed

    private void repairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairButtonActionPerformed
        if(CheckInfo==true)
        {
            if(CheckSearch==true)
            {
                if(CheckRepair==false)
                {
                    
                    
                    
                    if(RepairType.equals("Gasoline"))
                    {
                        int n = JOptionPane.showConfirmDialog(null,"Price :"+gasolineCar.gettPrize()+"\n Would You like  Repair ?","Repair",JOptionPane.YES_NO_OPTION);
                        if(n ==JOptionPane.YES_OPTION)
                        {
                              if(gasolineCar.Repair_Car()==true)
                             {
                                CheckRepair=true;
                            
                                
                            
                                JOptionPane.showMessageDialog(this,"Tamir işlemi tamamlandı aracınızı teslim alabilirsiniz");
                                finance();
                                
                                
                                ClearRepair();
                            }
                              
                                else
                             {
                                tespit.setText(gasolineCar.Empty_Material);
                                CancelButton.setVisible(true);
                                 repairButton.setVisible(false);
                                
                            }  
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"Tamir işlemi iptal edildi");
                            
                            
                             ClearRepair();
                            
                        }
                            
                            
                    }
                    else if(RepairType.equals("Diesel"))
                    {
                         int n = JOptionPane.showConfirmDialog(null,"Price :"+dieselCar.gettPrize()+"\n Would You like  Repair ?","Repair",JOptionPane.YES_NO_OPTION);
                        if(n ==JOptionPane.YES_OPTION)
                        {
                              if(dieselCar.Repair_Car()==true)
                             {
                                CheckRepair=true;
                            
                            
                                JOptionPane.showMessageDialog(this,"Tamir işlemi tamamlandı aracınızı teslim alabilirsiniz");
                                 finance();
                                ClearRepair();
                            }
                              
                                else
                             {
                                tespit.setText(dieselCar.Empty_Material);
                                CancelButton.setVisible(true);
                                repairButton.setVisible(false);
                               
                             }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"Tamir işlemi iptal edildi");
                             ClearRepair();
                        }
                            
                    
                    }
                    else if(RepairType.equals("Electric"))
                    {
                          int n = JOptionPane.showConfirmDialog(null,"Price :"+electricCar.gettPrize()+"\n Would You like  Repair ?","Repair",JOptionPane.YES_NO_OPTION);
                        if(n ==JOptionPane.YES_OPTION)
                        {
                              if(electricCar.Repair_Car()==true)
                             {
                                CheckRepair=true;
                            
                            
                                JOptionPane.showMessageDialog(this,"Tamir işlemi tamamlandı aracınızı teslim alabilirsiniz");
                                 finance();
                                ClearRepair();
                            }
                              
                                else
                             {
                                tespit.setText(electricCar.Empty_Material);
                                CancelButton.setVisible(true);
                                repairButton.setVisible(false);
                               
                             }
                             
                             
                              
                              
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"Tamir işlemi iptal edildi");
                             ClearRepair();
                        }
                             
                        
                            
                    
                    }
                     else
                    {
                        JOptionPane.showMessageDialog(this,"motor tespit edilemedi tamir için)");
                    }
                     
                    
                     
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"zaten arabani tamir ettik bidaha mi para vericen!!!");
                }
            
            }
            else
            {
                JOptionPane.showMessageDialog(this,"gardasim bi hasar tespiti yapta fiyat çiksin!!!");
            }
        
        }
        
        else
        {
            JOptionPane.showMessageDialog(this,"önce kayit işlemi yap dürzü!!!");
        }
    }//GEN-LAST:event_repairButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
               CancelButton.setVisible(false);
               repairButton.setVisible(false);
               ClearRepair();
               if(RepairType.equals("Gasoline"))
               {
                    InfoClass.remove(gasolineCar.getID());
               }
               else if (RepairType.equals("Diesel"))
                {
                      InfoClass.remove(dieselCar.getID());
                       
                }
               else if (RepairType.equals("Electric"))
               {
                   InfoClass.remove(electricCar.getID());
               
               }
               else
                   JOptionPane.showMessageDialog(this,"error!");
               
               
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        StatisticOfRepair a=new StatisticOfRepair();
        a.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        InventoryOfRepair a=new InventoryOfRepair();
        a.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btWashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWashActionPerformed
        int page;
        if(tfName.getText().equals("") || tfSurname.getText().equals("") || tfIdentity.getText().equals("") || tfPlate.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please fill the all blanks");
        
        else if( cbProfession.getSelectedIndex() == -1)
            JOptionPane.showMessageDialog(this, "Please Select Profession !");
        
        else
        {
            if(Cleaning.getTotal_water_and_Foam() > Cleaning.getConsume_WaF() || Cleaning.getTotal_wax_quantity() > Cleaning.getConsume_wax())
        {   
            
            if(Cleaning.getTotal_wax_quantity() < Cleaning.getConsume_wax() )
            {
                if(checkWax.isSelected() == false)
                {
                    if(Cleaning.DecidePriceAccordingtoCarType( (String) cbVehType.getSelectedItem(), (String) cbProfession.getSelectedItem(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected() )== 0){
                        JOptionPane.showMessageDialog(this, "Please Select at least one of services!");
                    }
                    else
                    {

                        page = JOptionPane.showConfirmDialog(null,"PRICE : "+ Cleaning.DecidePriceAccordingtoCarType((String) cbVehType.getSelectedItem() , (String) cbProfession.getSelectedItem(), cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected()) + "\n Would You like to Wash your Vehicle ?","Wash",JOptionPane.YES_NO_OPTION); 
                        if(page == JOptionPane.YES_OPTION){
                            Cleaning clean = new Cleaning(tfPlate.getText(), tfName.getText(), tfSurname.getText(), tfIdentity.getText(), (String) cbProfession.getSelectedItem(), cbGender.getSelectedItem().toString(), (String) cbVehType.getSelectedItem());
                            clean.price =  Cleaning.DecidePriceAccordingtoCarType( (String) cbVehType.getSelectedItem() , (String) cbProfession.getSelectedItem(), cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected() );
                            
                            if(checkInterior.isSelected())
                                clean.typeOfwashing += "Int. W.- ";
                            if(checkExterior.isSelected())
                                clean.typeOfwashing += "Ext. W. - ";
                            if(checkAuto.isSelected())
                                clean.typeOfwashing += "Auto H. -";
                            if(checkWax.isSelected())
                                clean.typeOfwashing += "Wax P. - ";
                            
                            Cleaning.AddtoCase();
                            InfoClass.cleaning.add(clean);
                            InfoClass.infoCustomer.add(clean);
                            finance();
                            tfPrice.setText("");

                            JOptionPane.showMessageDialog(this,"Your Car Succesfully Washed! \n Hope to see you again !");
                            ClearWashing();
                        }
                        else
                             JOptionPane.showMessageDialog(this,"Washing Cancelled ! \n We hope you come again !");
                        
                        }
                    
                }
                else
                    JOptionPane.showMessageDialog(this,"Wax Polish service cancelled beceause of lack of material of Wax Polish \n We hope you serving time !");    
            }
             
            else if(Cleaning.getTotal_water_and_Foam() < Cleaning.getConsume_WaF())
            {
                if(checkAuto.isSelected() == false && checkInterior.isSelected() == false && checkExterior.isSelected() == false)
                {
                    if(Cleaning.DecidePriceAccordingtoCarType((String) cbVehType.getSelectedItem(), (String) cbProfession.getSelectedItem(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected() )== 0){
                        JOptionPane.showMessageDialog(this, "Please Select at least one of services!");
                    }
                    else
                    {

                        page = JOptionPane.showConfirmDialog(null,"PRICE : "+ Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), (String) cbProfession.getSelectedItem(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected()) + "\n Would You like to Wash your Vehicle ?","Wash",JOptionPane.YES_NO_OPTION);
        
                        if(page == JOptionPane.YES_OPTION){
                            Cleaning clean = new Cleaning(tfPlate.getText(), tfName.getText(), tfSurname.getText(), tfIdentity.getText(), (String) cbProfession.getSelectedItem(), cbGender.getSelectedItem().toString(), (String) cbVehType.getSelectedItem());
                            clean.price =  Cleaning.DecidePriceAccordingtoCarType( (String) cbVehType.getSelectedItem() , (String) cbProfession.getSelectedItem(), cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected() );
                            
                            if(checkInterior.isSelected())
                                clean.typeOfwashing += "Int. W.- ";
                            if(checkExterior.isSelected())
                                clean.typeOfwashing += "Ext. W. - ";
                            if(checkAuto.isSelected())
                                clean.typeOfwashing += "Auto H. -";
                            if(checkWax.isSelected())
                                clean.typeOfwashing += "Wax P. - ";
                            
                            Cleaning.AddtoCase();
                            InfoClass.cleaning.add(clean);
                            InfoClass.infoCustomer.add(clean);
                            finance();
                            tfPrice.setText("");
                                
                            JOptionPane.showMessageDialog(this,"Your Car Succesfully Washed! \n Hope to see you again !");
                            ClearWashing();
                        }
                        else
                             JOptionPane.showMessageDialog(this,"Washing Cancelled ! \n We hope you come again !");
                        
                        }
                }
                else
                    JOptionPane.showMessageDialog(this,"Auto\\Interior\\Exterior Washing service Cancelled beceause of lack of material of Water and Foam \n We hope you serving time  !");        
            }
            
            
            else
            {
                
                if(Cleaning.DecidePriceAccordingtoCarType( (String) cbVehType.getSelectedItem(), (String) cbProfession.getSelectedItem(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected() ) == 0){
                        JOptionPane.showMessageDialog(this, "Please Select at least one of services!");
                    }
                
                 else
                    {
                        page = JOptionPane.showConfirmDialog(null,"PRICE : "+ Cleaning.DecidePriceAccordingtoCarType( (String) cbVehType.getSelectedItem(), (String) cbProfession.getSelectedItem(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected()) + "\n Would You like to Wash your Vehicle ?","Wash",JOptionPane.YES_NO_OPTION);
        
                        if(page == JOptionPane.YES_OPTION)
                        {
                            Cleaning clean = new Cleaning(tfPlate.getText(), tfName.getText(), tfSurname.getText(), tfIdentity.getText(), (String) cbProfession.getSelectedItem(), cbGender.getSelectedItem().toString(),(String) cbVehType.getSelectedItem());
                            clean.price =  Cleaning.DecidePriceAccordingtoCarType( (String) cbVehType.getSelectedItem() , (String) cbProfession.getSelectedItem(), cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected() );
                            
                            if(checkInterior.isSelected())
                                clean.typeOfwashing += "Int. Wash. - ";
                            if(checkExterior.isSelected())
                                clean.typeOfwashing += "Ext. Wash. - ";
                            if(checkAuto.isSelected())
                                clean.typeOfwashing += "Auto H. - ";
                            if(checkWax.isSelected())
                                clean.typeOfwashing += "Wax P. - ";
                            
                            
                            Cleaning.AddtoCase();
                            InfoClass.cleaning.add(clean);
                            InfoClass.infoCustomer.add(clean);
                            finance();
                            tfPrice.setText("");

                            JOptionPane.showMessageDialog(this,"Your Car Succesfully Washed! \n Hope to see you again !");
                            ClearWashing();
                        }
                        else
                             JOptionPane.showMessageDialog(this,"Washing Cancelled ! \n We hope you come again !");
                        
                        }
              }
            
            
        }
        else
            JOptionPane.showMessageDialog(this,"Washing cancelled because of lack of material  \n We hope you serving time !");
        }
            
        
        //System.out.println(InfoClass.cleaning.toString());
    }//GEN-LAST:event_btWashActionPerformed

    private void checkAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAutoActionPerformed
        if(checkAuto.isSelected()){
            checkExterior.setSelected(false);
            checkExterior.disable();
            
            checkInterior.setSelected(false);
            checkInterior.disable();
        }
        else{
            checkExterior.enable();
            checkInterior.enable();
        }
            
        String s = Double.toString(Cleaning.DecidePriceAccordingtoCarType((String)cbVehType.getSelectedItem(), (String)cbProfession.getSelectedItem(), checkSpecial.isSelected(), checkInterior.isSelected(), checkExterior.isSelected(), checkAuto.isSelected(), checkWax.isSelected()));
        tfPrice.setText(s + " TL");
        
    }//GEN-LAST:event_checkAutoActionPerformed

    private void checkInteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInteriorActionPerformed
        if (checkInterior.isSelected()) {
            checkAuto.setSelected(false);
            checkAuto.disable();
            checkExterior.enable();
        }
        else
            checkAuto.disable();
        
        String s = Double.toString(Cleaning.DecidePriceAccordingtoCarType( (String)cbVehType.getSelectedItem(), (String)cbProfession.getSelectedItem(), checkSpecial.isSelected(), checkInterior.isSelected(), checkExterior.isSelected(), checkAuto.isSelected(), checkWax.isSelected()));
        tfPrice.setText(s + " TL");
    }//GEN-LAST:event_checkInteriorActionPerformed

    private void cbVehTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVehTypeActionPerformed
        if(cbVehType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels"))
        {
            checkExterior.disable();
            checkExterior.setVisible(false);
            
            checkInterior.disable();
            checkInterior.setVisible(false);
        }
        else{
            checkExterior.enable();
            checkExterior.setVisible(true);
            
            checkInterior.enable();
            checkInterior.setVisible(true);
        }
        String s = Double.toString(Cleaning.DecidePriceAccordingtoCarType( (String)cbVehType.getSelectedItem(), (String)cbProfession.getSelectedItem(), checkSpecial.isSelected(), checkInterior.isSelected(), checkExterior.isSelected(), checkAuto.isSelected(), checkWax.isSelected()));
        tfPrice.setText(s + " TL");
    }//GEN-LAST:event_cbVehTypeActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        parking.setVisible(false);
        washing.setVisible(false);
        repairing.setVisible(false);
        giris.setVisible(false);
        finance.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A1.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A1.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "SEcmek istiomusunuz?", "asd", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A1.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A1",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A1);
                A1.setSelected(true);
                ClearParking();
               
            }
            else
               A1.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }   
        
        
        
    }//GEN-LAST:event_A1MouseClicked

    private void A21LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A21LMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A21L.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A21L.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A21L.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A21L",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A21L);
                A21L.setSelected(true);
                ClearParking();
                
            }
            else
               A21L.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }   
    }//GEN-LAST:event_A21LMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        int b=InfoClass.FindIndex((String)cbPlate.getSelectedItem());
        int tempTime=InfoClass.parking.get(b).CalcTotalTime();            
        double tempPrice=InfoClass.parking.get(b).getPrice();               
        int a=JOptionPane.showConfirmDialog(rootPane, "Using Time for Parking  => "+tempTime+" Hours\nParking Price is  => "+tempPrice+" Turkish Liras\nDo you want to exit that car?", "Exit", JOptionPane.YES_NO_OPTION);
        if (a==JOptionPane.YES_OPTION) {         
            MotherMain.totalMoney+=tempPrice;
            InfoClass.ParkRemove((String)cbPlate.getSelectedItem());
            
            cbPlate.removeItem((String)cbPlate.getSelectedItem());
            finance();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void A7mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7mMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A7m.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A7m.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A7m.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A7m",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A7m);
                A7m.setSelected(true);
                ClearParking();
               
            }
            else
               A7m.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
        
    }//GEN-LAST:event_A7mMouseClicked

    private void A15sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A15sMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A15s.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A15s.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A15s.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A15s",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A15s);
                A15s.setSelected(true);
                ClearParking();
               // System.out.println(" "+InfoClass.ShowAll());
            }
            else
               A15s.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A15sMouseClicked

    private void A22LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A22LMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A22L.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A22L.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A22L.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A22L",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A22L);
                A22L.setSelected(true);
                ClearParking();
                
            }
            else
               A22L.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A22LMouseClicked

    private void A23LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A23LMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A23L.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A23L.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A23L.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A23L",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A23L);
                A23L.setSelected(true);
                ClearParking();
                
            }
            else
               A23L.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A23LMouseClicked

    private void A24LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A24LMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A24L.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A24L.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A24L.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A24L",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A24L);
                A24L.setSelected(true);
                ClearParking();
                
            }
            else
               A24L.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A24LMouseClicked

    private void A25LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A25LMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A25L.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A25L.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A25L.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A25L",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A25L);
                A25L.setSelected(true);
                ClearParking();
                
            }
            else
               A25L.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A25LMouseClicked

    private void A26LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A26LMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A26L.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A26L.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A26L.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A26L",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A26L);
                A26L.setSelected(true);
                ClearParking();
                
            }
            else
               A26L.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A26LMouseClicked

    private void A27LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A27LMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A27L.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A27L.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A27L.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A27L",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A27L);
                A27L.setSelected(true);
                ClearParking();
                
            }
            else
               A27L.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A27LMouseClicked

    private void A28LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A28LMouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A28L.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A28L.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A28L.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A28L",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A28L);
                A28L.setSelected(true);
                ClearParking();
                
            }
            else
               A28L.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A28LMouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A2.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A2.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A2.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A2",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A2);
                A2.setSelected(true);
                ClearParking();
               
            }
            else
               A2.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }   
    }//GEN-LAST:event_A2MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A3.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A3.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A3.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A3",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A3);
                A3.setSelected(true);
                ClearParking();
               
            }
            else
               A3.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }   
        
    }//GEN-LAST:event_A3MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A4.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A4.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A4.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A4",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A4);
                A4.setSelected(true);
                ClearParking();
               
            }
            else
               A4.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }   
    }//GEN-LAST:event_A4MouseClicked

    private void A5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A5.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A5.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A5.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A5",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A5);
                A5.setSelected(true);
                ClearParking();
               
            }
            else
               A5.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_A5MouseClicked

    private void A6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A6.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A6.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A6.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A6",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A6);
                A6.setSelected(true);
                ClearParking();
               
            }
            else
               A6.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_A6MouseClicked

    private void A11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A11MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A11.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A11.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A11.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A11",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A11);
                A11.setSelected(true);
                ClearParking();
               
            }
            else
               A11.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_A11MouseClicked

    private void A12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A12MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A12.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A12.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A12.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A12",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A12);
                A12.setSelected(true);
                ClearParking();
               
            }
            else
               A12.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_A12MouseClicked

    private void A13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A13MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A13.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A13.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A13.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A13",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A13);
                A13.setSelected(true);
                ClearParking();
               
            }
            else
               A13.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_A13MouseClicked

    private void A14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A14MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A14.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A14.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A14.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A14",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A14);
                A14.setSelected(true);
                ClearParking();
               
            }
            else
               A14.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_A14MouseClicked

    private void A16sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A16sMouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A16s.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A16s.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A16s.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A16s",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A16s);
                A16s.setSelected(true);
                ClearParking();
               // System.out.println(" "+InfoClass.ShowAll());
            }
            else
               A16s.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A16sMouseClicked

    private void A8mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8mMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A8m.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A8m.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A8m.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A8m",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A8m);
                A8m.setSelected(true);
                ClearParking();
               
            }
            else
               A8m.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A8mMouseClicked

    private void A9mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A9mMouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A9m.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A9m.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A9m.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A9m",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A9m);
                A9m.setSelected(true);
                ClearParking();
               
            }
            else
               A9m.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A9mMouseClicked

    private void A10mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A10mMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A10m.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A10m.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A10m.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A10m",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A10m);
                A10m.setSelected(true);
                ClearParking();
               
            }
            else
               A10m.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A10mMouseClicked

    private void A17mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A17mMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A17m.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A17m.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A17m.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A17m",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A17m);
                A17m.setSelected(true);
                ClearParking();
               
            }
            else
               A17m.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A17mMouseClicked

    private void A19mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A19mMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A19m.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A19m.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A19m.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A19m",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A19m);
                A19m.setSelected(true);
                ClearParking();
               
            }
            else
               A19m.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A19mMouseClicked

    private void A20mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A20mMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A20m.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A20m.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A20m.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A20m",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A20m);
                A20m.setSelected(true);
                ClearParking();
               
            }
            else
               A20m.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A20mMouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b1.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b1.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b1.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b1",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b1);
                b1.setSelected(true);
                ClearParking();
               
            }
            else
               b1.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b2.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b2.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b2.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b2",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b2);
                b2.setSelected(true);
                ClearParking();
               
            }
            else
               b2.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
            if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b3.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b3.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b3.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b3",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b3);
                b3.setSelected(true);
                ClearParking();
               
            }
            else
               b3.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b3MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b4.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b4.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b4.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b4",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b4);
                b4.setSelected(true);
                ClearParking();
               
            }
            else
               b4.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b4MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b5.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b5.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b5.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b5",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b5);
                b5.setSelected(true);
                ClearParking();
               
            }
            else
               b5.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b5MouseClicked

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b6.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b6.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b6.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b6",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b6);
                b6.setSelected(true);
                ClearParking();
               
            }
            else
               b6.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b6MouseClicked

    private void b9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b9.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b9.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b9.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b9",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b9);
                b9.setSelected(true);
                ClearParking();
               
            }
            else
               b9.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b9MouseClicked

    private void b10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b10MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b10.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b10.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b10.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b10",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b10);
                b10.setSelected(true);
                ClearParking();
               
            }
            else
               b10.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b10MouseClicked

    private void b11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b11.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b11.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b11.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b11",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b11);
                b11.setSelected(true);
                ClearParking();
               
            }
            else
               b11.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b11MouseClicked

    private void b12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b12.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b12.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b12.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b12",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b12);
                b12.setSelected(true);
                ClearParking();
               
            }
            else
               b12.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b12MouseClicked

    private void b13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b13MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b13.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b13.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b13.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b13",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b13);
                b13.setSelected(true);
                ClearParking();
               
            }
            else
               b13.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b13MouseClicked

    private void b14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b14MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b14.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b14.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b14.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b14",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b14);
                b14.setSelected(true);
                ClearParking();
               
            }
            else
               b14.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b14MouseClicked

    private void b17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b17MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b17.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b17.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b17.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b17",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b17);
                b17.setSelected(true);
                ClearParking();
               
            }
            else
               b17.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b17MouseClicked

    private void b18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b18MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b18.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b18.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b18.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b18",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b18);
                b18.setSelected(true);
                ClearParking();
               
            }
            else
               b18.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b18MouseClicked

    private void b19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b19MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b19.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b19.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b19.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b19",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b19);
                b19.setSelected(true);
                ClearParking();
               
            }
            else
               b19.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b19MouseClicked

    private void b20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b20MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b20.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b20.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b20.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b20",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b20);
                b20.setSelected(true);
                ClearParking();
               
            }
            else
               b20.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b20MouseClicked

    private void b21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b21MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b21.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b21.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b21.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b21",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b21);
                b21.setSelected(true);
                ClearParking();
               
            }
            else
               b21.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b21MouseClicked

    private void b22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b22MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b22.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b22.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b22.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b22",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b22);
                b22.setSelected(true);
                ClearParking();
               
            }
            else
               b22.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_b22MouseClicked

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b7.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b7.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b7.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b7",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b7);
                b7.setSelected(true);
                ClearParking();
               // System.out.println(" "+InfoClass.ShowAll());
            }
            else
               b7.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b7MouseClicked

    private void b8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b8.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b8.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b8.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b8",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b8);
                b8.setSelected(true);
                ClearParking();
               // System.out.println(" "+InfoClass.ShowAll());
            }
            else
               b8.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b8MouseClicked

    private void b15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b15.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b15.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b15.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b15",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b15);
                b15.setSelected(true);
                ClearParking();
               // System.out.println(" "+InfoClass.ShowAll());
            }
            else
               b15.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b15MouseClicked

    private void b16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b16.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b16.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b16.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b16",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b16);
                b16.setSelected(true);
                ClearParking();
               // System.out.println(" "+InfoClass.ShowAll());
            }
            else
               b16.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b16MouseClicked

    private void b23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b23MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b23.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b23.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b23.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b23",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b23);
                b23.setSelected(true);
                ClearParking();
               // System.out.println(" "+InfoClass.ShowAll());
            }
            else
               b23.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b23MouseClicked

    private void b24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b24MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b24.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b24.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b24.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b24",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b24);
                b24.setSelected(true);
                ClearParking();
               // System.out.println(" "+InfoClass.ShowAll());
            }
            else
               b24.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b24MouseClicked

    private void b25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b25MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b25.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b25.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b25.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b25",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b25);
                b25.setSelected(true);
                ClearParking();
               
            }
            else
               b25.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b25MouseClicked

    private void b26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b26MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b26.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b26.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b26.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b26",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b26);
                b26.setSelected(true);
                ClearParking();
               
            }
            else
               b26.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b26MouseClicked

    private void b27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b27MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b27.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b27.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b27.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b27",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b27);
                b27.setSelected(true);
                ClearParking();
               
            }
            else
               b27.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b27MouseClicked

    private void b28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b28MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b28.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b28.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b28.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b28",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b28);
                b28.setSelected(true);
                ClearParking();
               
            }
            else
               b28.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b28MouseClicked

    private void b29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b29MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b29.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b29.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b29.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b29",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b29);
                b29.setSelected(true);
                ClearParking();
               
            }
            else
               b29.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b29MouseClicked

    private void b30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b30MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b30.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b30.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b30.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b30",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b30);
                b30.setSelected(true);
                ClearParking();
               
            }
            else
               b30.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b30MouseClicked

    private void b31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b31MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b31.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b31.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b31.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b31",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b31);
                b31.setSelected(true);
                ClearParking();
               
            }
            else
               b31.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b31MouseClicked

    private void b32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b32MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b32.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b32.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b32.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b32",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b32);
                b32.setSelected(true);
                ClearParking();
               
            }
            else
               b32.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b32MouseClicked

    private void b33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b33MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b33.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b33.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b33.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b33",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b33);
                b33.setSelected(true);
                ClearParking();
               
            }
            else
               b33.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b33MouseClicked

    private void b34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b34MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b34.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b34.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b34.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b34",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b34);
                b34.setSelected(true);
                ClearParking();
               
            }
            else
               b34.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b34MouseClicked

    private void b35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b35MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b35.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b35.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b35.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b35",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b35);
                b35.setSelected(true);
                ClearParking();
               
            }
            else
               b35.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b35MouseClicked

    private void b36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b36MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b36.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b36.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b36.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b36",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b36);
                b36.setSelected(true);
                ClearParking();
               
            }
            else
               b36.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b36MouseClicked

    private void b37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b37MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b37.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b37.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b37.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b37",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b37);
                b37.setSelected(true);
                ClearParking();
               
            }
            else
               b37.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b37MouseClicked

    private void b38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b38MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b38.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b38.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b38.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b38",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b38);
                b38.setSelected(true);
                ClearParking();
               
            }
            else
               b38.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b38MouseClicked

    private void b39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b39MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b39.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b39.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b39.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b39",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b39);
                b39.setSelected(true);
                ClearParking();
               
            }
            else
               b39.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b39MouseClicked

    private void b40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b40MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(b40.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            b40.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                b40.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "b40",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(b40);
                b40.setSelected(true);
                ClearParking();
               
            }
            else
               b40.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_b40MouseClicked

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c2.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c2.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c2.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c2",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c2);
                c2.setSelected(true);
                ClearParking();
               
            }
            else
               c2.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_c2MouseClicked

    private void c3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c3.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c3.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c3.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c3",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c3);
                c3.setSelected(true);
                ClearParking();
               
            }
            else
               c3.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_c3MouseClicked

    private void c4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c4MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c4.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c4.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c4.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c4",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c4);
                c4.setSelected(true);
                ClearParking();
               
            }
            else
               c4.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_c4MouseClicked

    private void c5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c5MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c5.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c5.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c5.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c5",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c5);
                c5.setSelected(true);
                ClearParking();
               
            }
            else
               c5.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_c5MouseClicked

    private void c6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c6MouseClicked
      if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c6.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c6.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c6.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c6",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c6);
                c6.setSelected(true);
                ClearParking();
               
            }
            else
               c6.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_c6MouseClicked

    private void c7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c7MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c7.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c7.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c7.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c7",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c7);
                c7.setSelected(true);
                ClearParking();
               
            }
            else
               c7.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_c7MouseClicked

    private void c8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c8MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c8.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c8.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c8.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c8",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c8);
                c8.setSelected(true);
                ClearParking();
               
            }
            else
               c8.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_c8MouseClicked

    private void c9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c9MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c9.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c9.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c9.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c9",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c9);
                c9.setSelected(true);
                ClearParking();
               
            }
            else
               c9.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_c9MouseClicked

    private void c10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c10MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c10.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c10.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c10.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c10",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c10);
                c10.setSelected(true);
                ClearParking();
               
            }
            else
               c10.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_c10MouseClicked

    private void c11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c11MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c11.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c11.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c11.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c11",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c11);
                c11.setSelected(true);
                ClearParking();
               // System.out.println(" "+InfoClass.ShowAll());
            }
            else
               c11.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c11MouseClicked

    private void c12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c12MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c12.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c12.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c12.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c12",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c12);
                c12.setSelected(true);
                ClearParking();
               // System.out.println(" "+InfoClass.ShowAll());
            }
            else
               c12.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c12MouseClicked

    private void c13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c13MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c13.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c13.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c13.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c13",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c13);
                c13.setSelected(true);
                ClearParking();
                
            }
            else
               c13.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c13MouseClicked

    private void c14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c14MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c14.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c14.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c14.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c14",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c14);
                c14.setSelected(true);
                ClearParking();
                
            }
            else
               c14.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c14MouseClicked

    private void c15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c15MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c15.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c15.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c15.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c15",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c15);
                c15.setSelected(true);
                ClearParking();
                
            }
            else
               c15.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c15MouseClicked

    private void c16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c16MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c16.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c16.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c16.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c16",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c16);
                c16.setSelected(true);
                ClearParking();
                
            }
            else
               c16.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c16MouseClicked

    private void c17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c17MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c17.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c17.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c17.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c17",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c17);
                c17.setSelected(true);
                ClearParking();
                
            }
            else
               c17.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c17MouseClicked

    private void c18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c18MouseClicked
     if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c18.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c18.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c18.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c18",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c18);
                c18.setSelected(true);
                ClearParking();
                
            }
            else
               c18.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c18MouseClicked

    private void c19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c19MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c19.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c19.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c19.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c19",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c19);
                c19.setSelected(true);
                ClearParking();
                
            }
            else
               c19.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c19MouseClicked

    private void c20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c20MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Lorry") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c20.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c20.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c20.setBackground(java.awt.Color.red);                
                Lorry p=new Lorry(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c20",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c20);
                c20.setSelected(true);
                ClearParking();
                
            }
            else
               c20.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c20MouseClicked

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Automobile") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c1.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c1.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c1.setBackground(java.awt.Color.red);                
                Jip p=new Jip(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c1",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c1);
                c1.setSelected(true);
                ClearParking();
               
            }
            else
               c1.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }  
    }//GEN-LAST:event_c1MouseClicked

    private void c25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c25MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c25.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c25.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c25.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c25",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c25);
                c25.setSelected(true);
                ClearParking();
               
            }
            else
               c25.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c25MouseClicked

    private void c26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c26MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c26.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c26.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c26.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c26",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c26);
                c26.setSelected(true);
                ClearParking();
               
            }
            else
               c26.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c26MouseClicked

    private void c27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c27MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c27.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c27.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c27.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c27",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c27);
                c27.setSelected(true);
                ClearParking();
               
            }
            else
               c27.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c27MouseClicked

    private void c28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c28MouseClicked
         if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c28.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c28.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c28.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c28",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c28);
                c28.setSelected(true);
                ClearParking();
               
            }
            else
               c28.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c28MouseClicked

    private void c21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c21MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c21.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c21.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c21.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c21",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c21);
                c21.setSelected(true);
                ClearParking();
               
            }
            else
               c21.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c21MouseClicked

    private void c22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c22MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c22.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c22.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c22.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c22",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c22);
                c22.setSelected(true);
                ClearParking();
               
            }
            else
               c22.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c22MouseClicked

    private void c23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c23MouseClicked
       if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c23.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c23.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c23.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c23",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c23);
                c23.setSelected(true);
                ClearParking();
               
            }
            else
               c23.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c23MouseClicked

    private void c24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c24MouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(c24.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            c24.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                c24.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "c24",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(c24);
                c24.setSelected(true);
                ClearParking();
               
            }
            else
               c24.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_c24MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        
        if(ilk.getSelectedItem().toString().equals("TL"))
        {
            if(son.getSelectedItem().toString().equals("TL"))
            {
                JOptionPane.showMessageDialog(this, "Selected Items are same Currency !");
            }
            else if(son.getSelectedItem().toString().equals("Dollar"))
            {
                double Miktar,Dollar,convert;
                
                 Miktar=Double.parseDouble(miktar.getText());
                 
                 if(Miktar<=MotherMain.totalMoney)
                 {
                     convert=Miktar/(6.10);
                     MotherMain.totalDollarMoney+=convert;
                     MotherMain.totalMoney-=Miktar;
                 
                 
                 
                        String tl=""+MotherMain.getTotalMoney()+" TL";
                        jTextField1.setText(tl);
                        String Dollar1=""+ MotherMain.getTotalDollarMoney()+" Dollar";
                        jTextField2.setText(Dollar1);
                        String Euro=""+ MotherMain.getTotalEuroMoney()+ " Euro ";
                        jTextField3.setText(Euro);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(this, "insufficient money !");
                 }
                 
                 
                
            }
            else if(son.getSelectedItem().toString().equals("Euro"))
            {
                double Miktar,Euro,convert;
                
                 Miktar=Double.parseDouble(miktar.getText());
                 
                 if(Miktar<=MotherMain.totalMoney)
                 {
                     convert=Miktar/(6.10);
                     MotherMain.totalEuroMoney+=convert;
                     MotherMain.totalMoney-=Miktar;
                 
                 
                 
                        String tl=""+MotherMain.getTotalMoney()+" TL";
                        jTextField1.setText(tl);
                        String Dollar1=""+ MotherMain.getTotalDollarMoney()+" Dollar";
                        jTextField2.setText(Dollar1);
                        String euro=""+ MotherMain.getTotalEuroMoney()+ " Euro ";
                        jTextField3.setText(euro);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(this, "insufficient money !");
                 }
                
                
            }
        
        }
        else if(ilk.getSelectedItem().toString().equals("Dollar"))
        {
            if(son.getSelectedItem().toString().equals("Dollar"))
            {
                JOptionPane.showMessageDialog(this, "Selected Items are same Currency !");
            }
            else if(son.getSelectedItem().toString().equals("TL"))
            {
                double Miktar,Dollar,convert;
                
                 Miktar=Double.parseDouble(miktar.getText());
                 
                 if(Miktar<=MotherMain.totalDollarMoney)
                 {
                     convert=Miktar/(6.10);
                     MotherMain.totalMoney+=convert;
                     MotherMain.totalDollarMoney-=Miktar;
                 
                 
                 
                        String tl=""+MotherMain.getTotalMoney()+" TL";
                        jTextField1.setText(tl);
                        String Dollar1=""+ MotherMain.getTotalDollarMoney()+" Dollar";
                        jTextField2.setText(Dollar1);
                        String Euro=""+ MotherMain.getTotalEuroMoney()+ " Euro ";
                        jTextField3.setText(Euro);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(this, "insufficient money !");
                 }
                 
                 
                
            }
            else if(son.getSelectedItem().toString().equals("Euro"))
            {
                double Miktar,Euro,convert;
                
                 Miktar=Double.parseDouble(miktar.getText());
                 
                 if(Miktar<=MotherMain.totalDollarMoney)
                 {
                     convert=Miktar/(6.10);
                     MotherMain.totalEuroMoney+=convert;
                     MotherMain.totalDollarMoney-=Miktar;
                 
                 
                 
                        String tl=""+MotherMain.getTotalMoney()+" TL";
                        jTextField1.setText(tl);
                        String Dollar1=""+ MotherMain.getTotalDollarMoney()+" Dollar";
                        jTextField2.setText(Dollar1);
                        String euro=""+ MotherMain.getTotalEuroMoney()+ " Euro ";
                        jTextField3.setText(euro);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(this, "insufficient money !");
                 }
                
                
            }
            
            
            
        
        }
        else if(ilk.getSelectedItem().toString().equals("Euro"))
        {
            if(son.getSelectedItem().toString().equals("Euro"))
            {
                JOptionPane.showMessageDialog(this, "Selected Items are same Currency !");
            }
            else if(son.getSelectedItem().toString().equals("Dollar"))
            {
                double Miktar,Dollar,convert;
                
                 Miktar=Double.parseDouble(miktar.getText());
                 
                 if(Miktar<=MotherMain.totalMoney)
                 {
                     convert=Miktar/(6.10);
                     MotherMain.totalDollarMoney+=convert;
                     MotherMain.totalEuroMoney-=Miktar;
                 
                 
                 
                        String tl=""+MotherMain.getTotalMoney()+" TL";
                        jTextField1.setText(tl);
                        String Dollar1=""+ MotherMain.getTotalDollarMoney()+" Dollar";
                        jTextField2.setText(Dollar1);
                        String Euro=""+ MotherMain.getTotalEuroMoney()+ " Euro ";
                        jTextField3.setText(Euro);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(this, "insufficient money !");
                 }
                 
                 
                
            }
            else if(son.getSelectedItem().toString().equals("TL"))
            {
                double Miktar,Euro,convert;
                
                 Miktar=Double.parseDouble(miktar.getText());
                 
                 if(Miktar<=MotherMain.totalMoney)
                 {
                     convert=Miktar/(6.10);
                     MotherMain.totalMoney+=convert;
                     MotherMain.totalEuroMoney-=Miktar;
                 
                 
                 
                        String tl=""+MotherMain.getTotalMoney()+" TL";
                        jTextField1.setText(tl);
                        String Dollar1=""+ MotherMain.getTotalDollarMoney()+" Dollar";
                        jTextField2.setText(Dollar1);
                        String euro=""+ MotherMain.getTotalEuroMoney()+ " Euro ";
                        jTextField3.setText(euro);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(this, "insufficient money !");
                 }
                
                
            }
            
            
        
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        
        int miktar;
        double payment;
        
        /*
        TIRE          ( 120 €)
        SEAT         ( 50 € )
        WINDOW    ( 20 € )
        RIM            (180 €)
        HEADLIGHT ( 12 € )
        */
        
        
        if(generalI.getSelectedItem().toString().equalsIgnoreCase("TIRE          ( 120 €)"))
        {
            miktar=Integer.parseInt(Generalquantity.getText());
            payment=120*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                DieselCar.Tire+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
        
        else if(generalI.getSelectedItem().toString().equalsIgnoreCase("SEAT         ( 50 € )"))
        {
            miktar=Integer.parseInt(Generalquantity.getText());
            payment=50*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                DieselCar.Seat+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
         
        else if(generalI.getSelectedItem().toString().equalsIgnoreCase("WINDOW    ( 20 € )"))
        {
            miktar=Integer.parseInt(Generalquantity.getText());
            payment=20*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                DieselCar.window+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
          
        else  if(generalI.getSelectedItem().toString().equalsIgnoreCase("RIM            (180 €)"))
        {
            miktar=Integer.parseInt(Generalquantity.getText());
            payment=180*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                DieselCar.rim+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
           
        else  if(generalI.getSelectedItem().toString().equalsIgnoreCase("HEADLIGHT ( 12 € )"))
        {
            miktar=Integer.parseInt(Generalquantity.getText());
            payment=120*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                DieselCar.headlight+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
        
        Generalquantity.setText(null);
        
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
         int miktar;
        double payment;
        
        /*
        G. BATTERY  (30 €)
G. ENGINE     (58 €)
G. GEARBOX  (23 €)
G. RADIATOR(24 €)
G. FUEL         (87 €)
        */
     
        
        
        if(gasolineI.getSelectedItem().toString().equalsIgnoreCase("G. BATTERY  (30 €)"))
        {
            miktar=Integer.parseInt(gasolinequantity.getText());
            payment=30*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                GasolineCar.Gbattery+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
        
        else if(gasolineI.getSelectedItem().toString().equalsIgnoreCase("G. ENGINE     (58 €)"))
        {
            miktar=Integer.parseInt(gasolinequantity.getText());
            payment=58*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                GasolineCar.Gengine+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
         
        else if(gasolineI.getSelectedItem().toString().equalsIgnoreCase("G. GEARBOX  (23 €)"))
        {
            miktar=Integer.parseInt(gasolinequantity.getText());
            payment=23*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                GasolineCar.GGearBox+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
          
        else  if(gasolineI.getSelectedItem().toString().equalsIgnoreCase("G. RADIATOR(24 €)"))
        {
            miktar=Integer.parseInt(gasolinequantity.getText());
            payment=24*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                GasolineCar.GRadiator=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
           
        else  if(gasolineI.getSelectedItem().toString().equalsIgnoreCase("G. FUEL         (87 €)"))
        {
            miktar=Integer.parseInt(gasolinequantity.getText());
            payment=87*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                GasolineCar.Gfuel+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
        
        gasolinequantity.setText(null);
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
          int miktar;
        double payment;
        
        /*
D. BATTERY  (39 €)
D. ENGINE     (380 €)
D. GEARBOX  (123 €)
D. RADIATOR (357 €)
D. FUEL         (374€ )
        */
     
        
        
        if(dieselI.getSelectedItem().toString().equalsIgnoreCase("D. BATTERY  (39 €)"))
        {
            miktar=Integer.parseInt(dieselquantity.getText());
            payment=39*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                DieselCar.Dbattery+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
        
        else if(dieselI.getSelectedItem().toString().equalsIgnoreCase("D. ENGINE     (380 €)"))
        {
            miktar=Integer.parseInt(dieselquantity.getText());
            payment=380*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                DieselCar.Dengine+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
         
        else if(dieselI.getSelectedItem().toString().equalsIgnoreCase("D. GEARBOX  (123 €)"))
        {
            miktar=Integer.parseInt(dieselquantity.getText());
            payment=123*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                DieselCar.DGearBox+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
          
        else  if(dieselI.getSelectedItem().toString().equalsIgnoreCase("D. RADIATOR (357 €)"))
        {
            miktar=Integer.parseInt(dieselquantity.getText());
            payment=357*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                DieselCar.DRadiator=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
           
        else  if(dieselI.getSelectedItem().toString().equalsIgnoreCase("D. FUEL         (374€ )"))
        {
            miktar=Integer.parseInt(dieselquantity.getText());
            payment=374*miktar;
            
            if(payment<=MotherMain.totalEuroMoney)
            {
                MotherMain.totalEuroMoney-=payment;
                DieselCar.Dfuel+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
        dieselquantity.setText(null);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
      
                  int miktar;
        double payment;
        
        /*
E. BATTERY (51 $ )
E. ENGINE    (3.450 $ )
E. GEARBOX (520  $ )
E.RADIATOR (373 $ )
E. CHARGE B.(2.620 $ )
        */
     
        
        
        if(electricI.getSelectedItem().toString().equalsIgnoreCase("E. BATTERY (51 $ )"))
        {
            miktar=Integer.parseInt(electricquantitiy.getText());
            payment=51*miktar;
            
            if(payment<=MotherMain.totalDollarMoney)
            {
                MotherMain.totalDollarMoney-=payment;
                ElectricCar.Ebattery+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
        
        else if(electricI.getSelectedItem().toString().equalsIgnoreCase("E. ENGINE    (3.450 $ )"))
        {
            miktar=Integer.parseInt(electricquantitiy.getText());
            payment=3450*miktar;
            
            if(payment<=MotherMain.totalDollarMoney)
            {
                MotherMain.totalDollarMoney-=payment;
                ElectricCar.Eengine+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
         
        else if(electricI.getSelectedItem().toString().equalsIgnoreCase("E. GEARBOX (520  $ )"))
        {
            miktar=Integer.parseInt(electricquantitiy.getText());
            payment=520*miktar;
            
            if(payment<=MotherMain.totalDollarMoney)
            {
                MotherMain.totalDollarMoney-=payment;
                ElectricCar.EGearBox+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
          
        else  if(electricI.getSelectedItem().toString().equalsIgnoreCase("E.RADIATOR (373 $ )"))
        {
            miktar=Integer.parseInt(electricquantitiy.getText());
            payment=373*miktar;
            
            if(payment<=MotherMain.totalDollarMoney)
            {
                MotherMain.totalDollarMoney-=payment;
                ElectricCar.ERadiator=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
           
        else  if(electricI.getSelectedItem().toString().equalsIgnoreCase("E. CHARGE B.(2.620 $ )"))
        {
            miktar=Integer.parseInt(electricquantitiy.getText());
            payment=2620*miktar;
            
            if(payment<=MotherMain.totalDollarMoney)
            {
                MotherMain.totalDollarMoney-=payment;
                ElectricCar.EChargebattery+=miktar;
                JOptionPane.showMessageDialog(this, "materials were successfully purchased");
                
                finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money !");
        
        }
        
        electricquantitiy.setText(null);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*
        Gurkan 3600 TL
Yavuz  1600 TL
Oğuzhan 100 TL
        
        
        
        */
        
        if(ParkingSalary.getSelectedItem().toString().equalsIgnoreCase("Gurkan 3600 TL"))
        {
            if(MotherMain.totalMoney>3600)
            {
                MotherMain.totalMoney-=3600;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
        
        }
        
        else if(ParkingSalary.getSelectedItem().toString().equalsIgnoreCase("Yavuz  1600 TL"))
        {
           if(MotherMain.totalMoney>1600)
            {
                MotherMain.totalMoney-=1600;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
        
        }
        
        else if(ParkingSalary.getSelectedItem().toString().equalsIgnoreCase("Oğuzhan 100 TL"))
        {
           if(MotherMain.totalMoney>100)
            {
                MotherMain.totalMoney-=100;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
        
        }
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      
        /*
        Cihat 3600 TL
Berkan 1600 TL
Aytac 300 TL
        */
        
         if(CleaningSalary.getSelectedItem().toString().equalsIgnoreCase("Cihat 3600 TL"))
        {
            if(MotherMain.totalMoney>3600)
            {
                MotherMain.totalMoney-=3600;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
        
        }
        
        else if(CleaningSalary.getSelectedItem().toString().equalsIgnoreCase("Berkan 1600 TL"))
        {
            if(MotherMain.totalMoney>1600)
            {
                MotherMain.totalMoney-=1600;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
        
        }
        
        else if(CleaningSalary.getSelectedItem().toString().equalsIgnoreCase("Aytac 300 TL"))
        {
            if(MotherMain.totalMoney>300)
            {
                MotherMain.totalMoney-=300;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
        
        }
        
       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void RepairingSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairingSalaryActionPerformed
        
       
        
        
    }//GEN-LAST:event_RepairingSalaryActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed


        if(RepairingSalary.getSelectedItem().toString().equalsIgnoreCase("Murat 10.000 TL"))
        {
            if(MotherMain.totalMoney>10000)
            {
                MotherMain.totalMoney-=10000;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
        
        }
        
        else if(RepairingSalary.getSelectedItem().toString().equalsIgnoreCase("Ali 5600 TL"))
        {
            if(MotherMain.totalMoney>5600)
            {
                MotherMain.totalMoney-=5600;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
        
        }
        
        else if(RepairingSalary.getSelectedItem().toString().equalsIgnoreCase("Mehmet 3.000 TL"))
        {
            if(MotherMain.totalMoney>3000)
            {
                MotherMain.totalMoney-=3000;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
        
        }
        else if(RepairingSalary.getSelectedItem().toString().equalsIgnoreCase("Osman 1600 TL"))
        {
            if(MotherMain.totalMoney>1600)
            {
                MotherMain.totalMoney-=1600;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
        
        }

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         if(MotherMain.totalMoney>31000)
            {
                MotherMain.totalMoney-=31000;
                JOptionPane.showMessageDialog(this, "Payment is Succesfull");
                 finance();
            }
            else
                JOptionPane.showMessageDialog(this, "insufficient money");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        
        MotherMain.totalMoney-=MotherMain.Tax;
        MotherMain.Tax=0;
        finance();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void GeneralquantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeneralquantityMouseClicked
        Generalquantity.setText(null);
    }//GEN-LAST:event_GeneralquantityMouseClicked

    private void gasolinequantityMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gasolinequantityMousePressed
        gasolinequantity.setText(null);
    }//GEN-LAST:event_gasolinequantityMousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultPieDataset pieDataset=new DefaultPieDataset();
        pieDataset.setValue("Lorry = "+Lorry.getTotalLorry(), Lorry.getTotalLorry() );
        pieDataset.setValue("Automobile = "+Jip.getTotalJip(), Jip.getTotalJip());
        pieDataset.setValue("Two-Wheels = "+MotoBycycle.getTotalMoto(), MotoBycycle.getTotalMoto());
        
        
        JFreeChart chart=ChartFactory.createPieChart3D("CARS RATE", pieDataset, true, true, true);
        PiePlot3D p=(PiePlot3D)chart.getPlot();
        //p.setForegroundAlpha(TOP_ALIGNMENT);
        ChartFrame frame=new ChartFrame("Countt",chart);
        frame.setVisible(true);
        frame.setSize(650,700);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void checkWaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWaxActionPerformed
        String s = Double.toString(Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), cbProfession.getSelectedItem().toString(), checkSpecial.isSelected(), checkInterior.isSelected(), checkExterior.isSelected(), checkAuto.isSelected(), checkWax.isSelected()));
        tfPrice.setText(s + " TL");
    }//GEN-LAST:event_checkWaxActionPerformed

    private void checkExteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkExteriorActionPerformed
        if (checkExterior.isSelected()) {
            checkAuto.setSelected(false);
            checkAuto.disable();
            checkInterior.enable();
        }
        else
            checkAuto.disable();
        
        String s = Double.toString(Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), cbProfession.getSelectedItem().toString(), checkSpecial.isSelected(), checkInterior.isSelected(), checkExterior.isSelected(), checkAuto.isSelected(), checkWax.isSelected()));
        tfPrice.setText(s + " TL");
    }//GEN-LAST:event_checkExteriorActionPerformed

    private void btDataParkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDataParkActionPerformed
        REPAIR_CLEANING_PARK data = new REPAIR_CLEANING_PARK();
        data.setVisible(true);
        AddtoTableParking();
        AddtoWash();
    }//GEN-LAST:event_btDataParkActionPerformed

    private void A18mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A18mMouseClicked
        if(p1.getText().equals("") || p2.getText().equalsIgnoreCase("") || p3.getText().equalsIgnoreCase("") || p4.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Please Fill All The Blanks");
        
        else{
               
        if(cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels") || cbVehicleType.getSelectedItem().toString().equalsIgnoreCase("Disabled Car") ){
            if(A18m.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "This Park Place is full!");
        } 
        else {
            A18m.setBackground(java.awt.Color.blue);
            int a=JOptionPane.showConfirmDialog(rootPane, "Do you want to select ?", "Decide", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION) {    
                
                A18m.setBackground(java.awt.Color.red);                
                MotoBycycle p=new MotoBycycle(p4.getText(), p1.getText(), p2.getText(), p3.getText(), (String)p5.getSelectedItem(),(String)p6.getSelectedItem(), "A18m",checkSpecial.isSelected());         
                p.EnteringTime();
                InfoClass.parking.add(p);
                InfoClass.infoCustomer.add(p);
                cbPlate.addItem(p.getID());
                InfoClass.buttons.add(A18m);
                A18m.setSelected(true);
                ClearParking();
               
            }
            else
               A18m.setBackground(java.awt.Color.green); 
        
         }
       }
        else{
            JOptionPane.showMessageDialog(this, "This parking area doesn't match with Vehicle type !");
        }
     }
    }//GEN-LAST:event_A18mMouseClicked

    private void btDataWashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDataWashActionPerformed
        REPAIR_CLEANING_PARK repFrame = new REPAIR_CLEANING_PARK();
        repFrame.setVisible(true);
        AddtoTableParking();
        AddtoWash();

    }//GEN-LAST:event_btDataWashActionPerformed

    private void cbSpecialCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSpecialCondActionPerformed
        if(cbSpecialCond.isSelected() == true){
            String s = Double.toString(Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), cbProfession.getSelectedItem().toString(), true, checkInterior.isSelected(), checkExterior.isSelected(), checkAuto.isSelected(), checkWax.isSelected()));
            tfPrice.setText(s + " TL");
        }
        else
        {
            String s = Double.toString(Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), cbProfession.getSelectedItem().toString(), false, checkInterior.isSelected(), checkExterior.isSelected(), checkAuto.isSelected(), checkWax.isSelected()));
            tfPrice.setText(s + " TL");
        }
    }//GEN-LAST:event_cbSpecialCondActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A10m;
    private javax.swing.JButton A11;
    private javax.swing.JButton A12;
    private javax.swing.JButton A13;
    private javax.swing.JButton A14;
    private javax.swing.JButton A15s;
    private javax.swing.JButton A16s;
    private javax.swing.JButton A17m;
    private javax.swing.JButton A18m;
    private javax.swing.JButton A19m;
    private javax.swing.JButton A2;
    private javax.swing.JButton A20m;
    private javax.swing.JButton A21L;
    private javax.swing.JButton A22L;
    private javax.swing.JButton A23L;
    private javax.swing.JButton A24L;
    private javax.swing.JButton A25L;
    private javax.swing.JButton A26L;
    private javax.swing.JButton A27L;
    private javax.swing.JButton A28L;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7m;
    private javax.swing.JButton A8m;
    private javax.swing.JButton A9m;
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> CleaningSalary;
    private javax.swing.JTextField FDbattery;
    private javax.swing.JTextField FDengine;
    private javax.swing.JTextField FDfuel;
    private javax.swing.JTextField FDgearbox;
    private javax.swing.JTextField FDradiator;
    private javax.swing.JTextField FECharge;
    private javax.swing.JTextField FEbattery;
    private javax.swing.JTextField FEengine;
    private javax.swing.JTextField FEgearbox;
    private javax.swing.JTextField FEradiator;
    private javax.swing.JTextField FGbattery;
    private javax.swing.JTextField FGengine;
    private javax.swing.JTextField FGfuel;
    private javax.swing.JTextField FGgearbox;
    private javax.swing.JTextField FGradiator;
    private javax.swing.JTextField Fheadlight;
    private javax.swing.JTextField Frim;
    private javax.swing.JTextField Fseat;
    private javax.swing.JTextField Ftire;
    private javax.swing.JTextField Fwindow;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Generalquantity;
    private javax.swing.JTextField Model;
    private javax.swing.JTextField Name;
    private javax.swing.JComboBox<String> ParkingSalary;
    private javax.swing.JTextField Plate;
    private javax.swing.JComboBox<String> Profission;
    private javax.swing.JComboBox<String> RepairingSalary;
    private javax.swing.JTextField Surname;
    private javax.swing.JTextField Tc;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JButton add;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b38;
    private javax.swing.JButton b39;
    private javax.swing.JButton b4;
    private javax.swing.JButton b40;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton btDataPark;
    private javax.swing.JButton btDataRep;
    private javax.swing.JButton btDataWash;
    private javax.swing.JButton btInventory;
    private javax.swing.JButton btWash;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton c1;
    private javax.swing.JButton c10;
    private javax.swing.JButton c11;
    private javax.swing.JButton c12;
    private javax.swing.JButton c13;
    private javax.swing.JButton c14;
    private javax.swing.JButton c15;
    private javax.swing.JButton c16;
    private javax.swing.JButton c17;
    private javax.swing.JButton c18;
    private javax.swing.JButton c19;
    private javax.swing.JButton c2;
    private javax.swing.JButton c20;
    private javax.swing.JButton c21;
    private javax.swing.JButton c22;
    private javax.swing.JButton c23;
    private javax.swing.JButton c24;
    private javax.swing.JButton c25;
    private javax.swing.JButton c26;
    private javax.swing.JButton c27;
    private javax.swing.JButton c28;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton c8;
    private javax.swing.JButton c9;
    private javax.swing.JLabel cark;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbPlate;
    private javax.swing.JComboBox<String> cbProfession;
    private javax.swing.JCheckBox cbSpecialCond;
    private javax.swing.JComboBox<String> cbVehType;
    private javax.swing.JComboBox<String> cbVehicleType;
    private javax.swing.JCheckBox checkAuto;
    private javax.swing.JCheckBox checkExterior;
    private javax.swing.JCheckBox checkInterior;
    private javax.swing.JCheckBox checkSpecial;
    private javax.swing.JCheckBox checkWax;
    private javax.swing.JComboBox<String> dieselI;
    private javax.swing.JTextField dieselquantity;
    private javax.swing.JComboBox<String> electricI;
    private javax.swing.JTextField electricquantitiy;
    private javax.swing.JPanel finance;
    private javax.swing.JComboBox<String> gasolineI;
    private javax.swing.JTextField gasolinequantity;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> generalI;
    private javax.swing.JPanel giris;
    private javax.swing.JComboBox<String> ilk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField miktar;
    private javax.swing.JLabel model;
    private javax.swing.JLabel name;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p4;
    private javax.swing.JComboBox<String> p5;
    private javax.swing.JComboBox<String> p6;
    private javax.swing.JPanel parking;
    private javax.swing.JLabel plate;
    private javax.swing.JLabel profission;
    private javax.swing.JButton repairButton;
    private javax.swing.JPanel repairing;
    private javax.swing.JComboBox<String> son;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField tax;
    private javax.swing.JLabel tc;
    private javax.swing.JTextArea tespit;
    private javax.swing.JTextField tfIdentity;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPlate;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfSurname;
    private javax.swing.JLabel type;
    private javax.swing.JLabel type1;
    private javax.swing.JPanel washing;
    // End of variables declaration//GEN-END:variables
}
