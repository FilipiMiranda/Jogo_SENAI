package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Esporte1 extends JFrame{
    private JButton aBrasilButton;
    private JButton bAlemanhaButton;
    private JButton cFrançaButton;
    private JButton dCroáciaButton;
    private JPanel sport1;

    public Esporte1()throws HeadlessException {
        setTitle("Pergunta3.1");
        setSize(2000, 1000);
        setContentPane(sport1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        aBrasilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bAlemanhaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cFrançaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Esporte2();

            }
        });
        dCroáciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Esporte1 e = new Esporte1();
    }
}
