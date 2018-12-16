package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Repair.DieselCar;
import Repair.ElectricCar;
import Repair.GasolineCar;
import java.util.Date;
import java.util.TimerTask;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import midtermproject.Cleaning;


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
    boolean CheckInfo=false;
    boolean CheckSearch=false;
    boolean CheckRepair=false;
    
    

    
    public Admin() {
        initComponents();
        
        
        
        
        parking.setVisible(false);
        washing.setVisible(false);
        repairing.setVisible(false);
        giris.setVisible(true);
        buttonSearch.setVisible(false);
        repairButton.setVisible(false);
        CancelButton.setVisible(false);
        cark.setVisible(false);
        
        
        
        
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        parking = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        washing = new javax.swing.JPanel();
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
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
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
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        cark = new javax.swing.JLabel();
        buttonSearch = new javax.swing.JButton();
        repairButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        giris = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

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
        jRadioButton1.setText("1. Floor");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        parking.add(jRadioButton1);
        jRadioButton1.setBounds(190, 250, 73, 25);

        jLayeredPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 4, true));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/1. Floor.jpg"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/2. Floor.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2)
        );

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/0. Floor.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4)
        );

        jLayeredPane2.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        parking.add(jLayeredPane2);
        jLayeredPane2.setBounds(44, 300, 890, 480);

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
        jLabel1.setBounds(980, 230, 90, 20);
        parking.add(jTextField1);
        jTextField1.setBounds(1140, 230, 130, 20);

        jLabel10.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("SURNAME     :");
        parking.add(jLabel10);
        jLabel10.setBounds(980, 260, 142, 20);
        parking.add(jTextField3);
        jTextField3.setBounds(1140, 260, 130, 20);

        jLabel11.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("T.C   :");
        parking.add(jLabel11);
        jLabel11.setBounds(980, 290, 60, 22);
        parking.add(jTextField4);
        jTextField4.setBounds(1140, 290, 130, 20);

        jLabel14.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("PLATE  :");
        parking.add(jLabel14);
        jLabel14.setBounds(980, 320, 100, 22);
        parking.add(jTextField2);
        jTextField2.setBounds(1140, 320, 130, 20);

        jLabel12.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("PROFESSİON :");
        parking.add(jLabel12);
        jLabel12.setBounds(980, 380, 144, 22);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        parking.add(jComboBox2);
        jComboBox2.setBounds(1140, 380, 130, 22);

        jLabel13.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("GENDER        :");
        parking.add(jLabel13);
        jLabel13.setBounds(980, 350, 160, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        parking.add(jComboBox1);
        jComboBox1.setBounds(1140, 350, 130, 22);

        jButton1.setText("jButton1");
        parking.add(jButton1);
        jButton1.setBounds(1190, 420, 79, 25);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/Grafick.gif"))); // NOI18N
        parking.add(jLabel15);
        jLabel15.setBounds(1400, 210, 150, 130);

        jButton2.setText("CUSTOMERS");
        parking.add(jButton2);
        jButton2.setBounds(1410, 100, 110, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/customer.gif"))); // NOI18N
        parking.add(jLabel9);
        jLabel9.setBounds(1340, 20, 230, 180);

        jButton4.setText("Statistics");
        parking.add(jButton4);
        jButton4.setBounds(1420, 350, 110, 25);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/entrance.png"))); // NOI18N
        parking.add(jLabel16);
        jLabel16.setBounds(980, 80, 90, 90);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/exit.png"))); // NOI18N
        parking.add(jLabel17);
        jLabel17.setBounds(1160, 70, 100, 110);

        jButton3.setText("Entrance");
        parking.add(jButton3);
        jButton3.setBounds(980, 190, 90, 25);

        jButton5.setText("Exit");
        parking.add(jButton5);
        jButton5.setBounds(1170, 190, 80, 25);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/car animated.gif"))); // NOI18N
        parking.add(jLabel18);
        jLabel18.setBounds(20, 90, 570, 130);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Admin Pictures/SON PARK TEMA.jpg"))); // NOI18N
        parking.add(jLabel8);
        jLabel8.setBounds(0, 0, 1700, 800);

        getContentPane().add(parking, "card2");

        washing.setLayout(null);

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

        checkExterior.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        checkExterior.setForeground(new java.awt.Color(255, 255, 255));
        checkExterior.setText("EXTERIOR WASHING");
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
        washing.add(checkWax);
        checkWax.setBounds(640, 260, 150, 40);

        cbSpecialCond.setBackground(new java.awt.Color(0, 153, 240));
        cbSpecialCond.setForeground(new java.awt.Color(0, 153, 240));
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

        jButton13.setText("Customers");
        washing.add(jButton13);
        jButton13.setBounds(1240, 170, 93, 25);

        jButton14.setText("Inventory");
        washing.add(jButton14);
        jButton14.setBounds(1460, 250, 87, 25);

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

        Profission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        jButton7.setText("CUSTOMERS");
        repairing.add(jButton7);
        jButton7.setBounds(1310, 140, 110, 25);

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
        add.setBounds(1120, 580, 100, 25);

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
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
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
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        washing.setVisible(false);
        parking.setVisible(false);
        repairing.setVisible(true);
        giris.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        parking.setVisible(false);
        washing.setVisible(true);
        repairing.setVisible(false);
        giris.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        parking.setVisible(true);
        washing.setVisible(false);
        repairing.setVisible(false);
        giris.setVisible(false);

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
                
                 if(RepairType.equalsIgnoreCase("Gasoline"))
             {
                 String ArizaTespit;
                 ArizaTespit=gasolineCar.faultDetection();
                 tespit.setText(ArizaTespit);
                 
                 jProgressBar1.setValue(gasolineCar.getDamage());
                 jProgressBar1.setString("HASAR ORANI %"+gasolineCar.getDamage());
                 
                  JOptionPane.showMessageDialog(this,"hasar tespiti yapildi");
                  CheckSearch=true;
             
             }
             
             else if(RepairType.equalsIgnoreCase("Diesel"))
             {
                  String ArizaTespit;
                 ArizaTespit=dieselCar.faultDetection();
                 tespit.setText(ArizaTespit);
                 
                 jProgressBar1.setValue(dieselCar.getDamage());
                 
                 jProgressBar1.setString("HASAR ORANI %"+dieselCar.getDamage());
                 
                  JOptionPane.showMessageDialog(this,"hasar tespiti yapildi");
                  CheckSearch=true;
                 
             }
             
             else if(RepairType.equalsIgnoreCase("Electric"))
             {
                    String ArizaTespit;
                 ArizaTespit=electricCar.faultDetection();
                 tespit.setText(ArizaTespit);
                 
                 jProgressBar1.setValue(electricCar.getDamage());
                 
                 
                 jProgressBar1.setString("HASAR ORANI %"+electricCar.getDamage());
                 
                  JOptionPane.showMessageDialog(this,"hasar tespiti yapildi");
                  CheckSearch=true;
                 
             
             }
             
             else
             {
                 JOptionPane.showMessageDialog(this,"motor tipi tespit edilemedi");
             }
                 repairButton.setVisible(true);
                 CancelButton.setVisible(true);
                 buttonSearch.setVisible(false);
                 
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

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here: 
        REPAIR_CLEANING_PARK a=new REPAIR_CLEANING_PARK();
        a.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        String name,surname,tc,gender,profession,model,id;
        
        name=Name.getText();
        surname=Surname.getText();
        tc=Tc.getText();
        id=Plate.getText();
        gender=Gender.getSelectedItem().toString();
        profession=Profission.getSelectedItem().toString();
        model=Model.getText();
        RepairType=Type.getSelectedItem().toString();
        CheckInfo=true;
        
        if(name.equals("") || surname.equals("") || tc.equals("") || model.equals(""))
        {
            
            JOptionPane.showMessageDialog(this,"There is a Empty Information !!!");
            CheckInfo=false;
        
        }
        else
        {
            if(RepairType.equalsIgnoreCase("Gasoline"))
            {
                gasolineCar=new GasolineCar(name,surname,tc,gender,profession,model,id);
                InfoClass.add(gasolineCar);
                
                
            }
            else if (RepairType.equalsIgnoreCase("Electric"))
            {
                electricCar=new ElectricCar(name,surname,tc,gender,profession,model,id);
                InfoClass.add(electricCar);
            
            }
            else if (RepairType.equalsIgnoreCase("Diesel"))
            {
               
                dieselCar=new DieselCar(name,surname,tc,gender,profession,model,id);
                InfoClass.add(dieselCar);
            
            }
            else
            {
                JOptionPane.showMessageDialog(this,"There is a wrong some thing!!!");
            }
                CheckInfo=true;
            JOptionPane.showMessageDialog(this,"kayit tamamlandı aracı garaja sokup hasar tespiti yapabilirsiniz.");
            
            buttonSearch.setVisible(true);
            repairButton.setVisible(false);
            CancelButton.setVisible(false);
            cark.setVisible(true);
            tespit.setText("\n\n\n\n\tLÜTFEN ARACI GARAJA YÖNLENDİRİNİZ ");
            
            
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
                                ClearRepair();
                            }
                              
                                else
                             {
                                tespit.setText(gasolineCar.Empty_Material);
                               
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
                                ClearRepair();
                            }
                              
                                else
                             {
                                tespit.setText(dieselCar.Empty_Material);
                                
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
                                ClearRepair();
                            }
                              
                                else
                             {
                                tespit.setText(electricCar.Empty_Material);
                                
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
                    if(Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), cbProfession.getSelectedItem().toString(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected() )== 0){
                        JOptionPane.showMessageDialog(this, "Please Select at least one of services!");
                    }
                    else
                    {

                        page = JOptionPane.showConfirmDialog(null,"PRICE : "+ Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), cbProfession.getSelectedItem().toString(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected()) + "\n Would You like to Wash your Vehicle ?","Wash",JOptionPane.YES_NO_OPTION);
        
                        if(page == JOptionPane.YES_OPTION){
                            Cleaning clean = new Cleaning(tfPlate.getText(), tfName.getText(), tfSurname.getText(), tfIdentity.getText(), cbProfession.getSelectedItem().toString(), cbGender.getSelectedItem().toString());
                            Cleaning.AddtoCase();
                            InfoClass.infoCustomer.add(clean);

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
                    if(Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), cbProfession.getSelectedItem().toString(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected() )== 0){
                        JOptionPane.showMessageDialog(this, "Please Select at least one of services!");
                    }
                    else
                    {

                        page = JOptionPane.showConfirmDialog(null,"PRICE : "+ Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), cbProfession.getSelectedItem().toString(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected()) + "\n Would You like to Wash your Vehicle ?","Wash",JOptionPane.YES_NO_OPTION);
        
                        if(page == JOptionPane.YES_OPTION){
                            Cleaning clean = new Cleaning(tfPlate.getText(), tfName.getText(), tfSurname.getText(), tfIdentity.getText(), cbProfession.getSelectedItem().toString(), cbGender.getSelectedItem().toString());
                            Cleaning.AddtoCase();
                            InfoClass.infoCustomer.add(clean);

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
                
                if(Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), cbProfession.getSelectedItem().toString(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected() )== 0){
                        JOptionPane.showMessageDialog(this, "Please Select at least one of services!");
                    }
                
                 else
                    {
                        page = JOptionPane.showConfirmDialog(null,"PRICE : "+ Cleaning.DecidePriceAccordingtoCarType(cbVehType.getSelectedItem().toString(), cbProfession.getSelectedItem().toString(),cbSpecialCond.isSelected(),checkInterior.isSelected(), checkExterior.isSelected(),checkAuto.isSelected(), checkWax.isSelected()) + "\n Would You like to Wash your Vehicle ?","Wash",JOptionPane.YES_NO_OPTION);
        
                        if(page == JOptionPane.YES_OPTION)
                        {
                            Cleaning clean = new Cleaning(tfPlate.getText(), tfName.getText(), tfSurname.getText(), tfIdentity.getText(), cbProfession.getSelectedItem().toString(), cbGender.getSelectedItem().toString());
                            Cleaning.AddtoCase();
                            InfoClass.infoCustomer.add(clean);

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
            
        
    }//GEN-LAST:event_checkAutoActionPerformed

    private void checkInteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInteriorActionPerformed
        if (checkInterior.isSelected()) {
            checkAuto.setSelected(false);
            checkAuto.disable();
            checkExterior.enable();
        }
        else
            checkAuto.disable();
    }//GEN-LAST:event_checkInteriorActionPerformed

    private void cbVehTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVehTypeActionPerformed
        if(cbVehType.getSelectedItem().toString().equalsIgnoreCase("Two-Wheels"))
        {
            checkExterior.disable();
            checkExterior.setVisible(false);
            
            checkInterior.disable();
            checkInterior.setVisible(false);
        }
    }//GEN-LAST:event_cbVehTypeActionPerformed

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
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Model;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Plate;
    private javax.swing.JComboBox<String> Profission;
    private javax.swing.JTextField Surname;
    private javax.swing.JTextField Tc;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JButton add;
    private javax.swing.JButton btWash;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel cark;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbProfession;
    private javax.swing.JCheckBox cbSpecialCond;
    private javax.swing.JComboBox<String> cbVehType;
    private javax.swing.JCheckBox checkAuto;
    private javax.swing.JCheckBox checkExterior;
    private javax.swing.JCheckBox checkInterior;
    private javax.swing.JCheckBox checkWax;
    private javax.swing.JLabel gender;
    private javax.swing.JPanel giris;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel model;
    private javax.swing.JLabel name;
    private javax.swing.JPanel parking;
    private javax.swing.JLabel plate;
    private javax.swing.JLabel profission;
    private javax.swing.JButton repairButton;
    private javax.swing.JPanel repairing;
    private javax.swing.JLabel surname;
    private javax.swing.JLabel tc;
    private javax.swing.JTextArea tespit;
    private javax.swing.JTextField tfIdentity;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPlate;
    private javax.swing.JTextField tfSurname;
    private javax.swing.JLabel type;
    private javax.swing.JPanel washing;
    // End of variables declaration//GEN-END:variables
}
