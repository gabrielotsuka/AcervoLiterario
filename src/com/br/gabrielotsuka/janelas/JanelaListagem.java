package com.br.gabrielotsuka.janelas;

import javax.swing.*;
import java.awt.*;

public class JanelaListagem extends JFrame {

    JLabel rotuloCabecalho = new JLabel("Listagem");


    public JanelaListagem() {
        String teste = "Livro: As aventuras da abobrinha para testar o scrollPanel horizontal Autor Gabriel Otsuka Ano 2021\n" +
                "Revista: TituloA OrgA VolA NroA AnoA\n" +
                "Revista: TituloB OrgB VolB NroB AnoB\n" +
                "Revista: TituloC OrgC VolC NroC AnoC\n" +
                "Revista: TituloC OrgC VolC NroC AnoC\n" +
                "Revista: TituloC OrgC VolC NroC AnoC\n" +
                "Revista: TituloC OrgC VolC NroC AnoC\n" +
                "Revista: TituloC OrgC VolC NroC AnoC\n" +
                "Revista: TituloC OrgC VolC NroC AnoC\n" +
                "Revista: TituloC OrgC VolC NroC AnoC\n" +
                "Livro: TituloB AutorB Ano B";
        montaCabecalho();
        montaAreaTexto(teste);
        montaFrameOutput();
    }

    private void montaAreaTexto(String texto) {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setText(texto);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setBorder(BorderFactory.createBevelBorder(1));
        areaTexto.setFont(new Font("", Font.PLAIN, 18));
        areaTexto.setEditable(false);

        montaPainelScroll(areaTexto);
    }

    private void montaPainelScroll(JTextArea areaTexto) {
        JScrollPane areaTextoScroll = new JScrollPane(areaTexto);
        areaTextoScroll.setBounds(20, 50, 540, 165);
        add(areaTextoScroll);
    }

    private void montaCabecalho() {
        rotuloCabecalho.setFont(new Font("", Font.PLAIN, 25));
        rotuloCabecalho.setHorizontalAlignment(SwingConstants.CENTER);
        rotuloCabecalho.setBounds(0,15, 580, 30);
        add(rotuloCabecalho);
    }

    private void montaFrameOutput() {
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(580, 270));
    }
}
