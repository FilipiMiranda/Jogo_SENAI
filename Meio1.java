package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meio1 extends JFrame{
    private JButton aOQueÉButton;
    private JButton bOAumentoDaButton;
    private JButton cADiminuiçãoDaButton;
    private JPanel MeioAmbiente;

    public Meio1() throws HeadlessException {
        setTitle("Pergunta2.1");
        setSize(2000, 1000);
        setContentPane(MeioAmbiente);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        aOQueÉButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bOAumentoDaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Meio2();

            }
        });
        cADiminuiçãoDaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Meio1 e = new Meio1();
    }
}
