package org.ibubble.util;

import org.ibubble.dto.DiscountDto;
import org.ibubble.entity.DiscountEntity;

/**
 * User: CuongNM
 * Date: 10/12/13
 * Time: 4:42 AM
 */
public class DtoMapper {
    public static DiscountDto toDto(DiscountEntity discountEntity, String description) {
        DiscountDto discountDto = new DiscountDto(discountEntity.isActive(), discountEntity.getDiscountTypeId(), discountEntity.getCategoryId()
        , discountEntity.getProductId(), discountEntity.getId(), description);
        return discountDto;
    }
}
