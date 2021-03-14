package com.br.gabrielotsuka.interfaces;

import javax.swing.*;
import java.awt.*;

public abstract class JanelaInput extends JFrame {

    protected Dimension dimension = new Dimension(480, 300);
    protected JLabel cabecalho = new JLabel();
    protected JPanel botoes = new JPanel();

    abstract void montaCabecalho();
    abstract void montaBotoes(String trocaTela);

    protected void botoesLayout() {
        botoes.setVisible(true);
        botoes.setBounds(10, 175, 460,80);
        botoes.setLayout(new GridLayout(1,3,10,10));
        JButton botaoIncluir = new JButton("Incluir");
        JButton botaoListagem = new JButton("Listagem");
        botoes.add(botaoIncluir);
        botoes.add(botaoListagem);
    }
}

