package com.soulcode.projetospring.models;


public class Chamado {
    private String setor;
    private String descricao;
    private String prioridade;
    private String dataInicio;

    public Chamado(String setor, String descricao, String prioridade, String dataInicio) {
        this.setor = setor;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataInicio = dataInicio;
    }

    // Getters e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
}
