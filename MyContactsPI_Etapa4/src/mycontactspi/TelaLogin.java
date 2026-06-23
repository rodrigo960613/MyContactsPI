package mycontactspi;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {

    public TelaLogin() {
        setTitle("MyContactsPI - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        JLabel titulo = new JLabel("MYCONTACTSPI", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));

        JTextField campoUsuario = new JTextField();
        JPasswordField campoSenha = new JPasswordField();

        JButton botaoEntrar = new JButton("Entrar");

        painel.add(titulo);
        painel.add(campoUsuario);
        painel.add(campoSenha);
        painel.add(botaoEntrar);

        botaoEntrar.addActionListener(e -> {
            TelaMenu menu = new TelaMenu();
            menu.setVisible(true);
            dispose();
        });

        add(painel);
    }

    public static void main(String[] args) {
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
    }
}