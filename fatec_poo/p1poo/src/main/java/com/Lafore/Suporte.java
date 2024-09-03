package com.Lafore;

import java.time.LocalDate;

public class Suporte extends Pessoa{
    private String equipe;
    private float avgNota = 5; // isso nao é uma media aritimedita, e sim ponderada (os ultimos atendimentos possuem mais peso)
    private int qtde_atendimentos;

    public Suporte(String equipe, float avgNota, int id, String cpf, String nome, LocalDate data_nasc, String senha) {
        super(id, cpf, nome, data_nasc, senha);
        setEquipe(equipe);
        setAvgNota(avgNota);
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getAvgNota() {
        return avgNota;
    }

    public void setAvgNota(float avgNota) {
        this.avgNota = avgNota;
    }

    public int getQtde_atendimentos() {
        return qtde_atendimentos;
    }

    public void setQtde_atendimentos(int qtde_atendimentos) {
        this.qtde_atendimentos = qtde_atendimentos;
    }

    public Atendimento atender(Usuario cliente) {
        Atendimento atd = new Atendimento(1, "Não consegui alugar uma maquina", cliente);
        setQtde_atendimentos(getQtde_atendimentos() + 1);
        setAvgNota((getAvgNota() + 10) / 2);
        return atd;
    }

    public void login(String cpf, String senha) {
        if(cpf.equals(getCpf()) && senha.equals(getSenha())){
            System.out.println("Seja bem vindo, Suporte");
        } else {
            System.out.println("Usuario/Senha incorretos");
        }
    }
}