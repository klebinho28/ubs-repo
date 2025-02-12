
package br.sp.gov.fatec.ubs.backend;

public class mensagemresponse {
    private String mensagem;

    public mensagemresponse(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}