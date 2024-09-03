package org.example;

public class Cliente extends Pessoa{
    private String endereco;
    private String telefone;

    public Cliente(int codigo, String nome, String cpf, String email, String senha,
                   String endereco, String telefone) {
        super(codigo, nome, cpf, email, senha);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente(){}

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void login(){
        try {
            if (getEmail() == null || getSenha() == null) {
                System.out.println("Login inválido! Campos vazios");
                return;
            } else {
                System.out.println("Usuário logado com sucesso!");
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
