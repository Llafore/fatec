package org.example;

public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private String especializacao;

    public Funcionario(int codigo, String nome, String cpf, String especializacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.especializacao = especializacao;
    }

    public Funcionario(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
