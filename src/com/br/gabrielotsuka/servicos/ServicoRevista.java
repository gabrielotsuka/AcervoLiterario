package com.br.gabrielotsuka.servicos;

import com.br.gabrielotsuka.dados.Revista;
import com.br.gabrielotsuka.repositorio.Listagem;

public class ServicoRevista {
    Listagem listagem;

    public ServicoRevista(Listagem listagem) {
        this.listagem = listagem;
    }

    public void adicionaRevista(String titulo, String ano, String orgao, String volume, String numero) {
        Revista revista = new Revista(titulo, ano, orgao, volume, numero);
        listagem.adicionaObraLiteraria(revista);
    }
}
