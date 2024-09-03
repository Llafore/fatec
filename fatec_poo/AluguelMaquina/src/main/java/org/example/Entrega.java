package org.example;

public class Entrega {
    private Funcionario entregador;
    private Aluguel pedido;
    private Cliente cliente;
    private String formaEntrega;

    public Entrega(Funcionario entregador, Aluguel pedido, Cliente cliente, String formaEntrega) {
        this.entregador = entregador;
        this.pedido = pedido;
        this.cliente = cliente;
        this.formaEntrega = formaEntrega;
    }

    public Entrega(){}

    public Funcionario getEntregador() {
        return entregador;
    }

    public void setEntregador(Funcionario entregador) {
        this.entregador = entregador;
    }

    public Aluguel getPedido() {
        return pedido;
    }

    public void setPedido(Aluguel pedido) {
        this.pedido = pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFormaEntrega() {
        return formaEntrega;
    }

    public void setFormaEntrega(String formaEntrega) {
        this.formaEntrega = formaEntrega;
    }
}
