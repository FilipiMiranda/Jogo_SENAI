package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Emp4 extends JFrame{
    private JPanel Empreendedorismo4;
    private JButton aUmaEmpresaQueButton;
    private JButton bUmaEmpresaQueButton;
    private JButton cUmaEmpresaQueButton;
    private JButton dUmaEmpresaQueButton;

    public Emp4() throws HeadlessException {
        setTitle("Pergunta4.4");
        setSize(2000, 1000);
        setContentPane(Empreendedorismo4);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        aUmaEmpresaQueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Emp5();

            }
        });
        bUmaEmpresaQueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        cUmaEmpresaQueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        dUmaEmpresaQueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
    }

    public static void main(String[] args) {
        Emp4 e = new Emp4();
    }
}
