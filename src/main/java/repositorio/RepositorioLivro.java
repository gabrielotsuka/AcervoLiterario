package repositorio;

import dados.Livro;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class RepositorioLivro {
    private EntityManager entityManager;

    public RepositorioLivro(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Optional<Livro> save(Livro livro) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(livro);
            entityManager.getTransaction().commit();
            return Optional.of(livro);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public List<Livro> findAll() {
        return entityManager.createQuery("from Livro").getResultList();
    }
}
