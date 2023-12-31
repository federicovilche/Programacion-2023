/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package curso.tecnicas.GUI;

import java.awt.Color;

/**
 *
 * @author Alumno15
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
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

        grupoEstadoCivil = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        chkTablet = new javax.swing.JCheckBox();
        chkSmartphone = new javax.swing.JCheckBox();
        chkNotebook = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMensajeSalida = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnCargar1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        rbnCasado = new javax.swing.JRadioButton();
        rbnSoltero = new javax.swing.JRadioButton();
        rbnDivorciado = new javax.swing.JRadioButton();
        rbnViudo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cmbColores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Apellido:");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        chkTablet.setText("Tablet");

        chkSmartphone.setText("Smartphone");
        chkSmartphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSmartphoneActionPerformed(evt);
            }
        });

        chkNotebook.setText("Notebook");
        chkNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNotebookActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Seleccione, si tiene:");

        txaMensajeSalida.setEditable(false);
        txaMensajeSalida.setColumns(20);
        txaMensajeSalida.setRows(5);
        jScrollPane1.setViewportView(txaMensajeSalida);

        btnLimpiar.setBackground(new java.awt.Color(255, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCargar1.setBackground(new java.awt.Color(0, 204, 0));
        btnCargar1.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        btnCargar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar1.setText("CARGAR");
        btnCargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargar1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Estado civil:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        grupoEstadoCivil.add(rbnCasado);
        rbnCasado.setText("Casado");

        grupoEstadoCivil.add(rbnSoltero);
        rbnSoltero.setText("Soltero");
        rbnSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnSolteroActionPerformed(evt);
            }
        });

        grupoEstadoCivil.add(rbnDivorciado);
        rbnDivorciado.setText("Divorciado");

        grupoEstadoCivil.add(rbnViudo);
        rbnViudo.setText("Viudo");

        jLabel4.setText("Seleccione un color");

        cmbColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Gris", "Naranja", "Púrpura", "Rojo", "Rosa", "Verde" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(chkSmartphone)
                                    .addComponent(chkNotebook)
                                    .addComponent(chkTablet))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbnViudo)
                                    .addComponent(rbnDivorciado)
                                    .addComponent(rbnSoltero)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rbnCasado))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))))))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCargar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSmartphone)
                    .addComponent(rbnCasado)
                    .addComponent(cmbColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNotebook)
                    .addComponent(rbnSoltero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkTablet)
                    .addComponent(rbnDivorciado))
                .addGap(7, 7, 7)
                .addComponent(rbnViudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargar1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void chkNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNotebookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNotebookActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
limpiarFormulario();
        
       
       
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void limpiarFormulario() {
        txtNombre.setText("");
        txtApellido.setText("");
        txaMensajeSalida.setText("");
        chkSmartphone.setSelected(false);
        chkTablet.setSelected(false);
        chkNotebook.setSelected(false);
        grupoEstadoCivil.clearSelection();
        txtNombre.requestFocus();
    }
    public void ponerColor(){
        String color= (String)cmbColores.getSelectedItem();
        switch(color) {
            case "Azul":
                txaMensajeSalida.setBackground(Color.BLUE);
                txaMensajeSalida.setForeground(Color.white);break;
            case "Gris":
                txaMensajeSalida.setBackground(Color.GRAY);
                txaMensajeSalida.setForeground(Color.white);break;
            case "Naranja":
                txaMensajeSalida.setBackground(Color.orange);
                txaMensajeSalida.setForeground(Color.white);break;
            case "Púrpura":
                txaMensajeSalida.setBackground(Color.magenta);
                txaMensajeSalida.setForeground(Color.white);break;
            case "Rojo":
                txaMensajeSalida.setBackground(Color.red);
                txaMensajeSalida.setForeground(Color.white);break;
            case "Rosa":
                txaMensajeSalida.setBackground(Color.pink);
                txaMensajeSalida.setForeground(Color.black);break;
            case "Verde":
                txaMensajeSalida.setBackground(Color.green);
                txaMensajeSalida.setForeground(Color.black);break;
        }
    }

    private void chkSmartphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSmartphoneActionPerformed

    }//GEN-LAST:event_chkSmartphoneActionPerformed

    private void btnCargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargar1ActionPerformed
       String nombre=txtNombre.getText();
       String apellido=txtApellido.getText();
       String texto="Hola "+nombre+" "+apellido+"!!\n";
       if(chkNotebook.isSelected())texto +=" tienes notebook.\n";
if(chkSmartphone.isSelected())texto +=" tienes smartphone.\n";
if(chkTablet.isSelected())texto +=" tienes tablet.\n";
       
       if(rbnCasado.isSelected())texto+= "Su estado es "+rbnCasado.getText()+"\n";
       if(rbnSoltero.isSelected())texto+= "Su estado es "+rbnSoltero.getText()+"\n";
       if(rbnDivorciado.isSelected())texto+= "Su estado es "+rbnDivorciado.getText()+"\n";
       if(rbnViudo.isSelected())texto+= "Su estado es "+rbnViudo.getText()+"\n";
       txaMensajeSalida.setText(texto);
       ponerColor();
    }//GEN-LAST:event_btnCargar1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void rbnSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnSolteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnSolteroActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkNotebook;
    private javax.swing.JCheckBox chkSmartphone;
    private javax.swing.JCheckBox chkTablet;
    private javax.swing.JComboBox<String> cmbColores;
    private javax.swing.ButtonGroup grupoEstadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rbnCasado;
    private javax.swing.JRadioButton rbnDivorciado;
    private javax.swing.JRadioButton rbnSoltero;
    private javax.swing.JRadioButton rbnViudo;
    private javax.swing.JTextArea txaMensajeSalida;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
