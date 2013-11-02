package org.ibubble.entity;

import javax.persistence.*;

/**
 * User: CuongNM
 * Date: 10/12/13
 * Time: 2:20 AM
 */
@NamedNativeQueries({
        @NamedNativeQuery(name = "DiscountEntity.getByCategoryID", query = "SELECT * FROM discount d WHERE d.CategoryID = :categoryId", resultClass = DiscountEntity.class)

})
@javax.persistence.Table(name = "discount", schema = "", catalog = "ibubble_drink")
@Entity
public class DiscountEntity {
    private boolean active;
    private Integer discountTypeId;
    private Integer categoryId;
    private Integer productId;
    private int id;

    @javax.persistence.Column(name = "Active", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    @Basic
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @javax.persistence.Column(name = "DiscountTypeID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getDiscountTypeId() {
        return discountTypeId;
    }

    public void setDiscountTypeId(Integer discountTypeId) {
        this.discountTypeId = discountTypeId;
    }

    @javax.persistence.Column(name = "CategoryID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @javax.persistence.Column(name = "ProductID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @javax.persistence.Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiscountEntity that = (DiscountEntity) o;

        if (active != that.active) return false;
        if (id != that.id) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (discountTypeId != null ? !discountTypeId.equals(that.discountTypeId) : that.discountTypeId != null)
            return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (active ? 1 : 0);
        result = 31 * result + (discountTypeId != null ? discountTypeId.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
