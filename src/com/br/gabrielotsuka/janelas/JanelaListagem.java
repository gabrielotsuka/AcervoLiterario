package com.br.gabrielotsuka.janelas;

import com.br.gabrielotsuka.repositorio.Listagem;

import javax.swing.*;
import java.awt.*;

public class JanelaListagem extends JFrame {

    JLabel rotuloCabecalho = new JLabel("Listagem");

    public JanelaListagem(Listagem listagem) {
        montaCabecalho();
        JTextArea areaTexto = montaAreaTexto(listagem.getListagem());
        montaPainelScroll(areaTexto);
        montaFrameOutput();
    }

    private JTextArea montaAreaTexto(String texto) {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setText(texto);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setBorder(BorderFactory.createBevelBorder(1));
        areaTexto.setFont(new Font("", Font.PLAIN, 17));
        areaTexto.setEditable(false);
        areaTexto.setCaretPosition(0);

        return areaTexto;
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
