package com.br.gabrielotsuka.janelas;

import com.br.gabrielotsuka.repositorio.Listagem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class JanelaInput extends JFrame implements ActionListener {

    protected JLabel rotuloCabecalho = new JLabel();
    protected JLabel rotuloTitulo = new JLabel();
    protected JLabel rotuloAno = new JLabel();

    protected JTextField campoTitulo = new JTextField();
    protected JTextField campoAno = new JTextField();

    protected JPanel painelBotoes = new JPanel();

    protected JButton botaoIncluir = new JButton("Incluir");
    protected JButton botaoListagem = new JButton("Listagem");

    protected Listagem listagem;

    public JanelaInput(Listagem listagem) {
        this.listagem = listagem;
    }

    protected void montaCabecalho(String texto) {
        configuraRotulo(rotuloCabecalho, texto, 25);
        rotuloCabecalho.setHorizontalAlignment(SwingConstants.CENTER);
        rotuloCabecalho.setBounds(0,15, 480, 25);
        add(rotuloCabecalho);
    }

    protected void montaTitulo() {
        configuraRotulo(rotuloTitulo, "Titulo:", 20);
        rotuloTitulo.setBounds(20,50, 65, 25);
        add(rotuloTitulo);
        campoTitulo.setBounds(90, 50, 380, 25);
        add(campoTitulo);
    }

    protected void configuraRotulo(JLabel label, String texto, Integer fontSize) {
        label.setText(texto);
        label.setFont(new Font("", Font.PLAIN, fontSize));
        label.setHorizontalAlignment(JLabel.LEFT);
    }

    protected void montaBotoes(JButton botaoTroca) {
        painelBotoes.setBounds(10, 175, 460,80);
        painelBotoes.setLayout(new GridLayout(1,3,10,10));
        painelBotoes.add(botaoIncluir);
        painelBotoes.add(botaoTroca);
        painelBotoes.add(botaoListagem);
        botaoListagem.addActionListener(this);
        botaoIncluir.addActionListener(this);
        botaoTroca.addActionListener(this);
        add(painelBotoes);
    }

    protected void montaFrameInput() {
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(480, 300));
    }

    protected void trocaParaJanelaListagem() {
        dispose();
        new JanelaListagem(listagem);
    }

    protected void validaParseInteiroCampoAno() throws Exception {
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

    protected void limpaCamposComuns() {
        campoAno.setText("");
        campoTitulo.setText("");
    }
}

