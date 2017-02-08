/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.Arquivo;
import Model.Eleitores;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cleyb
 */
public class Aniversarios extends javax.swing.JPanel {

    private Logado logado;
    private int mes;
    private String mesString;
    private ArrayList<Eleitores> auxEleitores;
    private ArrayList<Eleitores> auxEleitoresAtual;
    private DefaultTableModel model;

    /**
     * Creates new form Aniversarios
     */
    public Aniversarios(Logado logado, String mes) {
        initComponents();
        this.logado = logado;
        this.logado.setTitle("Lista de aniversariantes");
        this.mesString = mes;
        this.mes = this.converteMes(mes);
        auxEleitores = new ArrayList<Eleitores>();
        this.selecionarUsers();
        auxEleitoresAtual = auxEleitores;
        model = (DefaultTableModel) jTable2.getModel();
        for (Eleitores atual : auxEleitores) {

            String auxMsg;
            if (atual.isEnviada()) {
                auxMsg = "ENVIADA";
            } else {
                auxMsg = "FALTA ENVIAR";
            }
            model.insertRow(model.getRowCount(), new Object[]{atual.getNome(), atual.getNascimento(), atual.getTelefone(), auxMsg, atual.isMarcado()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jButton2.setText("Ordenar por Nome");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ordenar por Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Abrir Selecionado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aniversariantes do mês");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nascimento", "Telefone", "Enviada", "Selecionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Desmarcar Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Selecionar Todos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Enviada");
        jButton6.setActionCommand("Enviada");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Não Enviada");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Abrir Todos Marcados");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Ordenar por Não Enviados");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Collections.sort(auxEleitores);
        this.add(auxEleitores);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Eleitores[] ordenar = new Eleitores[auxEleitores.size()];

        for (int i = 0; i < auxEleitores.size(); i++) {
            ordenar[i] = auxEleitores.get(i);
        }

        for (int i = 0; i < ordenar.length; i++) {
            for (int j = 0; j < ordenar.length - 1; j++) {
                if (ordenar[j].getDia() > ordenar[j + 1].getDia()) {
                    Eleitores aux = ordenar[j];
                    ordenar[j] = ordenar[j + 1];
                    ordenar[j + 1] = aux;
                }
            }
        }

        auxEleitores = new ArrayList<Eleitores>();
        for (int i = 0; i < ordenar.length; i++) {
            auxEleitores.add(ordenar[i]);
        }
        this.add(auxEleitores);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (jTable2.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(logado,
                    "Selesione uma pessoa",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            new User(auxEleitores.get(jTable2.getSelectedRow()));
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        boolean nenhum = true;
        for (int i = 0; i < auxEleitores.size(); i++) {
            if (jTable2.getModel().getValueAt(i, 4).equals(true)) {
                nenhum = false;
                auxEleitores.get(i).setEnviada(true);
                for (Eleitores atual : Controller.getInstance().getEleitores()) {
                    if (atual.getNome().equals(auxEleitores.get(i).getNome())) {
                        atual.setEnviada(true);
                    }
                }
            }
        }
        if(nenhum){
            JOptionPane.showMessageDialog(logado,
                    "Nenhuma pessoa foi marcada",
                    "Marcar pessoas",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            this.add(auxEleitores);
        }
        

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        boolean nenhum = true;
        
        for (int i = 0; i < auxEleitores.size(); i++) {
            if (jTable2.getModel().getValueAt(i, 4).equals(true)) {
                nenhum = false;
                auxEleitores.get(i).setEnviada(false);
                for (Eleitores atual : Controller.getInstance().getEleitores()) {
                    if (atual.getNome().equals(auxEleitores.get(i).getNome())) {
                        atual.setEnviada(false);
                    }
                }
            }
        }
        if(nenhum){
            JOptionPane.showMessageDialog(logado,
                    "Nenhuma pessoa foi marcada",
                    "Marcar pessoas",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            this.add(auxEleitores);
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < auxEleitores.size(); i++) {
            if (jTable2.getModel().getValueAt(i, 4).equals(true)) {
                auxEleitores.get(i).setEnviada(false);
                new User(auxEleitores.get(i));
            }
        }


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        for (Eleitores atual : auxEleitoresAtual) {
            atual.setMarcado(true);
        }

        this.add(auxEleitoresAtual);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (Eleitores atual : auxEleitoresAtual) {
            atual.setMarcado(false);
        }

        this.add(auxEleitoresAtual);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        // TODO add your handling code here:

        for (int i = 0; i < auxEleitores.size(); i++) {
            auxEleitores.get(i).setMarcado((boolean) jTable2.getModel().getValueAt(i, 4));
        }

    }//GEN-LAST:event_jTable2MouseReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:

        ArrayList<Eleitores> auxSearch = new ArrayList<Eleitores>();
        for (Eleitores userAtual : auxEleitores) {
            if (userAtual.getNome().contains(this.jTextField1.getText()) || String.valueOf(userAtual.getDia()).contains(this.jTextField1.getText())) {
                auxSearch.add(userAtual);
            }
        }

        this.add(auxSearch);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        Eleitores[] ordenar = new Eleitores[auxEleitores.size()];

        for (int i = 0; i < auxEleitores.size(); i++) {
            ordenar[i] = auxEleitores.get(i);
        }

        for (int i = 0; i < ordenar.length; i++) {
            for (int j = 0; j < ordenar.length - 1; j++) {
                if (ordenar[j].isEnviada() && !ordenar[j + 1].isEnviada()) {
                    Eleitores aux = ordenar[j];
                    ordenar[j] = ordenar[j + 1];
                    ordenar[j + 1] = aux;
                }
            }
        }

        auxEleitores = new ArrayList<Eleitores>();
        for (int i = 0; i < ordenar.length; i++) {
            auxEleitores.add(ordenar[i]);
        }
        this.add(auxEleitores);
        
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void add(ArrayList<Eleitores> aux) {
        for (int i = auxEleitoresAtual.size() - 1; i >= 0; i--) {

            model.removeRow(i);

        }
        for (Eleitores atual : aux) {
            String auxMsg;
            if (atual.isEnviada()) {
                auxMsg = "ENVIADA";
            } else {
                auxMsg = "FALTA ENVIAR";
            }
            model.insertRow(model.getRowCount(), new Object[]{atual.getNome(), atual.getNascimento(), atual.getTelefone(), auxMsg, atual.isMarcado()});

        }
        auxEleitoresAtual = aux;
        Arquivo.writeSilencie(Controller.getInstance().getDiretorio(), logado, Controller.getInstance());
    }

    private int converteMes(String mes) {
        if (mes.equals("Janeiro")) {
            return 1;
        } else if (mes.equals("Fevereiro")) {
            return 2;
        } else if (mes.equals("Marco")) {
            return 3;
        } else if (mes.equals("Abril")) {
            return 4;
        } else if (mes.equals("Maio")) {
            return 5;
        } else if (mes.equals("Junho")) {
            return 6;
        } else if (mes.equals("Julho")) {
            return 7;
        } else if (mes.equals("Agosto")) {
            return 8;
        } else if (mes.equals("Setembro")) {
            return 9;
        } else if (mes.equals("Outubro")) {
            return 10;
        } else if (mes.equals("Novembro")) {
            return 11;
        } else {
            return 12;
        }
    }

    private void selecionarUsers() {
        for (Eleitores atual : Controller.getInstance().getEleitores()) {
            if (atual.getMes() == mes) {
                atual.setMarcado(false);
                auxEleitores.add(atual);
            }
        }
    }
}
