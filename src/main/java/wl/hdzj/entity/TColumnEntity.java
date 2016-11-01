package wl.hdzj.entity;

import javax.persistence.*;

/**
 * Created by micro on 2016/10/31.
 */
@Entity
@Table(name = "T_COLUMN", schema = "hdzj_2016")
public class TColumnEntity {
    private int cId;
    private String cName;
    private int cParterId;

    @Id
    @Column(name = "C_ID", nullable = false, unique = true)
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "C_NAME")
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Basic
    @Column(name = "C_PARTER_ID")
    public int getcParterId() {
        return cParterId;
    }

    public void setcParterId(int cParterId) {
        this.cParterId = cParterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TColumnEntity that = (TColumnEntity) o;

        if (cId != that.cId) return false;
        if (cParterId != that.cParterId) return false;
        if (cName != null ? !cName.equals(that.cName) : that.cName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cId;
        result = 31 * result + (cName != null ? cName.hashCode() : 0);
        result = 31 * result + cParterId;
        return result;
    }
}
