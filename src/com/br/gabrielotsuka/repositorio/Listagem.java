package com.br.gabrielotsuka.repositorio;

import com.br.gabrielotsuka.dados.ObraLiteraria;

import java.util.ArrayList;
import java.util.List;

public class Listagem {

    List<ObraLiteraria> acervo = new ArrayList<>();

    public void adicionaObraLiteraria(ObraLiteraria obraLiteraria) {
        acervo.add(obraLiteraria);
    }

    public String getListagem() {
        StringBuilder response = new StringBuilder();
        for (ObraLiteraria obraLiteraria : this.acervo) {
            response.append(obraLiteraria.toString());
        }
        return response.toString();
    }
}
