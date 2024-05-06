package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.PersonEntity;

import java.util.List;

@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager em;

    public List<PersonEntity> getPersonsByCity(String city) {
        var query = em.createQuery("select p from PersonEntity p where p.cityOfLiving = :city", PersonEntity.class);
        query.setParameter("city", city);
        return query.getResultList();
    }
}
