/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerDeposito;
import javax.swing.JOptionPane;

public class DepositoFrame extends javax.swing.JFrame {
    
    private ControllerDeposito c;
    private String CpfLogado;

       public DepositoFrame() {
        initComponents();
        c = new ControllerDeposito();
        this.CpfLogado = CpfLogado;
        atualizarSaldo();
        
    }

       
       private void atualizarSaldo(){
//           try{
//               double SaldoAtual = c.ObterSaldoAtual(CpfLogado);
//               txtnotinha.setText(String.format("%.2f", SaldoAtual));
//           }catch (Exception e){
//               txtnotinha.setText("Erro ao obter Saldo");
//           }
       }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtdeposito = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btdepositar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtnotinha = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        voltarbt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        voltarbt.setForeground(new java.awt.Color(0, 0, 0));
        voltarbt.setText("Voltar");
        voltarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarbtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Quanto deseja depositar?");

        txtdeposito.setBackground(new java.awt.Color(255, 255, 255));
        txtdeposito.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txtdeposito.setForeground(new java.awt.Color(0, 0, 0));
        txtdeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepositoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("R$");

        btdepositar.setBackground(new java.awt.Color(102, 102, 102));
        btdepositar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btdepositar.setForeground(new java.awt.Color(0, 0, 0));
        btdepositar.setText("Depositar");
        btdepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdepositarActionPerformed(evt);
            }
        });

        txtnotinha.setBackground(new java.awt.Color(255, 255, 255));
        txtnotinha.setColumns(20);
        txtnotinha.setForeground(new java.awt.Color(0, 0, 0));
        txtnotinha.setRows(5);
        jScrollPane1.setViewportView(txtnotinha);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltarbt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btdepositar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarbt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btdepositar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarbtActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_voltarbtActionPerformed

    private void txtdepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepositoActionPerformed
        
    }//GEN-LAST:event_txtdepositoActionPerformed

    private void btdepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdepositarActionPerformed
//        try{
//            double valorDeposito = Double.parseDouble(txtdeposito.getText());
//            c.depositar(CpfLogado, valorDeposito);
//            atualizarSaldo();
//            JOptionPane.showMessageDialog(this, "Depósito realizado com sucesso");
//            txtdeposito.setText("");
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(this, "Por favor, insira um valor numérico válido.");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Erro ao realizar depósito: " + e.getMessage());
//        }
    }//GEN-LAST:event_btdepositarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdepositar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtdeposito;
    private javax.swing.JTextArea txtnotinha;
    private javax.swing.JButton voltarbt;
    // End of variables declaration//GEN-END:variables
}
