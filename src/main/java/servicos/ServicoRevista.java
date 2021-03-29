package servicos;

import dados.Revista;
import validadores.ValidadorObraLiteraria;

public class ServicoRevista {

    public void adicionaRevista(String titulo, int ano, String orgao, int volume, int numero) throws Exception {
        validaCamposRevista(titulo, ano, orgao, volume, numero);
        Revista revista = new Revista(titulo, ano, orgao, volume, numero);
//        listagem.adicionaObraLiteraria(revista);
    }

    private void validaCamposRevista(String titulo, int ano, String orgao, int volume, int numero) throws Exception {
        ValidadorObraLiteraria.validaNegativo(volume, "Volume");
        ValidadorObraLiteraria.validaNegativo(numero, "Número");
        ValidadorObraLiteraria.validaAno(ano);
        ValidadorObraLiteraria.validaStringVazia(titulo, "Titulo");
        ValidadorObraLiteraria.validaStringVazia(orgao, "Orgão");
    }
}
