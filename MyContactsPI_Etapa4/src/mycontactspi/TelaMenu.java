package mycontactspi;

import javax.swing.*;
import java.awt.*;

public class TelaMenu extends JFrame {

    public TelaMenu() {
        setTitle("MyContactsPI - Menu Principal");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        JLabel titulo = new JLabel("MENU PRINCIPAL", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));

        JButton btnCadastrar = new JButton("Cadastrar Contato");
        JButton btnConsultar = new JButton("Consultar Contatos");
        JButton btnCategorias = new JButton("Tipos de Categorias");
        JButton btnSair = new JButton("Sair");

        painel.add(titulo);
        painel.add(btnCadastrar);
        painel.add(btnConsultar);
        painel.add(btnCategorias);
        painel.add(btnSair);

        btnCadastrar.addActionListener(e -> {
            TelaCadastro tela = new TelaCadastro();
            tela.setVisible(true);
            dispose();
        });

        btnConsultar.addActionListener(e -> {
            TelaConsulta tela = new TelaConsulta();
            tela.setVisible(true);
            dispose();
        });

        btnCategorias.addActionListener(e -> {
            TelaCategorias tela = new TelaCategorias();
            tela.setVisible(true);
            dispose();
        });

        btnSair.addActionListener(e -> {
            System.exit(0);
        });

        add(painel);
    }
}
