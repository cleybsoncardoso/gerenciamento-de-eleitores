/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Arquivo;
import Model.CorpoMensagem;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author cleyb
 */
public class ControllerMensagem {
    
    private ArrayList <CorpoMensagem> mensagens;
    private JFrame f;
    
    public ControllerMensagem(JFrame f) {
        this.f = f;
        try{
        mensagens = (ArrayList <CorpoMensagem>) Arquivo.readMensagem(Controller.getInstance().getDiretorio(), f);
        } catch(ClassCastException e){
            mensagens = new ArrayList<CorpoMensagem>();
            Arquivo.writeMensagem(Controller.getInstance().getDiretorio(), f, mensagens);
        }
    }

    public ArrayList<CorpoMensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<CorpoMensagem> mensagens) {
        this.mensagens = mensagens;
    }

    public JFrame getF() {
        return f;
    }

    public void setF(JFrame f) {
        this.f = f;
    }
    
    public void addMensagem(CorpoMensagem c){
        mensagens.add(c);
        Arquivo.writeMensagem(Controller.getInstance().getDiretorio(), f, mensagens);
    }
    
    
    
    
}
