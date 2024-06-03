package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Esporte4 extends JFrame{
    private JButton a210975KmButton;
    private JButton b30KmButton;
    private JButton c42195KmButton;
    private JButton d50KmButton;
    private JPanel sport4;

    public Esporte4() throws HeadlessException {
        setTitle("Pergunta3.4");
        setSize(2000, 1000);
        setContentPane(sport4);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        a210975KmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        b30KmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        c42195KmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Esporte5();

            }
        });
        d50KmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Esporte4 e = new Esporte4();
    }
}
