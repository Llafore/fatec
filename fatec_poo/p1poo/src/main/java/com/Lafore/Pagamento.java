package com.Lafore;

public class Pagamento {
    private int id;
    private float valor;
    private String metodo_pagamento;
    private String finalizado; // aceita apenas S e N

    public Pagamento(int id, float valor, String metodo_pagamento, String finalizado) throws Exception {
        setId(id);
        setValor(valor);
        setMetodo_pagamento(metodo_pagamento);
        setfinalizado(finalizado);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public String getfinalizado() {
        return finalizado;
    }

    public void setfinalizado(String finalizado) throws Exception {
        if(finalizado.equals("N") || finalizado.equals("S")){
            this.finalizado = finalizado;
        } else{throw new Exception("Tipo de status de pagamento invalido! Insira N para ainda em aberto ou S para pago");}
    }
}
