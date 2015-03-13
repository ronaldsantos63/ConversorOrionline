/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.orionline.entidade;

import org.coury.jfilehelpers.annotations.FieldAlign;
import org.coury.jfilehelpers.annotations.FieldConverter;
import org.coury.jfilehelpers.annotations.FieldFixedLength;
import org.coury.jfilehelpers.annotations.FieldOptional;
import org.coury.jfilehelpers.annotations.FixedLengthRecord;
import org.coury.jfilehelpers.enums.AlignMode;
import org.coury.jfilehelpers.enums.ConverterKind;
/**
 *
 * @author ronald
 */
@FixedLengthRecord()
public class ImpostoFederal {
    
    @FieldFixedLength(1)
    private String codigo;
    
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String descricao;
    
    @FieldFixedLength(1)
    private String incidencia;
    
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Right)
    @FieldConverter(converter = ConverterKind.Double, format = "#.0000")
    private Double aliquotaEnt;
    
    @FieldOptional
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Left)
    private String retenciao;
    
    @FieldOptional
    @FieldFixedLength(50)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String observacao;
    
    @FieldFixedLength(1)
    private String tipoImposto;
    
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Right)
    @FieldConverter(converter = ConverterKind.Double, format = "#.0000")
    private Double aliquotaSai;
    
    @FieldFixedLength(2)
    private String cstEnt;
    
    @FieldFixedLength(2)
    private String cstSai;
}
