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
 * @author ronald
 */
@FixedLengthRecord()
public class ImpostoFederalProduto {
    
    @FieldFixedLength(14)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private String procod;
    
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left)
    private String siglaImp;

    public String getProcod() {
        return procod;
    }

    public void setProcod(String procod) {
        this.procod = procod;
    }

    public String getSiglaImp() {
        return siglaImp;
    }

    public void setSiglaImp(String siglaImp) {
        this.siglaImp = siglaImp;
    }
    
}
