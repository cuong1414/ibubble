package org.ibubble.service;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.ibubble.dao.DrinkingEntityDAO;
import org.ibubble.dao.GenericEntityDAOForSpring;
import org.ibubble.entity.DrinkingEntity;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: CuongNM
 * Date: 10/11/13
 * Time: 7:51 PM
 */
@Service
public class DrinkingService extends GenericService<DrinkingEntity, Integer> {

    public DrinkingService() {
        super(DrinkingEntity.class, null, null);
    }

    @Autowired
    protected DrinkingService(SessionFactory sessionFactory) {
        super(DrinkingEntity.class, null, null);
        this.logger = Logger.getLogger(this.getClass());
        this.setGenericDAO(new DrinkingEntityDAO(sessionFactory));
    }

    @Transactional
    public List<DrinkingEntity> getAllActive() {
        return ((DrinkingEntityDAO)this.getGenericDAO()).getAllActive();
    }

    @Transactional
    public List<DrinkingEntity> getActiveByCategoryID(int categoryId) {
        return ((DrinkingEntityDAO)this.getGenericDAO()).getAllActiveByCategoryID(categoryId);
    }
}
