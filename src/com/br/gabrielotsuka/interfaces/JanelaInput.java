package com.br.gabrielotsuka.interfaces;

import javax.swing.*;
import java.awt.*;

public abstract class JanelaInput extends JFrame {

    protected JLabel rotuloCabecalho = new JLabel();
    protected JLabel rotuloTitulo = new JLabel();
    protected JLabel rotuloAno = new JLabel();

    protected JTextField campoTitulo = new JTextField();
    protected JTextField campoAno = new JTextField();

    protected JPanel painelBotoes = new JPanel();

    protected JButton botaoIncluir = new JButton("Incluir");
    protected JButton botaoListagem = new JButton("Listagem");

    protected void configuraRotulo(JLabel label, String texto, Integer fontSize) {
        label.setText(texto);
        label.setFont(new Font("", Font.PLAIN, fontSize));
        label.setHorizontalAlignment(JLabel.LEFT);
    }

    protected void montaBotoes(JButton botaoTroca) {
        painelBotoes.setVisible(true);
        painelBotoes.setBounds(10, 175, 460,80);
        painelBotoes.setLayout(new GridLayout(1,3,10,10));
        painelBotoes.add(botaoIncluir);
        painelBotoes.add(botaoTroca);
        painelBotoes.add(botaoListagem);
        add(painelBotoes);
    }

    protected void montaCabecalho(String texto) {
        configuraRotulo(rotuloCabecalho, texto, 25);
        rotuloCabecalho.setHorizontalAlignment(SwingConstants.CENTER);
        rotuloCabecalho.setBounds(0,15, 480, 25);
        add(rotuloCabecalho);
    }

    protected void montaFrame() {
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(480, 300));
    }

    protected void montaTitulo() {
        configuraRotulo(rotuloTitulo, "Titulo:", 20);
        rotuloTitulo.setBounds(20,50, 65, 25);
        add(rotuloTitulo);
        campoTitulo.setBounds(90, 50, 380, 25);
        add(campoTitulo);
    }
}

