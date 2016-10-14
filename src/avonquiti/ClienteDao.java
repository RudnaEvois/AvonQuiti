
package avonquiti;

import avonquiti.model.Cliente;
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
public class ClienteDao extends GenericDao {

    public void salvar(Cliente cliente) throws SQLException {
        String insert = "INSERT INTO CLIENTESAVON(id, nome, telefone) VALUES(?,?,?)";
        save(insert, cliente.getId(), cliente.getNome(), cliente.getTel());

    }

    public void salvarJ(Cliente cliente) throws SQLException {
        String insert = "INSERT INTO CLIENTESJEQUITI(id, nome, telefone) VALUES(?,?,?)";
        save(insert, cliente.getId(), cliente.getNome(), cliente.getTel());

    }

    public List<Cliente> findClientes() throws SQLException {
        List<Cliente> contatos = new ArrayList<Cliente>();
        String select = "SELECT * FROM CLIENTESAVON";
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Cliente contato = new Cliente();
            contato.setId(rs.getString("id"));
            contato.setNome(rs.getString("nome"));
            contato.setTel(rs.getString("telefone"));
            contatos.add(contato);
        }

        rs.close();
        stmt.close();

        return contatos;
    }

    public List<Cliente> findClientesJ() throws SQLException {
        List<Cliente> contatos = new ArrayList<Cliente>();

        String select = "SELECT NOME FROM CLIENTESJEQUITI";

        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Cliente contato = new Cliente();
            contato.setId(rs.getString("id"));
            contato.setNome(rs.getString("nome"));
            contato.setTel(rs.getString("telefone"));
            contatos.add(contato);
        }

        rs.close();
        stmt.close();

        return contatos;
    }

    public Cliente findByName(String nome) throws SQLException {
        String select = "SELECT * FROM CLIENTESAVON WHERE nome = ?";
        Cliente contato = null;
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            contato = new Cliente();
            contato.setId(rs.getString("id"));
            contato.setNome(rs.getString("nome"));
            contato.setTel(rs.getString("telefone"));
            ;
        }
        JOptionPane.showMessageDialog(null, "Código do(a) Cliente: " + contato.getId() + "\n Nome: " + contato.getNome() + "\n Telefone:" + contato.getTel());
        rs.close();
        stmt.close();

        return contato;

    }

    public Cliente findByNameJ(String nome) throws SQLException {
        String select = "SELECT * FROM CLIENTESJEQUITI WHERE nome = ?";
        Cliente contato = null;
        PreparedStatement stmt
                = getConnection().prepareStatement(select);

        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            contato = new Cliente();
            contato.setId(rs.getString("id"));
            contato.setNome(rs.getString("nome"));
            contato.setTel(rs.getString("telefone"));
            ;
        }
        JOptionPane.showMessageDialog(null, "Código do(a) Cliente: " + contato.getId() + "\n Nome: " + contato.getNome() + "\n Telefone:" + contato.getTel());
        rs.close();
        stmt.close();
        return contato;
    }
}
