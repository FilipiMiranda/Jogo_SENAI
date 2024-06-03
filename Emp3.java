package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Emp3 extends JFrame{
    private JButton aInvestirDinheiroNoButton;
    private JButton bVenderOsProdutosButton;
    private JButton cOferecerOrientaçãoEButton;
    private JButton dGerenciarAsOperaçõesButton;
    private JPanel Empreendedorismo3;

    public Emp3() throws HeadlessException {
        setTitle("Pergunta4.3");
        setSize(2000, 1000);
        setContentPane(Empreendedorismo3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        aInvestirDinheiroNoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bVenderOsProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cOferecerOrientaçãoEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Emp4();

            }
        });
        dGerenciarAsOperaçõesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Emp3 e = new Emp3();
    }
}
