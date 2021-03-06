/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiarclasses;

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
public class ArquivoNovo {

    public static void write(String diretorio, Object salvar) throws FileNotFoundException, IOException {

        String auxiliar = diretorio;
        FileOutputStream fileOut = new FileOutputStream(auxiliar);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(salvar);
        out.close();
        fileOut.close();

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

    public static Object read(String diretorio) throws FileNotFoundException, IOException, ClassNotFoundException {
        Object aux = null;

        String auxiliar = diretorio;
        FileInputStream fileIn = new FileInputStream(auxiliar);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        aux = in.readObject();
        in.close();
        fileIn.close();

        return aux;

        
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

}
