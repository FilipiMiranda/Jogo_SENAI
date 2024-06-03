package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaRegras extends JFrame {
    private JButton voltarButton;
    private JPanel Regras;

    public TelaRegras() throws HeadlessException {
        setTitle("Regras");
        setSize(2000, 1000);
        setContentPane(Regras);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
             new TelaInicial();
            }
        });
    }

    public static void main(String[] args) {
        TelaRegras e = new TelaRegras();

    }
}
