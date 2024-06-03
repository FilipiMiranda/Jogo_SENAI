package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meio5 extends JFrame{
    private JPanel MeioAmbiente5;
    private JButton aAMedidaDoButton;
    private JButton bOEspaçoOcupadoButton;
    private JButton cAMedidaDoButton;

    public Meio5() throws HeadlessException {
        setTitle("Pergunta2.5");
        setSize(2000, 1000);
        setContentPane(MeioAmbiente5);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        aAMedidaDoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Resultado();

            }
        });
        bOEspaçoOcupadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cAMedidaDoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }
}
