package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tec4 extends JFrame {
    private JButton bGerenciarMáquinasVirtuaisButton;
    private JButton dMonitorarAIntegridadeButton;
    private JButton aAumentarAVelocidadeButton;
    private JButton cCriptografarDadosEmButton;
    private JPanel Tecnologia4;

    public Tec4() throws HeadlessException {
        setTitle("Pergunta 4");
        setSize(2000, 1000);
        setContentPane(Tecnologia4);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        aAumentarAVelocidadeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bGerenciarMáquinasVirtuaisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tec5();

            }
        });
        cCriptografarDadosEmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        dMonitorarAIntegridadeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }
}
