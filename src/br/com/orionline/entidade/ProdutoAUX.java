/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.orionline.entidade;


/**
 *
 * @author ronald santos
 */
public class ProdutoAUX {
    
    private String procod;
    
    private String codAux;
    
    private Double fator;

    public Double getFator() {
        return fator;
    }

    public void setFator(Double fator) {
        this.fator = fator;
    }

    public String getProcod() {
        return this.procod;
    }

    public void setProcod(String procod) {
        this.procod = procod;
    }

    public String getCodAux() {
        return this.codAux;
    }

    public void setCodAux(String codAux) {
        this.codAux = codAux;
    }
}
