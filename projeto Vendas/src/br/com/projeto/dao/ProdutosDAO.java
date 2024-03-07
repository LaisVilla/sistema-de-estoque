/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Fornecedores;

import br.com.projeto.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class ProdutosDAO {

    private Connection con;

    public ProdutosDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //metodo cadastrar produtos
    public void cadastrar(Produtos obj) {

        try {
            String sql = "insert into tb_produtos(descricao,preco,qtd_estoque,for_id)values(?,?,?,?)";
            //conectar o banco de dados e organizar o comando sql

            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
            stmt.setInt(4, obj.getFornecedor().getId());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "produto cadastrado com sucesso!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "produto cadastrado com sucesso!" + erro);

        }

    }
    //metodo listar produtos

    public List<Produtos> listarProdutos() {

        try {
            //1 passo criar a lista

            List<Produtos> lista = new ArrayList<>();
            //2 passo-criar o sql, organizar e executar.

            String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on (p.for_id = f.id)";

            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

                f.setNome(rs.getString(("f.nome")));

                obj.setFornecedor(f);
                lista.add(obj);

            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }
    }

    //Metodo alterar produtos
    public void alterar(Produtos obj) {
        try {

            String sql = "update tb_produtos  set descricao=?, preco=?, qtd_estoque=?, for_id=?  where id=?";
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());

            stmt.setInt(4, obj.getFornecedor().getId());

            stmt.setInt(5, obj.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso!");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro : " + erro);

        }

    }

    //metodo exlcuir produtos
    public void excluir(Produtos obj) {
        try {

            String sql = "delete from tb_produtos  where id=?";
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Produto excluido com Sucesso!");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro : " + erro);

        }

    }

    //metodo listar produto
    public List<Produtos> listarProdutosPorNome(String nome) {
        try {

            //1 passo criar a lista
            List<Produtos> lista = new ArrayList<>();

            //2 passo - criar o sql , organizar e executar.
            String sql = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on (p.for_id = f.id)where p.descricao like?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

                f.setNome(rs.getString(("f.nome")));

                obj.setFornecedor(f);

                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }
    //metodo consulta produto por nome
     public Produtos consultaPorNome(String nome) {
        try {
            //1 passo - criar o sql , organizar e executar.

            String sql = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on (p.for_id = f.id) where p.descricao =  ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();

            if (rs.next()) {

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

                f.setNome(rs.getString(("f.nome")));

                obj.setFornecedor(f);
            }

            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            return null;
        }
    }
      //metodo busca produto por codigo
     public Produtos buscaPorCodigo(int id) {
        try {
            //1 passo - criar o sql , organizar e executar.

            String sql = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on (p.for_id = f.id) where p.id =  ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();

            if (rs.next()) {

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

                f.setNome(rs.getString(("f.nome")));

                obj.setFornecedor(f);
            }

            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            return null;
        }
    }
     // metodo que da baixar no estoque
     public void baixaEstoque(int id, int qtd_nova) {
        try {

            String sql = "update tb_produtos  set qtd_estoque= ?  where id=?";
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();

           // JOptionPane.showMessageDialog(null, "Produto Alterardo com Sucesso!");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro : " + erro);

        }

    }
     //Metodo que retorna o estoque atual de um produto
    public int retornaEstoqueAtual(int id) {
        try {
            int qtd_estoque = 0;

            String sql = "SELECT qtd_estoque from tb_produtos where id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {           
                qtd_estoque = (rs.getInt("qtd_estoque"));    
            }

            return qtd_estoque;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    // metodo que adiciona estoque
     public void adicionarEstoque(int id, int qtd_nova) {
        try {

            String sql = "update tb_produtos  set qtd_estoque= ?  where id=?";
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();

           // JOptionPane.showMessageDialog(null, "Produto Alterardo com Sucesso!");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro : " + erro);

        }

    }

    
}