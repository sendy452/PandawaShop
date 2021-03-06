/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pandawa;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sendy
 */
public class DataBuah extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public static int Kode;
    String nama = UserSession.getNama();

    public DataBuah() {
        initComponents();
        Kode = Login.kodeLogin;

        if (Kode == 1) {
            LoginOwner();
        } else if (Kode == 2) {
            LoginKaryawan();
        } else {
            LoginOwner();
        }
        load_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void LoginOwner() {
        Transaksi.setEnabled(false);
        Transaksi.setVisible(false);
    }

    private void LoginKaryawan() {
        Transaksi.setEnabled(true);
        Transaksi.setVisible(true);
        Laporan.setEnabled(false);
        Laporan.setVisible(false);
    }

    public void load_table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Buah");
        model.addColumn("Stok (kg)");
        model.addColumn("Harga (Rp.)");

        try {
            String sql = "SELECT * FROM buah";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{res.getString(2), res.getInt(4), res.getInt(3)});
            }
            TblBuah.setModel(model);
        } catch (Exception e) {
        }
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ScrollBuah = new javax.swing.JScrollPane();
        TblBuah = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtBuah = new javax.swing.JTextField();
        TxtStok = new javax.swing.JTextField();
        TxtHarga = new javax.swing.JTextField();
        BtnTambah = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Home = new javax.swing.JMenuItem();
        Refresh = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Transaksi = new javax.swing.JMenuItem();
        Buah = new javax.swing.JMenuItem();
        Laporan = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Quit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 250));

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 630, 10));

        jLabel3.setFont(new java.awt.Font("Futura Md BT", 0, 36)); // NOI18N
        jLabel3.setText("PANDAWA SHOP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        TblBuah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Buah", "Stok", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblBuah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblBuahMouseClicked(evt);
            }
        });
        ScrollBuah.setViewportView(TblBuah);
        if (TblBuah.getColumnModel().getColumnCount() > 0) {
            TblBuah.getColumnModel().getColumn(0).setResizable(false);
            TblBuah.getColumnModel().getColumn(1).setResizable(false);
            TblBuah.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(ScrollBuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 610, 190));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATA BUAH");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel1.setText("Jenis Buah :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel2.setText("Stok (kg) :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jLabel4.setText("Harga (Rp.) :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));
        jPanel1.add(TxtBuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, 30));
        jPanel1.add(TxtStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 90, 30));

        TxtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHargaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 100, 30));

        BtnTambah.setText("Tambah Buah");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, 40));

        BtnEdit.setText("Edit Buah");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, 40));

        BtnHapus.setText("Hapus Buah");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(BtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, 40));

        jMenu1.setText("MAIN");

        Home.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jMenu1.add(Home);

        Refresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jMenu1.add(Refresh);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("MENU");

        Transaksi.setText("Transaksi");
        Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiActionPerformed(evt);
            }
        });
        jMenu2.add(Transaksi);

        Buah.setText("Data Buah");
        Buah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuahActionPerformed(evt);
            }
        });
        jMenu2.add(Buah);

        Laporan.setText("Laporan");
        Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanActionPerformed(evt);
            }
        });
        jMenu2.add(Laporan);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("QUIT");

        Quit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Quit.setText("Logout");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        jMenu3.add(Quit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Transaksi().setVisible(true);
    }//GEN-LAST:event_TransaksiActionPerformed

    private void LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Laporan().setVisible(true);
    }//GEN-LAST:event_LaporanActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_QuitActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new DataBuah().setVisible(true);
    }//GEN-LAST:event_RefreshActionPerformed

    private void BuahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuahActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new DataBuah().setVisible(true);
    }//GEN-LAST:event_BuahActionPerformed

    private void TxtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHargaActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // TODO add your handling code here:
        try {
            Config ObjKoneksi = new Config();
            Connection con = ObjKoneksi.configDB();
            Statement st = con.createStatement();
            String sql = "insert into buah(namaBuah,harga,stok) "
                    + "values ('" + TxtBuah.getText() + "', '" + TxtHarga.getText() + "', '" + TxtStok.getText() + "')";
            int row = st.executeUpdate(sql);

            if (row == 1) {
                JOptionPane.showMessageDialog(null, "Sukses menambahkan buah", "Data Buah", JOptionPane.INFORMATION_MESSAGE);
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan buah", "Data Buah", JOptionPane.INFORMATION_MESSAGE);
        }
        load_table();
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
        try {
            Config ObjKoneksi = new Config();
            Connection con = ObjKoneksi.configDB();
            Statement st = con.createStatement();

            String sql = "update buah set namaBuah ='" + TxtBuah.getText() + "',"
                    + "harga =" + TxtHarga.getText() + ",stok = " + TxtStok.getText()
                    + " where namaBuah = '" + TxtBuah.getText() + "' ";

            int row = st.executeUpdate(sql);
            if (row == 1) {
                JOptionPane.showMessageDialog(null, "Sukses merubah data buah", "Data Buah", JOptionPane.INFORMATION_MESSAGE);
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal merubah data buah", "Data Buah", JOptionPane.INFORMATION_MESSAGE);
        }
        load_table();
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        try {
            Config ObjKoneksi = new Config();
            Connection con = ObjKoneksi.configDB();
            Statement st = con.createStatement();
            String sql = "delete from buah where namaBuah = '" + TxtBuah.getText() + "' ";
            int row = st.executeUpdate(sql);
            if (row == 1) {
                JOptionPane.showMessageDialog(null, "Buah sukses dihapus", "Data Buah", JOptionPane.INFORMATION_MESSAGE);

                con.close();

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Buah gagal dihapus", "Data Buah", JOptionPane.INFORMATION_MESSAGE);
        }
        load_table();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void TblBuahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblBuahMouseClicked
        // TODO add your handling code here:
        TxtBuah.setText(TblBuah.getValueAt(TblBuah.getSelectedRow(), 0).toString());
        TxtStok.setText(TblBuah.getValueAt(TblBuah.getSelectedRow(), 1).toString());
        TxtHarga.setText(TblBuah.getValueAt(TblBuah.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_TblBuahMouseClicked

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
            java.util.logging.Logger.getLogger(DataBuah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBuah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBuah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBuah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBuah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JMenuItem Buah;
    private javax.swing.JMenuItem Home;
    private javax.swing.JMenuItem Laporan;
    private javax.swing.JMenuItem Quit;
    private javax.swing.JMenuItem Refresh;
    private javax.swing.JScrollPane ScrollBuah;
    private javax.swing.JTable TblBuah;
    private javax.swing.JMenuItem Transaksi;
    private javax.swing.JTextField TxtBuah;
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JTextField TxtStok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
