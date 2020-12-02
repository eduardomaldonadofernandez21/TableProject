package com.mycompany.tableproject;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginVentana extends javax.swing.JInternalFrame {
   
    private JOptionPane dialog = new JOptionPane();
    private Interfaz frame;
    
    public LoginVentana(Interfaz interfaz){
        this.setIconifiable(true);
        this.setClosable(true);
        this.setResizable(false);
        frame = interfaz;
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        textFieldUsuario = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        buttonConecta = new javax.swing.JButton();

        labelUsuario.setText("Usuario:");

        labelContraseña.setText("Contraseña: ");

        buttonConecta.setText("Login");
        buttonConecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConectaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonConecta)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelContraseña))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuario)
                    .addComponent(textFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContraseña)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonConecta)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConectaActionPerformed
        if(textFieldUsuario.getText().equals("estudiante-DIU")){
            if(String.valueOf(passwordField.getPassword()).equals("DIU-aed56-noi")){
                this.dispose();
                try {
                    frame.loginSuccess();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginVentana.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(LoginVentana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                dialog.showMessageDialog(null,"Error al introducir la contraseña","Contraseña incorrecta", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            dialog.showMessageDialog(null,"Error al introducir el usuario","Usuario incorrecto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonConectaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConecta;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldUsuario;
    // End of variables declaration//GEN-END:variables

    private void System(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
