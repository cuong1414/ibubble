package org.ibubble.entity;

import javax.persistence.*;

/**
 * User: CuongNM
 * Date: 10/12/13
 * Time: 2:20 AM
 */
@NamedNativeQueries({
        @NamedNativeQuery(name = "CategoryEntity.getAllActive", query = "SELECT * FROM category c WHERE c.active = true", resultClass = CategoryEntity.class),
        @NamedNativeQuery(name = "CategoryEntity.getByPathActive", query = "SELECT * FROM category c WHERE c.active = true AND c.url = :url", resultClass = CategoryEntity.class)
})
@Table(name = "category", schema = "", catalog = "ibubble_drink")
@Entity
public class CategoryEntity {
    private boolean active;
    private Integer order;
    private String url;
    private String title;
    private int id;

    @Column(name = "Active", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    @Basic
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Column(name = "Order", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Column(name = "Url", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "Title", nullable = false, insertable = true, updatable = true, length = 255, precision = 0)
    @Basic
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
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

        CategoryEntity that = (CategoryEntity) o;

        if (active != that.active) return false;
        if (id != that.id) return false;
        if (order != null ? !order.equals(that.order) : that.order != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (active ? 1 : 0);
        result = 31 * result + (order != null ? order.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
