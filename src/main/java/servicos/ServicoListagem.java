package servicos;

import dados.Livro;
import dados.Revista;
import repositorio.RepositorioLivro;
import repositorio.RepositorioRevista;

import javax.persistence.EntityManager;
import java.util.List;

public class ServicoListagem {
    private RepositorioLivro repositorioLivro;
    private RepositorioRevista repositorioRevista;

    public ServicoListagem(EntityManager entityManager) {
        this.repositorioLivro = new RepositorioLivro(entityManager);
        this.repositorioRevista = new RepositorioRevista(entityManager);
    }

    public String getLivrosEmString() {
        List<Livro> livros = repositorioLivro.findAll();
        StringBuilder result = new StringBuilder();
        for (Livro livro : livros) {
            result.append(livro.toString());
        }
        return result.toString();
    }

    public String getRevistasEmString() {
        List<Revista> revistas = repositorioRevista.findAll();
        StringBuilder result = new StringBuilder();
        for (Revista revista : revistas) {
            result.append(revista.toString());
        }
        return result.toString();
    }
}
