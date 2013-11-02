package org.ibubble.dao;

import org.hibernate.SessionFactory;
import org.ibubble.entity.DiscounttypeEntity;
import org.springframework.stereotype.Component;

/**
 * User: CuongNM
 * Date: 10/11/13
 * Time: 7:30 PM
 */
public class DiscountTypeEntityDAO extends GenericEntityDAOForSpring<DiscounttypeEntity, Integer> {

    public DiscountTypeEntityDAO(SessionFactory sessionFactory) {
        super(sessionFactory, DiscounttypeEntity.class);
    }
}
