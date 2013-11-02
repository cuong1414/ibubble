package org.ibubble.service;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.ibubble.dao.DiscountEntityDAO;
import org.ibubble.dao.DiscountTypeEntityDAO;
import org.ibubble.dao.GenericEntityDAOForSpring;
import org.ibubble.dto.DiscountDto;
import org.ibubble.entity.DiscountEntity;
import org.ibubble.entity.DiscounttypeEntity;
import org.ibubble.util.DtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * User: CuongNM
 * Date: 10/11/13
 * Time: 7:34 PM
 */
@Service
public class DiscountService extends GenericService<DiscountEntity, Integer> {
    @Autowired
    private DiscountTypeService discountTypeService;

    public DiscountService() {
        super(DiscountEntity.class, null, null);
    }

    @Autowired
    protected DiscountService(SessionFactory sessionFactory) {
        super(DiscountEntity.class, new DiscountEntityDAO(sessionFactory), Logger.getLogger(DiscountService.class));
    }

    @Transactional
    public List<DiscountEntity> getByCategoryID(int categoryId) {
        return ((DiscountEntityDAO)this.getGenericDAO()).getByCategoryID(categoryId);
    }

    @Transactional
    public List<DiscountDto> parseToDto(List<DiscountEntity> discountEntityList) {
        List<DiscountDto> discountDtoList = new ArrayList<DiscountDto>();
        DiscounttypeEntity discounttypeEntity = null;
        for (DiscountEntity discountEntity : discountEntityList) {
            if (discountEntity.getDiscountTypeId() != null) {
                discounttypeEntity = this.discountTypeService.getByID(discountEntity.getDiscountTypeId());
                if (discounttypeEntity != null) {
                    discountDtoList.add(DtoMapper.toDto(discountEntity, discounttypeEntity.getDescription()));
                }
            }
        }
        return discountDtoList;
    }
}
