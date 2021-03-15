package com.br.gabrielotsuka.servicos;

import com.br.gabrielotsuka.dados.Revista;
import com.br.gabrielotsuka.repositorio.Listagem;
import com.br.gabrielotsuka.validador.ValidadorObraLiteraria;

public class ServicoRevista {
    Listagem listagem;

    public ServicoRevista(Listagem listagem) {
        this.listagem = listagem;
    }

    public void adicionaRevista(String titulo, int ano, String orgao, int volume, int numero) throws Exception {
        validaCamposRevista(titulo, ano, orgao, volume, numero);
        Revista revista = new Revista(titulo, ano, orgao, volume, numero);
        listagem.adicionaObraLiteraria(revista);
    }

    private void validaCamposRevista(String titulo, int ano, String orgao, int volume, int numero) throws Exception {
        ValidadorObraLiteraria.validaStringVazia(titulo, "Titulo");
        ValidadorObraLiteraria.validaStringVazia(orgao, "Orgão");
        ValidadorObraLiteraria.validaAno(ano);
        ValidadorObraLiteraria.validaNegativo(volume, "Volume");
        ValidadorObraLiteraria.validaNegativo(numero, "Número");
    }
}
