package perpustakaan;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormLamaPeminjaman extends javax.swing.JDialog {

    private boolean okPressed = false;
    private int lamaPeminjaman;

    private javax.swing.JButton jButtonTambahkan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox jComboBoxLamaPeminjaman;

    public FormLamaPeminjaman(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public boolean isOkPressed() {
        return okPressed;
    }

    public int getLamaPeminjaman() {
        return lamaPeminjaman;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jComboBoxLamaPeminjaman = new javax.swing.JComboBox<>();
        jButtonTambahkan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Lama Peminjaman: ");

        jComboBoxLamaPeminjaman
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Hari", "2 Hari", "3 Hari" }));

        jButtonTambahkan.setText("Tambahkan");
        jButtonTambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxLamaPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonTambahkan)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jComboBoxLamaPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonTambahkan))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }

    private void jButtonTambahkanActionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub
        String selected = (String) jComboBoxLamaPeminjaman.getSelectedItem();

        // Mengubah lama peminjaman jadi Integer
        switch (selected) {
            case "1 Hari":
                lamaPeminjaman = 1;
                break;
            case "2 Hari":
                lamaPeminjaman = 2;
                break;
            case "3 Hari":
                lamaPeminjaman = 3;
                break;
        }

        // Menampilkan pesan Konfirmasi
        JOptionPane.showMessageDialog(this, "Buku berhasil ditambahkan dengan lama peminjaman " + selected);
        okPressed = true;

        // Dialog ditutup
        dispose();
    }

}
