package br.com.portfolio.elton.cadastrocliente.model;

import jakarta.persistence.Embeddable;

@Embeddable //Embarcável, está sendo embarcada em outra classe.
public class Endereco {
    private String logradouro;
    private String complemento;
    private String cep;
    private int numero;
    private String bairro;
    private String municipio;
    private String estado;

    public Endereco() {
    }

    public Endereco(String logradouro, String complemento, String cep, int numero, String bairro, String municipio, String estado) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
