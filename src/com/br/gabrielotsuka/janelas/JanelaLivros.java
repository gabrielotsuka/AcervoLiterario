package com.br.gabrielotsuka.janelas;

import com.br.gabrielotsuka.repositorio.Listagem;
import com.br.gabrielotsuka.servicos.ServicoLivro;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaLivros extends JanelaInput {

    JLabel rotuloAutor = new JLabel();

    JTextField campoAutor = new JTextField();

    JButton botaoRevistas = new JButton("Revistas");

    ServicoLivro servicoLivro;

    public JanelaLivros(Listagem listagem) {
        super(listagem);
        servicoLivro = new ServicoLivro(listagem);
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
            try {
                validaParseInteiro();
                incluirLivroNoAcervo();
            } catch (Exception ignored) {}
        }
    }

    private void trocaParaJanelaRevistas() {
        dispose();
        new JanelaRevistas(listagem);
    }

    private void validaParseInteiro() throws Exception {
        try {
            Integer.parseInt(campoAno.getText());
        } catch (NumberFormatException erroParse) {
            JOptionPane.showMessageDialog(
                    this,
                    "Campo ano deve ser um número válido",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
    }

    private void incluirLivroNoAcervo() {
        int ano = Integer.parseInt(campoAno.getText());
        String autor = campoAutor.getText();
        String titulo = campoTitulo.getText();
        try {
            servicoLivro.adicionaLivro(autor, titulo, ano);
            JOptionPane.showMessageDialog(this, "Livro adicionado ao acervo.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
        } catch (Exception campoInvalido) {
            JOptionPane.showMessageDialog(this, campoInvalido.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpaCampos() {
        campoAutor.setText("");
        campoAno.setText("");
        campoTitulo.setText("");
    }
}
