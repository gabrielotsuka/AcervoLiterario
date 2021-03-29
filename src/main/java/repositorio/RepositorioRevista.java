package repositorio;

import dados.Revista;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class RepositorioRevista {

    private EntityManager entityManager;

    public RepositorioRevista(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Optional<Revista> save(Revista revista) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(revista);
            entityManager.getTransaction().commit();
            return Optional.of(revista);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public List<Revista> findAll() {
        return entityManager.createQuery("from Revista").getResultList();
    }

}
