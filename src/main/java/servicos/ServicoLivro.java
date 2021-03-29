package servicos;

import dados.Livro;
import validadores.ValidadorObraLiteraria;

public class ServicoLivro {

    public void adicionaLivro(String autor, String titulo, int ano) throws Exception {
        validaCamposLivro(autor, titulo, ano);
        Livro livro = new Livro(autor, titulo, ano);
//        listagem.adicionaObraLiteraria(livro);
    }

    private void validaCamposLivro(String autor, String titulo, int ano) throws Exception {
        ValidadorObraLiteraria.validaAno(ano);
        ValidadorObraLiteraria.validaStringVazia(autor, "Autor");
        ValidadorObraLiteraria.validaStringVazia(titulo, "Titulo");
    }
}
