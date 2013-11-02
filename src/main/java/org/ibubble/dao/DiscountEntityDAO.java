package org.ibubble.dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.ibubble.entity.DiscountEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User: CuongNM
 * Date: 10/11/13
 * Time: 7:28 PM
 */
public class DiscountEntityDAO extends GenericEntityDAOForSpring<DiscountEntity, Integer> {

    public DiscountEntityDAO(SessionFactory sessionFactory) {
        super(sessionFactory ,DiscountEntity.class);
    }

    public List<DiscountEntity> getByCategoryID(int categoryId) {
        Session session = this.getSessionFactory().getCurrentSession();
        return session.getNamedQuery("DiscountEntity.getByCategoryID").setParameter("categoryId", categoryId).list();
    }
}
