package Aula1.Jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jogo extends JFrame{
    private JButton tecnologiaButton;
    private JButton meioAmbienteButton;
    private JButton esportesButton;
    private JButton empreendedorismoButton;
    private JButton voltarButton;
    private JPanel Jogo;

    public Jogo() throws HeadlessException
    {
        setTitle("Menu");
        setSize(2000, 1000);
        setContentPane(Jogo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new TelaInicial();

            }
        });
        tecnologiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tec1();

            }
        });
        meioAmbienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Meio1();
            }
        });
        esportesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Esporte1();

            }
        });
        empreendedorismoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        Jogo q = new Jogo();
    }
}
