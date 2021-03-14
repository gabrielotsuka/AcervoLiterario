package com.br.gabrielotsuka.interfaces;

import javax.swing.*;
import java.awt.*;

public class JanelaListagem extends JFrame {

    JLabel rotuloCabecalho = new JLabel("Listagem");


    public JanelaListagem() {
        String teste = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
                "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt " +
                "in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim " +
                "ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo" +
                " consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu " +
                "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia" +
                " deserunt mollit anim id est laborum.";
        montaCabecalho();
        montaAreaTexto(teste);
        montaFrameOutput();
    }

    private void montaAreaTexto(String texto) {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setText(texto);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setBorder(BorderFactory.createBevelBorder(1));
        areaTexto.setFont(new Font("", Font.PLAIN, 15));
        areaTexto.setEditable(false);

        montaPainelScroll(areaTexto);
    }

    private void montaPainelScroll(JTextArea areaTexto) {
        JScrollPane areaTextoScroll = new JScrollPane(areaTexto);
        areaTextoScroll.setBounds(20, 50, 540, 165);
        areaTextoScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
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
