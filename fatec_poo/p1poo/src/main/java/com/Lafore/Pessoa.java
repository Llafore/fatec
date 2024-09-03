package com.Lafore;

import java.time.LocalDate;

public class Pessoa {
    private int id;
    private String cpf;
    private String nome;
    private LocalDate data_nasc;
    private String senha;

    public Pessoa(int id, String cpf, String nome, LocalDate data_nasc, String senha) {
        setId(id);
        setCpf(cpf);
        setNome(nome);
        setData_nasc(data_nasc);
        setSenha(senha);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSenha() {
        return "*******";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void login(String cpf, String senha){

    }
}
