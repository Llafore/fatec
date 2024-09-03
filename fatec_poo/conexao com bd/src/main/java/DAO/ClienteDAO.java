/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import DTO.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author norton
 */
public class ClienteDAO {
    private ConexaoSQLite conexao = new ConexaoSQLite();
    
    public ClienteDAO(){
        try{
            String sql = "create table if not exists cliente(codigo int, "
                        + "nome varchar(100), email varchar(100), senha varchar(30))";
            if(conexao.conectar()){
                Statement stmt = conexao.retornaStatement();
                stmt.execute(sql);
            }
        } 
        catch(SQLException err){
            System.err.println(err.getMessage());
        }
        finally{
            conexao.desconectar();
        }
    }
    
    public int inserir(Cliente obj){
        int cont = 0;
        try{
            if(conexao.conectar()){
                String sql = "insert into cliente(codigo,nome,email,senha) values(?,?,?,?)";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setInt(1, obj.getCodigo());
                stmt.setString(2, obj.getNome());
                stmt.setString(3, obj.getEmail());
                stmt.setString(4, obj.getSenha());
                cont = stmt.executeUpdate();
            }
        } 
        catch(SQLException err){
            System.err.println(err.getMessage());
        }
        finally{
            conexao.desconectar();
            return cont;
        }
    }
    
     public int alterar(Cliente obj){
        int cont = 0;
        try{
            if(conexao.conectar()){
                String sql = "update cliente set nome=?,email=?,senha=? where codigo=?";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setString(1, obj.getNome());
                stmt.setString(2, obj.getEmail());
                stmt.setString(3, obj.getSenha());
                stmt.setInt(4, obj.getCodigo());
                cont = stmt.executeUpdate();
            }
        } 
        catch(SQLException err){
            System.err.println(err.getMessage());
        }
        finally{
            conexao.desconectar();
            return cont;
        }
    }
   
    public int remover(Cliente obj){
        int cont = 0;
        try{
            if(conexao.conectar()){
                String sql = "delete from cliente where codigo=?";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setInt(1, obj.getCodigo());
                cont = stmt.executeUpdate();
            }
        } 
        catch(SQLException err){
            System.err.println(err.getMessage());
        }
        finally{
            conexao.desconectar();
            return cont;
        }
    }
    
    public Cliente pesquisar(int codigo){
        Cliente obj = new Cliente();
        try{
            if(conexao.conectar()){
                String sql = "select *  from cliente where codigo=?";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setInt(1, codigo);
                ResultSet resultado = stmt.executeQuery();
                if(! resultado.isClosed()){
                    obj.setCodigo(resultado.getInt("codigo"));
                    obj.setEmail(resultado.getString("email"));
                    obj.setNome(resultado.getString("nome"));
                    obj.setSenha(resultado.getString("senha"));
                }
            }
        } 
        catch(SQLException err){
            System.err.println(err.getMessage());
        }
        finally{
            conexao.desconectar();
            return obj;
        }
    }
    
    
     public List<Cliente> retornaLista(String busca){
        List<Cliente> lista = new ArrayList<Cliente>();
        try{
            if(conexao.conectar()){
                PreparedStatement stmt;
                if(busca.length() > 0){          
                    stmt = conexao.preparedStatement("select *  from cliente "
                            + "where nome like ? order by nome");
                    stmt.setString(1, "%"+ busca + "%");
                } else {
                    stmt = conexao.preparedStatement("select *  from cliente "
                            + "order by nome");
                }
                ResultSet resultado = stmt.executeQuery();
                while(resultado.next()){
                    Cliente obj = new Cliente();
                    obj.setCodigo(resultado.getInt("codigo"));
                    obj.setEmail(resultado.getString("email"));
                    obj.setNome(resultado.getString("nome"));
                    obj.setSenha(resultado.getString("senha"));
                    lista.add(obj);
                }
            }
        } 
        catch(SQLException err){
         System.err.println(err.getMessage());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        finally{
            conexao.desconectar();
            return lista;
        }
    }
    
}
