package org.example;

import java.util.Date;

public class Aluguel{
    private Date dataRetirada;
    private Date dataDevolucao;
    private itemAluguel pedido;
    //Composição

    private Catalogo catalogo;
    //Associação?

    private Entrega entrega;
    private String formaPagamento;

    public Aluguel(Date dataRetirada, Date dataDevolucao, itemAluguel pedido, Catalogo catalogo, Entrega entrega) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.pedido = pedido;
        this.catalogo = catalogo;
        this.entrega = entrega;
    }

    public Aluguel(){}

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public itemAluguel getPedido() {
        return pedido;
    }

    public void setPedido(itemAluguel pedido) {
        this.pedido = pedido;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
}
