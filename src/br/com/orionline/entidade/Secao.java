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
public class Secao {
    
    @FieldFixedLength(2)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codSecao;
    
    @FieldFixedLength(30)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String descricao;

    public Integer getCodSecao() {
        return codSecao;
    }

    public void setCodSecao(Integer codSecao) {
        this.codSecao = codSecao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
