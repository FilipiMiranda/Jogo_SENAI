package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Emp1 extends JFrame {
    private JPanel Empreendedorismo1;
    private JButton aRelutânciaEmCorrerButton;
    private JButton bCapacidadeDeInovaçãoButton;
    private JButton cPreferênciaPorSegurançaButton;
    private JButton dFaltaDeAmbiçãoButton;

    public Emp1() throws HeadlessException {
        setTitle("Pergunta4.1");
        setSize(2000, 1000);
        setContentPane(Empreendedorismo1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        aRelutânciaEmCorrerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bCapacidadeDeInovaçãoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Emp2();

            }
        });
        cPreferênciaPorSegurançaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        dFaltaDeAmbiçãoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {

        Emp1 e = new Emp1();
    }
}



