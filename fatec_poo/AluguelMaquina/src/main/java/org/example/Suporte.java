package org.example;

public class Suporte{
    private Cliente usuario;
    //Associação
    private Funcionario funcionario;
    private String motivo;
    private char solucionado;

    public Suporte(Cliente usuario, Funcionario funcionario, String motivo, char solucionado) {
        this.usuario = usuario;
        this.funcionario = funcionario;
        this.motivo = motivo;
        this.solucionado = solucionado;
    }

    public Suporte(){}

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

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
