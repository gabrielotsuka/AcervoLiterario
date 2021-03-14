package com.br.gabrielotsuka.janelas;

import com.br.gabrielotsuka.dados.Livro;
import com.br.gabrielotsuka.repositorio.Listagem;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaLivros extends JanelaInput {

    JLabel rotuloAutor = new JLabel();

    JTextField campoAutor = new JTextField();

    JButton botaoRevistas = new JButton("Revistas");

    public JanelaLivros(Listagem listagem) {
        super(listagem);
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
        Object source = e.getSource();
        if(source.equals(botaoRevistas)) {
            trocaParaJanelaRevistas();
        } else if (source.equals(botaoListagem)) {
            trocaParaJanelaListagem();
        } else if (source.equals(botaoIncluir)) {
            incluirLivroNoAcervo();
        }
    }

    private void trocaParaJanelaRevistas() {
        dispose();
        new JanelaRevistas(listagem);
    }

    private void incluirLivroNoAcervo() {
        Livro livro = new Livro(
                campoAutor.getText(), campoTitulo.getText(), campoAno.getText());
        incluirObraNoAcervo(livro);
        limpaCampos();
    }

    private void limpaCampos() {
        campoAutor.setText("");
        campoAno.setText("");
        campoTitulo.setText("");
    }
}
