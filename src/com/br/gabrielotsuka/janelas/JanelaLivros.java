package com.br.gabrielotsuka.janelas;

import com.br.gabrielotsuka.dados.Livro;
import com.br.gabrielotsuka.repositorio.Listagem;
import com.br.gabrielotsuka.servicos.ServicoLivros;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaLivros extends JanelaInput {

    JLabel rotuloAutor = new JLabel();

    JTextField campoAutor = new JTextField();

    JButton botaoRevistas = new JButton("Revistas");

    Listagem listagem;
    ServicoLivros servicoLivros;

    public JanelaLivros(Listagem listagem) {
        this.listagem = listagem;
        servicoLivros = new ServicoLivros(listagem);
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
            dispose();
            new JanelaRevista(listagem);
        } else if (source.equals(botaoListagem)) {
            dispose();
            new JanelaListagem(listagem);
        } else if (source.equals(botaoIncluir)) {
            incluirLivro();
        }
    }

    private void incluirLivro() {
        Livro livro = new Livro(campoAutor.getText(), campoTitulo.getText(), campoAno.getText());
        servicoLivros.adicionaLivro(livro);
        campoAutor.setText("");
        campoAno.setText("");
        campoTitulo.setText("");
    }
}
