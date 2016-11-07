package wl.hdzj.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by micro on 2016/11/7.
 */
@Entity
public class Column {
    private int cid;
    private String name;
    private int parterid;

    @Id
    @GeneratedValue
    @javax.persistence.Column(name = "cid", nullable = false)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @javax.persistence.Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @javax.persistence.Column(name = "parterid", nullable = false)
    public int getParterid() {
        return parterid;
    }

    public void setParterid(int parterid) {
        this.parterid = parterid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Column column = (Column) o;

        if (cid != column.cid) return false;
        if (parterid != column.parterid) return false;
        if (name != null ? !name.equals(column.name) : column.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + parterid;
        return result;
    }
}
