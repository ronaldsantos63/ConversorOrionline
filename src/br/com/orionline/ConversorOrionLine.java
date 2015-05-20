/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionline;

import br.com.orionline.controllers.ConectaBanco;
import br.com.orionline.gui.DialogConfDB;
import br.com.orionline.gui.Principal;
import java.awt.SystemColor;
import java.io.File;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.log4j.Logger;

/**
 *
 * @author ronald
 */
public class ConversorOrionLine {

    private static final Logger logger = Logger.getLogger(ConversorOrionLine.class);
    private static ConversorOrionLine instance = null;
    ConectaBanco cx = new ConectaBanco();

    public ConversorOrionLine() {
    }

    public void load() throws SQLException {
        
        //SkyBlue()
        //BrownSugar()
        // DarkStar()  
        //DesertGreen()
        //Silver()
        //ExperienceRoyale()
        try {
            logger.debug("Aplicando LookAndFeel...");
//            PlasticLookAndFeel.setPlasticTheme(new DarkStar());
            try {
                UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
                logger.debug("LookAndFeel Aplicado com sucesso!");
            } catch (InstantiationException ex) {
                logger.error("Erro ao intanciar LookAndFeel", ex);
            } catch (IllegalAccessException ex) {
                logger.info("Acesso Ilegal a classe LookAndFeel", ex);
            } catch (UnsupportedLookAndFeelException ex) {
                logger.error("lookAndFeel não suportado", ex);
            }

        } catch (ClassNotFoundException ex) {
            logger.error("Classe LookAndFeel não encontrada", ex);
        }
        
        logger.debug("Analisando arquivo de configuração");
        verificaProperties();
        logger.debug("Arquivo de configuração Analisado");
        
        logger.debug("Carregando janela principal...");
        Principal frm = new Principal();
        frm.setIconImage(new ImageIcon(getClass().getResource("imagens/logo.png")).getImage());
        frm.setBackground(SystemColor.BLACK);
        frm.setVisible(true);
        logger.debug("Janela Principal Carregada com sucesso");
    }

    private void verificaProperties() throws SQLException {
        logger.debug("Verificando se a pasta properties existe");
        File pasta = new File("properties");
        if (!pasta.exists()) {
            logger.debug("A pasta properties não existe!");
            logger.debug("Criando a pasta properties...");
            pasta.mkdir();
            logger.debug("Pasta properties criada com sucesso!");
            logger.debug("Carregando janela de configuração do banco de dados");
            DialogConfDB frm = new DialogConfDB(null, true);
            frm.setVisible(true);
            logger.debug("Janela de configuração do banco de dados carregada com sucesso!");
        } else {
            logger.debug("Verificando se arquivo de configuração do banco de dados existe...");
            File arqConf = new File("./properties/db.properties");
            if (!arqConf.exists()) {
                logger.debug("Arquivo de configuração não existe!");
                logger.debug("Carregando janela de configuração do banco de dados");
                DialogConfDB frm = new DialogConfDB(null, true);
                frm.setVisible(true);
                logger.debug("Janela de configuração do banco de dados carregada com sucesso!");
            }
        }
    }

    public static ConversorOrionLine getInstance() {
        if (instance == null) {
            instance = new ConversorOrionLine();
        }
        return instance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        logger.debug("Inciando aplicação");
        getInstance().load();
        logger.debug("Aplicação carregada com sucesso!");
    }

}
