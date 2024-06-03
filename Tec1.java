package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tec1 extends JFrame {
    private JPanel Tecnologia1;
    private JButton bCriptografarDadosSensíveisButton;
    private JButton cProtegerContraAcessosButton;
    private JButton dOtimizarODesempenhoButton;
    private JButton aAumentarAVelocidadeButton;

    public Tec1() throws HeadlessException {
        setTitle("Pergunta 1");
        setSize(2000, 1000);
        setContentPane(Tecnologia1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        aAumentarAVelocidadeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Perdeu();

            }
        });
        bCriptografarDadosSensíveisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cProtegerContraAcessosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tec2();

            }
        });
        dOtimizarODesempenhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Tec1 e = new Tec1();
    }
}


