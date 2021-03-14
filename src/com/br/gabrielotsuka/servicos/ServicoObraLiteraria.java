package com.br.gabrielotsuka.servicos;

import com.br.gabrielotsuka.dados.ObraLiteraria;
import com.br.gabrielotsuka.repositorio.Listagem;

public class ServicoObraLiteraria {
    Listagem listagem;

    public ServicoObraLiteraria(Listagem listagem) {
        this.listagem = listagem;
    }

    public void adicionaObraLiteraria(ObraLiteraria obraLiteraria) {
        listagem.adicionaObraLiteraria(obraLiteraria);
    }
}
