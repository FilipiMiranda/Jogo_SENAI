package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meio2 extends JFrame {
    private JButton aAumentoDaBiodiversidadeButton;
    private JButton cReduçãoDasEmissõesButton;
    private JButton bMorteDeAnimaisButton;
    private JPanel MeioAmbiente2;

    public Meio2() throws HeadlessException {
        setTitle("Pergunta2.2");
        setSize(2000, 1000);
        setContentPane(MeioAmbiente2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        aAumentoDaBiodiversidadeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bMorteDeAnimaisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Meio3();

            }
        });
        cReduçãoDasEmissõesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {

        new Meio2();
    }
}
