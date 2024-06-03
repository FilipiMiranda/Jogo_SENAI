package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Emp5 extends JFrame {
    private JButton aEvitarQualquerTipoButton;
    private JButton bFocarExclusivamenteEmButton;
    private JButton cIgnorarAConcorrênciaButton;
    private JButton dRealizarUmaAnáliseButton;
    private JPanel Empreendedorismo5;

    public Emp5() throws HeadlessException {
        setTitle("Pergunta4.5");
        setSize(2000, 1000);
        setContentPane(Empreendedorismo5);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        aEvitarQualquerTipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();

            }
        });
        bFocarExclusivamenteEmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();
            }
        });
        cIgnorarAConcorrênciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perdeu();
            }
        });
        dRealizarUmaAnáliseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Resultado();

            }
        });
    }

    public static void main(String[] args) {
        Emp5 e = new Emp5();
    }
}
