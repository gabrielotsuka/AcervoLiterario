package com.br.gabrielotsuka.janelas;

import com.br.gabrielotsuka.repositorio.Listagem;
import com.br.gabrielotsuka.servicos.ServicoRevista;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaRevistas extends JanelaInput {

    JLabel rotuloOrgao = new JLabel();
    JLabel rotuloVolume = new JLabel();
    JLabel rotuloNumero = new JLabel();

    JTextField campoOrgao = new JTextField();
    JTextField campoVolume = new JTextField();
    JTextField campoNumero = new JTextField();

    JButton botaoLivros = new JButton("Livros");

    ServicoRevista servicoRevista;

    public JanelaRevistas(Listagem listagem) {
        super(listagem);
        servicoRevista = new ServicoRevista(listagem);
        montaAno();
        montaBotoes(botaoLivros);
        montaCabecalho("Revistas");
        montaNumero();
        montaOrgao();
        montaTitulo();
        montaVolume();
        montaFrameInput();
    }

    private void montaAno() {
        configuraRotulo(rotuloAno, "Ano:", 20);
        rotuloAno.setBounds(325,130, 50, 25);
        add(rotuloAno);
        campoAno.setBounds(375, 130, 95, 25);
        add(campoAno);
    }

    private void montaNumero() {
        configuraRotulo(rotuloNumero, "Nro.:", 20);
        rotuloNumero.setBounds(170,130, 65, 25);
        add(rotuloNumero);
        campoNumero.setBounds(225, 130, 60, 25);
        add(campoNumero);
    }

    private void montaOrgao() {
        configuraRotulo(rotuloOrgao, "Org:", 20);
        rotuloOrgao.setBounds(20,90, 65, 25);
        add(rotuloOrgao);
        campoOrgao.setBounds(90, 90, 380, 25);
        add(campoOrgao);
    }

    private void montaVolume() {
        configuraRotulo(rotuloVolume, "Vol.:", 20);
        rotuloVolume.setBounds(20,130, 65, 25);
        add(rotuloVolume);
        campoVolume.setBounds(90, 130, 60, 25);
        add(campoVolume);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(botaoLivros))
            trocaParaJanelaLivros();
        else if (source.equals(botaoListagem))
            trocaParaJanelaListagem();
        else if (source.equals(botaoIncluir))
            incluirRevistaNoAcervo();
    }

    private void trocaParaJanelaLivros() {
        dispose();
        new JanelaLivros(listagem);
    }

    private void incluirRevistaNoAcervo() {
        servicoRevista.adicionaRevista(
                campoTitulo.getText(), campoAno.getText(), campoOrgao.getText(),
                campoVolume.getText(), campoNumero.getText());
        limpaCampos();
    }

    private void limpaCampos() {
        campoAno.setText("");
        campoTitulo.setText("");
        campoOrgao.setText("");
        campoVolume.setText("");
        campoNumero.setText("");
    }
}
