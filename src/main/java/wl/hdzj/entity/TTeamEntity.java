package wl.hdzj.entity;

import javax.persistence.*;

/**
 * Created by micro on 2016/10/31.
 */
@Entity
@Table(name = "T_TEAM", schema = "hdzj_2016")
public class TTeamEntity {
    private int tId;
    private String tName;
    private String tDescribe;
    private String tPic;
    private int tDel;

    @Id
    @Column(name = "T_ID")
    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    @Basic
    @Column(name = "T_NAME")
    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Basic
    @Column(name = "T_DESCRIBE")
    public String gettDescribe() {
        return tDescribe;
    }

    public void settDescribe(String tDescribe) {
        this.tDescribe = tDescribe;
    }

    @Basic
    @Column(name = "T_PIC")
    public String gettPic() {
        return tPic;
    }

    public void settPic(String tPic) {
        this.tPic = tPic;
    }

    @Basic
    @Column(name = "T_DEL")
    public int gettDel() {
        return tDel;
    }

    public void settDel(int tDel) {
        this.tDel = tDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTeamEntity that = (TTeamEntity) o;

        if (tId != that.tId) return false;
        if (tDel != that.tDel) return false;
        if (tName != null ? !tName.equals(that.tName) : that.tName != null) return false;
        if (tDescribe != null ? !tDescribe.equals(that.tDescribe) : that.tDescribe != null) return false;
        if (tPic != null ? !tPic.equals(that.tPic) : that.tPic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tId;
        result = 31 * result + (tName != null ? tName.hashCode() : 0);
        result = 31 * result + (tDescribe != null ? tDescribe.hashCode() : 0);
        result = 31 * result + (tPic != null ? tPic.hashCode() : 0);
        result = 31 * result + tDel;
        return result;
    }
}
