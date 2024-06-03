package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Esporte5 extends JFrame {
    private JButton aTheBestFIFAButton;
    private JButton bPrêmioPuskásButton;
    private JButton cBolaDeOuroButton;
    private JButton dChuteiraDeOuroButton;
    private JPanel sport5;

    public Esporte5() throws HeadlessException {
        setTitle("Pergunta3.5");
        setSize(2000, 1000);
        setContentPane(sport5);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        aTheBestFIFAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Resultado();

            }
        });
        bPrêmioPuskásButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cBolaDeOuroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        dChuteiraDeOuroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }
}
