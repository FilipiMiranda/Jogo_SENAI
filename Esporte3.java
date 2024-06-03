package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Esporte3 extends JFrame{
    private JButton aSerenaWilliamsButton;
    private JButton bSteffiGrafButton;
    private JButton cMargaretCourtButton;
    private JButton dMartinaNavratilovaButton;
    private JPanel sport3;

    public Esporte3() throws HeadlessException {
        setTitle("Pergunta3.3");
        setSize(2000, 1000);
        setContentPane(sport3   );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        aSerenaWilliamsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bSteffiGrafButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cMargaretCourtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Esporte4();

            }
        });
        dMartinaNavratilovaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Esporte3 e = new Esporte3();
    }
}
