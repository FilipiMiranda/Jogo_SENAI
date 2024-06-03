package Aula1.Jogo;

import Aula1.MegaSena.MegaSenaLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame{
    private JButton iniciarButton;
    private JButton regrasButton;
    private JPanel TelaInicial;

    public TelaInicial () throws HeadlessException{
        setTitle("Jogo");
        setSize(2000, 1000);
        setContentPane(TelaInicial);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Jogo();


            }
        });
        regrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaRegras();

            }
        });
    }

    public static void main(String[] args) {
        TelaInicial w = new TelaInicial();
    }
}
