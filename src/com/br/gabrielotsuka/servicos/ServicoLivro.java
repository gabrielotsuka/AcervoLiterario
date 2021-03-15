package com.br.gabrielotsuka.servicos;

import com.br.gabrielotsuka.dados.Livro;
import com.br.gabrielotsuka.repositorio.Listagem;

public class ServicoLivro {
    Listagem listagem;

    public ServicoLivro(Listagem listagem) {
        this.listagem = listagem;
    }

    public void adicionaLivro(String autor, String titulo, int ano) {
        Livro livro = new Livro(autor, titulo, ano);
        listagem.adicionaObraLiteraria(livro);
    }
}
