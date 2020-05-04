package javapa.lab11;

import entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import util.PersistenceUtil;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

    public static void create(Player e){
        EntityManager em = PersistenceUtil.createEntityManagerFactory("Lab11").createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
    }

    public static List<Player> getAll(){
        EntityManager em = PersistenceUtil.createEntityManagerFactory("Lab11").createEntityManager();
        em.getTransaction().begin();
        List lst = PersistenceUtil.createEntityManagerFactory("Lab11").createEntityManager().createQuery("Select a from Player a", Player.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return lst;
    }
}