package com.br.gabrielotsuka.interfaces;

import javax.swing.*;

public class JanelaLivros extends JanelaInput{

    JLabel rotuloAutor = new JLabel();

    JTextField campoAutor = new JTextField();

    JButton botaoRevistas = new JButton("Revistas");

    public JanelaLivros() {
        montaCabecalho("Livros");
        montaAno();
        montaAutor();
        montaTitulo();
        montaBotoes(botaoRevistas);
        montaFrame();
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

}
