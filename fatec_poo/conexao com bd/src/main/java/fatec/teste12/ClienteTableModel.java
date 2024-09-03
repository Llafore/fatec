/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.teste12;

import DTO.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel  extends AbstractTableModel {
    private List<Cliente> dados = new ArrayList<Cliente>();
    private String[] colunas = {"codigo","email","nome","senha"};
    @Override
    public int getRowCount() {
        return getDados().size();
    }
    @Override
    public int getColumnCount() {
        return getColunas().length;
    }
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0: return this.dados.get(linha).getCodigo();
            case 1: return this.dados.get(linha).getEmail();
            case 2: return this.dados.get(linha).getNome();
            case 3: return this.dados.get(linha).getSenha();
            default: return null;
        }
    }  
    @Override
    public String getColumnName(int coluna) {
        return getColunas()[coluna];
    }
    public List<Cliente> getDados() {
        return dados;
    }
    public void setDados(List<Cliente> dados) {
        this.dados = dados;
    }
    public String[] getColunas() {
        return colunas;
    }
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    public Cliente retornaObjeto(int linha){
        return dados.get(linha);
    }
}
