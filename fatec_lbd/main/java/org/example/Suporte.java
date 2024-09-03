package org.example;

public class Suporte extends Funcionario{
    private Cliente usuario;
    //Associação
    private String motivo;
    private char solucionado;

    public Suporte(int codigo, String nome, String cpf, String especializacao, Cliente usuario, String motivo,
                   char solucionado) {
        super(codigo, nome, cpf, especializacao);
        this.usuario = usuario;
        this.motivo = motivo;
        this.solucionado = solucionado;
    }

    public Suporte(){}

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public char getSolucionado() {
        return solucionado;
    }

    public void setSolucionado(char solucionado) {
        this.solucionado = solucionado;
    }
}
