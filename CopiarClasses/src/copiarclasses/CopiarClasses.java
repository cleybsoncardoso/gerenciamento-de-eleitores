/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiarclasses;

import Controller.Controller;
import Model.Eleitores;
import Model.EleitoresNovo;
import Model.Usuario;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cleyb
 */
public class CopiarClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Controller.newInstance(Arquivo.read("a"));
            System.out.println("copiado");
            ArrayList  <EleitoresNovo> aux = new ArrayList<EleitoresNovo>();
            
            for (Eleitores atual : Controller.getInstance().getEleitores()) {
                System.out.println(atual.getNome());
                aux.add(new EleitoresNovo(atual.getNome(), atual.getNascimento(), atual.getRua(), atual.getNumero(), atual.getBairro(), atual.getCidade(), atual.getCEP(), "", atual.getTelefone(), "", atual.getEmail(), atual.getDateFormat()));
            }
            Arquivo.write("E:\\pessoas.date", aux);
            Arquivo.write("E:\\usuarios.date", Controller.getInstance().getUsuarios());
 
            
        } catch (IOException ex) {
            Logger.getLogger(CopiarClasses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CopiarClasses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
