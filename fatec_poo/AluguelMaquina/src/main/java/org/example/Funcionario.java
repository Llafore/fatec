package org.example;

public class Funcionario extends Pessoa{
    private String especializacao;

    public Funcionario(int codigo, String nome, String cpf, String email, String senha, String especializacao) {
        super(codigo, nome, cpf, email, senha);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public void login(){
        try {
            if (getCpf() == null || getSenha() == null) {
                System.out.println("Login inválido! Campos vazios");
                return;
            } else {
                System.out.println("Funcionário logado com sucesso!");
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
