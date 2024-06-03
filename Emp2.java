package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Emp2 extends JFrame{
    private JButton aMáquinasEEquipamentosButton;
    private JButton bOConhecimentoEButton;
    private JButton cOCapitalFinanceiroButton;
    private JButton dOsProdutosEButton;
    private JPanel Empreendedorismo2;

    public Emp2() throws HeadlessException {
        setTitle("Pergunta4.2");
        setSize(2000, 1000);
        setContentPane(Empreendedorismo2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        aMáquinasEEquipamentosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bOConhecimentoEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Emp3();

            }
        });
        cOCapitalFinanceiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        dOsProdutosEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Emp2 e = new Emp2();
    }
}
