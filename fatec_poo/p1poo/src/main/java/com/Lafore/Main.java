package com.Lafore;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario usr = new Usuario(1, "2131231231", "Luis Lafore", LocalDate.of(2004, 4, 20), "senha123");
        Suporte spt = new Suporte("A1", 4.2f,73,"213412","Joao", LocalDate.of(2004, 4, 20) ,"dabliuBrasil");
        Atendimento atd = spt.atender(usr);
        atd.setAtendente(spt);
    }
}