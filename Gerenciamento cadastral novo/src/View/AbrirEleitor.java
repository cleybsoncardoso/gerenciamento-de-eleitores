/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.Arquivo;
import Model.EleitoresNovo;
import Model.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author cleyb
 */
public class AbrirEleitor extends javax.swing.JPanel {

    private JFrame logado;
    private EleitoresNovo eleitor;
    private boolean editar = false, ativar;
    private String anterior;

    /**
     * Creates new form AbrirEleitor
     */
    public AbrirEleitor(JFrame logado, EleitoresNovo eleitor, String anterior, boolean ativar) {
        initComponents();
        this.logado = logado;
        this.logado.setTitle("Abrir cadastro");
        this.eleitor = eleitor;
        jTextFieldNome.setText(eleitor.getNome());
        jFormattedTextField3.setText(eleitor.getDateFormat());
        jFormattedTextFieldcep.setText(eleitor.getCEP());
        jFormattedTextFieldtelefone1.setText(eleitor.getTelefone());
        jFormattedTextFieldcelular1.setText(eleitor.getCelular1());
        jFormattedTextFieldCelular2.setText(eleitor.getCelular2());
        jTextFieldbairro.setText(eleitor.getBairro());
        jTextFieldcidade.setText(eleitor.getCidade());
        jTextFieldemail1.setText(eleitor.getEmail());
        jTextFieldn.setText(eleitor.getNumero());
        jTextFieldrua.setText(eleitor.getRua());
        jLabel1.setText(eleitor.getNome());
        this.ativar = ativar;
        if (ativar) {
            jButton1.hide();
            jButton3.hide();
        }
        this.anterior = anterior;
        this.edicao();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldrua = new javax.swing.JTextField();
        jTextFieldn = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldcidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextFieldcep = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldbairro = new javax.swing.JTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextFieldcelular1 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCelular2 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldtelefone1 = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldemail1 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pessoa");

        jLabel9.setText("Nº");

        jTextFieldrua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldruaActionPerformed(evt);
            }
        });

        jLabel10.setText("Cidade");

        jLabel11.setText("CEP");

        try {
            jFormattedTextFieldcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Nome");

        jLabel6.setText("Rua");

        jLabel7.setText("Nascimento");

        jLabel12.setText("Bairro");

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Observação");

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Adicionar Observação");
        jButton2.setActionCommand("Adicionar Observaçã");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel13.setText("Celular");

        jLabel14.setText("Celular");

        jLabel15.setText("Telefone");

        try {
            jFormattedTextFieldcelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldCelular2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldtelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFormattedTextFieldcelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel16))
                                    .addGap(13, 13, 13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextFieldrua, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldn))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel14)
                                            .addGap(18, 18, 18)
                                            .addComponent(jFormattedTextFieldCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(78, 78, 78)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jFormattedTextFieldtelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jTextFieldemail1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jTextFieldcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jFormattedTextFieldcep, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldbairro)))))
                            .addGap(212, 212, 212)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jFormattedTextFieldcelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jFormattedTextFieldCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jFormattedTextFieldtelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldemail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jTextFieldbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldrua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(105, 105, 105))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldruaActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Controller.getInstance().getEleitores().remove(eleitor);
        Arquivo.write(Controller.getInstance().getDiretorio() + "\\pessoas.date", logado, Controller.getInstance().getEleitores());
        this.logado.setContentPane(new GerenciarEleitores((Logado) logado));
        logado.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldNome.getText().equals("")) {
            this.editar = !isEditar();
            if (this.jButton3.getText().equals("Editar")) {
                this.jButton3.setText("Salvar");
            } else {
                this.jButton3.setText("Editar");
            }
            if (!this.editar) {

                EleitoresNovo editado = new EleitoresNovo(jTextFieldNome.getText(),
                        jFormattedTextField3.getText(), jTextFieldrua.getText(), jTextFieldn.getText(),
                        jTextFieldbairro.getText(), jTextFieldcidade.getText(), jFormattedTextFieldcep.getText(),
                        jFormattedTextFieldtelefone1.getText(),jFormattedTextFieldcelular1.getText(),
                        jFormattedTextFieldCelular2.getText(),jTextFieldemail1.getText(), jFormattedTextField3.getText());
                editado.setComentario(eleitor.getComentario());
                Controller.getInstance().getEleitores().remove(eleitor);
                Controller.getInstance().getEleitores().add(editado);
                Arquivo.write(Controller.getInstance().getDiretorio() + "\\pessoas.date", logado, Controller.getInstance().getEleitores());
                eleitor = editado;
            }
            this.edicao();
        } else {
            JOptionPane.showMessageDialog(logado,
                    "Informe o nome para poder salvar a edição da pessoa no sistema",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton3ActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(ativar){
            logado.dispose();
        } else{
        if (this.anterior.equals("lista")) {
            this.logado.setContentPane(new GerenciarEleitores((Logado) logado));
            logado.setVisible(true);
        } else {
            this.logado.setContentPane(new Aniversarios((Logado) logado, this.anterior));
            logado.setVisible(true);
        }
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String s = (String) JOptionPane.showInputDialog(
                logado,
                "Informe a observacao",
                "Adicionar OBS",
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                "");

        if ((s != null) && (s.length() > 0)) {
            eleitor.getComentario().add(s);
            this.atualizar();
            Arquivo.write(Controller.getInstance().getDiretorio()+ "\\pessoas.date", logado, Controller.getInstance().getEleitores());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (this.jList1.getSelectedValue() != null) {
            int n = JOptionPane.showConfirmDialog(logado, "Deseja deletar " + this.jList1.getSelectedValue() + " ?", "Deletar OBS", JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                String remove = null;
                for (String atual : eleitor.getComentario()) {
                    if (atual.equals(this.jList1.getSelectedValue())) {
                        remove = atual;
                    }
                }
                eleitor.getComentario().remove(remove);
                this.atualizar();
                Arquivo.write(Controller.getInstance().getDiretorio(), logado, Controller.getInstance());
            }
        }

    }//GEN-LAST:event_jList1MouseClicked

    public boolean isEditar() {
        return editar;
    }

    private void edicao() {
        jTextFieldNome.setEnabled(editar);
        jFormattedTextField3.setEnabled(editar);
        jFormattedTextFieldcep.setEnabled(editar);
        jFormattedTextFieldtelefone1.setEnabled(editar);
        jFormattedTextFieldcelular1.setEnabled(editar);
        jFormattedTextFieldCelular2.setEnabled(editar);
        jTextFieldbairro.setEnabled(editar);
        jTextFieldcidade.setEnabled(editar);
        jTextFieldemail1.setEnabled(editar);
        jTextFieldn.setEnabled(editar);
        jTextFieldrua.setEnabled(editar);

    }

    private void atualizar() {

        ArrayList<String> comentarios = eleitor.getComentario();
        String[] aux = new String[comentarios.size()];
        for (int i = 0; i < comentarios.size(); i++) {
            aux[i] = comentarios.get(i);
        }
        jList1.setListData(aux);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelular2;
    private javax.swing.JFormattedTextField jFormattedTextFieldcelular1;
    private javax.swing.JFormattedTextField jFormattedTextFieldcep;
    private javax.swing.JFormattedTextField jFormattedTextFieldtelefone1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldbairro;
    private javax.swing.JTextField jTextFieldcidade;
    private javax.swing.JTextField jTextFieldemail1;
    private javax.swing.JTextField jTextFieldn;
    private javax.swing.JTextField jTextFieldrua;
    // End of variables declaration//GEN-END:variables

}