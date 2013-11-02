package org.ibubble.dto;

import java.io.Serializable;

/**
 * User: CuongNM
 * Date: 10/12/13
 * Time: 4:31 AM
 */
public class DiscountDto implements Serializable{
    private boolean active;
    private Integer discountTypeId;
    private Integer categoryId;
    private Integer productId;
    private int id;
    private String discountTypeDescription;

    public DiscountDto() {
    }

    public DiscountDto(boolean active, Integer discountTypeId, Integer categoryId, Integer productId, int id, String discountTypeDescription) {
        this.active = active;
        this.discountTypeId = discountTypeId;
        this.categoryId = categoryId;
        this.productId = productId;
        this.id = id;
        this.discountTypeDescription = discountTypeDescription;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Integer getDiscountTypeId() {
        return discountTypeId;
    }

    public void setDiscountTypeId(Integer discountTypeId) {
        this.discountTypeId = discountTypeId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscountTypeDescription() {
        return discountTypeDescription;
    }

    public void setDiscountTypeDescription(String discountTypeDescription) {
        this.discountTypeDescription = discountTypeDescription;
    }
}
