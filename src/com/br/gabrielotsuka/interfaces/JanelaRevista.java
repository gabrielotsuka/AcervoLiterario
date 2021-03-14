package com.br.gabrielotsuka.interfaces;

import javax.swing.*;
import java.awt.*;

public class JanelaRevista extends JanelaInput{

    JLabel rotuloOrgao = new JLabel();
    JLabel rotuloVolume = new JLabel();
    JLabel rotuloNumero = new JLabel();

    JTextField campoOrgao = new JTextField();
    JTextField campoVolume = new JTextField();
    JTextField campoNumero = new JTextField();

    JButton botaoLivros = new JButton("Livros");

    public JanelaRevista() {
        montaAno();
        montaBotoes(botaoLivros);
        montaCabecalho();
        montaNumero();
        montaOrgao();
        montaTitulo();
        montaVolume();

        montaFrame();
    }

    private void montaAno() {
        configuraRotulo(rotuloAno, "Ano:", 20);
        rotuloAno.setBounds(325,130, 50, 25);
        add(rotuloAno);
        campoAno.setBounds(375, 130, 95, 25);
        add(campoAno);
    }

    private void montaCabecalho() {
        configuraRotulo(rotuloCabecalho, "Revistas", 25);
        rotuloCabecalho.setHorizontalAlignment(SwingConstants.CENTER);
        rotuloCabecalho.setBounds(0,0, 480, 25);
        add(rotuloCabecalho);
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

    private void montaTitulo() {
        configuraRotulo(rotuloTitulo, "Titulo:", 20);
        rotuloTitulo.setBounds(20,50, 65, 25);
        add(rotuloTitulo);
        campoTitulo.setBounds(90, 50, 380, 25);
        add(campoTitulo);
    }

    private void montaVolume() {
        configuraRotulo(rotuloVolume, "Vol.:", 20);
        rotuloVolume.setBounds(20,130, 65, 25);
        add(rotuloVolume);
        campoVolume.setBounds(90, 130, 60, 25);
        add(campoVolume);
    }

    private void montaFrame() {
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(480, 300));
    }
}
