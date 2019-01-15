
package GUI;

import Clean.Cleaning;
import javax.swing.table.DefaultTableModel;
import Park.Parking;
import Park.MotoBycycle;
import Park.Jip;
import Park.Lorry;
import Repair.*;
import javax.swing.JTable;
import javax.swing.JTextField;




public class REPAIR_CLEANING_PARK extends javax.swing.JFrame {

    
    public REPAIR_CLEANING_PARK() {
        initComponents();
        CarPane.setVisible(false);
        MotoPane.setVisible(false);
        LorryPane.setVisible(false);
        
        CleanCarPane.setVisible(false);
        CleanLorryPane.setVisible(false);
        CleanMotoPane.setVisible(false);
        
        
        ParkingAllPane.setVisible(false);
        CleanAllPane.setVisible(false);
        RepAllPane.setVisible(false);
        
        CleanSearchPane.setVisible(false);
        SearchPaneRep.setVisible(false);
        SearchParkingPane.setVisible(false);
        //ParkingTableCar.setOpaque(false);
        
        for (int i = 0; i < InfoClass.infoCustomer.size(); i++){
            if(InfoClass.infoCustomer.get(i) instanceof Cleaning)
                cbPlateClean.addItem(InfoClass.infoCustomer.get(i).getID());
            
            else if(InfoClass.infoCustomer.get(i) instanceof Parking)
                cbPlatePark.addItem(InfoClass.infoCustomer.get(i).getID());
            
            else
                cbPlateRep.addItem(InfoClass.infoCustomer.get(i).getID());
        }
                
    
 
            
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelParking = new javax.swing.JPanel();
        Car = new javax.swing.JLabel();
        Lorry = new javax.swing.JLabel();
        Moto = new javax.swing.JLabel();
        CarPane = new javax.swing.JScrollPane();
        ParkingTableCar = new javax.swing.JTable();
        LorryPane = new javax.swing.JScrollPane();
        ParkingTableLorry = new javax.swing.JTable();
        MotoPane = new javax.swing.JScrollPane();
        ParkingTableCycle = new javax.swing.JTable();
        ParkingAllPane = new javax.swing.JScrollPane();
        ParkingTableAll = new javax.swing.JTable();
        SearchParkingPane = new javax.swing.JScrollPane();
        SearchParkingTable = new javax.swing.JTable();
        btTotalEarnPark = new javax.swing.JButton();
        tfTotalEarnings = new javax.swing.JTextField();
        btAdvPark = new javax.swing.JButton();
        btAllParking = new javax.swing.JButton();
        btSearchDataPark = new javax.swing.JButton();
        cbPlatePark = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Suggestpark = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        PanelCleaning = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        WashCar = new javax.swing.JLabel();
        WashLorry = new javax.swing.JLabel();
        WashMoto = new javax.swing.JLabel();
        CleanAllPane = new javax.swing.JScrollPane();
        CleanAllTable = new javax.swing.JTable();
        CleanCarPane = new javax.swing.JScrollPane();
        CleanCarTable = new javax.swing.JTable();
        CleanLorryPane = new javax.swing.JScrollPane();
        CleanLorryTable = new javax.swing.JTable();
        CleanMotoPane = new javax.swing.JScrollPane();
        CleanMotoTable = new javax.swing.JTable();
        CleanSearchPane = new javax.swing.JScrollPane();
        CleanSearchTable = new javax.swing.JTable();
        btAdvClean = new javax.swing.JButton();
        tfTotalEarnClean = new javax.swing.JTextField();
        btTotalEarnClean = new javax.swing.JButton();
        btAllClean = new javax.swing.JButton();
        cbPlateClean = new javax.swing.JComboBox<>();
        btSearchDataClean = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taSuggestionClean = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        PanelRepair = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RepAllPane = new javax.swing.JScrollPane();
        RepAllTable = new javax.swing.JTable();
        SearchPaneRep = new javax.swing.JScrollPane();
        SearchTableRep = new javax.swing.JTable();
        btAdvRepElc = new javax.swing.JButton();
        btAdvRepDis = new javax.swing.JButton();
        btAdvRepGas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        taSuggestionRep = new javax.swing.JTextArea();
        tfTotalEarnRep = new javax.swing.JTextField();
        btTotalEarnRep = new javax.swing.JButton();
        btAllRep = new javax.swing.JButton();
        cbPlateRep = new javax.swing.JComboBox<>();
        btSearchDataRep = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        PanelAll = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        AllPane = new javax.swing.JScrollPane();
        AllTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jTabbedPane1.setFont(new java.awt.Font("Mongolian Baiti", 0, 30)); // NOI18N

        PanelParking.setLayout(null);

        Car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CarIcon.png"))); // NOI18N
        Car.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarMouseClicked(evt);
            }
        });
        PanelParking.add(Car);
        Car.setBounds(40, 10, 200, 120);

        Lorry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/truck.png"))); // NOI18N
        Lorry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LorryMouseClicked(evt);
            }
        });
        PanelParking.add(Lorry);
        Lorry.setBounds(300, 20, 210, 110);

        Moto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/two-wheels.png"))); // NOI18N
        Moto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MotoMouseClicked(evt);
            }
        });
        PanelParking.add(Moto);
        Moto.setBounds(570, 10, 200, 120);

        ParkingTableCar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ParkingTableCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "Name", "Surname", "Gender", "Profession", "Identity No", "Parking Area", "Entering Time", "Exiting Time", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CarPane.setViewportView(ParkingTableCar);
        if (ParkingTableCar.getColumnModel().getColumnCount() > 0) {
            ParkingTableCar.getColumnModel().getColumn(5).setPreferredWidth(100);
            ParkingTableCar.getColumnModel().getColumn(6).setResizable(false);
        }

        PanelParking.add(CarPane);
        CarPane.setBounds(0, 140, 1170, 400);

        ParkingTableLorry.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ParkingTableLorry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "PROFESSION", "IDENTITY NO", "Parking Area", "ENTERING TIME", "EXITING TIME", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LorryPane.setViewportView(ParkingTableLorry);
        if (ParkingTableLorry.getColumnModel().getColumnCount() > 0) {
            ParkingTableLorry.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        PanelParking.add(LorryPane);
        LorryPane.setBounds(0, 140, 1170, 402);

        ParkingTableCycle.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ParkingTableCycle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "PROFESSION", "IDENTITY NO", "Parking Area", "ENTERING TIME", "EXITING TIME", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MotoPane.setViewportView(ParkingTableCycle);
        if (ParkingTableCycle.getColumnModel().getColumnCount() > 0) {
            ParkingTableCycle.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        PanelParking.add(MotoPane);
        MotoPane.setBounds(0, 140, 1170, 402);

        ParkingTableAll.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ParkingTableAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "PROFESSION", "IDENTITY NO", "TYPE OF VEHICLE", "Parking Area", "ENTERING TIME", "EXITING TIME", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ParkingAllPane.setViewportView(ParkingTableAll);
        if (ParkingTableAll.getColumnModel().getColumnCount() > 0) {
            ParkingTableAll.getColumnModel().getColumn(5).setPreferredWidth(100);
            ParkingTableAll.getColumnModel().getColumn(6).setPreferredWidth(95);
            ParkingTableAll.getColumnModel().getColumn(8).setPreferredWidth(80);
        }

        PanelParking.add(ParkingAllPane);
        ParkingAllPane.setBounds(0, 140, 1170, 402);

        SearchParkingTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        SearchParkingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "PROFESSION", "IDENTITY NO", "TYPE OF VEHICLE", "Parking Area", "ENTERING TIME", "EXITING TIME", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SearchParkingPane.setViewportView(SearchParkingTable);
        if (SearchParkingTable.getColumnModel().getColumnCount() > 0) {
            SearchParkingTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            SearchParkingTable.getColumnModel().getColumn(6).setPreferredWidth(95);
            SearchParkingTable.getColumnModel().getColumn(8).setPreferredWidth(80);
        }

        PanelParking.add(SearchParkingPane);
        SearchParkingPane.setBounds(0, 140, 1170, 402);

        btTotalEarnPark.setBackground(new java.awt.Color(0, 51, 204));
        btTotalEarnPark.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        btTotalEarnPark.setForeground(new java.awt.Color(255, 255, 255));
        btTotalEarnPark.setText("Total Earnings ");
        btTotalEarnPark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTotalEarnParkActionPerformed(evt);
            }
        });
        PanelParking.add(btTotalEarnPark);
        btTotalEarnPark.setBounds(30, 560, 200, 60);

        tfTotalEarnings.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        PanelParking.add(tfTotalEarnings);
        tfTotalEarnings.setBounds(280, 560, 230, 60);

        btAdvPark.setBackground(new java.awt.Color(0, 51, 204));
        btAdvPark.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        btAdvPark.setForeground(new java.awt.Color(255, 255, 255));
        btAdvPark.setText("Suggestion for Adv.");
        btAdvPark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdvParkActionPerformed(evt);
            }
        });
        PanelParking.add(btAdvPark);
        btAdvPark.setBounds(600, 560, 200, 60);

        btAllParking.setBackground(new java.awt.Color(51, 0, 204));
        btAllParking.setFont(new java.awt.Font("Yu Gothic Medium", 0, 40)); // NOI18N
        btAllParking.setForeground(new java.awt.Color(255, 255, 255));
        btAllParking.setText("ALL");
        btAllParking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAllParkingActionPerformed(evt);
            }
        });
        PanelParking.add(btAllParking);
        btAllParking.setBounds(890, 10, 210, 50);

        btSearchDataPark.setBackground(new java.awt.Color(51, 0, 204));
        btSearchDataPark.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        btSearchDataPark.setText("SEARCH DATA");
        btSearchDataPark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchDataParkActionPerformed(evt);
            }
        });
        PanelParking.add(btSearchDataPark);
        btSearchDataPark.setBounds(800, 70, 210, 40);

        cbPlatePark.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PanelParking.add(cbPlatePark);
        cbPlatePark.setBounds(1020, 70, 130, 40);

        Suggestpark.setEditable(false);
        Suggestpark.setColumns(20);
        Suggestpark.setRows(5);
        jScrollPane1.setViewportView(Suggestpark);

        PanelParking.add(jScrollPane1);
        jScrollPane1.setBounds(850, 560, 300, 66);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CarPark.jpg"))); // NOI18N
        PanelParking.add(jLabel1);
        jLabel1.setBounds(0, 0, 1176, 650);

        jTabbedPane1.addTab("PARKING", PanelParking);

        jPanel1.setLayout(null);

        WashCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/carWash.png"))); // NOI18N
        WashCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WashCarMouseClicked(evt);
            }
        });
        jPanel1.add(WashCar);
        WashCar.setBounds(60, 0, 180, 140);

        WashLorry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LorryWash.png"))); // NOI18N
        WashLorry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WashLorryMouseClicked(evt);
            }
        });
        jPanel1.add(WashLorry);
        WashLorry.setBounds(300, 40, 210, 100);

        WashMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/motoWash.png"))); // NOI18N
        WashMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WashMotoMouseClicked(evt);
            }
        });
        jPanel1.add(WashMoto);
        WashMoto.setBounds(590, 40, 190, 100);

        CleanAllTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "IDENTITY NO", "PROFESSION", "TYPE OF WASHING", "TYPE OF VEHICLE", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CleanAllPane.setViewportView(CleanAllTable);
        if (CleanAllTable.getColumnModel().getColumnCount() > 0) {
            CleanAllTable.getColumnModel().getColumn(6).setPreferredWidth(140);
            CleanAllTable.getColumnModel().getColumn(8).setPreferredWidth(70);
        }

        jPanel1.add(CleanAllPane);
        CleanAllPane.setBounds(0, 150, 1170, 380);

        CleanCarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "IDENTITY NO", "PROFESSION", "TYPE OF WASHING", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CleanCarPane.setViewportView(CleanCarTable);
        if (CleanCarTable.getColumnModel().getColumnCount() > 0) {
            CleanCarTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        jPanel1.add(CleanCarPane);
        CleanCarPane.setBounds(0, 150, 1170, 380);

        CleanLorryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "IDENTITY NO", "PROFESSION", "TYPE OF WASHING", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CleanLorryPane.setViewportView(CleanLorryTable);
        if (CleanLorryTable.getColumnModel().getColumnCount() > 0) {
            CleanLorryTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        jPanel1.add(CleanLorryPane);
        CleanLorryPane.setBounds(0, 150, 1170, 380);

        CleanMotoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "IDENTITY NO", "PROFESSION", "TYPE OF WASHING", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CleanMotoPane.setViewportView(CleanMotoTable);
        if (CleanMotoTable.getColumnModel().getColumnCount() > 0) {
            CleanMotoTable.getColumnModel().getColumn(6).setMinWidth(150);
        }

        jPanel1.add(CleanMotoPane);
        CleanMotoPane.setBounds(0, 150, 1170, 380);

        CleanSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "IDENTITY NO", "PROFESSION", "TYPE OF WASHING", "TYPE OF VEHICLE", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CleanSearchPane.setViewportView(CleanSearchTable);
        if (CleanSearchTable.getColumnModel().getColumnCount() > 0) {
            CleanSearchTable.getColumnModel().getColumn(6).setPreferredWidth(140);
            CleanSearchTable.getColumnModel().getColumn(8).setPreferredWidth(70);
        }

        jPanel1.add(CleanSearchPane);
        CleanSearchPane.setBounds(0, 150, 1170, 380);

        btAdvClean.setBackground(new java.awt.Color(0, 51, 204));
        btAdvClean.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        btAdvClean.setForeground(new java.awt.Color(255, 255, 255));
        btAdvClean.setText("Suggestion for Adv.");
        btAdvClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdvCleanActionPerformed(evt);
            }
        });
        jPanel1.add(btAdvClean);
        btAdvClean.setBounds(600, 560, 200, 60);

        tfTotalEarnClean.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jPanel1.add(tfTotalEarnClean);
        tfTotalEarnClean.setBounds(280, 560, 230, 60);

        btTotalEarnClean.setBackground(new java.awt.Color(0, 51, 204));
        btTotalEarnClean.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        btTotalEarnClean.setForeground(new java.awt.Color(255, 255, 255));
        btTotalEarnClean.setText("Total Earnings ");
        btTotalEarnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTotalEarnCleanActionPerformed(evt);
            }
        });
        jPanel1.add(btTotalEarnClean);
        btTotalEarnClean.setBounds(30, 560, 200, 60);

        btAllClean.setBackground(new java.awt.Color(51, 0, 204));
        btAllClean.setFont(new java.awt.Font("Yu Gothic Medium", 0, 40)); // NOI18N
        btAllClean.setForeground(new java.awt.Color(255, 255, 255));
        btAllClean.setText("ALL");
        btAllClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAllCleanActionPerformed(evt);
            }
        });
        jPanel1.add(btAllClean);
        btAllClean.setBounds(890, 10, 210, 50);

        cbPlateClean.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(cbPlateClean);
        cbPlateClean.setBounds(1020, 70, 130, 40);

        btSearchDataClean.setBackground(new java.awt.Color(51, 0, 204));
        btSearchDataClean.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        btSearchDataClean.setText("SEARCH DATA");
        btSearchDataClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchDataCleanActionPerformed(evt);
            }
        });
        jPanel1.add(btSearchDataClean);
        btSearchDataClean.setBounds(800, 70, 210, 40);

        taSuggestionClean.setColumns(20);
        taSuggestionClean.setRows(5);
        jScrollPane2.setViewportView(taSuggestionClean);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(860, 560, 280, 66);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/washing_01_1500_31.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1170, 650);

        javax.swing.GroupLayout PanelCleaningLayout = new javax.swing.GroupLayout(PanelCleaning);
        PanelCleaning.setLayout(PanelCleaningLayout);
        PanelCleaningLayout.setHorizontalGroup(
            PanelCleaningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelCleaningLayout.setVerticalGroup(
            PanelCleaningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CLEANING", PanelCleaning);

        jPanel3.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/repCar.png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(60, 20, 180, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/repLorry.png"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(320, 10, 180, 140);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 204));
        jLabel20.setText("Suggestion for Adv.");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(620, 540, 200, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/repMoto.png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(560, 30, 190, 110);

        RepAllTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "IDENTITY NO", "PROFESSION", "CAR MODEL", "ENGINE TYPE", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RepAllPane.setViewportView(RepAllTable);

        jPanel3.add(RepAllPane);
        RepAllPane.setBounds(0, 150, 1170, 402);

        SearchTableRep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATE", "NAME", "SURNAME", "GENDER", "IDENTITY NO", "PROFESSION", "CAR MODEL", "ENGINE TYPE", "FAULT DETECTION", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SearchPaneRep.setViewportView(SearchTableRep);
        if (SearchTableRep.getColumnModel().getColumnCount() > 0) {
            SearchTableRep.getColumnModel().getColumn(8).setPreferredWidth(90);
        }

        jPanel3.add(SearchPaneRep);
        SearchPaneRep.setBounds(0, 150, 1170, 402);

        btAdvRepElc.setBackground(new java.awt.Color(0, 51, 204));
        btAdvRepElc.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        btAdvRepElc.setForeground(new java.awt.Color(255, 255, 255));
        btAdvRepElc.setText("Electric C.");
        btAdvRepElc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdvRepElcActionPerformed(evt);
            }
        });
        jPanel3.add(btAdvRepElc);
        btAdvRepElc.setBounds(660, 570, 110, 30);

        btAdvRepDis.setBackground(new java.awt.Color(0, 51, 204));
        btAdvRepDis.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        btAdvRepDis.setForeground(new java.awt.Color(255, 255, 255));
        btAdvRepDis.setText("Diesel C.");
        btAdvRepDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdvRepDisActionPerformed(evt);
            }
        });
        jPanel3.add(btAdvRepDis);
        btAdvRepDis.setBounds(610, 610, 100, 30);

        btAdvRepGas.setBackground(new java.awt.Color(0, 51, 204));
        btAdvRepGas.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        btAdvRepGas.setForeground(new java.awt.Color(255, 255, 255));
        btAdvRepGas.setText("Gasoline C.");
        btAdvRepGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdvRepGasActionPerformed(evt);
            }
        });
        jPanel3.add(btAdvRepGas);
        btAdvRepGas.setBounds(720, 610, 120, 30);

        taSuggestionRep.setColumns(20);
        taSuggestionRep.setRows(5);
        jScrollPane3.setViewportView(taSuggestionRep);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(870, 560, 270, 70);

        tfTotalEarnRep.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jPanel3.add(tfTotalEarnRep);
        tfTotalEarnRep.setBounds(280, 560, 230, 60);

        btTotalEarnRep.setBackground(new java.awt.Color(0, 51, 204));
        btTotalEarnRep.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        btTotalEarnRep.setForeground(new java.awt.Color(255, 255, 255));
        btTotalEarnRep.setText("Total Earnings ");
        btTotalEarnRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTotalEarnRepActionPerformed(evt);
            }
        });
        jPanel3.add(btTotalEarnRep);
        btTotalEarnRep.setBounds(30, 560, 200, 60);

        btAllRep.setBackground(new java.awt.Color(51, 0, 204));
        btAllRep.setFont(new java.awt.Font("Yu Gothic Medium", 0, 40)); // NOI18N
        btAllRep.setForeground(new java.awt.Color(255, 255, 255));
        btAllRep.setText("SHOW");
        btAllRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAllRepActionPerformed(evt);
            }
        });
        jPanel3.add(btAllRep);
        btAllRep.setBounds(890, 10, 210, 50);

        cbPlateRep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel3.add(cbPlateRep);
        cbPlateRep.setBounds(1020, 70, 130, 40);

        btSearchDataRep.setBackground(new java.awt.Color(51, 0, 204));
        btSearchDataRep.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        btSearchDataRep.setText("SEARCH DATA");
        btSearchDataRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchDataRepActionPerformed(evt);
            }
        });
        jPanel3.add(btSearchDataRep);
        btSearchDataRep.setBounds(800, 70, 210, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/repBack.jpg"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 0, 1170, 650);

        javax.swing.GroupLayout PanelRepairLayout = new javax.swing.GroupLayout(PanelRepair);
        PanelRepair.setLayout(PanelRepairLayout);
        PanelRepairLayout.setHorizontalGroup(
            PanelRepairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelRepairLayout.setVerticalGroup(
            PanelRepairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("REPAIRING", PanelRepair);

        PanelAll.setPreferredSize(new java.awt.Dimension(1170, 650));
        PanelAll.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ducati-corse.png"))); // NOI18N
        PanelAll.add(jLabel9);
        jLabel9.setBounds(0, 0, 190, 170);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Tesla_Icon.png"))); // NOI18N
        PanelAll.add(jLabel8);
        jLabel8.setBounds(190, 40, 200, 90);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mini_cooper.png"))); // NOI18N
        PanelAll.add(jLabel10);
        jLabel10.setBounds(800, 550, 170, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kawasaki-logo.jpg"))); // NOI18N
        PanelAll.add(jLabel11);
        jLabel11.setBounds(560, 10, 200, 130);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mercedes_Icon.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        PanelAll.add(jLabel12);
        jLabel12.setBounds(750, 0, 190, 160);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/honda_ıcon.jpg"))); // NOI18N
        PanelAll.add(jLabel13);
        jLabel13.setBounds(960, 10, 200, 130);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/opel.png"))); // NOI18N
        PanelAll.add(jLabel15);
        jLabel15.setBounds(350, 530, 140, 110);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CİTROEN.png"))); // NOI18N
        PanelAll.add(jLabel16);
        jLabel16.setBounds(500, 540, 140, 110);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/harley.png"))); // NOI18N
        PanelAll.add(jLabel17);
        jLabel17.setBounds(210, 520, 150, 120);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kia.png"))); // NOI18N
        PanelAll.add(jLabel18);
        jLabel18.setBounds(650, 540, 140, 90);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ktm (1).png"))); // NOI18N
        PanelAll.add(jLabel14);
        jLabel14.setBounds(30, 520, 120, 120);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SUZUKI_120.png"))); // NOI18N
        PanelAll.add(jLabel19);
        jLabel19.setBounds(410, 20, 140, 110);

        jButton1.setBackground(new java.awt.Color(255, 0, 15));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton1.setText("DOCUMENTORY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelAll.add(jButton1);
        jButton1.setBounds(990, 550, 170, 70);

        AllTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plate", "Name", "Surname", "Gender", "IDENTITY NO", "PROFESSION", "ENTERING T.", "EXITING T.", "TYPE OF VEH.", "CAR MODEL", "ENGINE TYPE", "TYPE OF WASH.", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllPane.setViewportView(AllTable);
        if (AllTable.getColumnModel().getColumnCount() > 0) {
            AllTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            AllTable.getColumnModel().getColumn(1).setPreferredWidth(65);
            AllTable.getColumnModel().getColumn(2).setPreferredWidth(65);
            AllTable.getColumnModel().getColumn(3).setPreferredWidth(55);
            AllTable.getColumnModel().getColumn(4).setPreferredWidth(80);
            AllTable.getColumnModel().getColumn(5).setPreferredWidth(78);
            AllTable.getColumnModel().getColumn(6).setPreferredWidth(87);
            AllTable.getColumnModel().getColumn(7).setPreferredWidth(75);
            AllTable.getColumnModel().getColumn(8).setPreferredWidth(95);
            AllTable.getColumnModel().getColumn(9).setPreferredWidth(70);
            AllTable.getColumnModel().getColumn(11).setPreferredWidth(89);
            AllTable.getColumnModel().getColumn(12).setPreferredWidth(65);
        }

        PanelAll.add(AllPane);
        AllPane.setBounds(0, 170, 1170, 360);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        PanelAll.add(jLabel2);
        jLabel2.setBounds(10, 0, 1170, 650);

        jTabbedPane1.addTab("ALL", PanelAll);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WashCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WashCarMouseClicked
        CleanCarPane.setVisible(true);
        CleanLorryPane.setVisible(false);
        CleanMotoPane.setVisible(false);
        CleanAllPane.setVisible(false);
        CleanSearchPane.setVisible(false);
    }//GEN-LAST:event_WashCarMouseClicked

    private void WashLorryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WashLorryMouseClicked
        CleanCarPane.setVisible(false);
        CleanLorryPane.setVisible(true);
        CleanMotoPane.setVisible(false);
        CleanAllPane.setVisible(false);
        CleanSearchPane.setVisible(false);
    }//GEN-LAST:event_WashLorryMouseClicked

    private void WashMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WashMotoMouseClicked
        CleanCarPane.setVisible(false);
        CleanLorryPane.setVisible(false);
        CleanMotoPane.setVisible(true);
        CleanAllPane.setVisible(false);
        CleanSearchPane.setVisible(false);
    }//GEN-LAST:event_WashMotoMouseClicked

    private void btAllRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllRepActionPerformed
        RepAllPane.setVisible(true);
        SearchPaneRep.setVisible(false);
    }//GEN-LAST:event_btAllRepActionPerformed

    private void btAllCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllCleanActionPerformed
        CleanAllPane.setVisible(true);
        CleanCarPane.setVisible(false);
        CleanLorryPane.setVisible(false);
        CleanMotoPane.setVisible(false);
        CleanSearchPane.setVisible(false);
    }//GEN-LAST:event_btAllCleanActionPerformed

    private void btAllParkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllParkingActionPerformed
        ParkingAllPane.setVisible(true);
        CarPane.setVisible(false);
        MotoPane.setVisible(false);
        LorryPane.setVisible(false);
        SearchParkingPane.setVisible(false);
        
    }//GEN-LAST:event_btAllParkingActionPerformed

    private void CarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarMouseClicked
        ParkingAllPane.setVisible(false);
        CarPane.setVisible(true);
        MotoPane.setVisible(false);
        LorryPane.setVisible(false);
        SearchParkingPane.setVisible(false);
    }//GEN-LAST:event_CarMouseClicked

    private void LorryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LorryMouseClicked
        ParkingAllPane.setVisible(false);
        CarPane.setVisible(false);
        MotoPane.setVisible(false);
        LorryPane.setVisible(true);
        SearchParkingPane.setVisible(false);
    }//GEN-LAST:event_LorryMouseClicked

    private void MotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotoMouseClicked
        ParkingAllPane.setVisible(false);
        CarPane.setVisible(false);
        MotoPane.setVisible(true);
        LorryPane.setVisible(false);
        SearchParkingPane.setVisible(false);
    }//GEN-LAST:event_MotoMouseClicked

    private void btTotalEarnParkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTotalEarnParkActionPerformed
        double sum = 0.0;
        int i;
        
        if(CarPane.isShowing()){
            for (i = 0; i < InfoClass.infoCustomer.size(); i++){                
                if(InfoClass.infoCustomer.get(i) instanceof Jip){
                    Jip j = (Jip) InfoClass.infoCustomer.get(i);
                
                    sum += j.CurrentMoney();
            }}
            tfTotalEarnings.setText(Double.toString(sum));
        }
                
          else if(LorryPane.isShowing()){
            for (i = 0; i < InfoClass.infoCustomer.size(); i++){
                
                if(InfoClass.infoCustomer.get(i) instanceof Lorry){
                    Lorry L = (Lorry) InfoClass.infoCustomer.get(i);
                    sum += L.CurrentMoney();
                }
                    
            }
            tfTotalEarnings.setText(Double.toString(sum));
          }
                    
          else if(MotoPane.isShowing()){
            for (i = 0; i < InfoClass.infoCustomer.size(); i++){
                
                if(InfoClass.infoCustomer.get(i) instanceof MotoBycycle){
                    MotoBycycle M = (MotoBycycle) InfoClass.infoCustomer.get(i);
                    sum += M.CurrentMoney();
                }
                    
            }
            tfTotalEarnings.setText(Double.toString(sum));
          }
        
          else{
            for (i = 0; i < InfoClass.infoCustomer.size(); i++){
                if (InfoClass.infoCustomer.get(i) instanceof Parking) {               
               
                 Parking p = (Parking)InfoClass.infoCustomer.get(i);
                 sum += p.getPrice();
             }
            }
            tfTotalEarnings.setText(Double.toString(sum));
          }
        
        sum = 0.0;
    }//GEN-LAST:event_btTotalEarnParkActionPerformed

    private void btTotalEarnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTotalEarnCleanActionPerformed
        double sumCar = 0, sumLorry = 0, sumMoto = 0, sumAll = 0;
        int i;
          if(CleanCarTable.isShowing() == true && CleanAllTable.isShowing() == false && CleanLorryTable.isShowing() == false && CleanMotoTable.isShowing() == false){
            for (i = 0; i < InfoClass.cleaning.size(); i++) 
                if(InfoClass.cleaning.get(i).getVehicleType().equalsIgnoreCase("Automobile")){
                    sumCar += InfoClass.cleaning.get(i).getPrice();
                    tfTotalEarnClean.setText(sumCar + " TL");
                }
            }
            
          else if(CleanCarTable.isShowing() == false && CleanAllTable.isShowing() == false && CleanLorryTable.isShowing() == true && CleanMotoTable.isShowing() == false){
              for (i = 0; i < InfoClass.cleaning.size(); i++) 
                if(InfoClass.cleaning.get(i).getVehicleType().equalsIgnoreCase("Lorry")){
                    sumLorry += InfoClass.cleaning.get(i).getPrice();
                    tfTotalEarnClean.setText(sumLorry + " TL");
                }
          }
              
          else if(CleanCarTable.isShowing() == false && CleanAllTable.isShowing() == false && CleanLorryTable.isShowing() == false && CleanMotoTable.isShowing() == true){
              for (i = 0; i < InfoClass.cleaning.size(); i++) 
                if(InfoClass.cleaning.get(i).getVehicleType().equalsIgnoreCase("Automobile")){
                    sumMoto += InfoClass.cleaning.get(i).getPrice();
                    tfTotalEarnClean.setText(sumMoto + " TL");
                }   
          }
          
          else
          {
              for (i = 0; i < InfoClass.cleaning.size(); i++) {   
                    sumAll += InfoClass.cleaning.get(i).getPrice();
                    tfTotalEarnClean.setText(sumAll + " TL");
              }
          } 
    }//GEN-LAST:event_btTotalEarnCleanActionPerformed

    private void btAdvCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdvCleanActionPerformed
           Cleaning s = InfoClass.cleaning.get(InfoClass.cleaning.size() -1 );
            taSuggestionClean.setText(s.statisticsUsed());
    }//GEN-LAST:event_btAdvCleanActionPerformed

    private void btSearchDataCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchDataCleanActionPerformed
        DefaultTableModel modelS = (DefaultTableModel)CleanSearchTable.getModel();
        modelS.setRowCount(0);
        
        for (int i = 0; i < InfoClass.cleaning.size(); i++) {
            if(InfoClass.cleaning.get(i).getID().equalsIgnoreCase( (String)cbPlateClean.getSelectedItem() )){
                    modelS.addRow(new Object[] {InfoClass.cleaning.get(i).getID() , InfoClass.cleaning.get(i).getPerson().name,InfoClass.cleaning.get(i).getPerson().surname,InfoClass.cleaning.get(i).getPerson().Gender, 
                        InfoClass.cleaning.get(i).getPerson().IdentityNo, InfoClass.cleaning.get(i).getPerson().Profession, InfoClass.cleaning.get(i).typeOfwashing, InfoClass.cleaning.get(i).getVehicleType(),InfoClass.cleaning.get(i).getPrice() } );
            }
        }
        
        CleanSearchPane.setVisible(true);
        CleanAllTable.setVisible(false);
        CleanCarTable.setVisible(false);
        CleanLorryTable.setVisible(false);
        CleanMotoTable.setVisible(false);
    }//GEN-LAST:event_btSearchDataCleanActionPerformed

    private void btAdvParkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdvParkActionPerformed
        int a=0;
        for (int i = 0; i < InfoClass.infoCustomer.size(); i++) {
            if (InfoClass.infoCustomer.get(i) instanceof Parking) {
                a=i;
            }
        }
     
        Parking p=(Parking)InfoClass.infoCustomer.get(a);         
        Suggestpark.setText(p.statisticsUsed());
    }//GEN-LAST:event_btAdvParkActionPerformed

    private void btTotalEarnRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTotalEarnRepActionPerformed
        double sum = 0.0;
        for (int i = 0; i < InfoClass.infoCustomer.size(); i++) {
            if(InfoClass.infoCustomer.get(i) instanceof GasolineCar){
                GasolineCar g = (GasolineCar)InfoClass.infoCustomer.get(i);
                sum += g.gettPrice();
            }
            
            else if(InfoClass.infoCustomer.get(i) instanceof ElectricCar){
                ElectricCar e = (ElectricCar)InfoClass.infoCustomer.get(i);
                sum += e.gettPrice();
            }
            
            else if(InfoClass.infoCustomer.get(i) instanceof DieselCar){
                DieselCar d = (DieselCar)InfoClass.infoCustomer.get(i);
                sum += d.gettPrice();
            }
        }
        
        tfTotalEarnRep.setText(Double.toString(sum));
        
    }//GEN-LAST:event_btTotalEarnRepActionPerformed

    private void btAdvRepDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdvRepDisActionPerformed
        
        for (int i = 0; i < InfoClass.infoCustomer.size(); i++) {
            if(InfoClass.infoCustomer.get(i) instanceof DieselCar){
                DieselCar d = (DieselCar)InfoClass.infoCustomer.get(i);
                taSuggestionRep.setText(d.statisticsUsed());
            }
        }
        
    }//GEN-LAST:event_btAdvRepDisActionPerformed

    private void btAdvRepGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdvRepGasActionPerformed
        for (int i = 0; i < InfoClass.infoCustomer.size(); i++) {
            if(InfoClass.infoCustomer.get(i) instanceof GasolineCar){
                GasolineCar g = (GasolineCar)InfoClass.infoCustomer.get(i);
                taSuggestionRep.setText( g.statisticsUsed() );
            }
        }
    }//GEN-LAST:event_btAdvRepGasActionPerformed

    private void btAdvRepElcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdvRepElcActionPerformed
        for (int i = 0; i < InfoClass.infoCustomer.size(); i++) {
            if(InfoClass.infoCustomer.get(i) instanceof ElectricCar){
                ElectricCar e = (ElectricCar)InfoClass.infoCustomer.get(i);
                taSuggestionRep.setText( e.statisticsUsed() );
            }
        }
    }//GEN-LAST:event_btAdvRepElcActionPerformed

    private void btSearchDataRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchDataRepActionPerformed
        DefaultTableModel SearchRep = (DefaultTableModel)SearchTableRep.getModel();
        SearchRep.setRowCount(0);
        
        for (int i = 0; i < InfoClass.infoCustomer.size(); i++) {
            
            if(InfoClass.infoCustomer.get(i).getID().equals( (String) cbPlateRep.getSelectedItem() )){
                if(InfoClass.infoCustomer.get(i) instanceof ElectricCar){
                ElectricCar e = (ElectricCar)InfoClass.infoCustomer.get(i);
                SearchRep.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), e.getPersonalty().name , e.getPersonalty().surname, e.getPersonalty().Gender , e.getPersonalty().Profession , e.getPersonalty().IdentityNo, 
                    e.getModel(), "Electric",e.getDamage(),e.gettPrice()});
                    
                 }
            
            else if(InfoClass.infoCustomer.get(i) instanceof GasolineCar){
                GasolineCar g = (GasolineCar)InfoClass.infoCustomer.get(i);
                 SearchRep.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), g.getPersonalty().name , g.getPersonalty().surname, g.getPersonalty().Gender , g.getPersonalty().Profession , g.getPersonalty().IdentityNo, 
                    g.getModel(), "Gasoline", g.getDamage(), g.gettPrice() });       
                }
            
            else if(InfoClass.infoCustomer.get(i) instanceof DieselCar){
                DieselCar d = (DieselCar)InfoClass.infoCustomer.get(i);
                SearchRep.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), d.getPersonalty().name , d.getPersonalty().surname, d.getPersonalty().Gender , d.getPersonalty().Profession , d.getPersonalty().IdentityNo, 
                    d.getModel(), "Diesel",+d.getDamage(), d.gettPrice() });        
                }
            }
        }
        
        RepAllPane.setVisible(false);
        SearchPaneRep.setVisible(true);
    }//GEN-LAST:event_btSearchDataRepActionPerformed

    private void btSearchDataParkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchDataParkActionPerformed
        DefaultTableModel SearchPark = (DefaultTableModel)SearchParkingTable.getModel();
        SearchPark.setRowCount(0);
        
        
        for (int i = 0; i < InfoClass.infoCustomer.size(); i++) {
            
            if(InfoClass.infoCustomer.get(i).getID().equalsIgnoreCase((String) cbPlatePark.getSelectedItem() )){
                
                if(InfoClass.infoCustomer.get(i) instanceof Jip){
                    Jip j = (Jip)InfoClass.infoCustomer.get(i);
                    SearchPark.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), j.getPerson().name , j.getPerson().surname, j.getPerson().Gender , j.getPerson().Profession , j.getPerson().IdentityNo, "Automobile",
                    j.getEnteringtime(), j.getExitingTime(), j.CurrentMoney()});        
             }
            
                else if(InfoClass.infoCustomer.get(i) instanceof Lorry){
                    Lorry L = (Lorry)InfoClass.infoCustomer.get(i);
                    SearchPark.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), L.getPerson().name , L.getPerson().surname, L.getPerson().Gender , L.getPerson().Profession , L.getPerson().IdentityNo, "Lorry",
                    L.getEnteringtime(), L.getExitingTime(), L.CurrentMoney()});
             }
            
                else if(InfoClass.infoCustomer.get(i) instanceof MotoBycycle){
                    MotoBycycle M = (MotoBycycle)InfoClass.infoCustomer.get(i);
                    SearchPark.addRow(new Object[] {InfoClass.infoCustomer.get(i).getID(), M.getPerson().name , M.getPerson().surname, M.getPerson().Gender , M.getPerson().Profession , M.getPerson().IdentityNo, "MotorCycle",
                    M.getEnteringtime(), M.getExitingTime(), M.CurrentMoney()});
              }
         }
     }
        
        SearchParkingPane.setVisible(true);
        ParkingAllPane.setVisible(false);
        CarPane.setVisible(false);
        MotoPane.setVisible(false);
        LorryPane.setVisible(false);
    }//GEN-LAST:event_btSearchDataParkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dokuman d=new Dokuman();
        d.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(REPAIR_CLEANING_PARK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REPAIR_CLEANING_PARK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REPAIR_CLEANING_PARK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REPAIR_CLEANING_PARK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REPAIR_CLEANING_PARK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AllPane;
    public static javax.swing.JTable AllTable;
    private javax.swing.JLabel Car;
    private javax.swing.JScrollPane CarPane;
    private javax.swing.JScrollPane CleanAllPane;
    public static javax.swing.JTable CleanAllTable;
    private javax.swing.JScrollPane CleanCarPane;
    public static javax.swing.JTable CleanCarTable;
    private javax.swing.JScrollPane CleanLorryPane;
    public static javax.swing.JTable CleanLorryTable;
    private javax.swing.JScrollPane CleanMotoPane;
    public static javax.swing.JTable CleanMotoTable;
    private javax.swing.JScrollPane CleanSearchPane;
    public static javax.swing.JTable CleanSearchTable;
    private javax.swing.JLabel Lorry;
    private javax.swing.JScrollPane LorryPane;
    private javax.swing.JLabel Moto;
    private javax.swing.JScrollPane MotoPane;
    private javax.swing.JPanel PanelAll;
    private javax.swing.JPanel PanelCleaning;
    private javax.swing.JPanel PanelParking;
    private javax.swing.JPanel PanelRepair;
    private javax.swing.JScrollPane ParkingAllPane;
    protected static javax.swing.JTable ParkingTableAll;
    protected static javax.swing.JTable ParkingTableCar;
    protected static javax.swing.JTable ParkingTableCycle;
    protected static javax.swing.JTable ParkingTableLorry;
    private javax.swing.JScrollPane RepAllPane;
    public static javax.swing.JTable RepAllTable;
    private javax.swing.JScrollPane SearchPaneRep;
    private javax.swing.JScrollPane SearchParkingPane;
    protected static javax.swing.JTable SearchParkingTable;
    public static javax.swing.JTable SearchTableRep;
    private javax.swing.JTextArea Suggestpark;
    private javax.swing.JLabel WashCar;
    private javax.swing.JLabel WashLorry;
    private javax.swing.JLabel WashMoto;
    private javax.swing.JButton btAdvClean;
    private javax.swing.JButton btAdvPark;
    private javax.swing.JButton btAdvRepDis;
    private javax.swing.JButton btAdvRepElc;
    private javax.swing.JButton btAdvRepGas;
    private javax.swing.JButton btAllClean;
    private javax.swing.JButton btAllParking;
    private javax.swing.JButton btAllRep;
    private javax.swing.JButton btSearchDataClean;
    private javax.swing.JButton btSearchDataPark;
    private javax.swing.JButton btSearchDataRep;
    private javax.swing.JButton btTotalEarnClean;
    private javax.swing.JButton btTotalEarnPark;
    private javax.swing.JButton btTotalEarnRep;
    public static javax.swing.JComboBox<String> cbPlateClean;
    private javax.swing.JComboBox<String> cbPlatePark;
    private javax.swing.JComboBox<String> cbPlateRep;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea taSuggestionClean;
    private javax.swing.JTextArea taSuggestionRep;
    private javax.swing.JTextField tfTotalEarnClean;
    private javax.swing.JTextField tfTotalEarnRep;
    private javax.swing.JTextField tfTotalEarnings;
    // End of variables declaration//GEN-END:variables
}
