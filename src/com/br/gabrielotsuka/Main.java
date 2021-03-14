package com.br.gabrielotsuka;

import com.br.gabrielotsuka.janelas.JanelaLivros;
import com.br.gabrielotsuka.repositorio.Listagem;

public class Main {

    public static void main(String[] args) {
        Listagem listagem = new Listagem();
        new JanelaLivros(listagem);
    }
}
