/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.Arquivo;
import Model.Eleitores;
import Model.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author cleyb
 */
public class GerenciarEleitores extends javax.swing.JPanel {

    private Logado logado;

    /**
     * Creates new form GerenciarEleitores
     */
    public GerenciarEleitores(Logado logado) {
        initComponents();
        this.logado = logado;
        this.logado.setTitle("Lista de Pessoas cadastradas no sistema");
        this.atualizar();
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
        jList1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jToggleButton2.setText("Cadastrar");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 866, Short.MAX_VALUE)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        // TODO add your handling code here:
        logado.setContentPane(new CadastroEleitor(logado));
        logado.setVisible(true);
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        ArrayList<Eleitores> ordenar = Controller.getInstance().getEleitores();
        Collections.sort(ordenar);
        ArrayList<Eleitores> users = ordenar;
        ArrayList<Eleitores> auxSearch = new ArrayList<Eleitores>();
        for (Eleitores userAtual : users) {
            if (userAtual.getNome().contains(this.jTextField1.getText())) {
                auxSearch.add(userAtual);
            }
        }

        String[] aux = new String[auxSearch.size()];
        for (int i = 0; i < auxSearch.size(); i++) {
            aux[i] = auxSearch.get(i).getNome();
        }
        jList1.setListData(aux);

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:

        Eleitores selecionada = null;
        for (Eleitores atual : Controller.getInstance().getEleitores()) {
            if (atual.getNome().equals(this.jList1.getSelectedValue())) {
                selecionada = atual;
            }
        }
        jTextField1.setText("");
        this.logado.setContentPane(new AbrirEleitor(this.logado, selecionada, "lista", false));
        this.logado.setVisible(true);

    }//GEN-LAST:event_jList1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

    private void atualizar() {
        ArrayList<Eleitores> ordenar = Controller.getInstance().getEleitores();
       
        Collections.sort(ordenar);
        ArrayList<Eleitores> users = ordenar;
        String[] aux = new String[users.size()];
        for (int i = 0; i < users.size(); i++) {
            aux[i] = users.get(i).getNome();
        }
        jList1.setListData(aux);
    }
}
