package com.Lafore;

public class Atendimento{
    private int id;
    private String motivo;
    private String resolucao;
    private Usuario cliente;
    private Suporte atendente;

    public Atendimento(int id, String motivo, Usuario cliente) {
        setId(id);
        setMotivo(motivo);
        setCliente(cliente);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Suporte getAtendente() {
        return atendente;
    }

    public void setAtendente(Suporte atendente) {
        this.atendente = atendente;
    }
}
