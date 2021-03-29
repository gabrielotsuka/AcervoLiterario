package servicos;

import dados.Livro;
import repositorio.RepositorioLivro;
import validadores.ValidadorObraLiteraria;

import javax.persistence.EntityManager;

public class ServicoLivro {

    RepositorioLivro repositorioLivro;

    public ServicoLivro(EntityManager entityManager) {
        repositorioLivro = new RepositorioLivro(entityManager);
    }

    public void adicionaLivro(String autor, String titulo, int ano) throws Exception {
        validaCamposLivro(autor, titulo, ano);
        Livro livro = new Livro(autor, titulo, ano);
        repositorioLivro.save(livro);
    }

    private void validaCamposLivro(String autor, String titulo, int ano) throws Exception {
        ValidadorObraLiteraria.validaAno(ano);
        ValidadorObraLiteraria.validaStringVazia(autor, "Autor");
        ValidadorObraLiteraria.validaStringVazia(titulo, "Titulo");
    }
}
