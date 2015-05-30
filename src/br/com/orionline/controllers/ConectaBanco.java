/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.orionline.controllers;

import br.com.orionline.util.LoadProperties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.jdesktop.swingx.JXErrorPane;
import org.jdesktop.swingx.error.ErrorInfo;

/**
 *
 * @author rayanne nascimento
 */
public class ConectaBanco {
    
    Logger logger = Logger.getLogger(ConectaBanco.class);
    LoadProperties props = new LoadProperties();
    public Statement stm;
    public ResultSet rs;
    public Connection conn;
    
    public String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    public String url = "jdbc:odbc:Driver={Microsoft dBase Driver (*.dbf)};DBQ="+props.getPropriedade("caminhoDB");
//    public String url = "jdbc:odbc:Driver={Driver do Microsoft dBase(*.dbf)};DBQ=" + props.getPropriedade("caminhoDB");
    
    public void conexao(){
        logger.debug("Abrindo conexão com o banco de dados...");
        try {
            logger.debug("Registrando driver do banco de dados...");
            Class.forName(driver).newInstance();
            logger.debug("Driver registrado com sucesso!");
            conn = DriverManager.getConnection(url);
            logger.debug("Conexão com o banco de dados aberta com sucesso!");
        } catch (ClassNotFoundException ex) {
            logger.error("Classe não encontrada", ex);
            JXErrorPane.showDialog(null,
                    new ErrorInfo("OrionLine Automação Comercial",
                            "Erro ao conectar ao banco de dados ",
                            "<html><body>"
                            + "<h1><center>ClassNotFoundException: </center></h1>"
                            + "<p><b>" + ex.fillInStackTrace()
                            + "<b></p></body></html>", "Erro", ex, Level.ALL, null));
//            JOptionPane.showMessageDialog(null,"Erro ao carregar Driver do banco de dados!","Atenção", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            logger.error("SQLException", ex);
            JXErrorPane.showDialog(null,
                    new ErrorInfo("OrionLine Automação Comercial",
                            "Erro ao conectar ao banco de dados ",
                            "<html>"
                            + "<body><div>"
                            + "<h1><center style=color: activeborder>SQLException: </center></h1>"
                            + "<p><b>" + ex.fillInStackTrace()
                            + "<b></p></div></body></html>", "Erro", ex, Level.ALL, null));
//            JOptionPane.showMessageDialog(null, "Erro ao conectar ao Banco de Dados!","Atenção", JOptionPane.ERROR_MESSAGE);
        } catch (InstantiationException ex) {
            logger.error("Erro ao intanciar classe", ex);
            JXErrorPane.showDialog(null,
                    new ErrorInfo("OrionLine Automação Comercial",
                            "Erro ao conectar ao banco de dados\n"
                                    + "O erro ocorreu ao instanciar classe ",
                            "<html><body style=background-image: "
                            + "url('br/com/orionline/imagens/logo.png')>"
                            + "<h1><center>InstantiationException: </center></h1>"
                            + "<p><b>" + ex.fillInStackTrace()
                            + "<b></p></body></html>", "Erro", ex, Level.ALL, null));
        } catch (IllegalAccessException ex) {
            logger.error("Acesso ilegal", ex);
        }
    }
    public void executaQuery(String sql){
        logger.debug("Executando query...");
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            logger.debug("query executada com sucesso!");
        } catch (SQLException ex) {
            logger.error("Ocorreu um erro na query: " + sql, ex);
            JXErrorPane.showDialog(null,
                    new ErrorInfo("OrionLine Automação Comercial",
                            "Erro ao executar a query:\n" + sql,
                            "<html>"
                            + "<body><div>"
                            + "<h1><center style=color: activeborder>SQLException: </center></h1>"
                            + "<p><b>" + ex.fillInStackTrace()
                            + "<b></p></div></body></html>", "Erro", ex, Level.ALL, null));
        }
    }
    
    public void desconecta(){
        logger.debug("Fechando conexão com o banco de dados");
        try {
            conn.close();
            logger.debug("Conexão com o banco de dados fechada com sucesso!");
        } catch (SQLException ex) {
            logger.error("Erro ao fechar conexão com o banco de dados", ex);
        }
    }
}
