package br.sp.gov.fatec.ubs.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "paciente")
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int codigo;
    private String nomeCompleto;
    private String nomeSocial;
    private String cpf;
    private String nomeMae;
    private String nomePai;
    private String dataNascimento;
    private String sexo;
    private String nacionalidade;
    private String municipioNascimento;
    private String ra;
    private String frequentaEscola;
    private String Escolaridade;
    private String situacaoFamiliar;
    private String estabelecimentoVinculo;
    private String estabelecimentoCadastro;
    private String deficiente;
    private String visual;
    private String auditiva;
    private String motora;
    private String intelectual;
    private String telefoneCelular;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String contato;
    private String email;
    private String endereco;
 

public String getEscolaridade(){
       return Escolaridade;
}

public void setEscolaridade(String Escolaridade){
    this.Escolaridade = Escolaridade;
}

public String getEndereço(){
    return endereco;
}

public void setEndereço(String endereco){
    this.endereco = endereco;
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public String getcpf(){
        return cpf;
    }

    public void setcpf(String cpf){
        this.cpf = cpf;
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
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getMunicipioNascimento() {
        return municipioNascimento;
    }

    public void setMunicipioNascimento(String municipioNascimento) {
        this.municipioNascimento = municipioNascimento;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(String situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    public String getFrequentaEscola() {
        return frequentaEscola;
    }

    public void setFrequentaEscola(String frequentaEscola) {
        this.frequentaEscola = frequentaEscola;
    }

    public String getEstabeleciomentoVeiculo() {
        return estabelecimentoVinculo;
    }

    public void setEstabeleciomentoVeiculo(String estabelecimentoVeiculo) {
            this.estabelecimentoVinculo = estabelecimentoVinculo;
    }

    public String getEstabelecimentoCadastro() {
        return estabelecimentoCadastro;
    }

    public void setEstabelecimentoCadastro(String estabelecimentoCadastro) {
        this.estabelecimentoCadastro = estabelecimentoCadastro;
    }

    public String getDeficiente() {
        return deficiente;
    }

    public void setDeficiente(String deficiente) {
        this.deficiente = deficiente;
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
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFicha(String filePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFicha'");
    }

}