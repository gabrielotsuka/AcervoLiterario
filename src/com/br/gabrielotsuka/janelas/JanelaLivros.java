package com.br.gabrielotsuka.janelas;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaLivros extends JanelaInput {

    JLabel rotuloAutor = new JLabel();

    JTextField campoAutor = new JTextField();

    JButton botaoRevistas = new JButton("Revistas");

    public JanelaLivros() {
        botaoRevistas.addActionListener(this);
        montaCabecalho("Livros");
        montaAno();
        montaAutor();
        montaTitulo();
        montaBotoes(botaoRevistas);
        montaFrameInput();
    }

    private void montaAutor() {
        configuraRotulo(rotuloAutor, "Autor:", 20);
        rotuloAutor.setBounds(20,90, 65, 25);
        add(rotuloAutor);
        campoAutor.setBounds(90, 90, 380, 25);
        add(campoAutor);
    }

    private void montaAno() {
        configuraRotulo(rotuloAno, "Ano:", 20);
        rotuloAno.setBounds(20,130, 65, 25);
        add(rotuloAno);
        campoAno.setBounds(90, 130, 60, 25);
        add(campoAno);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Object source = e.getSource();
        if(source.equals(botaoRevistas)) {
            new JanelaRevista();
        } else if (source.equals(botaoListagem)) {
            new JanelaListagem();
        }
    }
}
