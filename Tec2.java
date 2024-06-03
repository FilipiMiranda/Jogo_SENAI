package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tec2 extends JFrame{
    private JButton aUmSistemaOperacionalButton;
    private JButton cUmProtocoloDeButton;
    private JButton bUmaLinguagemDeButton;
    private JButton dUmaLinguagemDeButton;
    private JPanel Tecnologia2;

    public Tec2() throws HeadlessException {
        setTitle("Pergunta 2");
        setSize(2000, 1000);
        setContentPane(Tecnologia2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        aUmSistemaOperacionalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bUmaLinguagemDeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cUmProtocoloDeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        dUmaLinguagemDeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tec3();

            }
        });
    }

    public static void main(String[] args) {
        Tec2 e = new Tec2();
    }
}
