package org.ibubble.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * User: CuongNM
 * Date: 10/1/13
 * Time: 1:33 PM
 */
public abstract class GenericEntityDAOForSpring<E, ID extends Serializable> {
    private final Class<? extends E> clazz;
    private SessionFactory sessionFactory;

    public GenericEntityDAOForSpring(SessionFactory sessionFactory, Class<? extends E> clazz) {
        this.sessionFactory = sessionFactory;
        this.clazz = clazz;
    }

    protected SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public List<E> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<E> result = session.createCriteria(clazz).list();
        return result;
    }

    public E get(ID id) {
        Session session = this.sessionFactory.getCurrentSession();
        E result = (E) session.get(clazz, id);
        return result;
    }

    public E add(E object) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(object);
        return object;
    }

    public List<E> add(List<E> listObject) {
        Session session = this.sessionFactory.getCurrentSession();
        for (E object : listObject) {
            session.save(object);
        }
        return listObject;
    }

    public E update(E object) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(object);
        return object;
    }

    public E delete(E object) {
        Session session = this.sessionFactory.getCurrentSession();
        session.delete(object);
        return object;
    }
}
