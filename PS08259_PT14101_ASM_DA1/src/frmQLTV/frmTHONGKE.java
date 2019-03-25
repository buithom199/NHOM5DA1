/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frmQLTV;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Thongke;
import model.ThongkeDao;

/**
 *
 * @author My PC
 */
public class frmTHONGKE extends javax.swing.JFrame {

    /**
     * Creates new form frmMENU
     */
    List<Thongke> list = new ArrayList<>();
    private int ma;

    public frmTHONGKE() {
        initComponents();
        this.setSize(630, 470);
        lblBR.setIcon(new ImageIcon(getClass().getResource("/BR/brtk-1.jpg")));
        setLocationRelativeTo(null);
        thongke(1);

    }

    private void thongke(int ma) {
        try {
            list.clear();
            tblTHONGKE.removeAll();
            if (ma == 1) {
                list = ThongkeDao.thongketongluotmuon();
            } else if (ma == 2) {
                list = ThongkeDao.thongkeluotmuontheongay("");
            } else if (ma == 3) {
                list = ThongkeDao.thongkeluotmuontheothang("", "");
            } else if (ma == 4) {
                list = ThongkeDao.thongkeluotmuontheonam("");
            }
            fillToTableTK();
        } catch (SQLException ex) {
            Logger.getLogger(frmTHONGKE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fillToTableTK() {
        DefaultTableModel model = (DefaultTableModel) tblTHONGKE.getModel();
        model.setRowCount(0);
        for (Thongke tk : list) {
            String tg = "";
            if (tk.getNgaythang().equals("")) {
                tg = tk.getNam();
            } else if (tk.getNam().equals("")) {
                tg = tk.getNgaythang();
            } else {
                tg = tk.getNgaythang() + " - " + tk.getNam();
            }
            Object[] row = new Object[]{tk.getLuotmuon(), tk.getTensach(), tk.getTacgia(), tk.getTheloai(), tg};
            model.addRow(row);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnDANGXUAT = new javax.swing.JButton();
        btnSACH = new javax.swing.JButton();
        btnPHIEUNHAP = new javax.swing.JButton();
        btnPHIEUMUON = new javax.swing.JButton();
        btnPHIEUMUONCT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        THONGKE = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblTHONGKE = new javax.swing.JTable();
        btnTKNGAY = new javax.swing.JButton();
        btnTKTHANG = new javax.swing.JButton();
        btnTKNAM = new javax.swing.JButton();
        cbbNGAY = new javax.swing.JComboBox<>();
        cbbTHANG = new javax.swing.JComboBox<>();
        cbbNAM = new javax.swing.JComboBox<>();
        btnTKTIMKIEM = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lblBR = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitDANGXUAT = new javax.swing.JMenuItem();
        mitDOIMK = new javax.swing.JMenuItem();
        mitTHOAT = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mitNHANVIEN = new javax.swing.JMenuItem();
        mitDOCGIA = new javax.swing.JMenuItem();
        mitSACH = new javax.swing.JMenuItem();
        mitTACGIA = new javax.swing.JMenuItem();
        mitNXB = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mitPHIEUNHAP = new javax.swing.JMenuItem();
        mitPHIEUMUON = new javax.swing.JMenuItem();
        mitPHIEUMUONCT = new javax.swing.JMenuItem();
        mitTHONGKE = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mitHDSD = new javax.swing.JMenuItem();
        mitTTPB = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ THƯ VIỆN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");

        btnDANGXUAT.setBackground(new java.awt.Color(255, 255, 255));
        btnDANGXUAT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDANGXUAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icondx1.jpg"))); // NOI18N
        btnDANGXUAT.setText("Đăng xuất");
        btnDANGXUAT.setFocusable(false);
        btnDANGXUAT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDANGXUAT.setMaximumSize(new java.awt.Dimension(91, 51));
        btnDANGXUAT.setMinimumSize(new java.awt.Dimension(91, 51));
        btnDANGXUAT.setPreferredSize(new java.awt.Dimension(91, 51));
        btnDANGXUAT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDANGXUAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDANGXUATActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDANGXUAT);

        btnSACH.setBackground(new java.awt.Color(255, 255, 255));
        btnSACH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSACH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconbook1.jpg"))); // NOI18N
        btnSACH.setText("Sách");
        btnSACH.setFocusable(false);
        btnSACH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSACH.setMaximumSize(new java.awt.Dimension(91, 51));
        btnSACH.setMinimumSize(new java.awt.Dimension(91, 51));
        btnSACH.setPreferredSize(new java.awt.Dimension(91, 51));
        btnSACH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSACH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSACHActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSACH);

        btnPHIEUNHAP.setBackground(new java.awt.Color(255, 255, 255));
        btnPHIEUNHAP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPHIEUNHAP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconphieunhapsach1.jpg"))); // NOI18N
        btnPHIEUNHAP.setText("Phiếu nhập");
        btnPHIEUNHAP.setFocusable(false);
        btnPHIEUNHAP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPHIEUNHAP.setMaximumSize(new java.awt.Dimension(91, 51));
        btnPHIEUNHAP.setMinimumSize(new java.awt.Dimension(91, 51));
        btnPHIEUNHAP.setPreferredSize(new java.awt.Dimension(91, 51));
        btnPHIEUNHAP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPHIEUNHAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPHIEUNHAPActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPHIEUNHAP);

        btnPHIEUMUON.setBackground(new java.awt.Color(255, 255, 255));
        btnPHIEUMUON.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPHIEUMUON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconphieumuon1.jpg"))); // NOI18N
        btnPHIEUMUON.setText("Phiếu mượn");
        btnPHIEUMUON.setFocusable(false);
        btnPHIEUMUON.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPHIEUMUON.setMaximumSize(new java.awt.Dimension(91, 51));
        btnPHIEUMUON.setMinimumSize(new java.awt.Dimension(91, 51));
        btnPHIEUMUON.setPreferredSize(new java.awt.Dimension(91, 51));
        btnPHIEUMUON.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPHIEUMUON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPHIEUMUONActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPHIEUMUON);

        btnPHIEUMUONCT.setBackground(new java.awt.Color(255, 255, 255));
        btnPHIEUMUONCT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPHIEUMUONCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconphieumuonct1.jpg"))); // NOI18N
        btnPHIEUMUONCT.setText("Phiếu mượn CT");
        btnPHIEUMUONCT.setFocusable(false);
        btnPHIEUMUONCT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPHIEUMUONCT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPHIEUMUONCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPHIEUMUONCTActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPHIEUMUONCT);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        THONGKE.setBackground(new java.awt.Color(255, 255, 255));
        THONGKE.setOpaque(false);

        tblTHONGKE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Lượt mượn", "Tên sách", "Tác giả", "Thể loại", "Thời gian mượn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tblTHONGKE);

        btnTKNGAY.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTKNGAY.setForeground(new java.awt.Color(51, 51, 51));
        btnTKNGAY.setText("Theo ngày");
        btnTKNGAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKNGAYActionPerformed(evt);
            }
        });

        btnTKTHANG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTKTHANG.setForeground(new java.awt.Color(51, 51, 51));
        btnTKTHANG.setText("Theo tháng");
        btnTKTHANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKTHANGActionPerformed(evt);
            }
        });

        btnTKNAM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTKNAM.setForeground(new java.awt.Color(51, 51, 51));
        btnTKNAM.setText("Theo năm");
        btnTKNAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKNAMActionPerformed(evt);
            }
        });

        cbbNGAY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbbTHANG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbbNAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        btnTKTIMKIEM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTKTIMKIEM.setForeground(new java.awt.Color(51, 51, 51));
        btnTKTIMKIEM.setText("Tìm kiếm");
        btnTKTIMKIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKTIMKIEMActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Năm");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Tháng");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("Ngày");

        javax.swing.GroupLayout THONGKELayout = new javax.swing.GroupLayout(THONGKE);
        THONGKE.setLayout(THONGKELayout);
        THONGKELayout.setHorizontalGroup(
            THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(THONGKELayout.createSequentialGroup()
                .addGroup(THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(THONGKELayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(THONGKELayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbNGAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTKNGAY))
                        .addGap(54, 54, 54)
                        .addGroup(THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTKTHANG)
                            .addGroup(THONGKELayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbTHANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(THONGKELayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)
                                .addComponent(cbbNAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTKNAM)))
                    .addGroup(THONGKELayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(THONGKELayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnTKTIMKIEM)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        THONGKELayout.setVerticalGroup(
            THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(THONGKELayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTKNGAY)
                    .addComponent(btnTKTHANG)
                    .addComponent(btnTKNAM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(THONGKELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbNGAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTHANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addGap(18, 18, 18)
                .addComponent(btnTKTIMKIEM)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        lblBR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblBR.setName(""); // NOI18N
        lblBR.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(THONGKE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(lblBR)
                    .addGap(0, 660, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(THONGKE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(lblBR)
                    .addGap(0, 387, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 2496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Hệ thống");

        mitDANGXUAT.setBackground(new java.awt.Color(255, 255, 255));
        mitDANGXUAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icondx1.jpg"))); // NOI18N
        mitDANGXUAT.setText("Đăng xuất");
        mitDANGXUAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDANGXUATActionPerformed(evt);
            }
        });
        jMenu1.add(mitDANGXUAT);

        mitDOIMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icondmk.jpg"))); // NOI18N
        mitDOIMK.setText("Đổi mật khẩu");
        mitDOIMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDOIMKActionPerformed(evt);
            }
        });
        jMenu1.add(mitDOIMK);

        mitTHOAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconexit1.jpg"))); // NOI18N
        mitTHOAT.setText("Thoát");
        mitTHOAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitTHOATActionPerformed(evt);
            }
        });
        jMenu1.add(mitTHOAT);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mitNHANVIEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconnv1.jpg"))); // NOI18N
        mitNHANVIEN.setText("Nhân viên");
        mitNHANVIEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitNHANVIENActionPerformed(evt);
            }
        });
        jMenu2.add(mitNHANVIEN);

        mitDOCGIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icondocgia1.jpg"))); // NOI18N
        mitDOCGIA.setText("Độc giả");
        mitDOCGIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDOCGIAActionPerformed(evt);
            }
        });
        jMenu2.add(mitDOCGIA);

        mitSACH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconbook1.jpg"))); // NOI18N
        mitSACH.setText("Sách");
        mitSACH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSACHActionPerformed(evt);
            }
        });
        jMenu2.add(mitSACH);

        mitTACGIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icontacgia1.jpg"))); // NOI18N
        mitTACGIA.setText("Tác giả");
        mitTACGIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitTACGIAActionPerformed(evt);
            }
        });
        jMenu2.add(mitTACGIA);

        mitNXB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconnxb1.jpg"))); // NOI18N
        mitNXB.setText("Nhà xuất bản");
        mitNXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitNXBActionPerformed(evt);
            }
        });
        jMenu2.add(mitNXB);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");

        mitPHIEUNHAP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconphieunhapsach1.jpg"))); // NOI18N
        mitPHIEUNHAP.setText("Phiếu nhập sách");
        mitPHIEUNHAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitPHIEUNHAPActionPerformed(evt);
            }
        });
        jMenu3.add(mitPHIEUNHAP);

        mitPHIEUMUON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconphieumuon1.jpg"))); // NOI18N
        mitPHIEUMUON.setText("Phiếu mượn sách");
        mitPHIEUMUON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitPHIEUMUONActionPerformed(evt);
            }
        });
        jMenu3.add(mitPHIEUMUON);

        mitPHIEUMUONCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconphieumuonct1.jpg"))); // NOI18N
        mitPHIEUMUONCT.setText("Phiếu mượn sách chi tiết");
        mitPHIEUMUONCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitPHIEUMUONCTActionPerformed(evt);
            }
        });
        jMenu3.add(mitPHIEUMUONCT);

        mitTHONGKE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconbdtk.jpg"))); // NOI18N
        mitTHONGKE.setText("Thống kê số liệu");
        mitTHONGKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitTHONGKEActionPerformed(evt);
            }
        });
        jMenu3.add(mitTHONGKE);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Trợ giúp");

        mitHDSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/iconhdsd1.jpg"))); // NOI18N
        mitHDSD.setText("Hướng dẫn sử dụng");
        jMenu4.add(mitHDSD);

        mitTTPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/gt_1.png"))); // NOI18N
        mitTTPB.setText("Thông tin phiên bản");
        jMenu4.add(mitTTPB);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitDANGXUATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDANGXUATActionPerformed
        frmDANGNHAP frmDN;
        try {
            frmDN = new frmDANGNHAP();;
            frmDN.show();
            dispose();
        } catch (ClassNotFoundException | SQLException ex1) {
            Logger.getLogger(frmDANGNHAP.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }//GEN-LAST:event_mitDANGXUATActionPerformed

    private void mitTHOATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitTHOATActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mitTHOATActionPerformed

    private void btnSACHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSACHActionPerformed
        frmSACH frmS = new frmSACH();
        frmS.show();
        dispose();
    }//GEN-LAST:event_btnSACHActionPerformed

    private void btnPHIEUNHAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPHIEUNHAPActionPerformed
        frmPHIEUNHAP frmPN;
        frmPN = new frmPHIEUNHAP();
        frmPN.show();
        dispose();
    }//GEN-LAST:event_btnPHIEUNHAPActionPerformed

    private void btnPHIEUMUONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPHIEUMUONActionPerformed
        frmPHIEUMUON frmPM = new frmPHIEUMUON();
        frmPM.show();
        dispose();
    }//GEN-LAST:event_btnPHIEUMUONActionPerformed

    private void btnPHIEUMUONCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPHIEUMUONCTActionPerformed
        frmPHIEUMUONCT frmPMCT = new frmPHIEUMUONCT();
        frmPMCT.show();
        dispose();
    }//GEN-LAST:event_btnPHIEUMUONCTActionPerformed

    private void mitNHANVIENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitNHANVIENActionPerformed
        frmNNHANVIEN frmNV = new frmNNHANVIEN();
        frmNV.show();
        dispose();
    }//GEN-LAST:event_mitNHANVIENActionPerformed

    private void mitDOCGIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDOCGIAActionPerformed
        frmDOCGIA frmDG = new frmDOCGIA();
        frmDG.show();
        dispose();
    }//GEN-LAST:event_mitDOCGIAActionPerformed

    private void mitSACHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSACHActionPerformed
        frmSACH frmS = new frmSACH();
        frmS.show();
        dispose();
    }//GEN-LAST:event_mitSACHActionPerformed

    private void mitTACGIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitTACGIAActionPerformed
        frmTACGIA frmTG = new frmTACGIA();
        frmTG.show();
        dispose();
    }//GEN-LAST:event_mitTACGIAActionPerformed

    private void mitNXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitNXBActionPerformed
        frmNXB frmN = new frmNXB();
        frmN.show();
        dispose();
    }//GEN-LAST:event_mitNXBActionPerformed

    private void mitPHIEUNHAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitPHIEUNHAPActionPerformed
        frmPHIEUNHAP frmPN;
        frmPN = new frmPHIEUNHAP();
        frmPN.show();
        dispose();
    }//GEN-LAST:event_mitPHIEUNHAPActionPerformed

    private void mitPHIEUMUONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitPHIEUMUONActionPerformed
        frmPHIEUMUON frmPM = new frmPHIEUMUON();
        frmPM.show();
        dispose();
    }//GEN-LAST:event_mitPHIEUMUONActionPerformed

    private void mitPHIEUMUONCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitPHIEUMUONCTActionPerformed
        frmPHIEUMUONCT frmPMCT = new frmPHIEUMUONCT();
        frmPMCT.show();
        dispose();
    }//GEN-LAST:event_mitPHIEUMUONCTActionPerformed

    private void mitTHONGKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitTHONGKEActionPerformed
        frmTHONGKE frmTK = new frmTHONGKE();
        frmTK.show();
        dispose();
    }//GEN-LAST:event_mitTHONGKEActionPerformed

    private void btnDANGXUATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDANGXUATActionPerformed
        frmDANGNHAP frmDN;
        try {
            frmDN = new frmDANGNHAP();;
            frmDN.show();
            dispose();
        } catch (ClassNotFoundException | SQLException ex1) {
            Logger.getLogger(frmDANGNHAP.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }//GEN-LAST:event_btnDANGXUATActionPerformed

    private void mitDOIMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDOIMKActionPerformed
        frmDOIMATKHAU frmDMK;
        try {
            frmDMK = new frmDOIMATKHAU();
            frmDMK.show();
            dispose();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(frmDANGNHAP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mitDOIMKActionPerformed

    private void btnTKNGAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKNGAYActionPerformed
        ma = 2;
        thongke(ma);
    }//GEN-LAST:event_btnTKNGAYActionPerformed

    private void btnTKTHANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKTHANGActionPerformed
        ma = 3;
        thongke(ma);
    }//GEN-LAST:event_btnTKTHANGActionPerformed

    private void btnTKNAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKNAMActionPerformed
        ma = 4;
        thongke(ma);
    }//GEN-LAST:event_btnTKNAMActionPerformed

    private void btnTKTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKTIMKIEMActionPerformed
        try {
            timkiemtk();
        } catch (SQLException ex) {
            Logger.getLogger(frmTHONGKE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTKTIMKIEMActionPerformed

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
            java.util.logging.Logger.getLogger(frmTHONGKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTHONGKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTHONGKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTHONGKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTHONGKE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel THONGKE;
    private javax.swing.JButton btnDANGXUAT;
    private javax.swing.JButton btnPHIEUMUON;
    private javax.swing.JButton btnPHIEUMUONCT;
    private javax.swing.JButton btnPHIEUNHAP;
    private javax.swing.JButton btnSACH;
    private javax.swing.JButton btnTKNAM;
    private javax.swing.JButton btnTKNGAY;
    private javax.swing.JButton btnTKTHANG;
    private javax.swing.JButton btnTKTIMKIEM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox<String> cbbNAM;
    private javax.swing.JComboBox<String> cbbNGAY;
    private javax.swing.JComboBox<String> cbbTHANG;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBR;
    private javax.swing.JMenuItem mitDANGXUAT;
    private javax.swing.JMenuItem mitDOCGIA;
    private javax.swing.JMenuItem mitDOIMK;
    private javax.swing.JMenuItem mitHDSD;
    private javax.swing.JMenuItem mitNHANVIEN;
    private javax.swing.JMenuItem mitNXB;
    private javax.swing.JMenuItem mitPHIEUMUON;
    private javax.swing.JMenuItem mitPHIEUMUONCT;
    private javax.swing.JMenuItem mitPHIEUNHAP;
    private javax.swing.JMenuItem mitSACH;
    private javax.swing.JMenuItem mitTACGIA;
    private javax.swing.JMenuItem mitTHOAT;
    private javax.swing.JMenuItem mitTHONGKE;
    private javax.swing.JMenuItem mitTTPB;
    private javax.swing.JTable tblTHONGKE;
    // End of variables declaration//GEN-END:variables

    private void timkiemtk() throws SQLException {
        String ngay = (String) cbbNGAY.getSelectedItem();
        String thang = (String) cbbTHANG.getSelectedItem();
        String nam = (String) cbbNAM.getSelectedItem();
        list.clear();
        tblTHONGKE.removeAll();
        if (ma == 1) {
            list = ThongkeDao.thongketongluotmuon();
        } else if (ma == 2) {
            list = ThongkeDao.thongkeluotmuontheongay(ngay + "-" + thang + "-" + nam);
        } else if (ma == 3) {
            list = ThongkeDao.thongkeluotmuontheothang(thang, nam);
        } else if (ma == 4) {
            list = ThongkeDao.thongkeluotmuontheonam(nam);
        }
        fillToTableTK();

    }

}
