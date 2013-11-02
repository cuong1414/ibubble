package org.ibubble.entity;

import javax.persistence.*;

/**
 * User: CuongNM
 * Date: 10/12/13
 * Time: 2:20 AM
 */
@NamedNativeQueries({
        @NamedNativeQuery(name = "DrinkingEntity.getAllActive", query = "SELECT * FROM drinking d WHERE d.active = true", resultClass = DrinkingEntity.class),
        @NamedNativeQuery(name = "DrinkingEntity.getAllActiveByCategoryID", query = "SELECT * FROM drinking d WHERE d.active = true AND d.categoryId = :categoryId", resultClass = DrinkingEntity.class)
})
@javax.persistence.Table(name = "drinking", schema = "", catalog = "ibubble_drink")
@Entity
public class DrinkingEntity {
    private boolean active;
    private Integer categoryId;
    private String imageUrl;
    private float sellingPrice;
    private String description;
    private String title;
    private int id;

    @javax.persistence.Column(name = "Active", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    @Basic
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @javax.persistence.Column(name = "CategoryId", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @javax.persistence.Column(name = "ImageUrl", nullable = true, insertable = true, updatable = true, length = 65535, precision = 0)
    @Basic
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @javax.persistence.Column(name = "SellingPrice", nullable = false, insertable = true, updatable = true, length = 12, precision = 0)
    @Basic
    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @javax.persistence.Column(name = "Description", nullable = false, insertable = true, updatable = true, length = 65535, precision = 0)
    @Basic
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @javax.persistence.Column(name = "Title", nullable = false, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

        DrinkingEntity that = (DrinkingEntity) o;

        if (active != that.active) return false;
        if (id != that.id) return false;
        if (Float.compare(that.sellingPrice, sellingPrice) != 0) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (active ? 1 : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (sellingPrice != +0.0f ? Float.floatToIntBits(sellingPrice) : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
