package kuis;

/**
 *
 * @author septianenggarsukmana
 */
public class Kalkulator extends javax.swing.JFrame {
<<<<<<< HEAD
        public static LoginClass loginc = Login.loginc;
        public static KalkulatorClass mDataKalkulator = new
=======
<<<<<<< HEAD
    public static LoginClass loginc = new LoginClass();
    public static Login loginn;
    double a,b,c;
    public static KalkulatorClass datKalkulator=new KalkulatorClass();
=======
<<<<<<< HEAD
    public static LoginClass loginc = Login.loginc;
    public static Login loginn;
    double a, b, c;
    public static KalkulatorClass mHistoryDataKalkulator = new KalkulatorClass();

=======
    public static LoginClass loginc = new LoginClass();
    static KalkulatorClass mHistoryDataKalklator;
    
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
    /**
     * Creates new form Kalkulator
     */
    
    double a,b,c;
    String oprasi;

    
    public Kalkulator() {
        initComponents();
<<<<<<< HEAD
       //loginc = new LoginClass();
        jLabelHalo.setText(loginc.info());
=======
<<<<<<< HEAD
        //loginc=new LoginClass();
        jLabelHalo.setText(loginc.info());
        
        loginc=new LoginClass();
        
        if(RecordFrame)
        
=======
<<<<<<< HEAD
        jLabelHalo.setText(loginn.loginc.info());
        
        //if(RecordFrame)
=======
//        jLabelHalo.setText(loginc.info());
//        jLabelHalo.getText();

          LoginClass user = Login.loginc;
          if(user != null) {
              jLabelHalo.setText(user.getNama());
              telepon.setText(user.getTelepon());
          }
          
       if(Record.frame)
       
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textAngka1 = new javax.swing.JTextField();
        textAngka2 = new javax.swing.JTextField();
        textHasil = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelHalo = new javax.swing.JLabel();
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
        telepon = new javax.swing.JLabel();
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAngka1ActionPerformed(evt);
            }
        });

        textAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAngka2ActionPerformed(evt);
            }
        });

        textHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHasilActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Angka 1");

        jLabel2.setText("Angka 2");

        jLabel3.setText("Hasil");

<<<<<<< HEAD
        jLabelHalo.setText("Text");

=======
        jLabelHalo.setText("Halo");

<<<<<<< HEAD
=======
        telepon.setText("Halo");

>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
<<<<<<< HEAD
                        .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHalo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
=======
<<<<<<< HEAD
                        .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(textAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHalo)
                            .addGroup(layout.createSequentialGroup()
=======
<<<<<<< HEAD
                        .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelHalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(103, 103, 103))
=======
                        .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelHalo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(telepon))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(textAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(30, 30, 30)
                .addComponent(jLabelHalo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
=======
<<<<<<< HEAD
                .addGap(17, 17, 17)
                .addComponent(jLabelHalo)
                .addGap(18, 18, 18)
=======
                .addContainerGap()
<<<<<<< HEAD
                .addComponent(jLabelHalo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHalo)
                    .addComponent(telepon))
                .addGap(26, 26, 26)
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void textAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAngka1ActionPerformed
        // TODO add your handling code here:
        textAngka1.setText("");
    }//GEN-LAST:event_textAngka1ActionPerformed

    private void textAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAngka2ActionPerformed
        // TODO add your handling code here:
        textAngka2.setText("");
    }//GEN-LAST:event_textAngka2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        a = Double.parseDouble(textAngka1.getText());
        b = Double.parseDouble(textAngka1.getText());
=======
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         a = Double.parseDouble(textAngka1.getText());
         b = Double.parseDouble(textAngka2.getText());
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
        
        if (jComboBox1.getSelectedItem().equals("+")){
            c = a + b;
            String hasil = String.valueOf(c);
            textHasil.setText(hasil);
        }else if (jComboBox1.getSelectedItem().equals("-")){
            c = a - b;
            String hasil2 = String.valueOf(c);
            textHasil.setText(hasil2);
        } else if (jComboBox1.getSelectedItem().equals("*")){
            c = a * b;
            String hasil3 = String.valueOf(c);
            textHasil.setText(hasil3);
        } else if (jComboBox1.getSelectedItem().equals("/")) {
            c = a / b;
            String hasil4 = String.valueOf(c);
            textHasil.setText(hasil4);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

<<<<<<< HEAD
    private void textHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHasilActionPerformed

=======
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelHalo;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
    private javax.swing.JLabel telepon;
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
    private javax.swing.JTextField textAngka1;
    private javax.swing.JTextField textAngka2;
    private javax.swing.JTextField textHasil;
    // End of variables declaration//GEN-END:variables
}
