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
import org.coury.jfilehelpers.enums.AlignMode;
/**
 *
 * @author ronald
 */
@FixedLengthRecord()
public class ContaReceberAberta {
    
    @FieldFixedLength(1)
    private String tipo;
    
    @FieldFixedLength(4)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer loja;
    
    @FieldFixedLength(10)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private String nrDoc;
    
    @FieldFixedLength(1)
    private String tipoPagamento;
    
    @FieldFixedLength(4)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codAgente;
    
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codCliente;
    
    @FieldOptional()
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String dataEmissao;
    
    @FieldOptional()
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String dataVencimento;
    
    @FieldOptional()
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String dataPagamento;
    
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double valorNominal;
    
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double totalRecebido;
    
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double valorDevido;
    
    @FieldOptional()
    @FieldFixedLength(45)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String observacao;
    
    @FieldOptional()
    @FieldFixedLength(6)
    private String codAuxiliar;
    
    @FieldOptional()
    @FieldFixedLength(8)
    private String dataCalculo;
    
    @FieldOptional
    @FieldFixedLength(6)
    private String sequencial;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getLoja() {
        return loja;
    }

    public void setLoja(Integer loja) {
        this.loja = loja;
    }

    public String getNrDoc() {
        return nrDoc;
    }

    public void setNrDoc(String nrDoc) {
        this.nrDoc = nrDoc;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Integer getCodAgente() {
        return codAgente;
    }

    public void setCodAgente(Integer codAgente) {
        this.codAgente = codAgente;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(Double valorNominal) {
        this.valorNominal = valorNominal;
    }

    public Double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(Double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

    public Double getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(Double valorDevido) {
        this.valorDevido = valorDevido;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getCodAuxiliar() {
        return codAuxiliar;
    }

    public void setCodAuxiliar(String codAuxiliar) {
        this.codAuxiliar = codAuxiliar;
    }

    public String getDataCalculo() {
        return dataCalculo;
    }

    public void setDataCalculo(String dataCalculo) {
        this.dataCalculo = dataCalculo;
    }

    public String getSequencial() {
        return sequencial;
    }

    public void setSequencial(String sequencial) {
        this.sequencial = sequencial;
    }
}
