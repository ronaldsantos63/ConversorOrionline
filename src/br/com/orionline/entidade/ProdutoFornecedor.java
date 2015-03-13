/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.orionline.entidade;

import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.AlignMode;
/**
 *
 * @author rayanne nascimento
 */
@FixedLengthRecord()
public class ProdutoFornecedor {
    
    @FieldFixedLength(14)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private String procod;
    
    @FieldFixedLength(4)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codigoFornecedor;
    
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaFornecedor;
    
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String unidadeCompra;
    
    @FieldFixedLength(9)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer itensEmbalagem;
    
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nivelPreferencia;

    public String getProcod() {
        return procod;
    }

    public void setProcod(String procod) {
        this.procod = procod;
    }

    public Integer getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(Integer codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getReferenciaFornecedor() {
        return referenciaFornecedor;
    }

    public void setReferenciaFornecedor(String referenciaFornecedor) {
        this.referenciaFornecedor = referenciaFornecedor;
    }

    public String getUnidadeCompra() {
        return unidadeCompra;
    }

    public void setUnidadeCompra(String unidadeCompra) {
        this.unidadeCompra = unidadeCompra;
    }

    public Integer getItensEmbalagem() {
        return itensEmbalagem;
    }

    public void setItensEmbalagem(Integer itensEmbalagem) {
        this.itensEmbalagem = itensEmbalagem;
    }

    public String getNivelPreferencia() {
        return nivelPreferencia;
    }

    public void setNivelPreferencia(String nivelPreferencia) {
        this.nivelPreferencia = nivelPreferencia;
    }
    
}
