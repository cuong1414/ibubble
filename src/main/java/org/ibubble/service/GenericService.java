package org.ibubble.service;

import org.apache.log4j.Logger;
import org.ibubble.dao.GenericEntityDAOForSpring;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * User: CuongNM
 * Date: 10/1/13
 * Time: 12:54 PM
 */

public abstract class GenericService<E, ID extends Serializable> {
    protected final Class<? extends E> clazz;
    private GenericEntityDAOForSpring<E, ID> genericDAO;
    protected Logger logger;

    protected GenericService(Class<? extends E> clazz, GenericEntityDAOForSpring genericDAO, Logger logger) {
        this.clazz = clazz;
        this.genericDAO = genericDAO;
        this.logger = logger;
    }

    protected GenericEntityDAOForSpring getGenericDAO() {
        return genericDAO;
    }

    protected void setGenericDAO(GenericEntityDAOForSpring genericDAO) {
        this.genericDAO = genericDAO;
    }

    @Transactional
    public E getByID(ID id) {
        this.logger.info("Getting" + clazz.getSimpleName() + " with id = " + id);
        return genericDAO.get(id);
    }

    @Transactional
    public List<E> getAll() {
        this.logger.info("Getting all " + this.clazz.getSimpleName());
        return this.genericDAO.getAll();
    }

    @Transactional
    public E insert(E entity) {
        this.logger.info("Adding new " + clazz.getSimpleName() + ".");
        return this.genericDAO.add(entity);
    }

    @Transactional
    public List<E> insert(List<E> entityList) {
        this.logger.info("Adding new " + clazz.getSimpleName() + ".");
        return this.genericDAO.add(entityList);
    }

    @Transactional
    public E update(E entity) {
        this.logger.info("Updating " + this.clazz.getSimpleName() + ".");
        return this.genericDAO.update(entity);
    }

    @Transactional
    public E delete(E entity) {
        this.logger.info("Deleting " + clazz.getSimpleName() + ".");
        return this.genericDAO.delete(entity);
    }
}
