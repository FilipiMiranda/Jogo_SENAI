package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Esporte2 extends JFrame{
    private JButton c1999Button;
    private JButton b2003Button;
    private JButton d2007Button;
    private JButton a1996Button;
    private JPanel sport2;

    public Esporte2() throws HeadlessException {
        setTitle("Pergunta3.2");
        setSize(2000, 1000);
        setContentPane(sport2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        a1996Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        b2003Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Esporte3();

            }
        });
        c1999Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        d2007Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Esporte2 e = new Esporte2();
    }
}
