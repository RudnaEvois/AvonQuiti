/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avonquiti.controller;

/**
 *
 * @author USER
 */
import avonquiti.NFDao;
import avonquiti.model.NF;

import javax.swing.*;

import java.sql.SQLException;

import java.text.ParseException;

import java.util.List;

public class NFController {

    public void salvar(String cod, String codproduto, String nome, int quantidade, float precocusto, float precovenda,float lucro)
            throws SQLException, ParseException {
        NF nf = new NF();
        nf.setCod(cod);
        nf.setCodproduto(codproduto);
        nf.setNome(nome);
        nf.setQuant(quantidade);
        nf.setPcusto(precocusto);
        nf.setPvenda(precovenda);
        nf.setLucro(lucro);
        new NFDao().salvar(nf);
    }

    public void salvarJ(String cod, String codproduto, String nome, int quantidade, float precocusto, float precovenda,float lucro)
            throws SQLException, ParseException {
        NF nf = new NF();
        nf.setCod(cod);
        nf.setCodproduto(codproduto);
        nf.setNome(nome);
        nf.setQuant(quantidade);
        nf.setPcusto(precocusto);
        nf.setPvenda(precovenda);
        nf.setLucro(lucro);
        new NFDao().salvarJ(nf);
    }

    public List<NF> listaNF() {
        NFDao dao = new NFDao();
        try {
            return dao.findNF();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Problemas ao localizar contaton"
                    + e.getLocalizedMessage()
            );
        }
        return null;
    }

    public NF buscaContatoPorNome(String nome) throws SQLException {
        NFDao dao = new NFDao();
        return dao.findByName(nome);
    }

    public NF buscaContatoPorNomeJ(String nome) throws SQLException {
        NFDao dao = new NFDao();
        return dao.findByNameJ(nome);
    }

}
