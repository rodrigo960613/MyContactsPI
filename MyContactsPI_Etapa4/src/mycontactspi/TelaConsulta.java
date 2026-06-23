package mycontactspi;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TelaConsulta extends JFrame {

    public TelaConsulta() {

        setTitle("Consulta de Contatos");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new BorderLayout());

        JTextArea areaContatos = new JTextArea();
        areaContatos.setEditable(false);

        JButton btnVoltar = new JButton("Voltar");

        StringBuilder texto = new StringBuilder();

        texto.append("===== LISTA DE CONTATOS =====\n\n");

        ContatoDAO dao = new ContatoDAO();
        ArrayList<Contato> lista = dao.listar();

        if (lista.isEmpty()) {
            texto.append("Nenhum contato cadastrado.");
        } else {

            for (Contato c : lista) {

                texto.append("Nome: ").append(c.getNome()).append("\n");
                texto.append("Telefone: ").append(c.getTelefone()).append("\n");
                texto.append("Email: ").append(c.getEmail()).append("\n");
                texto.append("Categoria: ").append(c.getCategoria()).append("\n");
                texto.append("----------------------------------------\n");

            }

        }

        areaContatos.setText(texto.toString());

        painel.add(new JScrollPane(areaContatos), BorderLayout.CENTER);
        painel.add(btnVoltar, BorderLayout.SOUTH);

        add(painel);

        btnVoltar.addActionListener(e -> {
            TelaMenu menu = new TelaMenu();
            menu.setVisible(true);
            dispose();
        });

    }

}