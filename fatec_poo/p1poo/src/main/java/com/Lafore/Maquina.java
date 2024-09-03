package com.Lafore;

public class Maquina {
    private int id;
    private boolean disponibilidade; // aceita apenas 1 para disponivel e 0 para indisponivel
    private String especificacoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getDiponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
            this.disponibilidade = disponibilidade;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }
}
