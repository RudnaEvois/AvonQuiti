/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avonquiti;

import avonquiti.model.NF;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class NFDao extends GenericDao {

    public void salvar(NF nf) throws SQLException {
        String insert = "INSERT INTO NFAVON(cod, codproduto, nome, quantidade, precocusto, precovenda, lucro ) VALUES(?,?,?,?,?,?,?)";
        save(insert, nf.getCod(), nf.getCodproduto(), nf.getNome(), nf.getQuant(), nf.getPcusto(), nf.getPvenda(), nf.getLucro());

    }

    public void salvarJ(NF nf) throws SQLException {
        String insert = "INSERT INTO NFJEQUITI(cod, codproduto, nome, quantidade, precocusto, precovenda, lucro ) VALUES(?,?,?,?,?,?,?)";
        save(insert, nf.getCod(), nf.getCodproduto(), nf.getNome(), nf.getQuant(), nf.getPcusto(), nf.getPvenda(), nf.getLucro());

    }

    public List<NF> findNF() throws SQLException {
        List<NF> notafiscal = new ArrayList<NF>();
        String select = "SELECT * FROM NFAVON";
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            NF nf = new NF();
            nf.setCod(rs.getString("cod"));
            nf.setCodproduto(rs.getString("codproduto"));
            nf.setNome(rs.getString("nome"));
            nf.setQuant(rs.getInt("quantidade"));
            nf.setPcusto(rs.getFloat("precocusto"));
            nf.setPvenda(rs.getFloat("precovenda"));
            rs.getFloat("lucro");
            notafiscal.add(nf);
        }

        rs.close();
        stmt.close();

        return notafiscal;
    }

    public NF findByName(String nome) throws SQLException {
        String select = "SELECT * FROM NFAVON WHERE nome = ?";
        NF nf = null;
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            nf = new NF();
            nf.setCod(rs.getString("cod"));
            nf.setCodproduto(rs.getString("codproduto"));
            nf.setNome(rs.getString("nome"));
            nf.setQuant(rs.getInt("quantidade"));
            nf.setPcusto(rs.getFloat("precocusto"));
            nf.setPvenda(rs.getFloat("precovenda"));
            nf.setLucro(rs.getFloat("lucro"));
            ;

        }
        JOptionPane.showMessageDialog(null, "Código da NF: " + nf.getCod() + "\n Código do produto: " + nf.getCodproduto() + "\n Nome: " + nf.getNome() + "\n Quantidade: " + nf.getQuant() + "\n Preço de custo: " + nf.getPcusto() + "\n Preço de venda: " + nf.getPvenda() + "\n O lucro sobre esse produto: " + nf.getLucro());
        rs.close();
        stmt.close();
        return nf;
    }

    public NF findByNameJ(String nome) throws SQLException {
        String select = "SELECT * FROM NJEQUITI WHERE nome = ?";
        NF nf = null;
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            nf = new NF();
            nf.setCod(rs.getString("cod"));
            nf.setCodproduto(rs.getString("codproduto"));
            nf.setNome(rs.getString("nome"));
            nf.setQuant(rs.getInt("quantidade"));
            nf.setPcusto(rs.getFloat("precocusto"));
            nf.setPvenda(rs.getFloat("precovenda"));
            nf.setLucro(rs.getFloat("lucro"));
            ;

        }
        JOptionPane.showMessageDialog(null, "Código da NF: " + nf.getCod() + "\n Código do produto: " + nf.getCodproduto() + "\n Nome: " + nf.getNome() + "\n Quantidade: " + nf.getQuant() + "\n Preço de custo: " + nf.getPcusto() + "\n Preço de venda: " + nf.getPvenda() + "\n O lucro sobre esse produto: " + nf.getLucro());
        rs.close();
        stmt.close();
        return nf;
    }

    public NF findByCod(String nome) throws SQLException {
        String select = "SELECT * FROM NFAVON WHERE cod = ?";
        NF nf = new NF();

        nf = null;
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            nf = new NF();
            nf.setCod(rs.getString("cod"));
            nf.setCodproduto(rs.getString("codproduto"));
            nf.setNome(rs.getString("nome"));
            nf.setQuant(rs.getInt("quantidade"));
            nf.setPcusto(rs.getFloat("precocusto"));
            nf.setPvenda(rs.getFloat("precovenda"));
            nf.setLucro(rs.getFloat("lucro"));
            System.out.println("Código da NF: " + nf.getCod() + "\n Código do produto: " + nf.getCodproduto() + "\n Nome: " + nf.getNome() + "\n Quantidade: "+nf.getQuant() + "\n Preço de custo: " + nf.getPcusto() + "\n Preço de venda: " + nf.getPvenda() + "\n O lucro sobre esse produto: " + nf.getLucro());

            ;

        }

        rs.close();
        stmt.close();

        return nf;

    }

    public NF findByCodJ(String nome) throws SQLException {
        String select = "SELECT * FROM NFJEQUITI WHERE cod = ?";
        NF nf = null;
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            nf = new NF();
            nf.setCod(rs.getString("cod"));
            nf.setCodproduto(rs.getString("codproduto"));
            nf.setNome(rs.getString("nome"));
            nf.setQuant(rs.getInt("quantidade"));
            nf.setPcusto(rs.getFloat("precocusto"));
            nf.setPvenda(rs.getFloat("precovenda"));
            nf.setLucro(rs.getFloat("lucro"));
            ;

        }
        JOptionPane.showMessageDialog(null, "Código da NF: " + nf.getCod() + "\n Código do produto: " + nf.getCodproduto() + "\n Nome: " + nf.getNome() + "\n Quantidade: " + nf.getQuant() + "\n Preço de custo: " + nf.getPcusto() + "\n Preço de venda: " + nf.getPvenda() + "\n O lucro sobre esse produto: " + nf.getLucro());
        rs.close();
        stmt.close();
        return nf;
    }
}
