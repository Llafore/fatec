package DAO;

import DTO.Pedido;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PedidoDAO {
    private ConexaoSQLite conexao = new ConexaoSQLite();
    public PedidoDAO(){
        try{
            String sql = "create table if not exists pedido(id int primary key auto_increment, " +
                    "data_pedido date, valor_total float)";
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
    public int inserir(Pedido obj){
        int cont = 0;
        try{
            if(conexao.conectar()){
                String sql = "insert into pedido(id,data_pedido,valor_total) values(?,?,?)";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setInt(1, obj.getId());
                stmt.setString(2, obj.getData());
                stmt.setFloat(3, obj.getTotal());
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
    public int alterar(Pedido obj){
        int cont = 0;
        try{
            if(conexao.conectar()){
                String sql = "update pedido set id=?,data_pedido=?,valor_total=?";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setInt(1, obj.getId());
                stmt.setString(2, obj.getData());
                stmt.setFloat(3, obj.getTotal());
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
    public int remover(Pedido obj){
        int cont = 0;
        try{
            if(conexao.conectar()){
                String sql = "delete from pedido where id=?";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setInt(1, obj.getId());
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
    public Pedido pesquisar(int codigo){
        Pedido ped = new Pedido();
        try{
            if(conexao.conectar()){
                String sql = "select * from pedido where id = ?";
                PreparedStatement stmt = conexao.preparedStatement(sql);
                stmt.setInt(1, codigo);
                ResultSet resultado = stmt.executeQuery();
                if(! resultado.isClosed()){
                    ped.setId(resultado.getInt("id"));
                    ped.setData(resultado.getString("data_pedido"));
                    ped.setTotal(resultado.getFloat("valor"));
                }
            }

        }catch(SQLException err){
            System.err.println(err.getMessage());
        }
        finally{
            conexao.desconectar();
            return ped;
        }
    }
}
