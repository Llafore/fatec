package org.example;

import java.util.Date;

public class Pessoa {
    private int codigo;
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    public Pessoa(int codigo, String nome, String cpf, String email, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public Pessoa(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

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

    public void login(){
        System.out.println("Entre com seu email e senha: " + getEmail() + "\n" + getSenha());
        try {
            if (getEmail() == null || getSenha() == null) {
                System.out.println("Login inválido! Campos vazios");
                return;
            } else {
                System.out.println("Logado com sucesso!");
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
