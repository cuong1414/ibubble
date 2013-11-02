package org.ibubble.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * User: CuongNM
 * Date: 10/12/13
 * Time: 2:20 AM
 */
@javax.persistence.Table(name = "discounttype", schema = "", catalog = "ibubble_drink")
@Entity
public class DiscounttypeEntity {
    private String description;
    private int id;

    @javax.persistence.Column(name = "Description", nullable = false, insertable = true, updatable = true, length = 65535, precision = 0)
    @Basic
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

        DiscounttypeEntity that = (DiscounttypeEntity) o;

        if (id != that.id) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}
