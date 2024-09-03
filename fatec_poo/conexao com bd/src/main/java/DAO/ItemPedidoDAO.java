package DAO;

import DTO.Item;
import DTO.Pedido;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemPedidoDAO {
    private ConexaoSQLite conexao = new ConexaoSQLite();

    public ItemPedidoDAO(){
        try{
            String sql =
                    "create table if not exists item_pedido (id int primary key" +
                    " auto_increment, id_item int, id_pedido int, valor float);" +
                    "create table if not exists item(id int primary key auto_increment," +
                    "preco float, nome varchar(60));";
            if(conexao.conectar()){
                Statement stmt = conexao.retornaStatement();
                stmt.execute(sql);
            }
        } catch (SQLException err){
            System.out.println(err.getMessage());
        } finally {
            conexao.desconectar();
        }
    }
    public int inserir(Item item, Pedido ped){
        int count = 0;
        try{
            if(conexao.conectar()){
                String sql = "insert into item_pedido(id_item, id_pedido, valor) values (?,?,?)";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setInt(1, item.getId());
                stmt.setInt(2, ped.getId());
                stmt.setFloat(3,item.getValor());
                count = stmt.executeUpdate();
            }
        }
        catch(SQLException err){
                System.err.println(err.getMessage());
            }
        finally {
            conexao.desconectar();
            return count;
        }
    }
    public int alterar(Item item, Pedido ped){
        int count = 0;
        try{
            if(conexao.conectar()){
                String sql = "update item_pedido set valor=? where id_item=? and id_pedido=?;";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setFloat(1,item.getValor());
                stmt.setInt(2, item.getId());
                stmt.setInt(3, ped.getId());
                count = stmt.executeUpdate();
            }
        }
        catch(SQLException err){
            System.err.println(err.getMessage());
        }
        finally {
            conexao.desconectar();
            return count;
        }
    }
    public int remover(Item item, Pedido ped){
        int cont = 0;
        try{
            if (conexao.conectar()) {

                String sql = "delete from item_pedido where id_item=? and id_pedido=?";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setInt(1,item.getId());
                stmt.setInt(2,ped.getId());
                cont =  stmt.executeUpdate();
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

    public List<Item> retornaLista(int ped_id){
        List<Item> lista = new ArrayList<Item>();
        try{
            if(conexao.conectar()){
                PreparedStatement stmt;
                stmt = conexao.preparedStatement("select i.* from item_pedido as ip " +
                        "inner join item as i on i.id = ip.id_item where ip.id_pedido=?");
                stmt.setInt(1,ped_id);
                ResultSet resultado = stmt.executeQuery();
                while(resultado.next()){
                    Item obj = new Item();
                    obj.setId(resultado.getInt("id"));
                    obj.setNome(resultado.getString("nome"));
                    obj.setValor(resultado.getFloat("preco"));
                    obj.setDesc(" ");
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
