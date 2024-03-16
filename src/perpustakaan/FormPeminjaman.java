package perpustakaan;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

public class FormPeminjaman extends javax.swing.JFrame {

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButtonCari;
        private javax.swing.JButton jButtonPinjam;
        private javax.swing.JButton jButtonBatal;
        private javax.swing.JButton jButtonKonfirmasi;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTextField jTextFieldJudul;
        private javax.swing.JTable jtBuku;
        private javax.swing.JTable jtBukuDipinjam;
        // End of variables declaration//GEN-END:variables

        public FormPeminjaman() {
                initComponents();
        }

        public void tampilkan() {
                this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.pack();
                this.setSize(800, 600);
                this.setLocationRelativeTo(null);
                this.setVisible(true);
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {
                // TODO Auto-generated method stub
                jTextFieldJudul = new javax.swing.JTextField();
                jButtonCari = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jtBuku = new javax.swing.JTable();
                jButtonPinjam = new javax.swing.JButton();
                jScrollPane2 = new javax.swing.JScrollPane();
                jtBukuDipinjam = new javax.swing.JTable();
                jButtonBatal = new javax.swing.JButton();
                jButtonKonfirmasi = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jButtonCari.setText("Cari");
                jButtonCari.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jButtonCariMouseClicked(evt);
                        }
                });

                jtBuku.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {

                                }));
                jScrollPane1.setViewportView(jtBuku);

                jButtonPinjam.setText("Pinjam");
                jButtonPinjam.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonPinjamActionPerformed(evt);
                        }
                });

                jButtonKonfirmasi.setText("Konfirmasi");
                jButtonKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonKonfirmasiActionPerformed(evt);
                        }
                });

                jtBukuDipinjam.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {},
                                new String[] {}));
                jScrollPane2.setViewportView(jtBukuDipinjam);

                jButtonBatal.setText("Batal");
                jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonBatalActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap(200, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                300,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(15, 15, 15)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.CENTER)
                                                                                                                .addComponent(jButtonPinjam)
                                                                                                                .addComponent(jButtonBatal))
                                                                                                .addGap(15, 15, 15)
                                                                                                .addComponent(jScrollPane2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                300,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))

                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jTextFieldJudul,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                222,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButtonCari))

                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()

                                                                                                                .addComponent(jButtonKonfirmasi)))
                                                                .addContainerGap(200, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jTextFieldJudul,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButtonCari))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                200, Short.MAX_VALUE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jButtonPinjam)
                                                                                                .addGap(10, 10, 10)
                                                                                                .addComponent(jButtonBatal))
                                                                                .addComponent(jScrollPane2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0, Short.MAX_VALUE))
                                                                .addGap(20, 20, 20)
                                                                // .addPreferredGap(
                                                                // javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonKonfirmasi)
                                                                .addContainerGap(22, Short.MAX_VALUE)));

                pack();
        }

        private void jButtonCariMouseClicked(java.awt.event.MouseEvent evt) {
                // TODO Auto-generated method stub
                String judul = jTextFieldJudul.getText();
                Perpustakaan.controllerPencarian.cariBuku(judul);
        }

        private void jButtonPinjamActionPerformed(ActionEvent evt) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'jButtonPinjamActionPerformed'");
        }

        private void jButtonBatalActionPerformed(ActionEvent evt) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'jButtonBatalActionPerformed'");
        }

        private void jButtonKonfirmasiActionPerformed(ActionEvent evt) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'jButtonKonfirmasiActionPerformed'");
        }
}
