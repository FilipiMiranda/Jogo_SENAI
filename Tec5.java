package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tec5 extends JFrame {
    private JButton bUmProtocoloDeButton;
    private JButton dUmSoftwareParaButton;
    private JButton aAQuintaGeraçãoButton;
    private JButton cUmTipoDeButton;
    private JPanel Tecnologia5;

    public Tec5() throws HeadlessException {
        setTitle("Pergunta 5");
        setSize(2000, 1000);
        setContentPane(Tecnologia5);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        aAQuintaGeraçãoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Resultado();

            }
        });
        bUmProtocoloDeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cUmTipoDeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        dUmSoftwareParaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Tec5 e = new Tec5();
    }
}
