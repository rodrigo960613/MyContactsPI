package mycontactspi;

import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends JFrame {

    public TelaCadastro() {

        setTitle("Cadastro de Contato");
        setSize(450, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(9, 2, 5, 5));

        JTextField txtNome = new JTextField();
        JTextField txtTelefone = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtCategoria = new JTextField();

        JButton btnSalvar = new JButton("Salvar");
        JButton btnVoltar = new JButton("Voltar");

        painel.add(new JLabel("Nome"));
        painel.add(txtNome);

        painel.add(new JLabel("Telefone"));
        painel.add(txtTelefone);

        painel.add(new JLabel("Email"));
        painel.add(txtEmail);

        painel.add(new JLabel("Categoria"));
        painel.add(txtCategoria);

        painel.add(btnSalvar);
        painel.add(btnVoltar);

        add(painel);

        // Salvar no banco de dados
        btnSalvar.addActionListener(e -> {

            Contato contato = new Contato(
                    txtNome.getText(),
                    txtTelefone.getText(),
                    txtEmail.getText(),
                    txtCategoria.getText()
            );

            ContatoDAO dao = new ContatoDAO();
            dao.cadastrar(contato);

            JOptionPane.showMessageDialog(
                    null,
                    "Contato cadastrado com sucesso!"
            );

            txtNome.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
            txtCategoria.setText("");

        });

        // Voltar ao menu
        btnVoltar.addActionListener(e -> {

            TelaMenu menu = new TelaMenu();
            menu.setVisible(true);
            dispose();

        });

    }
}