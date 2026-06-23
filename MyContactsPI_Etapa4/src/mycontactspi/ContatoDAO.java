package mycontactspi;

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ContatoDAO {

    public void cadastrar(Contato contato) {

        String sql = "INSERT INTO contatos (nome, telefone, email, categoria) VALUES (?, ?, ?, ?)";

        try {
            Connection conexao = Conexao.conectar();

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getTelefone());
            stmt.setString(3, contato.getEmail());
            stmt.setString(4, contato.getCategoria());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar contato!");
            e.printStackTrace();
        }
    }

    public ArrayList<Contato> listar() {

        ArrayList<Contato> lista = new ArrayList<>();

        String sql = "SELECT * FROM contatos";

        try {
            Connection conexao = Conexao.conectar();

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Contato contato = new Contato(
                        rs.getString("nome"),
                        rs.getString("telefone"),
                        rs.getString("email"),
                        rs.getString("categoria")
                );

                lista.add(contato);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (Exception e) {
            System.out.println("Erro ao listar contatos!");
            e.printStackTrace();
        }

        return lista;
    }
}