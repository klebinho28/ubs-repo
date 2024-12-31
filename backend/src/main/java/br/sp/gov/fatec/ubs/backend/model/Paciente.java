package br.sp.gov.fatec.ubs.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long codigo;
    private String nomeCompleto;
    private String nomeSocial;
    private String nomeMae;
    private String nomePai;
    private String dataNascimento;
    private String sexo;
    private String Nacionalidade;
    private String MunicipioNascimento;
    private String Raca;
    private String Situacaofamiliar;
    private String FrequentaEscola;
    private String EstabelecimentoVeiculo;
    private String EstabelecimentoCadastro;
    private String deficiencia;
    private String visual;
    private String auditiva;
    private String motora;
    private String intelectual;
    private String TelefoneCelular;
    private String TelefoneComercial;
    private String Contato;
    private String Email;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        Nacionalidade = nacionalidade;
    }

    public String getMunicipioNascimento() {
        return MunicipioNascimento;
    }

    public void setMunicipioNascimento(String municipioNascimento) {
        MunicipioNascimento = municipioNascimento;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }

    public String getSituacaofamiliar() {
        return Situacaofamiliar;
    }

    public void setSituacaofamiliar(String situacaofamiliar) {
        Situacaofamiliar = situacaofamiliar;
    }

    public String getFrequentaEscola() {
        return FrequentaEscola;
    }

    public void setFrequentaEscola(String frequentaEscola) {
        FrequentaEscola = frequentaEscola;
    }

    public String getEstabelecimentoVeiculo() {
        return EstabelecimentoVeiculo;
    }

    public void setEstabelecimentoVeiculo(String estabelecimentoVeiculo) {
        EstabelecimentoVeiculo = estabelecimentoVeiculo;
    }

    public String getEstabelecimentoCadastro() {
        return EstabelecimentoCadastro;
    }

    public void setEstabelecimentoCadastro(String estabelecimentoCadastro) {
        EstabelecimentoCadastro = estabelecimentoCadastro;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getVisual() {
        return visual;
    }

    public void setVisual(String visual) {
        this.visual = visual;
    }

    public String getAuditiva() {
        return auditiva;
    }

    public void setAuditiva(String auditiva) {
        this.auditiva = auditiva;
    }

    public String getMotora() {
        return motora;
    }

    public void setMotora(String motora) {
        this.motora = motora;
    }

    public String getIntelectual() {
        return intelectual;
    }

    public void setIntelectual(String intelectual) {
        this.intelectual = intelectual;
    }

    public String getTelefoneCelular() {
        return TelefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        TelefoneCelular = telefoneCelular;
    }

    public String getTelefoneComercial() {
        return TelefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        TelefoneComercial = telefoneComercial;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String contato) {
        Contato = contato;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
