package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meio3 extends JFrame{
    private JPanel MeioAmbiente3;
    private JButton aElesSãoLocaisButton;
    private JButton bElesAtuamComoButton;
    private JButton cElesAumentamAButton;

    public Meio3() throws HeadlessException {
        setTitle("Pergunta2.3");
        setSize(2000, 1000);
        setContentPane(MeioAmbiente3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        aElesSãoLocaisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bElesAtuamComoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Meio4();


            }
        });
        cElesAumentamAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Meio3 e = new Meio3();
    }
}
