package com.br.gabrielotsuka.interfaces;

import javax.swing.*;
import java.awt.*;

public class JanelaRevista extends JanelaInput{

    public JanelaRevista() {
        montaCabecalho();
        montaBotoes("Livros");
        montaFrame();
    }

    protected void montaBotoes(String trocaTela) {
        botoesLayout();
        JButton botaoLivros = new JButton(trocaTela);
        botoes.add(botaoLivros);
    }

    protected void montaCabecalho() {
        cabecalho.setText("Revistas");
        cabecalho.setFont(new Font("", Font.PLAIN, 20));
        cabecalho.setBounds(0,0, 480, 20);
        cabecalho.setHorizontalAlignment(JLabel.CENTER);
    }

    private void montaFrame() {
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(this.dimension);
        add(cabecalho);
        add(botoes);
    }


}
