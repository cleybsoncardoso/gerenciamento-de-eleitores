/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Controller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author cleyb
 */
public class Arquivo {
    
    public static void write(String diretorio, JFrame frame, Object salvar) {
        try {//serializa e salva os usuarios
            String auxiliar = diretorio + "luiz.date";
            FileOutputStream fileOut = new FileOutputStream(auxiliar);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(salvar);
            out.close();
            fileOut.close();
            JOptionPane.showMessageDialog(frame, "Arquivo criado com sucesso", "Sucesso", JOptionPane.PLAIN_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(frame, "Arquivo não encontrado, criando arquivo para execução", "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Erro ao salvar arquivo", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    
    public static void writeSilencie(String diretorio, JFrame frame, Object salvar) {
        try {//serializa e salva os usuarios
            String auxiliar = diretorio + "luiz.date";
            FileOutputStream fileOut = new FileOutputStream(auxiliar);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(salvar);
            out.close();
            fileOut.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(frame, "Arquivo não encontrado, criando arquivo para execução", "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Erro ao salvar arquivo", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static Controller read(String diretorio, JFrame frame) {
        Controller aux;
        try {//pega a serialização dos usuarios já cadastrados.
            String auxiliar = diretorio + "luiz.date";
            FileInputStream fileIn = new FileInputStream(auxiliar);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            aux = (Controller) in.readObject();
            in.close();
            fileIn.close();
            Controller.newInstance(aux);
            return aux;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(frame, "Arquivo não encontrado, criando arquivo para execução", "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(frame, "Erro na leitura", "Error", JOptionPane.ERROR_MESSAGE);

        }
        Controller.newInstance(new Controller());
        return new Controller();
    }
    
    public static void writeMensagem(String diretorio, JFrame frame, Object salvar) {
        try {//serializa e salva os usuarios
            String auxiliar = diretorio + "mensagens.date";
            FileOutputStream fileOut = new FileOutputStream(auxiliar);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(salvar);
            out.close();
            fileOut.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(frame, "Arquivo não encontrado, criando arquivo para execução", "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Erro ao salvar arquivo", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
     public static ArrayList<CorpoMensagem> readMensagem(String diretorio, JFrame frame) {
        ArrayList<CorpoMensagem> aux;
        try {//pega a serialização dos usuarios já cadastrados.
            String auxiliar = diretorio + "mensagens.date";
            FileInputStream fileIn = new FileInputStream(auxiliar);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            aux =  (ArrayList<CorpoMensagem>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Model.Arquivo.readMensagem()");
            return aux;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(frame, "Arquivo não encontrado, criando arquivo para execução", "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(frame, "Erro na leitura", "Error", JOptionPane.ERROR_MESSAGE);

        }
        Controller.newInstance(new Controller());
        return new ArrayList<CorpoMensagem>();
    }
    
}
