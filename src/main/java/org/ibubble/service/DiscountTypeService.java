package org.ibubble.service;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.ibubble.dao.DiscountEntityDAO;
import org.ibubble.dao.DiscountTypeEntityDAO;
import org.ibubble.dao.GenericEntityDAOForSpring;
import org.ibubble.entity.DiscounttypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: CuongNM
 * Date: 10/11/13
 * Time: 7:50 PM
 */
@Service
public class DiscountTypeService extends GenericService<DiscounttypeEntity, Integer> {

    public DiscountTypeService() {
        super(DiscounttypeEntity.class, null, null);
    }

    @Autowired
    protected DiscountTypeService(SessionFactory sessionFactory) {
        super(DiscounttypeEntity.class, null, null);
        this.logger = Logger.getLogger(this.getClass());
        this.setGenericDAO(new DiscountTypeEntityDAO(sessionFactory));
    }
}
