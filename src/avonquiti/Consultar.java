/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avonquiti;

import avonquiti.model.NF;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Consultar {

    public List<NF> nfa = new ArrayList<NF>();

    public void listar() {
        ResultSet rs = null;
        Connection cnn = ConnectionDataBase.getConnection();
        try {
            String cod = JOptionPane.showInputDialog("Digite o código da NF");
            PreparedStatement sql = cnn.prepareStatement("SELECT * FROM NFJEQUITI WHERE cod =" + cod);

            rs = sql.executeQuery();
            while(rs.next()){
                NF nf=new NF();
                 nf.setCod(rs.getString("cod"));
            nf.setCodproduto(rs.getString("codproduto"));
            nf.setNome(rs.getString("nome"));
            nf.setQuant(rs.getInt("quantidade"));
            nf.setPcusto(rs.getFloat("precocusto"));
            nf.setPvenda(rs.getFloat("precovenda"));
            nf.setLucro(rs.getFloat("lucro"));
            nfa.add(nf);
            }
        }
catch(SQLException e){
        e.printStackTrace();
        }
        }
    
    public void listarA() {
        ResultSet rs = null;
        Connection cnn = ConnectionDataBase.getConnection();
        try {
            
            String cod = JOptionPane.showInputDialog("Digite o código da NF");
            PreparedStatement sql = cnn.prepareStatement("SELECT * FROM NFAVON WHERE cod =" + cod);

            rs = sql.executeQuery();
            while(rs.next()){
                NF nf=new NF();
                 nf.setCod(rs.getString("cod"));
            nf.setCodproduto(rs.getString("codproduto"));
            nf.setNome(rs.getString("nome"));
            nf.setQuant(rs.getInt("quantidade"));
            nf.setPcusto(rs.getFloat("precocusto"));
            nf.setPvenda(rs.getFloat("precovenda"));
            nf.setLucro(rs.getFloat("lucro"));
            nfa.add(nf);
            }
        }
catch(SQLException e){
        e.printStackTrace();
        }
        }
     public void porCodA() {
        ResultSet rs = null;
        Connection cnn = ConnectionDataBase.getConnection();
        try {
            String codp = JOptionPane.showInputDialog("Digite o código do produto");
            PreparedStatement sql = cnn.prepareStatement("SELECT * FROM NFAVON WHERE codproduto =" + codp);

            rs = sql.executeQuery();
            while(rs.next()){
                NF nf=new NF();
                 nf.setCod(rs.getString("cod"));
            nf.setCodproduto(rs.getString("codproduto"));
            nf.setNome(rs.getString("nome"));
            nf.setQuant(rs.getInt("quantidade"));
            nf.setPcusto(rs.getFloat("precocusto"));
            nf.setPvenda(rs.getFloat("precovenda"));
            nf.setLucro(rs.getFloat("lucro"));
            nfa.add(nf);
            }
        }
catch(SQLException e){
        e.printStackTrace();
        }
        }
     public void porCodJ() {
        ResultSet rs = null;
        Connection cnn = ConnectionDataBase.getConnection();
        try {
            String codp = JOptionPane.showInputDialog("Digite o código do produto");
            PreparedStatement sql = cnn.prepareStatement("SELECT * FROM NFJEQUITI WHERE codproduto =" + codp);

            rs = sql.executeQuery();
            while(rs.next()){
                NF nf=new NF();
                 nf.setCod(rs.getString("cod"));
            nf.setCodproduto(rs.getString("codproduto"));
            nf.setNome(rs.getString("nome"));
            nf.setQuant(rs.getInt("quantidade"));
            nf.setPcusto(rs.getFloat("precocusto"));
            nf.setPvenda(rs.getFloat("precovenda"));
            nf.setLucro(rs.getFloat("lucro"));
            nfa.add(nf);
            }
        }
catch(SQLException e){
        e.printStackTrace();
        }
        }
    }


