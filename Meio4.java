package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meio4 extends JFrame{
    private JButton aEnergiaSolarButton;
    private JButton bEnergiaHidrelétricaButton;
    private JButton cEnergiaNuclearButton;
    private JPanel MeioAmbiente4;

    public Meio4() throws HeadlessException {
        setTitle("Pergunta2.4");
        setSize(2000, 1000);
        setContentPane(MeioAmbiente4);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        aEnergiaSolarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bEnergiaHidrelétricaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cEnergiaNuclearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Meio5();

            }
        });
    }

    public static void main(String[] args) {
        new Meio4();
    }
}
