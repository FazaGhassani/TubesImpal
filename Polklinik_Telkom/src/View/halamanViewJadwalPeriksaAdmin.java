/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Dhino
 */
public class halamanViewJadwalPeriksaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form halamanViewJadwalPeriksaAdmin
     */
    public halamanViewJadwalPeriksaAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_ViewDataPasien = new javax.swing.JButton();
        jButton_EditDataPasien = new javax.swing.JButton();
        jButton_DeleteDataPasien = new javax.swing.JButton();
        jLabel_MengelolaDataPasien = new javax.swing.JLabel();
        jButton_LogOut = new javax.swing.JButton();
        jPanel_foto = new javax.swing.JPanel();
        jLabel_NamaDokter1 = new javax.swing.JLabel();
        jLabel_NamaDokter = new javax.swing.JLabel();
        jLabel_MengelolaDataPasien1 = new javax.swing.JLabel();
        jButton_MengelolaShiftDokter = new javax.swing.JButton();
        jButton_MelihatShiftDokter = new javax.swing.JButton();
        jButton_MelihatJadwalPeriksa = new javax.swing.JButton();
        jLabel_DataPAsien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_ViewDataPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_ViewDataPasien.setText("View Data Pasien");

        jButton_EditDataPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_EditDataPasien.setText("Edit Data Pasien");

        jButton_DeleteDataPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_DeleteDataPasien.setText("Delete Data Pasien");

        jLabel_MengelolaDataPasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_MengelolaDataPasien.setText("Mengelola Data Pasien");

        jButton_LogOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_LogOut.setText("LogOut");

        javax.swing.GroupLayout jPanel_fotoLayout = new javax.swing.GroupLayout(jPanel_foto);
        jPanel_foto.setLayout(jPanel_fotoLayout);
        jPanel_fotoLayout.setHorizontalGroup(
            jPanel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanel_fotoLayout.setVerticalGroup(
            jPanel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        jLabel_NamaDokter1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NamaDokter1.setText("ADMIN");

        jLabel_NamaDokter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NamaDokter.setText("Nama Admin");

        jLabel_MengelolaDataPasien1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_MengelolaDataPasien1.setText("Mengelola Jadwal");

        jButton_MengelolaShiftDokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MengelolaShiftDokter.setText("Mengelola Shift Dokter");

        jButton_MelihatShiftDokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MelihatShiftDokter.setText("Melihat Shift Dokter");

        jButton_MelihatJadwalPeriksa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MelihatJadwalPeriksa.setText("Melihat Jadwal Periksa");

        jLabel_DataPAsien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_DataPAsien.setText("JADWAL PERIKSA");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Pasien", "Nama Dokter", "Shift", "Tanggal Lahir"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_NamaDokter)
                            .addComponent(jLabel_NamaDokter1)))
                    .addComponent(jButton_EditDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ViewDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_DeleteDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_MengelolaDataPasien)
                    .addComponent(jButton_MelihatShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_MengelolaShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_MelihatJadwalPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_MengelolaDataPasien1)
                    .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_DataPAsien)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_DataPAsien)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_NamaDokter1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_NamaDokter)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_MengelolaDataPasien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_ViewDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_EditDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_DeleteDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel_MengelolaDataPasien1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_MengelolaShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_MelihatShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_MelihatJadwalPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(halamanViewJadwalPeriksaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamanViewJadwalPeriksaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamanViewJadwalPeriksaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamanViewJadwalPeriksaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanViewJadwalPeriksaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DeleteDataPasien;
    private javax.swing.JButton jButton_EditDataPasien;
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JButton jButton_MelihatJadwalPeriksa;
    private javax.swing.JButton jButton_MelihatShiftDokter;
    private javax.swing.JButton jButton_MengelolaShiftDokter;
    private javax.swing.JButton jButton_ViewDataPasien;
    private javax.swing.JLabel jLabel_DataPAsien;
    private javax.swing.JLabel jLabel_MengelolaDataPasien;
    private javax.swing.JLabel jLabel_MengelolaDataPasien1;
    private javax.swing.JLabel jLabel_NamaDokter;
    private javax.swing.JLabel jLabel_NamaDokter1;
    private javax.swing.JPanel jPanel_foto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
