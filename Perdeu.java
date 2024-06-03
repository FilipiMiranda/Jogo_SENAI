package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Perdeu extends JFrame{
    private JPanel Perdeu;
    private JButton voltarParaMenuButton;

    public Perdeu() throws HeadlessException
    {
        setTitle("Menu");
        setSize(2000, 1000);
        setContentPane(Perdeu);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        voltarParaMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Jogo();

            }
        });
    }

    public static void main(String[] args) {
        Perdeu e = new Perdeu();
    }
}

