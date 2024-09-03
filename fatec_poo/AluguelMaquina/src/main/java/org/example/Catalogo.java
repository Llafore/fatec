package org.example;

public class Catalogo extends Maquina{

    private String descricao;
    private String especificacoesTecnicas;
    private String imagens;

    public Catalogo(int codigo, String tipoMaquina, String disponibilidade, String condicao, int preco,
                    String descricao, String especificacoesTecnicas, String imagens) {
        super(codigo, tipoMaquina, disponibilidade, condicao, preco);
        this.descricao = descricao;
        this.especificacoesTecnicas = especificacoesTecnicas;
        this.imagens = imagens;
    }

    public Catalogo(){
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEspecificacoesTecnicas() {
        return especificacoesTecnicas;
    }

    public void setEspecificacoesTecnicas(String especificacoesTecnicas) {
        this.especificacoesTecnicas = especificacoesTecnicas;
    }

    public String getImagens() {
        return imagens;
    }

    public void setImagens(String imagens) {
        this.imagens = imagens;
    }
}
