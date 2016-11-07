package wl.hdzj.entity;

import javax.persistence.*;

/**
 * Created by micro on 2016/11/7.
 */
@Entity
public class Relation {
    private int rid;
    private Member memberByMid;

    @Id
    @GeneratedValue
    @javax.persistence.Column(name = "rid", nullable = false)
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Relation relation = (Relation) o;

        if (rid != relation.rid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return rid;
    }

    @ManyToOne
    @JoinColumn(name = "mid", referencedColumnName = "mid", nullable = false)
    public Member getMemberByMid() {
        return memberByMid;
    }

    public void setMemberByMid(Member memberByMid) {
        this.memberByMid = memberByMid;
    }
}
