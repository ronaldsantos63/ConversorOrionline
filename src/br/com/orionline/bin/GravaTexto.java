/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.orionline.bin;

import br.com.orionline.entidade.Clientes;
import br.com.orionline.entidade.ContaReceberAberta;
import br.com.orionline.entidade.Estoque;
import br.com.orionline.entidade.Fornecedor;
import br.com.orionline.entidade.Grupo;
import br.com.orionline.entidade.ImpostoFederal;
import br.com.orionline.entidade.ImpostoFederalProduto;
import br.com.orionline.entidade.Produto;
import br.com.orionline.entidade.ProdutoAUX;
import br.com.orionline.entidade.ProdutoFornecedor;
import br.com.orionline.entidade.Secao;
import br.com.orionline.entidade.SubGrupo;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import org.coury.jfilehelpers.engines.FileHelperEngine;
/**
 *
 * @author ronald
 */
public class GravaTexto {
    
    private final static Logger logger = Logger.getLogger(GravaTexto.class);
    public void geraProduto(List<Produto> produtoList){
        File pasta = new File("arquivos");
        if ( !pasta.exists() ){
            pasta.mkdir();
        }
        FileHelperEngine<Produto> engineProduto = 
                new FileHelperEngine<Produto>(Produto.class);
        try {
            engineProduto.writeFile("arquivos/SYSPPRO.TXT", produtoList);
        } catch (IOException ex) {
            logger.error("Erro ao gravar Produto em arquivo!", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo Produto!"
                    + "\nErro:"+ex.getMessage()+""
                    + "\nStackTrace: "+ex.getStackTrace(),"Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraFornecedor(List<Fornecedor> fornecedorList){
        File pasta = new File("arquivos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        FileHelperEngine<Fornecedor> engineFornecedor
                = new FileHelperEngine<Fornecedor>(Fornecedor.class);
        try {
            engineFornecedor.writeFile("arquivos/SYSPFOR.TXT", fornecedorList);
        } catch (IOException ex) {
            logger.error("Erro ao gravar Fornecedor em arquivo!", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo Fornecedor!"
                    + "\nErro:" + ex.getMessage() + ""
                    + "\nStackTrace: " + ex.getStackTrace(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraEstoque(List<Estoque> estoqueList){
        File pasta = new File("arquivos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        FileHelperEngine<Estoque> engineEstoque
                = new FileHelperEngine<Estoque>(Estoque.class);
        try {
            engineEstoque.writeFile("arquivos/SYSPEST.TXT", estoqueList);
        } catch (IOException ex) {
            logger.error("Erro ao gravar Estoque em arquivo!", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo Estoque!"
                    + "\nErro:" + ex.getMessage() + ""
                    + "\nStackTrace: " + ex.getStackTrace(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraGrupo(List<Grupo> grupoList){
        File pasta = new File("arquivos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        FileHelperEngine<Grupo> engineGrupo
                = new FileHelperEngine<Grupo>(Grupo.class);
        try {
            engineGrupo.writeFile("arquivos/SYSPGRP.TXT", grupoList);
        } catch (IOException ex) {
            logger.error("Erro ao gravar Grupo em arquivo!", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo Grupo!"
                    + "\nErro:" + ex.getMessage() + ""
                    + "\nStackTrace: " + ex.getStackTrace(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraProdutoAUX(List<ProdutoAUX> produtoAuxList){
        File pasta = new File("arquivos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        FileHelperEngine<ProdutoAUX> engineProdutoAux
                = new FileHelperEngine<ProdutoAUX>(ProdutoAUX.class);
        try {
            engineProdutoAux.writeFile("arquivos/SYSPAUX.TXT", produtoAuxList);
        } catch (IOException ex) {
            logger.error("Erro ao gravar Codigo de barras em arquivo", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo ProdutoAux!"
                    + "\nErro:" + ex.getMessage() + ""
                    + "\nStackTrace: " + ex.getStackTrace(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraItensFornecedor(List<ProdutoFornecedor> itensFornecList){
        File pasta = new File("arquivos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        FileHelperEngine<ProdutoFornecedor> engineItensFornec
                = new FileHelperEngine<ProdutoFornecedor>(ProdutoFornecedor.class);
        try {
            engineItensFornec.writeFile("arquivos/SYSPPROFOR.TXT", itensFornecList);
        } catch (IOException ex) {
            logger.error("Erro ao gravar Itens do Fornecedor em arquivo!", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo itensFornecedor!"
                    + "\nErro:" + ex.getMessage() + ""
                    + "\nStackTrace: " + ex.getStackTrace(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraSecao(List<Secao> secaoList){
        File pasta = new File("arquivos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        FileHelperEngine<Secao> engineSecao
                = new FileHelperEngine<Secao>(Secao.class);
        try {
            engineSecao.writeFile("arquivos/SYSPSEC.TXT", secaoList);
        } catch (IOException ex) {
            logger.error("Erro ao gravar Seção em arquivo!", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo Secao!"
                    + "\nErro:" + ex.getMessage() + ""
                    + "\nStackTrace: " + ex.getStackTrace(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraSubGrupo(List<SubGrupo> subgrupoList){
        File pasta = new File("arquivos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        FileHelperEngine<SubGrupo> engineSubGrupo
                = new FileHelperEngine<SubGrupo>(SubGrupo.class);
        try {
            engineSubGrupo.writeFile("arquivos/SYSPSBG.TXT", subgrupoList);
        } catch (IOException ex) {
            logger.error("Erro ao gravar SubGrupo em arquivo!", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo SubGrupo!"
                    + "\nErro:" + ex.getMessage() + ""
                    + "\nStackTrace: " + ex.getStackTrace(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraCliente(List<Clientes> clienteList){
        File pasta = new File("arquivos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        FileHelperEngine<Clientes> engineCliente
                = new FileHelperEngine<Clientes>(Clientes.class);
        try {
            engineCliente.writeFile("arquivos/SYSPCLI.TXT", clienteList);
        } catch (IOException ex) {
            logger.error("Erro ao gravar Cliente em arquivo!", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo Clientes!"
                    + "\nErro:" + ex.getMessage() + ""
                    + "\nStackTrace: " + ex.getStackTrace(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraImpFedProd(List<ImpostoFederalProduto> impFedProdList){
        File pasta = new File("arquivos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        FileHelperEngine<ImpostoFederalProduto> engineImpFedProd
                = new FileHelperEngine<ImpostoFederalProduto>(ImpostoFederalProduto.class);
        try {
            engineImpFedProd.writeFile("arquivos/SYSPIMPPRO.TXT", impFedProdList);
        } catch (IOException ex) {
            logger.error("Erro gravar Impostos Federais do Produto em arquivo!", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo Imposto Federal Produto!"
                    + "\nErro:" + ex.getMessage() + ""
                    + "\nStackTrace: " + ex.getStackTrace(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraImpFed(List<ImpostoFederal> impFedList) {
        File pasta = new File("arquivos");
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        FileHelperEngine<ImpostoFederal> engineImpFed
                = new FileHelperEngine<ImpostoFederal>(ImpostoFederal.class);
        try {
            engineImpFed.writeFile("arquivos/SYSPIMPPRO.TXT", impFedList);
        } catch (IOException ex) {
            logger.error("Erro ao gravar Impostos Federais em arquivo!", ex);
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro na gravação do arquivo Imposto Federal!"
                    + "\nErro:" + ex.getMessage() + ""
                    + "\nStackTrace: " + ex.getStackTrace(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void geraContasReceber(List<ContaReceberAberta> contaReceberList){
        
    }
}
