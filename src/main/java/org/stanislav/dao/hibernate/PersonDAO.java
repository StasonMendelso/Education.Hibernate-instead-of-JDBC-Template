package org.stanislav.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import org.stanislav.models.Person;

import java.util.List;

/**
 * @author Stanislav Hlova
 */
public class PersonDAO implements org.stanislav.dao.PersonDAO {
    private final SessionFactory sessionFactory;

    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Person> index() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("SELECT p FROM Person p",Person.class).getResultList();
    }

    @Override
    public Person show(int id) {
        return null;
    }

    @Override
    public void save(Person person) {

    }

    @Override
    public void update(int id, Person updatedPerson) {

    }

    @Override
    public void delete(int id) {

    }
}
