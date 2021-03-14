package com.br.gabrielotsuka;

import com.br.gabrielotsuka.interfaces.JanelaListagem;
import com.br.gabrielotsuka.interfaces.JanelaLivros;
import com.br.gabrielotsuka.interfaces.JanelaRevista;

public class Main {

    public static void main(String[] args) {

        new JanelaLivros();
        new JanelaRevista();
        new JanelaListagem();
    }
}
