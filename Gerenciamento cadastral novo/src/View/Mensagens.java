/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerMensagem;
import Model.Arquivo;
import Model.CorpoMensagem;
import Model.EleitoresNovo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cleyb
 */
public class Mensagens extends javax.swing.JPanel {

    private Logado logado;
    public ArrayList<CorpoMensagem> auxSelecionados, todasMensagens;
    private DefaultTableModel model;


    /**
     * Creates new form Aniversarios
     */
    public Mensagens( Logado logado) {
        initComponents();
        this.logado = logado;
        this.logado.setTitle("Selecionar pessoas");
        this.auxSelecionados = new ControllerMensagem(logado).getMensagens();
        System.out.println(auxSelecionados.size());
        model = (DefaultTableModel) jTable2.getModel();
        for (CorpoMensagem atual : auxSelecionados) {
            model.insertRow(model.getRowCount(), new Object[]{atual.getNome(), atual.getTelefone(), atual.getData(), atual.getMensagem()});
        }
        this.todasMensagens = auxSelecionados;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Data", "Mensagem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton6.setText("Abrir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(573, 811, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            User m = new User(auxSelecionados.get(jTable2.getSelectedRow()));
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
        


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:

        ArrayList<CorpoMensagem> auxSearch = new ArrayList<CorpoMensagem>();
        for (CorpoMensagem userAtual : todasMensagens) {
            if (userAtual.getNome().contains(this.jTextField1.getText()) || userAtual.getData().contains(this.jTextField1.getText()) || userAtual.getTelefone().contains(this.jTextField1.getText())) {
                auxSearch.add(userAtual);
            }
        }

        this.add(auxSearch);
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void add(ArrayList<CorpoMensagem> aux) {
        for (int i = auxSelecionados.size() - 1; i >= 0; i--) {

            model.removeRow(i);

        }
        for (CorpoMensagem atual : aux) {
            model.insertRow(model.getRowCount(), new Object[]{atual.getNome(), atual.getTelefone(), atual.getData(), atual.getMensagem()});

        }
        auxSelecionados = aux;
    }

}