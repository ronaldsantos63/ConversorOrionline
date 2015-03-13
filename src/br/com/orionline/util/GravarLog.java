/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.orionline.util;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author ronald
 */
public class GravarLog {
    
    public void Gravar(String texto){
        String conteudo = texto;
        
        File pasta = new File("logs");
        if (!pasta.exists()){
            pasta.mkdir();
        }
        try{
            FileWriter x = new FileWriter("logs/log.err", true);
            
            conteudo += "\n\r";
            x.write(conteudo);
            x.close();
        } catch ( Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao gravar log!\nErro: "+ex.getMessage(),"Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
}
