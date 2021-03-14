package com.br.gabrielotsuka.interfaces;

import javax.swing.*;

public class JanelaLivros extends JanelaInput{

    JButton botaoRevistas = new JButton("Revistas");

    public JanelaLivros() {
        montaCabecalho("Livros");
        montaTitulo();
        montaBotoes(botaoRevistas);
        montaFrame();
    }

}
