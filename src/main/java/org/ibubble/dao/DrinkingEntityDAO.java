package org.ibubble.dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.ibubble.entity.CategoryEntity;
import org.ibubble.entity.DrinkingEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User: CuongNM
 * Date: 10/11/13
 * Time: 7:27 PM
 */
public class DrinkingEntityDAO extends GenericEntityDAOForSpring<DrinkingEntity, Integer> {

    public DrinkingEntityDAO(SessionFactory sessionFactory) {
        super(sessionFactory, DrinkingEntity.class);
    }

    public List<DrinkingEntity> getAllActive() {
        Session session = this.getSessionFactory().getCurrentSession();
        return session.getNamedQuery("DrinkingEntity.getAllActive").list();
    }

    public List<DrinkingEntity> getAllActiveByCategoryID(int categoryId) {
        Session session = this.getSessionFactory().getCurrentSession();
        return session.getNamedQuery("DrinkingEntity.getAllActiveByCategoryID").setParameter("categoryId",categoryId).list();
    }
}
