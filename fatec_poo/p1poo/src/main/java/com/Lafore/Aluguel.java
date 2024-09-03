package com.Lafore;
import java.time.LocalDate;
import java.util.ArrayList;
public class Aluguel {
    private int id;
    private ArrayList<ItemPedido> itens;
    private Usuario cliente;
    private String feedback;
    private float nota;
    private LocalDate dataPedido;
    private LocalDate dataRecebimento;
    private LocalDate dataDevolucao;
    private String retiradaEntrega; // Aceita 'retirada' para retirada e 'entrega' para entrega
    private Pagamento pagamento;

    public Aluguel(int id, Usuario cliente, String feedback, float nota,
                   LocalDate dataPedido, LocalDate dataRecebimento, LocalDate dataDevolucao,
                   String retiradaEntrega) throws Exception {
        setId(id);
        setCliente(cliente);
        setFeedback(feedback);
        setNota(nota);
        setDataPedido(dataPedido);
        setDataRecebimento(dataRecebimento);
        setDataDevolucao(dataDevolucao);
        setRetiradaEntrega(retiradaEntrega);
        Pagamento pgt = new Pagamento(1, 100.0f, "Cartão de Crédito", "N");
        setPagamento(pgt);
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(LocalDate dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getRetiradaEntrega() {
        return retiradaEntrega;
    }

    public void setRetiradaEntrega(String retiradaEntrega) throws Exception{
        if(retiradaEntrega.equals("retirada") || retiradaEntrega.equals("entrega")){
            this.retiradaEntrega = retiradaEntrega;
        } else{throw new Exception("Tipo de status invalido! Insira retirada ou entrega");}
    }
}
