
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList; 
import java.util.List;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pick
 */
public class bayarspp extends javax.swing.JFrame {

    /**
     * Creates new form bayarspp
     */
    private int ukt = 0;
    
    
    
    public bayarspp() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pembayaranspp = new javax.swing.JLabel();
        pembayaranspp1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nama = new javax.swing.JLabel();
        kolomnama = new javax.swing.JTextField();
        niim = new javax.swing.JLabel();
        kolomnim = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        bulan = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        januari = new javax.swing.JCheckBox();
        februari = new javax.swing.JCheckBox();
        maret = new javax.swing.JCheckBox();
        april = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        juni = new javax.swing.JCheckBox();
        juli = new javax.swing.JCheckBox();
        agustus = new javax.swing.JCheckBox();
        september = new javax.swing.JCheckBox();
        oktober = new javax.swing.JCheckBox();
        november = new javax.swing.JCheckBox();
        desember = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        totalpembayaran = new javax.swing.JButton();
        kolomtotal = new javax.swing.JTextField();
        jumlah = new javax.swing.JLabel();
        kembaliantext = new javax.swing.JLabel();
        kolomjumlah = new javax.swing.JTextField();
        kolomkembalian = new javax.swing.JTextField();
        bayar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 255, 0));

        pembayaranspp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pembayaranspp.setText("PEMBAYARAN SPP UNIVERSITAS ");

        pembayaranspp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pembayaranspp1.setText("NIHONGO DAIGAKU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(pembayaranspp)
                .addContainerGap(278, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pembayaranspp1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(pembayaranspp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pembayaranspp1)
                .addGap(17, 17, 17))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        nama.setText("Nama : ");

        niim.setText("Nim :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(kolomnama, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(nama))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(niim)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kolomnim)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kolomnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(niim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kolomnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        bulan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bulan.setText("BULAN");

        jPanel6.setLayout(new java.awt.GridLayout(4, 0));

        januari.setText("Januari");
        januari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                januariActionPerformed(evt);
            }
        });
        jPanel6.add(januari);

        februari.setText("Februari");
        februari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                februariActionPerformed(evt);
            }
        });
        jPanel6.add(februari);

        maret.setText("Maret");
        maret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maretActionPerformed(evt);
            }
        });
        jPanel6.add(maret);

        april.setText("April");
        april.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprilActionPerformed(evt);
            }
        });
        jPanel6.add(april);

        mei.setText("Mei");
        mei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meiActionPerformed(evt);
            }
        });
        jPanel6.add(mei);

        juni.setText("Juni");
        juni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juniActionPerformed(evt);
            }
        });
        jPanel6.add(juni);

        juli.setText("Juli");
        juli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juliActionPerformed(evt);
            }
        });
        jPanel6.add(juli);

        agustus.setText("Agustus");
        agustus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agustusActionPerformed(evt);
            }
        });
        jPanel6.add(agustus);

        september.setText("September");
        september.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                septemberActionPerformed(evt);
            }
        });
        jPanel6.add(september);

        oktober.setText("Oktober");
        oktober.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oktoberActionPerformed(evt);
            }
        });
        jPanel6.add(oktober);

        november.setText("November");
        november.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novemberActionPerformed(evt);
            }
        });
        jPanel6.add(november);

        desember.setText("Desember");
        desember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desemberActionPerformed(evt);
            }
        });
        jPanel6.add(desember);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(bulan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(bulan)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        totalpembayaran.setBackground(new java.awt.Color(0, 255, 0));
        totalpembayaran.setText("Total Pembayaran");
        totalpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpembayaranActionPerformed(evt);
            }
        });

        kolomtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomtotalActionPerformed(evt);
            }
        });

        jumlah.setText("Jumlah");

        kembaliantext.setText("Kembalian");

        kolomjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomjumlahActionPerformed(evt);
            }
        });

        kolomkembalian.setEditable(false);
        kolomkembalian.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bayar.setBackground(new java.awt.Color(51, 255, 51));
        bayar.setText("BAYAR");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(totalpembayaran))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kembaliantext)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jumlah)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kolomjumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(kolomkembalian))
                        .addGap(36, 36, 36)
                        .addComponent(bayar)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(kolomtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalpembayaran)
                    .addComponent(kolomtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah)
                    .addComponent(kolomjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembaliantext)
                    .addComponent(kolomkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Nim", "Bulan", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabeldata);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

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
    }// </editor-fold>//GEN-END:initComponents

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
    int totalBulan = 0;
    List<String> bulanDipilih = new ArrayList<>(); 

    if (januari.isSelected()) { totalBulan++; bulanDipilih.add("Januari"); }
    if (februari.isSelected()) { totalBulan++; bulanDipilih.add("Februari"); }
    if (maret.isSelected()) { totalBulan++; bulanDipilih.add("Maret"); }
    if (april.isSelected()) { totalBulan++; bulanDipilih.add("April"); }
    if (mei.isSelected()) { totalBulan++; bulanDipilih.add("Mei"); }
    if (juni.isSelected()) { totalBulan++; bulanDipilih.add("Juni"); }
    if (juli.isSelected()) { totalBulan++; bulanDipilih.add("Juli"); }
    if (agustus.isSelected()) { totalBulan++; bulanDipilih.add("Agustus"); }
    if (september.isSelected()) { totalBulan++; bulanDipilih.add("September"); }
    if (oktober.isSelected()) { totalBulan++; bulanDipilih.add("Oktober"); }
    if (november.isSelected()) { totalBulan++; bulanDipilih.add("November"); }
    if (desember.isSelected()) { totalBulan++; bulanDipilih.add("Desember"); }
    
    String nama = kolomnama.getText().trim();
    String nim = kolomnim.getText().trim();
    String uangDiterimaText = kolomjumlah.getText().replace(".", "");
    
    if (nama.isEmpty() || nim.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan nama dan NIM terlebih dahulu", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int nimInt = Integer.parseInt(nim);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan NIM hanya dengan angka", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (totalBulan == 0) {
        JOptionPane.showMessageDialog(this, "Pilih bulan yang ingin dibayar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (uangDiterimaText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Harap masukkan jumlah uang yang anda terima di tagihan!", "Input Kosong", JOptionPane.WARNING_MESSAGE);
        return; 
    }

    int uangDiterima;
    try {
        uangDiterima = Integer.parseInt(uangDiterimaText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Input tidak valid! Harap masukkan angka.", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String totalBayarText = kolomtotal.getText().replace("Rp ", "").replace(".", ""); 
    int totalBayar;

    try {
        totalBayar = Integer.parseInt(totalBayarText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memproses total bayar.", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (uangDiterima < totalBayar) {
        JOptionPane.showMessageDialog(this, "Uang yang dimasukkan kurang dari total pembayaran!", "Kesalahan Pembayaran", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int kembalian = uangDiterima - totalBayar;
    kolomkembalian.setText("Rp " + kembalian);

    DefaultTableModel model = (DefaultTableModel) tabeldata.getModel();

    for (String bulan : bulanDipilih) {
        boolean alreadyExists = false;
        
        for (int i = 0; i < model.getRowCount(); i++) {
            String existingNama = model.getValueAt(i, 0).toString();
            String existingNim = model.getValueAt(i, 1).toString();
            String existingBulan = model.getValueAt(i, 2).toString();

            if (existingNama.equalsIgnoreCase(nama) && existingNim.equals(nim) && existingBulan.equals(bulan)) {
                alreadyExists = true;
                JOptionPane.showMessageDialog(this, "pembayaran bulan ini telah di bayar!", " BERHASIL", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        if (!alreadyExists) {
            model.addRow(new Object[]{nama, nim, bulan, "Lunas"});
        }
    }

    kolomnama.setText("");
    kolomnim.setText("");
    JOptionPane.showMessageDialog(this, "berhasil telah melakukan pembayaran!", " BERHASIL", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bayarActionPerformed

    private void januariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_januariActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_januariActionPerformed

    private void februariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_februariActionPerformed
        // TODO add your handling code here:
        
        ukt = 500000;
    }//GEN-LAST:event_februariActionPerformed

    private void maretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maretActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_maretActionPerformed

    private void aprilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprilActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_aprilActionPerformed

    private void meiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meiActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_meiActionPerformed

    private void juniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juniActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_juniActionPerformed

    private void juliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juliActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_juliActionPerformed

    private void agustusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agustusActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_agustusActionPerformed

    private void septemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_septemberActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_septemberActionPerformed

    private void oktoberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oktoberActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_oktoberActionPerformed

    private void novemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novemberActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_novemberActionPerformed

    private void desemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desemberActionPerformed
        // TODO add your handling code here:
        ukt = 500000;
    }//GEN-LAST:event_desemberActionPerformed

    private void totalpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpembayaranActionPerformed
        boolean bulandipilih = false;
        if (januari.isSelected() ||
            februari.isSelected() ||    
            maret.isSelected() ||    
            april.isSelected() ||    
            mei.isSelected() ||    
            juni.isSelected() ||    
            juli.isSelected() ||    
            agustus.isSelected() ||    
            september.isSelected() ||    
            oktober.isSelected() ||    
            november.isSelected() ||    
            desember.isSelected())
        {
            bulandipilih = true;
        }
        
        
        
        if (!bulandipilih){
            JOptionPane.showMessageDialog(this, "pilih bulan terlebih dahulu", "ERROR",JOptionPane.ERROR_MESSAGE);
        }else {
            int totalukt = 500000;
            int totalbulan = 0;
            
            if (januari.isSelected()) totalbulan++;
            if (februari.isSelected()) totalbulan++;
            if (maret.isSelected()) totalbulan++;
            if (april.isSelected()) totalbulan++;
            if (mei.isSelected()) totalbulan++;
            if (juni.isSelected()) totalbulan++;
            if (juli.isSelected()) totalbulan++;
            if (agustus.isSelected()) totalbulan++;
            if (september.isSelected()) totalbulan++;
            if (oktober.isSelected()) totalbulan++;
            if (november.isSelected()) totalbulan++;
            if (desember.isSelected()) totalbulan++;
            
            int total = totalbulan * totalukt;
            
            JOptionPane.showMessageDialog(this, "total yang harus dibayar: Rp " + total, "Total Pembayaran", JOptionPane.INFORMATION_MESSAGE);
            kolomtotal.setText("Rp " + total);
            
            kolomkembalian.setText("");
            kolomjumlah.setText("");
        }
        
    }//GEN-LAST:event_totalpembayaranActionPerformed

    private void kolomtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomtotalActionPerformed

    private void kolomjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomjumlahActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_kolomjumlahActionPerformed

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
            java.util.logging.Logger.getLogger(bayarspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bayarspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bayarspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bayarspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bayarspp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agustus;
    private javax.swing.JCheckBox april;
    private javax.swing.JButton bayar;
    private javax.swing.JLabel bulan;
    private javax.swing.JCheckBox desember;
    private javax.swing.JCheckBox februari;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox januari;
    private javax.swing.JCheckBox juli;
    private javax.swing.JLabel jumlah;
    private javax.swing.JCheckBox juni;
    private javax.swing.JLabel kembaliantext;
    private javax.swing.JTextField kolomjumlah;
    private javax.swing.JTextField kolomkembalian;
    private javax.swing.JTextField kolomnama;
    private javax.swing.JTextField kolomnim;
    private javax.swing.JTextField kolomtotal;
    private javax.swing.JCheckBox maret;
    private javax.swing.JCheckBox mei;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel niim;
    private javax.swing.JCheckBox november;
    private javax.swing.JCheckBox oktober;
    private javax.swing.JLabel pembayaranspp;
    private javax.swing.JLabel pembayaranspp1;
    private javax.swing.JCheckBox september;
    private javax.swing.JTable tabeldata;
    private javax.swing.JButton totalpembayaran;
    // End of variables declaration//GEN-END:variables
}