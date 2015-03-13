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
public class Produto {
    
    @FieldOptional
    @FieldFixedLength(14)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    public String procod;
    
    @FieldFixedLength(45)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    public String descricao;
    
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    public String descricaoReduzidsa;
    
    @FieldFixedLength(2)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codSecao;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String pagaComissao;
    
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tributacao;
    
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String pesoVariavel;
    
    @FieldOptional
    @FieldFixedLength(2)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codLocalImpressao;
    
    @FieldOptional
    @FieldFixedLength(5)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double comissao1;
    
    @FieldOptional
    @FieldFixedLength(5)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double comissao2;
    
    @FieldOptional
    @FieldFixedLength(5)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double comissao3;
    
    @FieldOptional
    @FieldFixedLength(5)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double descontoMaximo;
    
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double precoVenda1;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double precoOferta1;
    
    @FieldOptional
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer diasDeValidade;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String precoVariavel;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String frenteDeLoja;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double estoqueMinimo;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double estoqueMaximo;
    
    @FieldOptional
    @FieldFixedLength(4)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codFornecedor;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double precoVenda2;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double precoOferta2;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double precoVenda3;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double precoOferta3;
    
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tabelaA;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tipoBonificacao;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double fatorBonificacao;
    
    @FieldTrim(trimMode = TrimMode.Right)
    @FieldFixedLength(8)
    private String dataAlteracao;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer quantidadeEtiqueta;
    
    @FieldOptional
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String unidadeVenda;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String indentificaProdutoAlterado;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double precoCusto;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String controlaNumSerie;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String controlaEstoque;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String permiteDesconto;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tipoEspecializacaoProduto;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String composicao;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String enviaBalanca;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String controlaValidade;
    
    @FieldOptional
    @FieldFixedLength(7)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double margemVenda1;
    
    @FieldOptional
    @FieldFixedLength(7)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double margemVenda2;
    
    @FieldOptional
    @FieldFixedLength(7)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double margemVenda3;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String mixProduto;
    
    @FieldTrim(trimMode = TrimMode.Right)
    @FieldFixedLength(8)
    private String dataInclusao;
    
    @FieldOptional
    @FieldTrim(trimMode = TrimMode.Right)
    @FieldFixedLength(8)
    private String dataForaDeLinha;
    
    @FieldOptional
    @FieldTrim(trimMode = TrimMode.Right)
    @FieldFixedLength(8)
    private String dataUltimoReajustePreco1;
    
    @FieldOptional
    @FieldTrim(trimMode = TrimMode.Right)
    @FieldFixedLength(8)
    private String dataUltimoReajustePreco2;
    
    @FieldOptional
    @FieldTrim(trimMode = TrimMode.Right)
    @FieldFixedLength(8)
    private String dataUltimoReajustePreco3;
    
    @FieldOptional
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String descricaVariavel;
    
    @FieldOptional
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String enderecoEstoque;
    
    @FieldOptional
    @FieldFixedLength(9)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double quantidadeMinimaDeVendaPreco2;
    
    @FieldOptional
    @FieldFixedLength(9)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double quantidadeMinimaDeVendaPreco3;
    
    @FieldOptional
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codigoGrupo;
    
    @FieldOptional
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codigoSubGrupo;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double quantidadeItensEmbalagem;
    
    @FieldOptional
    @FieldFixedLength(9)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double quantidadeMaximaProdOferta;
    
    @FieldOptional
    @FieldFixedLength(9)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double pesoBruto;
    
    @FieldOptional
    @FieldFixedLength(9)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double pesoLiquido;
    
    @FieldOptional
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String unidadeReferencia;
    
    @FieldOptional
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double medidaReferencia;
    
    @FieldOptional
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = ' ')
    private String codigoGenero;
    
    @FieldOptional
    @FieldFixedLength(35)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String complementoDescProd;
    
    @FieldOptional
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String reservado;
    
    @FieldOptional
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String unidadeCompra;
    
    @FieldOptional
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer reservado2;
    
    @FieldOptional
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codigoNaturezaReceita;
    
    @FieldOptional
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private String ncm;
    
    @FieldOptional
    @FieldFixedLength(2)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = ' ')
    private String ncmExcecao;

    public String getProcod() {
        return procod;
    }

    public void setProcod(String procod) {
        this.procod = procod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoReduzidsa() {
        return descricaoReduzidsa;
    }

    public void setDescricaoReduzidsa(String descricaoReduzidsa) {
        this.descricaoReduzidsa = descricaoReduzidsa;
    }

    public Integer getCodSecao() {
        return codSecao;
    }

    public void setCodSecao(Integer codSecao) {
        this.codSecao = codSecao;
    }

    public String getPagaComissao() {
        return pagaComissao;
    }

    public void setPagaComissao(String pagaComissao) {
        this.pagaComissao = pagaComissao;
    }

    public String getTributacao() {
        return tributacao;
    }

    public void setTributacao(String tributacao) {
        this.tributacao = tributacao;
    }

    public String getPesoVariavel() {
        return pesoVariavel;
    }

    public void setPesoVariavel(String pesoVariavel) {
        this.pesoVariavel = pesoVariavel;
    }

    public Integer getCodLocalImpressao() {
        return codLocalImpressao;
    }

    public void setCodLocalImpressao(Integer codLocalImpressao) {
        this.codLocalImpressao = codLocalImpressao;
    }

    public Double getComissao1() {
        return comissao1;
    }

    public void setComissao1(Double comissao1) {
        this.comissao1 = comissao1;
    }

    public Double getComissao2() {
        return comissao2;
    }

    public void setComissao2(Double comissao2) {
        this.comissao2 = comissao2;
    }

    public Double getComissao3() {
        return comissao3;
    }

    public void setComissao3(Double comissao3) {
        this.comissao3 = comissao3;
    }

    public Double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(Double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public Double getPrecoVenda1() {
        return precoVenda1;
    }

    public void setPrecoVenda1(Double precoVenda1) {
        this.precoVenda1 = precoVenda1;
    }

    public Double getPrecoOferta1() {
        return precoOferta1;
    }

    public void setPrecoOferta1(Double precoOferta1) {
        this.precoOferta1 = precoOferta1;
    }

    public Integer getDiasDeValidade() {
        return diasDeValidade;
    }

    public void setDiasDeValidade(Integer diasDeValidade) {
        this.diasDeValidade = diasDeValidade;
    }

    public String getPrecoVariavel() {
        return precoVariavel;
    }

    public void setPrecoVariavel(String precoVariavel) {
        this.precoVariavel = precoVariavel;
    }

    public String getFrenteDeLoja() {
        return frenteDeLoja;
    }

    public void setFrenteDeLoja(String frenteDeLoja) {
        this.frenteDeLoja = frenteDeLoja;
    }

    public Double getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public Double getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(Double estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public Double getPrecoVenda2() {
        return precoVenda2;
    }

    public void setPrecoVenda2(Double precoVenda2) {
        this.precoVenda2 = precoVenda2;
    }

    public Double getPrecoOferta2() {
        return precoOferta2;
    }

    public void setPrecoOferta2(Double precoOferta2) {
        this.precoOferta2 = precoOferta2;
    }

    public Double getPrecoVenda3() {
        return precoVenda3;
    }

    public void setPrecoVenda3(Double precoVenda3) {
        this.precoVenda3 = precoVenda3;
    }

    public Double getPrecoOferta3() {
        return precoOferta3;
    }

    public void setPrecoOferta3(Double precoOferta3) {
        this.precoOferta3 = precoOferta3;
    }

    public String getTabelaA() {
        return tabelaA;
    }

    public void setTabelaA(String tabelaA) {
        this.tabelaA = tabelaA;
    }

    public String getTipoBonificacao() {
        return tipoBonificacao;
    }

    public void setTipoBonificacao(String tipoBonificacao) {
        this.tipoBonificacao = tipoBonificacao;
    }

    public Double getFatorBonificacao() {
        return fatorBonificacao;
    }

    public void setFatorBonificacao(Double fatorBonificacao) {
        this.fatorBonificacao = fatorBonificacao;
    }

    public String getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(String dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Integer getQuantidadeEtiqueta() {
        return quantidadeEtiqueta;
    }

    public void setQuantidadeEtiqueta(Integer quantidadeEtiqueta) {
        this.quantidadeEtiqueta = quantidadeEtiqueta;
    }

    public String getUnidadeVenda() {
        return unidadeVenda;
    }

    public void setUnidadeVenda(String unidadeVenda) {
        this.unidadeVenda = unidadeVenda;
    }

    public String getIndentificaProdutoAlterado() {
        return indentificaProdutoAlterado;
    }

    public void setIndentificaProdutoAlterado(String indentificaProdutoAlterado) {
        this.indentificaProdutoAlterado = indentificaProdutoAlterado;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getControlaNumSerie() {
        return controlaNumSerie;
    }

    public void setControlaNumSerie(String controlaNumSerie) {
        this.controlaNumSerie = controlaNumSerie;
    }

    public String getControlaEstoque() {
        return controlaEstoque;
    }

    public void setControlaEstoque(String controlaEstoque) {
        this.controlaEstoque = controlaEstoque;
    }

    public String getPermiteDesconto() {
        return permiteDesconto;
    }

    public void setPermiteDesconto(String permiteDesconto) {
        this.permiteDesconto = permiteDesconto;
    }

    public String getTipoEspecializacaoProduto() {
        return tipoEspecializacaoProduto;
    }

    public void setTipoEspecializacaoProduto(String tipoEspecializacaoProduto) {
        this.tipoEspecializacaoProduto = tipoEspecializacaoProduto;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getEnviaBalanca() {
        return enviaBalanca;
    }

    public void setEnviaBalanca(String enviaBalanca) {
        this.enviaBalanca = enviaBalanca;
    }

    public String getControlaValidade() {
        return controlaValidade;
    }

    public void setControlaValidade(String controlaValidade) {
        this.controlaValidade = controlaValidade;
    }

    public Double getMargemVenda1() {
        return margemVenda1;
    }

    public void setMargemVenda1(Double margemVenda1) {
        this.margemVenda1 = margemVenda1;
    }

    public Double getMargemVenda2() {
        return margemVenda2;
    }

    public void setMargemVenda2(Double margemVenda2) {
        this.margemVenda2 = margemVenda2;
    }

    public Double getMargemVenda3() {
        return margemVenda3;
    }

    public void setMargemVenda3(Double margemVenda3) {
        this.margemVenda3 = margemVenda3;
    }

    public String getMixProduto() {
        return mixProduto;
    }

    public void setMixProduto(String mixProduto) {
        this.mixProduto = mixProduto;
    }

    public String getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(String dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public String getDataForaDeLinha() {
        return dataForaDeLinha;
    }

    public void setDataForaDeLinha(String dataForaDeLinha) {
        this.dataForaDeLinha = dataForaDeLinha;
    }

    public String getDataUltimoReajustePreco1() {
        return dataUltimoReajustePreco1;
    }

    public void setDataUltimoReajustePreco1(String dataUltimoReajustePreco1) {
        this.dataUltimoReajustePreco1 = dataUltimoReajustePreco1;
    }

    public String getDataUltimoReajustePreco2() {
        return dataUltimoReajustePreco2;
    }

    public void setDataUltimoReajustePreco2(String dataUltimoReajustePreco2) {
        this.dataUltimoReajustePreco2 = dataUltimoReajustePreco2;
    }

    public String getDataUltimoReajustePreco3() {
        return dataUltimoReajustePreco3;
    }

    public void setDataUltimoReajustePreco3(String dataUltimoReajustePreco3) {
        this.dataUltimoReajustePreco3 = dataUltimoReajustePreco3;
    }

    public String getDescricaVariavel() {
        return descricaVariavel;
    }

    public void setDescricaVariavel(String descricaVariavel) {
        this.descricaVariavel = descricaVariavel;
    }

    public String getEnderecoEstoque() {
        return enderecoEstoque;
    }

    public void setEnderecoEstoque(String enderecoEstoque) {
        this.enderecoEstoque = enderecoEstoque;
    }

    public Double getQuantidadeMinimaDeVendaPreco2() {
        return quantidadeMinimaDeVendaPreco2;
    }

    public void setQuantidadeMinimaDeVendaPreco2(Double quantidadeMinimaDeVendaPreco2) {
        this.quantidadeMinimaDeVendaPreco2 = quantidadeMinimaDeVendaPreco2;
    }

    public Double getQuantidadeMinimaDeVendaPreco3() {
        return quantidadeMinimaDeVendaPreco3;
    }

    public void setQuantidadeMinimaDeVendaPreco3(Double quantidadeMinimaDeVendaPreco3) {
        this.quantidadeMinimaDeVendaPreco3 = quantidadeMinimaDeVendaPreco3;
    }

    public Integer getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(Integer codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public Integer getCodigoSubGrupo() {
        return codigoSubGrupo;
    }

    public void setCodigoSubGrupo(Integer codigoSubGrupo) {
        this.codigoSubGrupo = codigoSubGrupo;
    }

    public Double getQuantidadeItensEmbalagem() {
        return quantidadeItensEmbalagem;
    }

    public void setQuantidadeItensEmbalagem(Double quantidadeItensEmbalagem) {
        this.quantidadeItensEmbalagem = quantidadeItensEmbalagem;
    }

    public Double getQuantidadeMaximaProdOferta() {
        return quantidadeMaximaProdOferta;
    }

    public void setQuantidadeMaximaProdOferta(Double quantidadeMaximaProdOferta) {
        this.quantidadeMaximaProdOferta = quantidadeMaximaProdOferta;
    }

    public Double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public Double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(Double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public String getUnidadeReferencia() {
        return unidadeReferencia;
    }

    public void setUnidadeReferencia(String unidadeReferencia) {
        this.unidadeReferencia = unidadeReferencia;
    }

    public Double getMedidaReferencia() {
        return medidaReferencia;
    }

    public void setMedidaReferencia(Double medidaReferencia) {
        this.medidaReferencia = medidaReferencia;
    }

    public String getCodigoGenero() {
        return codigoGenero;
    }

    public void setCodigoGenero(String codigoGenero) {
        this.codigoGenero = codigoGenero;
    }

    public String getComplementoDescProd() {
        return complementoDescProd;
    }

    public void setComplementoDescProd(String complementoDescProd) {
        this.complementoDescProd = complementoDescProd;
    }

    public String getReservado() {
        return reservado;
    }

    public void setReservado(String reservado) {
        this.reservado = reservado;
    }

    public String getUnidadeCompra() {
        return unidadeCompra;
    }

    public void setUnidadeCompra(String unidadeCompra) {
        this.unidadeCompra = unidadeCompra;
    }

    public Integer getReservado2() {
        return reservado2;
    }

    public void setReservado2(Integer reservado2) {
        this.reservado2 = reservado2;
    }

    public Integer getCodigoNaturezaReceita() {
        return codigoNaturezaReceita;
    }

    public void setCodigoNaturezaReceita(Integer codigoNaturezaReceita) {
        this.codigoNaturezaReceita = codigoNaturezaReceita;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getNcmExcecao() {
        return ncmExcecao;
    }

    public void setNcmExcecao(String ncmExcecao) {
        this.ncmExcecao = ncmExcecao;
    }
}
