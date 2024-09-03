package com.Lafore;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario extends Pessoa{
    private ArrayList<Aluguel> alugueis;

    public Usuario(int id, String cpf, String nome, LocalDate data_nasc, String senha) {
        super(id, cpf, nome, data_nasc, senha);
    }

    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(ArrayList<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    Aluguel alugar(Usuario cliente) throws Exception {
        Aluguel alg = new Aluguel(1, cliente, "",2,LocalDate.of(LocalDate.now().getYear(), 4, 20), LocalDate.of(LocalDate.now().getYear(), 5, 20),LocalDate.of(LocalDate.now().getYear(), 10, 20), "R" );
        return alg;
    };
    void pagar(Aluguel alg) throws Exception {
        alg.getPagamento().setfinalizado("S");
    }

    public void login(String cpf, String senha) {
        if(cpf.equals(getCpf()) && senha.equals(getSenha())){
            System.out.println("Seja bem vindo, Usuario");
        } else {
            System.out.println("Usuario/Senha incorretos");
        }
    }
}
