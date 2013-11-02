package org.ibubble.service;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.ibubble.dao.CategoryEntityDAO;
import org.ibubble.dao.GenericEntityDAOForSpring;
import org.ibubble.entity.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: CuongNM
 * Date: 10/11/13
 * Time: 7:32 PM
 */

@Service
public class CategoryService extends GenericService<CategoryEntity, Integer> {

    public CategoryService() {
        super(CategoryEntity.class, null, null);
    }

    @Autowired
    public CategoryService(SessionFactory sessionFactory) {
        super(CategoryEntity.class, null, null);
        this.logger = Logger.getLogger(this.getClass());
        this.setGenericDAO(new CategoryEntityDAO(sessionFactory));
    }

    @Transactional
    public List<CategoryEntity> getAllActive() {
        return ((CategoryEntityDAO)this.getGenericDAO()).getAllActive();
    }

    @Transactional
    public List<CategoryEntity> getByPathActive(String path) {
        return ((CategoryEntityDAO)this.getGenericDAO()).getByPathActive(path);
    }
}
