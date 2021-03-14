package com.br.gabrielotsuka.servicos;

import com.br.gabrielotsuka.dados.Livro;
import com.br.gabrielotsuka.repositorio.Listagem;

public class ServicoLivros {

    Listagem listagem;

    public ServicoLivros(Listagem listagem) {
        this.listagem = listagem;
    }

    public void adicionaLivro(Livro livro) {
        listagem.adicionaObraLiteraria(livro);
    }
}
