package org.example;

import java.util.Date;

public class Aluguel{
    private Date dataRetirada;
    private Date dataDevolucao;
    private itemAluguel pedido;
    //Composição

    private Catalogo catalogo;
    //Associação?


    public Aluguel(Date dataRetirada, Date dataDevolucao, itemAluguel pedido) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.pedido = pedido;
    }

    public Aluguel(){}

    public itemAluguel getPedido() {
        return pedido;
    }

    public void setPedido(itemAluguel pedido) {
        this.pedido = pedido;
    }

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
}
