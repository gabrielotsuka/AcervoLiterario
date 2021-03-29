import janelas.JanelaLivros;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Acervo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        new JanelaLivros(entityManager);
    }
}
