package org.ibubble.dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.ibubble.entity.CategoryEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User: CuongNM
 * Date: 10/11/13
 * Time: 7:29 PM
 */
public class CategoryEntityDAO extends GenericEntityDAOForSpring<CategoryEntity, Integer> {

    public CategoryEntityDAO(SessionFactory sessionFactory) {
        super(sessionFactory, CategoryEntity.class);
    }

    public List<CategoryEntity> getAllActive() {
        Session session = this.getSessionFactory().getCurrentSession();
        return session.getNamedQuery("CategoryEntity.getAllActive").list();
    }

    public List<CategoryEntity> getByPathActive(String path) {
        Session session = this.getSessionFactory().getCurrentSession();
        return session.getNamedQuery("CategoryEntity.getByPathActive").setParameter("url",path).list();
    }
}
