package mycontactspi;

import javax.swing.*;
import java.awt.*;

public class TelaCategorias extends JFrame {

    public TelaCategorias() {

        setTitle("Categorias");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout(10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        JLabel titulo = new JLabel("CATEGORIAS", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));

        JTextArea areaCategorias = new JTextArea();
        areaCategorias.setEditable(false);
        areaCategorias.setFont(new Font("Arial", Font.PLAIN, 16));

        areaCategorias.setText(
                "Categorias disponíveis:\n\n"
                + "- Amigos\n"
                + "- Família\n"
                + "- Trabalho\n"
                + "- Clientes\n"
                + "- Outros\n"
        );

        JButton btnVoltar = new JButton("Voltar");

        painel.add(titulo, BorderLayout.NORTH);
        painel.add(areaCategorias, BorderLayout.CENTER);
        painel.add(btnVoltar, BorderLayout.SOUTH);

        add(painel);

        btnVoltar.addActionListener(e -> {
            TelaMenu menu = new TelaMenu();
            menu.setVisible(true);
            dispose();
        });
    }
}