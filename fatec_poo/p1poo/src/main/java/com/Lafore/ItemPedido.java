package com.Lafore;

public class ItemPedido extends Maquina {
    private int id;
    private int quantidade;

    public ItemPedido(int id, int quantidade) {
        setId(id);
        setQuantidade(quantidade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
