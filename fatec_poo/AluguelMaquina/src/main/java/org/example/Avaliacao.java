package org.example;

public class Avaliacao {
    private Cliente cliente;
    //Associação
    private int avaliacao;
    private String comentario;

    public Avaliacao(Cliente cliente, int avaliacao, String comentario) {
        this.cliente = cliente;
        this.avaliacao = avaliacao;
        this.comentario = comentario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
