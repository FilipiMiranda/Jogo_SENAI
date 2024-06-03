package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tec3 extends JFrame {
    private JPanel Tecnologia3;
    private JButton aUmRegistroDigitalButton;
    private JButton cUmaFormaDeButton;
    private JButton bUmaTécnicaParaButton;
    private JButton dUmMétodoDeButton;

    public Tec3() throws HeadlessException {
        setTitle("Pergunta 3");
        setSize(2000, 1000);
        setContentPane(Tecnologia3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        aUmRegistroDigitalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tec4();

            }
        });
        bUmaTécnicaParaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cUmaFormaDeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        dUmMétodoDeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Tec3 e = new Tec3();
    }
}
