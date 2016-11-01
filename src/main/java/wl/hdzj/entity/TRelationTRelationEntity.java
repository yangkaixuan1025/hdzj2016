package wl.hdzj.entity;

import javax.persistence.*;

/**
 * Created by micro on 2016/10/31.
 */
@Entity
@Table(name = "T_RELATION\rT_RELATION", schema = "hdzj_2016")
public class TRelationTRelationEntity {
    private int rId;
    private int tId;
    private int mId;

    @Id
    @Column(name = "R_ID")
    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    @Basic
    @Column(name = "T_ID")
    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    @Basic
    @Column(name = "M_ID")
    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TRelationTRelationEntity that = (TRelationTRelationEntity) o;

        if (rId != that.rId) return false;
        if (tId != that.tId) return false;
        if (mId != that.mId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rId;
        result = 31 * result + tId;
        result = 31 * result + mId;
        return result;
    }
}
