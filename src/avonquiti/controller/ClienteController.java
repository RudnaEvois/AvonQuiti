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
import avonquiti.ClienteDao;
import avonquiti.model.Cliente;

import javax.swing.*;

import java.sql.SQLException;

import java.text.ParseException;

import java.util.List;

public class ClienteController {

    public void salvar(String id, String nome, String telefone)
            throws SQLException, ParseException {
        Cliente contato = new Cliente();
        contato.setId(id);
        contato.setNome(nome);
        contato.setTel(telefone);
        new ClienteDao().salvar(contato);
    }

    public void salvarJ(String id, String nome, String telefone)
            throws SQLException, ParseException {
        Cliente contato = new Cliente();
        contato.setId(id);
        contato.setNome(nome);
        contato.setTel(telefone);
        new ClienteDao().salvarJ(contato);
    }

    public List<Cliente> listaClientes() {
        ClienteDao dao = new ClienteDao();
        try {
            return dao.findClientes();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Problemas ao localizar contaton"
                    + e.getLocalizedMessage()
            );
        }
        return null;
    }

    public Cliente buscaContatoPorNome(String nome) throws SQLException {
        ClienteDao dao = new ClienteDao();
        return dao.findByName(nome);
    }

    public Cliente buscaContatoPorNomeJ(String nome) throws SQLException {
        ClienteDao dao = new ClienteDao();
        return dao.findByNameJ(nome);
    }

}
