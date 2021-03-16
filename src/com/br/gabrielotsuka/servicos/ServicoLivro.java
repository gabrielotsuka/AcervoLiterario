package com.br.gabrielotsuka.servicos;

import com.br.gabrielotsuka.dados.Livro;
import com.br.gabrielotsuka.repositorios.Listagem;
import com.br.gabrielotsuka.validadores.ValidadorObraLiteraria;

public class ServicoLivro {
    Listagem listagem;

    public ServicoLivro(Listagem listagem) {
        this.listagem = listagem;
    }

    public void adicionaLivro(String autor, String titulo, int ano) throws Exception {
        validaCamposLivro(autor, titulo, ano);
        Livro livro = new Livro(autor, titulo, ano);
        listagem.adicionaObraLiteraria(livro);
    }

    private void validaCamposLivro(String autor, String titulo, int ano) throws Exception {
        ValidadorObraLiteraria.validaAno(ano);
        ValidadorObraLiteraria.validaStringVazia(autor, "Autor");
        ValidadorObraLiteraria.validaStringVazia(titulo, "Titulo");
    }
}
