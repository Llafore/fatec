package org.example;

import java.util.ArrayList;
import java.util.List;

public class itemAluguel {
    private int codigo;
    private List<Maquina> maquinas;
    // Agregação
    private int quantidade;
    private Cliente comprador;
    // Composição


    public itemAluguel(int codigo, List<Maquina> maquinas, int quantidade, Cliente comprador) {
        this.codigo = codigo;
        this.maquinas = maquinas;
        this.quantidade = quantidade;
        this.comprador = comprador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquina) {
        this.maquinas = maquina;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
}
