<<<<<<< HEAD
package kuis;

/**
 *
 * @author Windows
 */
public class RecordFrame extends javax.swing.JFrame {
    public static KalkulatorClass mHistoryData = new KalkulatorClass();
    
    DefaultTableModel model;
    
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import javax.swing.table.DefaultTableModel;

/**
 *
<<<<<<< HEAD
 * @author WINDOWS 10
 */
public class RecordFrame extends javax.swing.JFrame {
    public static KalkulatorClass mHistoryData=new KalkulatorClass();
    
    DefaultTableModel model;

=======
<<<<<<< HEAD
 * @author MSI GAMING
 */
=======
 * @author hokyt
 */

>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
public class RecordFrame extends javax.swing.JFrame {
    public static KalkulatorClass mHistoryData = new KalkulatorClass();
    
    DefaultTableModel model;
<<<<<<< HEAD

=======
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
    /**
     * Creates new form RecordFrame
     */
    public RecordFrame() {
        initComponents();
<<<<<<< HEAD
        mHistoryData = Kalkulator.mHistoryDataKalkulator;
        
        String[] NamaKolom = {"Angka1","Angka2","Operator","Hasil"};
        Object[][] objekKalkulator = new Object[mHistoryData.getData().size()][4];
   
        int index = 0;
        for (int ii = 0; ii < mHistoryData.getData().size(); ii++){
            Record model = mHistoryData.getData().get(ii);
            String[] array = {model.getAngka1(),
                              model.getAngka2(),
                              model.opertor(),
                              model.getHasil(),
            objekKalkulator[ii] = array;
                 
        }
        model = new DefaultTableModel(objekKalkulator, NamaKolom);
        jTableData.setModel(model);
=======
<<<<<<< HEAD
        mHistoryData = Kalkulator.datKalkulator;
        
        String[] NamaKolom={"Angka1","Angka2","Operator","Hasil"};
        Object[][] objekKalkulator=new Object[mHistoryData.getData().size()][4];
         
        
        int index=0;
        for (int ii=0; ii<mHistoryData.getData().size(); ii++){
            Record model = mHistoryData.getData().get(ii);
            String[] array = {model.getAngka1(),model.getAngka2(),model.getOperator(),model.getHasil()};
            objekKalkulator[ii]=array;
        }
        model = new DefaultTableModel(objekKalkulator,NamaKolom);
        jTableData.setModel(model);
        
=======
<<<<<<< HEAD
        mHistoryData = Kalkulator.mHistoryDataKalkulator;
        
        String[] NamaKolom = {"Angka1", "Angka2", "Operator", "Hasil"};
        Object[][] objekKalkulator = new Object[mHistoryData.getData().size()][4];
        
        int index = 0;
        for(int ii = 0; ii < mHistoryData.getData().size(); ii++) {
            Record model = mHistoryData.getData().get(ii);
            String[] array = {model.getAngka1(), model.getAngka2(), model.getOperator(), model.getHasil()};
            objekKalkulator[ii] =  array;
        }
        model = new DefaultTableModel(objekKalkulator, NamaKolom);
        jTabelData.setModel(model);
=======
        mHistoryData = Kalkulator.mHistoryDataKalklator;
        
        String[] NamaKolom = {"Angka 1", "Angka 2", "Operator", "Hasil"};
        Object[][] objekKalkulator = (Object[][]) new Object[mHistoryData.getData().size()];
        
        int index = 0;
        for (int ii = 0; ii < mHistoryData.getData().size(); ii++) {
            Record model = mHistoryData.getData().get(ii);
            String[] array = {model.getAngka1(), model.getAngka2(), model.getOperator(), model.getHasil()};
            objekKalkulator[ii] = array;
        }
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
<<<<<<< HEAD
        jTableData = new javax.swing.JTable();
=======
<<<<<<< HEAD
        jTableData = new javax.swing.JTable();
=======
<<<<<<< HEAD
        jTabelData = new javax.swing.JTable();
=======
        jTableData = new javax.swing.JTable();
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

<<<<<<< HEAD
        jTableData.setModel(new javax.swing.table.DefaultTableModel(
=======
<<<<<<< HEAD
        jTableData.setModel(new javax.swing.table.DefaultTableModel(
=======
<<<<<<< HEAD
        jTabelData.setModel(new javax.swing.table.DefaultTableModel(
=======
        jTableData.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
<<<<<<< HEAD
        jScrollPane1.setViewportView(jTableData);

        jButton1.setText("jButton1");
=======
<<<<<<< HEAD
        jScrollPane1.setViewportView(jTableData);

        jButton1.setText("jButton1");
=======
<<<<<<< HEAD
        jScrollPane1.setViewportView(jTabelData);

        jButton1.setText("Back");
=======
        jScrollPane1.setViewportView(jTableData);

        jButton1.setText("jButton1");
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 140, Short.MAX_VALUE))
=======
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(22, 22, 22))
=======
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
=======
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
=======
<<<<<<< HEAD
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
=======
<<<<<<< HEAD
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(79, Short.MAX_VALUE))
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
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
            java.util.logging.Logger.getLogger(RecordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
<<<<<<< HEAD
    private javax.swing.JTable jTableData;
=======
<<<<<<< HEAD
    private javax.swing.JTable jTableData;
=======
<<<<<<< HEAD
    private javax.swing.JTable jTabelData;
=======
    private javax.swing.JTable jTableData;
>>>>>>> 0d9954003ceb102cfdb7ff40f807ef729c91ac29
>>>>>>> e98d5f459e33b808bbbf5c127b74c610f3f901ae
>>>>>>> 617fc8f585ff199e7c0f7e2c7196ffd14ba7b789
    // End of variables declaration//GEN-END:variables
}
