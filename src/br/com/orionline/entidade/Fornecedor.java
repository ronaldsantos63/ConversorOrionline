/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.orionline.entidade;

import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FieldOptional;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.annotations.FieldTrim;
import org.coury.jfilehelpers.enums.AlignMode;
import org.coury.jfilehelpers.enums.TrimMode;
/**
 *
 * @author rayanne nascimento
 */
@FixedLengthRecord()
public class Fornecedor {
    
    @FieldFixedLength(4)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codFornecedor;
    
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String descricao;
    
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String endereco;
    
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String bairro;
    
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String cidade;
    
    @FieldFixedLength(2)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String estado;
    
    @FieldOptional
    @FieldTrim(trimMode = TrimMode.Right, trimChars = ' ')
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = ' ')
    private String telefone;
    
    @FieldOptional
    @FieldTrim(trimMode = TrimMode.Right, trimChars = ' ')
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = ' ')
    private String fax;
    
    @FieldOptional
    @FieldTrim(trimMode = TrimMode.Right, trimChars = ' ')
    @FieldFixedLength(10)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = ' ')
    private String cep;
    
    @FieldOptional
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String contato;
    
    @FieldOptional
    @FieldFixedLength(70)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String obervacao;
    
    @FieldOptional
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomeFantasia;
    
    @FieldFixedLength(6)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String numeroFornecedor;
    
    @FieldOptional
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String complemento;
    
    @FieldFixedLength(14)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String cnpj;
    
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String IE;

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getObervacao() {
        return obervacao;
    }

    public void setObervacao(String obervacao) {
        this.obervacao = obervacao;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNumeroFornecedor() {
        return numeroFornecedor;
    }

    public void setNumeroFornecedor(String numeroFornecedor) {
        this.numeroFornecedor = numeroFornecedor;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }
    
}