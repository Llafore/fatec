package com.Lafore;
public class Estagiario extends Funcionario implements Colaborador{
    public Estagiario(int cargaHoraria) {
        setCargaHoraria(cargaHoraria);
        setSalario();
    }

}
