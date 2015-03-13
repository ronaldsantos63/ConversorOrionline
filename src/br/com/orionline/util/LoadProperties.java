/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.orionline.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 *
 * @author ronald
 */
public class LoadProperties {
    
    private static final Logger logger = Logger.getLogger(LoadProperties.class);
    private static Properties defaultProps = null;

    // Local do arquivo mensagens.properties
    String localProperties = "properties/db.properties";

    /**
     * Construtor da Classe LoadProperties
     */
    public LoadProperties() {
        //ConectaBanco cx = new ConectaBanco();
        try {
            defaultProps = new Properties();

            // Aqui utilizamos um ClassLoader para carregar nosso arquivo
            // de propriedades.
            //InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream(localProperties);
            FileInputStream stream = new FileInputStream(localProperties);

            // Lê os dados do arquivo de propriedade
            defaultProps.load(stream);
        } catch (IOException ex) {
            logger.error("Erro no loadProperties", ex);
        }
    }

    /**
     * Recupera o valor da propriedade informada.
     *
     * @param Propriedade Caminho informado para recuperar seu Endereço.
     * @return Endereço do caminho.
     */
    public String getPropriedade(String Propriedade) {
        return defaultProps.getProperty(Propriedade);
    }
    
}
