package ctojava;
public class MainFrame extends javax.swing.JFrame {
    
    /* global variabel */
    private HeaderData hData = new HeaderData();
    private Model model = new Model();
    
    
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnTraslate = new javax.swing.JButton();
        btnPaste = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(734, 499));
        setPreferredSize(new java.awt.Dimension(734, 499));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInput.setColumns(20);
        txtInput.setRows(5);
        txtInput.setText("// test project\n#include<stdio.h>\n\nint main() {\n    int a;\n    char b;\n    float c;\n    double d;\n    String e;\n    \n    printf(\"Hello World\\n\");\n    return 0;\n}");
        txtInput.setToolTipText("");
        txtInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInputFocusLost(evt);
            }
        });
        txtInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtInputMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtInputMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(txtInput);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 730, 200));

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        txtOutput.setToolTipText("");
        jScrollPane1.setViewportView(txtOutput);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 730, 200));

        btnTraslate.setText("Translate");
        btnTraslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraslateActionPerformed(evt);
            }
        });
        jPanel1.add(btnTraslate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        btnPaste.setText("Paste");
        jPanel1.add(btnPaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 80, -1));

        btnCopy.setText("Copy");
        jPanel1.add(btnCopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInputFocusGained
        if(txtInput.getText().equals("Masukkan Kodingan Bahasa C Disini ...")) {
            txtInput.setText("");
        }
    }//GEN-LAST:event_txtInputFocusGained

    private void txtInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInputFocusLost
        if(txtInput.getText().equals("")) {
            txtInput.setText("Masukkan Kodingan Bahasa C Disini ...");
        }
    }//GEN-LAST:event_txtInputFocusLost

    private void txtInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInputMouseExited
        if(txtInput.getText().equals("")) {
            txtInput.setText("Masukkan Kodingan Bahasa C Disini ...");
        }
    }//GEN-LAST:event_txtInputMouseExited

    private void txtInputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInputMouseEntered
        if(txtInput.getText().equals("Masukkan Kodingan Bahasa C Disini ...")) {
            txtInput.setText("");
        }
    }//GEN-LAST:event_txtInputMouseEntered
    
    private void printTest(float []data) {
        int countList = data.length;
        for(int i = 0; i < countList; i++) {
            System.out.println(data[i]);
        }
    }
    
    private void printTest(double []data) {
        int countList = data.length;
        for(int i = 0; i < countList; i++) {
            System.out.println(data[i]);
        }
    }
    
    private void printTest(int []data) {
        int countList = data.length;
        for(int i = 0; i < countList; i++) {
            System.out.println(data[i]);
        }
    }
    
    private void printTest(String []data) {
        int countList = data.length;
        for(int i = 0; i < countList; i++) {
            System.out.println(data[i]);
        }
    }
    
    private void processList(String []list) {
        int countList = list.length;
        hData.setFileName(model.extractHeader(list[0]));
        for(int i = 1; i < countList; i++) {
            hData.addGlobalVariabel(model.checkKeyword(list[i]));
        }
        
        int countGlobalVariable = hData.countGlobalVariabel();
        String dataHeader[] = hData.getGlobalVariabelAsArray();
        
        System.out.println("public class "+ hData.getFileName() +" {");
        
        for(int i = 0; i < countGlobalVariable; i++) {
            System.out.println(dataHeader[i]);
        }
        
        System.out.println("}");
    }
    
    private void btnTraslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraslateActionPerformed
        String inputText = txtInput.getText();
        if(!inputText.isEmpty()) {
            hData.reset();
            String []listInput = inputText.split("\n");
            processList(listInput);
        }
    }//GEN-LAST:event_btnTraslateActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnTraslate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
