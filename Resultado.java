package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resultado extends JFrame {
    private JButton voltarButton;
    private JPanel Res;

    public Resultado() throws HeadlessException{
        setTitle("Resultado");
        setSize(2000, 1000);
        setContentPane(Res);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaInicial();
            }
        });
    }

    public static void main(String[] args) {
        Resultado e = new Resultado();
    }
}
