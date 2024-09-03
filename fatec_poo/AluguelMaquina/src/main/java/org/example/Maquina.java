package org.example;

public class Maquina {

    int codigo;
    private String tipoMaquina;
    private String disponibilidade;
    private String condicao;
    private int preco;

    public Maquina(int codigo, String tipoMaquina, String disponibilidade, String condicao, int preco) {
        this.codigo = codigo;
        this.tipoMaquina = tipoMaquina;
        this.disponibilidade = disponibilidade;
        this.condicao = condicao;
        this.preco = preco;
    }

    public Maquina() {}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(String tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
