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
public class Clientes {

    //define o numero maximo de caracteres do campo
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer codigo;

    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String descricao;

    @FieldFixedLength(14)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = ' ')
    private String CPF_CNPJ;

    @FieldFixedLength(45)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String endereco;

    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String bairro;

    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String cidade;

    @FieldFixedLength(2)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String estado;

    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = ' ')
    private String cep;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String telefone;

    @FieldOptional()
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double limite;

    @FieldOptional()
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double limite_usado;

    @FieldOptional()
    @FieldFixedLength(2)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer status;

    @FieldOptional()
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tabela_prazo;

    @FieldOptional()
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Integer prazo;

    @FieldOptional()
    @FieldFixedLength(25)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nome_fantasia;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = ' ')
    private String rg_ie;

    @FieldOptional()
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String data_cadastro;

    @FieldOptional()
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String data_nascimento;

    @FieldOptional()
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String data_bloqueio;

    @FieldOptional()
    @FieldFixedLength(30)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomePai;

    @FieldOptional()
    @FieldFixedLength(30)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomeMae;

    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tipoPessoa;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String telefone2;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String fax;

    @FieldOptional()
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomeContato;

    @FieldOptional()
    @FieldFixedLength(45)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String endereco_cobranca;

    @FieldOptional()
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String bairroCobranca;

    @FieldOptional()
    @FieldFixedLength(10)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String cepCobranca;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String cidadeCobranca;

    @FieldOptional()
    @FieldFixedLength(2)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String estadoCobranca;

    @FieldOptional()
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private Double desconto;

    @FieldOptional()
    @FieldFixedLength(255)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String observacao;

    @FieldOptional()
    @FieldFixedLength(255)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String restricoes;

    @FieldOptional()
    @FieldFixedLength(10)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String adminCartaoCredito;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String numeroCartaoCredito;

    @FieldOptional()
    @FieldFixedLength(5)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String validaCartaoCredito;

    @FieldOptional()
    @FieldFixedLength(70)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String email;

    @FieldOptional()
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String dt_ultimaAlteracao;

    @FieldOptional()
    @FieldFixedLength(7)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String CNAE;

    @FieldOptional()
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String sexo;

    @FieldOptional()
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tipoResidencia;

    @FieldOptional()
    @FieldFixedLength(10)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tempoResidencia;

    @FieldOptional()
    @FieldFixedLength(50)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String veiculo;

    @FieldOptional()
    @FieldFixedLength(50)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String PontoReferencia;

    @FieldOptional()
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String comprovanteResidencia;

    @FieldOptional()
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String comprovanteRenda;

    @FieldOptional()
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String comprovanteRendaConj;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String empresaTrabalho;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String telefoneTrablho;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String CargoEmpresa;

    @FieldOptional()
    @FieldFixedLength(10)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tempoEmpresa;

    @FieldOptional()
    @FieldFixedLength(50)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String enderecoEmpresa;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomeChefeEmpresa;

    @FieldOptional()
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = ' ')
    private String salario;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String outrasRendas;

    @FieldOptional()
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String estadoCivil;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomeConjuge;

    @FieldOptional()
    @FieldFixedLength(8)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String dtNascConjuge;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomeEmpresaConjuge;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String telefoneTrabConjuge;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String cargoConjuge;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomeChefeConjuge;

    @FieldOptional()
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String salarioConjuge;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaPessoalNome1;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String telefoneReferencia1;

    @FieldOptional()
    @FieldFixedLength(50)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String enderecoReferencia1;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaPessoalNome2;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String telefoneReferencia2;

    @FieldOptional()
    @FieldFixedLength(50)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String enderecoReferencia2;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaComercialNome1;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String telefoneReferenciaComercial1;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaComercialNome2;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String telefoneReferenciaComercial2;

    @FieldOptional()
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaBancaria1;

    @FieldOptional()
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaBancariaAgencia1;

    @FieldOptional()
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaBancariaConta1;

    @FieldOptional()
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tipoContaBancaria1;

    @FieldOptional()
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaBancaria2;

    @FieldOptional()
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaBancariaAgencia2;

    @FieldOptional()
    @FieldFixedLength(15)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String referenciaBancariaConta2;

    @FieldOptional()
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tipoContaBancaria2;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String ticket;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomeDependente1;

    @FieldOptional()
    @FieldFixedLength(10)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String GrauParentesco1;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String telefoneDependete1;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomeDependente2;

    @FieldOptional()
    @FieldFixedLength(10)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String GrauParentesco2;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String telefoneDependete2;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String situacaoSPC;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomePessoaContatoSPC;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String situacaoTeleCheque;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String nomePessoaTeleCheque;

    @FieldOptional()
    @FieldFixedLength(40)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String observacaoSituacao;

    @FieldOptional()
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String situacaoAprovacaoCad;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String pessoaQueAutorizouCad;

    @FieldOptional()
    @FieldFixedLength(2)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String diaFechamentoFatura;

    @FieldOptional()
    @FieldFixedLength(20)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String naturalidade;

    @FieldOptional()
    @FieldFixedLength(6)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String orgaoExpeditorRG;

    @FieldOptional()
    @FieldFixedLength(1)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String tipoPreco;

    @FieldOptional()
    @FieldFixedLength(3)
    @FieldAlign(alignMode = AlignMode.Right, alignChar = '0')
    private String ramoAtividade;

    @FieldOptional()
    @FieldFixedLength(5)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String complementoBairro;

    @FieldOptional()
    @FieldFixedLength(5)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String complementoBairroCobranca;

    @FieldOptional()
    @FieldFixedLength(6)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private Integer numeroEnderecoCliente;

    @FieldOptional()
    @FieldFixedLength(6)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private Integer numeroEnderecoClienteCobranca;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String ComplementoEnderecoCliente;

    @FieldOptional()
    @FieldFixedLength(12)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String ComplementoEnderecoClienteCobranca;

    @FieldOptional()
    @FieldFixedLength(4)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String vendedor;

    @FieldOptional()
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private Double limite2;

    @FieldOptional()
    @FieldFixedLength(13)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private Double limite2Usado;

    @FieldOptional()
    @FieldFixedLength(6)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String codigoInterno;

    @FieldOptional()
    @FieldFixedLength(6)
    @FieldAlign(alignMode = AlignMode.Left, alignChar = ' ')
    private String vendedor2;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getLimite_usado() {
        return limite_usado;
    }

    public void setLimite_usado(Double limite_usado) {
        this.limite_usado = limite_usado;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTabela_prazo() {
        return tabela_prazo;
    }

    public void setTabela_prazo(String tabela_prazo) {
        this.tabela_prazo = tabela_prazo;
    }

    public Integer getPrazo() {
        return prazo;
    }

    public void setPrazo(Integer prazo) {
        this.prazo = prazo;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getRg_ie() {
        return rg_ie;
    }

    public void setRg_ie(String rg_ie) {
        this.rg_ie = rg_ie;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getData_bloqueio() {
        return data_bloqueio;
    }

    public void setData_bloqueio(String data_bloqueio) {
        this.data_bloqueio = data_bloqueio;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEndereco_cobranca() {
        return endereco_cobranca;
    }

    public void setEndereco_cobranca(String endereco_cobranca) {
        this.endereco_cobranca = endereco_cobranca;
    }

    public String getBairroCobranca() {
        return bairroCobranca;
    }

    public void setBairroCobranca(String bairroCobranca) {
        this.bairroCobranca = bairroCobranca;
    }

    public String getCepCobranca() {
        return cepCobranca;
    }

    public void setCepCobranca(String cepCobranca) {
        this.cepCobranca = cepCobranca;
    }

    public String getCidadeCobranca() {
        return cidadeCobranca;
    }

    public void setCidadeCobranca(String cidadeCobranca) {
        this.cidadeCobranca = cidadeCobranca;
    }

    public String getEstadoCobranca() {
        return estadoCobranca;
    }

    public void setEstadoCobranca(String estadoCobranca) {
        this.estadoCobranca = estadoCobranca;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getRestricoes() {
        return restricoes;
    }

    public void setRestricoes(String restricoes) {
        this.restricoes = restricoes;
    }

    public String getAdminCartaoCredito() {
        return adminCartaoCredito;
    }

    public void setAdminCartaoCredito(String adminCartaoCredito) {
        this.adminCartaoCredito = adminCartaoCredito;
    }

    public String getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    public void setNumeroCartaoCredito(String numeroCartaoCredito) {
        this.numeroCartaoCredito = numeroCartaoCredito;
    }

    public String getValidaCartaoCredito() {
        return validaCartaoCredito;
    }

    public void setValidaCartaoCredito(String validaCartaoCredito) {
        this.validaCartaoCredito = validaCartaoCredito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDt_ultimaAlteracao() {
        return dt_ultimaAlteracao;
    }

    public void setDt_ultimaAlteracao(String dt_ultimaAlteracao) {
        this.dt_ultimaAlteracao = dt_ultimaAlteracao;
    }

    public String getCNAE() {
        return CNAE;
    }

    public void setCNAE(String CNAE) {
        this.CNAE = CNAE;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoResidencia() {
        return tipoResidencia;
    }

    public void setTipoResidencia(String tipoResidencia) {
        this.tipoResidencia = tipoResidencia;
    }

    public String getTempoResidencia() {
        return tempoResidencia;
    }

    public void setTempoResidencia(String tempoResidencia) {
        this.tempoResidencia = tempoResidencia;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPontoReferencia() {
        return PontoReferencia;
    }

    public void setPontoReferencia(String PontoReferencia) {
        this.PontoReferencia = PontoReferencia;
    }

    public String getComprovanteResidencia() {
        return comprovanteResidencia;
    }

    public void setComprovanteResidencia(String comprovanteResidencia) {
        this.comprovanteResidencia = comprovanteResidencia;
    }

    public String getComprovanteRenda() {
        return comprovanteRenda;
    }

    public void setComprovanteRenda(String comprovanteRenda) {
        this.comprovanteRenda = comprovanteRenda;
    }

    public String getComprovanteRendaConj() {
        return comprovanteRendaConj;
    }

    public void setComprovanteRendaConj(String comprovanteRendaConj) {
        this.comprovanteRendaConj = comprovanteRendaConj;
    }

    public String getEmpresaTrabalho() {
        return empresaTrabalho;
    }

    public void setEmpresaTrabalho(String empresaTrabalho) {
        this.empresaTrabalho = empresaTrabalho;
    }

    public String getTelefoneTrablho() {
        return telefoneTrablho;
    }

    public void setTelefoneTrablho(String telefoneTrablho) {
        this.telefoneTrablho = telefoneTrablho;
    }

    public String getCargoEmpresa() {
        return CargoEmpresa;
    }

    public void setCargoEmpresa(String CargoEmpresa) {
        this.CargoEmpresa = CargoEmpresa;
    }

    public String getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(String tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public String getNomeChefeEmpresa() {
        return nomeChefeEmpresa;
    }

    public void setNomeChefeEmpresa(String nomeChefeEmpresa) {
        this.nomeChefeEmpresa = nomeChefeEmpresa;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getOutrasRendas() {
        return outrasRendas;
    }

    public void setOutrasRendas(String outrasRendas) {
        this.outrasRendas = outrasRendas;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNomeConjuge() {
        return nomeConjuge;
    }

    public void setNomeConjuge(String nomeConjuge) {
        this.nomeConjuge = nomeConjuge;
    }

    public String getDtNascConjuge() {
        return dtNascConjuge;
    }

    public void setDtNascConjuge(String dtNascConjuge) {
        this.dtNascConjuge = dtNascConjuge;
    }

    public String getNomeEmpresaConjuge() {
        return nomeEmpresaConjuge;
    }

    public void setNomeEmpresaConjuge(String nomeEmpresaConjuge) {
        this.nomeEmpresaConjuge = nomeEmpresaConjuge;
    }

    public String getTelefoneTrabConjuge() {
        return telefoneTrabConjuge;
    }

    public void setTelefoneTrabConjuge(String telefoneTrabConjuge) {
        this.telefoneTrabConjuge = telefoneTrabConjuge;
    }

    public String getCargoConjuge() {
        return cargoConjuge;
    }

    public void setCargoConjuge(String cargoConjuge) {
        this.cargoConjuge = cargoConjuge;
    }

    public String getNomeChefeConjuge() {
        return nomeChefeConjuge;
    }

    public void setNomeChefeConjuge(String nomeChefeConjuge) {
        this.nomeChefeConjuge = nomeChefeConjuge;
    }

    public String getSalarioConjuge() {
        return salarioConjuge;
    }

    public void setSalarioConjuge(String salarioConjuge) {
        this.salarioConjuge = salarioConjuge;
    }

    public String getReferenciaPessoalNome1() {
        return referenciaPessoalNome1;
    }

    public void setReferenciaPessoalNome1(String referenciaPessoalNome1) {
        this.referenciaPessoalNome1 = referenciaPessoalNome1;
    }

    public String getTelefoneReferencia1() {
        return telefoneReferencia1;
    }

    public void setTelefoneReferencia1(String telefoneReferencia1) {
        this.telefoneReferencia1 = telefoneReferencia1;
    }

    public String getEnderecoReferencia1() {
        return enderecoReferencia1;
    }

    public void setEnderecoReferencia1(String enderecoReferencia1) {
        this.enderecoReferencia1 = enderecoReferencia1;
    }

    public String getReferenciaPessoalNome2() {
        return referenciaPessoalNome2;
    }

    public void setReferenciaPessoalNome2(String referenciaPessoalNome2) {
        this.referenciaPessoalNome2 = referenciaPessoalNome2;
    }

    public String getTelefoneReferencia2() {
        return telefoneReferencia2;
    }

    public void setTelefoneReferencia2(String telefoneReferencia2) {
        this.telefoneReferencia2 = telefoneReferencia2;
    }

    public String getEnderecoReferencia2() {
        return enderecoReferencia2;
    }

    public void setEnderecoReferencia2(String enderecoReferencia2) {
        this.enderecoReferencia2 = enderecoReferencia2;
    }

    public String getReferenciaComercialNome1() {
        return referenciaComercialNome1;
    }

    public void setReferenciaComercialNome1(String referenciaComercialNome1) {
        this.referenciaComercialNome1 = referenciaComercialNome1;
    }

    public String getTelefoneReferenciaComercial1() {
        return telefoneReferenciaComercial1;
    }

    public void setTelefoneReferenciaComercial1(String telefoneReferenciaComercial1) {
        this.telefoneReferenciaComercial1 = telefoneReferenciaComercial1;
    }

    public String getReferenciaComercialNome2() {
        return referenciaComercialNome2;
    }

    public void setReferenciaComercialNome2(String referenciaComercialNome2) {
        this.referenciaComercialNome2 = referenciaComercialNome2;
    }

    public String getTelefoneReferenciaComercial2() {
        return telefoneReferenciaComercial2;
    }

    public void setTelefoneReferenciaComercial2(String telefoneReferenciaComercial2) {
        this.telefoneReferenciaComercial2 = telefoneReferenciaComercial2;
    }

    public String getReferenciaBancaria1() {
        return referenciaBancaria1;
    }

    public void setReferenciaBancaria1(String referenciaBancaria1) {
        this.referenciaBancaria1 = referenciaBancaria1;
    }

    public String getReferenciaBancariaAgencia1() {
        return referenciaBancariaAgencia1;
    }

    public void setReferenciaBancariaAgencia1(String referenciaBancariaAgencia1) {
        this.referenciaBancariaAgencia1 = referenciaBancariaAgencia1;
    }

    public String getReferenciaBancariaConta1() {
        return referenciaBancariaConta1;
    }

    public void setReferenciaBancariaConta1(String referenciaBancariaConta1) {
        this.referenciaBancariaConta1 = referenciaBancariaConta1;
    }

    public String getTipoContaBancaria1() {
        return tipoContaBancaria1;
    }

    public void setTipoContaBancaria1(String tipoContaBancaria1) {
        this.tipoContaBancaria1 = tipoContaBancaria1;
    }

    public String getReferenciaBancaria2() {
        return referenciaBancaria2;
    }

    public void setReferenciaBancaria2(String referenciaBancaria2) {
        this.referenciaBancaria2 = referenciaBancaria2;
    }

    public String getReferenciaBancariaAgencia2() {
        return referenciaBancariaAgencia2;
    }

    public void setReferenciaBancariaAgencia2(String referenciaBancariaAgencia2) {
        this.referenciaBancariaAgencia2 = referenciaBancariaAgencia2;
    }

    public String getReferenciaBancariaConta2() {
        return referenciaBancariaConta2;
    }

    public void setReferenciaBancariaConta2(String referenciaBancariaConta2) {
        this.referenciaBancariaConta2 = referenciaBancariaConta2;
    }

    public String getTipoContaBancaria2() {
        return tipoContaBancaria2;
    }

    public void setTipoContaBancaria2(String tipoContaBancaria2) {
        this.tipoContaBancaria2 = tipoContaBancaria2;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getNomeDependente1() {
        return nomeDependente1;
    }

    public void setNomeDependente1(String nomeDependente1) {
        this.nomeDependente1 = nomeDependente1;
    }

    public String getGrauParentesco1() {
        return GrauParentesco1;
    }

    public void setGrauParentesco1(String GrauParentesco1) {
        this.GrauParentesco1 = GrauParentesco1;
    }

    public String getTelefoneDependete1() {
        return telefoneDependete1;
    }

    public void setTelefoneDependete1(String telefoneDependete1) {
        this.telefoneDependete1 = telefoneDependete1;
    }

    public String getNomeDependente2() {
        return nomeDependente2;
    }

    public void setNomeDependente2(String nomeDependente2) {
        this.nomeDependente2 = nomeDependente2;
    }

    public String getGrauParentesco2() {
        return GrauParentesco2;
    }

    public void setGrauParentesco2(String GrauParentesco2) {
        this.GrauParentesco2 = GrauParentesco2;
    }

    public String getTelefoneDependete2() {
        return telefoneDependete2;
    }

    public void setTelefoneDependete2(String telefoneDependete2) {
        this.telefoneDependete2 = telefoneDependete2;
    }

    public String getSituacaoSPC() {
        return situacaoSPC;
    }

    public void setSituacaoSPC(String situacaoSPC) {
        this.situacaoSPC = situacaoSPC;
    }

    public String getNomePessoaContatoSPC() {
        return nomePessoaContatoSPC;
    }

    public void setNomePessoaContatoSPC(String nomePessoaContatoSPC) {
        this.nomePessoaContatoSPC = nomePessoaContatoSPC;
    }

    public String getSituacaoTeleCheque() {
        return situacaoTeleCheque;
    }

    public void setSituacaoTeleCheque(String situacaoTeleCheque) {
        this.situacaoTeleCheque = situacaoTeleCheque;
    }

    public String getNomePessoaTeleCheque() {
        return nomePessoaTeleCheque;
    }

    public void setNomePessoaTeleCheque(String nomePessoaTeleCheque) {
        this.nomePessoaTeleCheque = nomePessoaTeleCheque;
    }

    public String getObservacaoSituacao() {
        return observacaoSituacao;
    }

    public void setObservacaoSituacao(String observacaoSituacao) {
        this.observacaoSituacao = observacaoSituacao;
    }

    public String getSituacaoAprovacaoCad() {
        return situacaoAprovacaoCad;
    }

    public void setSituacaoAprovacaoCad(String situacaoAprovacaoCad) {
        this.situacaoAprovacaoCad = situacaoAprovacaoCad;
    }

    public String getPessoaQueAutorizouCad() {
        return pessoaQueAutorizouCad;
    }

    public void setPessoaQueAutorizouCad(String pessoaQueAutorizouCad) {
        this.pessoaQueAutorizouCad = pessoaQueAutorizouCad;
    }

    public String getDiaFechamentoFatura() {
        return diaFechamentoFatura;
    }

    public void setDiaFechamentoFatura(String diaFechamentoFatura) {
        this.diaFechamentoFatura = diaFechamentoFatura;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getOrgaoExpeditorRG() {
        return orgaoExpeditorRG;
    }

    public void setOrgaoExpeditorRG(String orgaoExpeditorRG) {
        this.orgaoExpeditorRG = orgaoExpeditorRG;
    }

    public String getTipoPreco() {
        return tipoPreco;
    }

    public void setTipoPreco(String tipoPreco) {
        this.tipoPreco = tipoPreco;
    }

    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

    public String getComplementoBairro() {
        return complementoBairro;
    }

    public void setComplementoBairro(String complementoBairro) {
        this.complementoBairro = complementoBairro;
    }

    public String getComplementoBairroCobranca() {
        return complementoBairroCobranca;
    }

    public void setComplementoBairroCobranca(String complementoBairroCobranca) {
        this.complementoBairroCobranca = complementoBairroCobranca;
    }

    public Integer getNumeroEnderecoCliente() {
        return numeroEnderecoCliente;
    }

    public void setNumeroEnderecoCliente(Integer numeroEnderecoCliente) {
        this.numeroEnderecoCliente = numeroEnderecoCliente;
    }

    public Integer getNumeroEnderecoClienteCobranca() {
        return numeroEnderecoClienteCobranca;
    }

    public void setNumeroEnderecoClienteCobranca(Integer numeroEnderecoClienteCobranca) {
        this.numeroEnderecoClienteCobranca = numeroEnderecoClienteCobranca;
    }

    public String getComplementoEnderecoCliente() {
        return ComplementoEnderecoCliente;
    }

    public void setComplementoEnderecoCliente(String ComplementoEnderecoCliente) {
        this.ComplementoEnderecoCliente = ComplementoEnderecoCliente;
    }

    public String getComplementoEnderecoClienteCobranca() {
        return ComplementoEnderecoClienteCobranca;
    }

    public void setComplementoEnderecoClienteCobranca(String ComplementoEnderecoClienteCobranca) {
        this.ComplementoEnderecoClienteCobranca = ComplementoEnderecoClienteCobranca;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Double getLimite2() {
        return limite2;
    }

    public void setLimite2(Double limite2) {
        this.limite2 = limite2;
    }

    public Double getLimite2Usado() {
        return limite2Usado;
    }

    public void setLimite2Usado(Double limite2Usado) {
        this.limite2Usado = limite2Usado;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getVendedor2() {
        return vendedor2;
    }

    public void setVendedor2(String vendedor2) {
        this.vendedor2 = vendedor2;
    }

}
