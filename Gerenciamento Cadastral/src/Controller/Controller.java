/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Arquivo;
import Model.Eleitores;
import Model.Usuario;
import View.Tela;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cleyb
 */
public class Controller implements Serializable{

    private ArrayList<Eleitores> eleitores;
    private ArrayList<Usuario> usuarios;
    private Tela frame;
    public static Controller controller;
    private String diretorio;


    public Controller() {
        this.eleitores = new ArrayList<Eleitores>();
        this.usuarios = new ArrayList<Usuario>();
    }
    
    public static void newInstance(Controller controllerSerial){
        controller = controllerSerial;
    }
    
    public static Controller getInstance() {
        return controller;
    }

    public boolean logar(String nome, String password) {
        //usuarios.add(new Usuario("a", "a"));
        //Arquivo.write(diretorio, frame, Controller.getInstance());
        for(Usuario userAtual:this.usuarios){
            
            if(userAtual.getLogin().equals(nome) && userAtual.getSenha().equals(password)){
                return true;
            }
        }
        return false;
    }

    public void deslogar() {

    }

    public void carregarInformacoes() {

    }

    public boolean salvar() {
        return false;
    }

    public boolean cadastrar() {
        return false;
    }

    public ArrayList<Eleitores> getEleitores() {
        return eleitores;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    

    public boolean editar() {
        return false;
    }

    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }
    

    public void setFrame(Tela tela) {
        this.frame = tela;
    }

}
