package ru.netology.hibernatehw.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatehw.entity.Person;

@Repository
public class RepositoryForData {
    @PersistenceContext
    private EntityManager entityManager;

    public RepositoryForData() {
    }

    public Object getPersonsByCity(String city) {
        String sql = "select * from person where city = '" + city + "'";
        var query = entityManager.createNativeQuery(sql, Person.class);
        return query.getResultList();
    }
}
