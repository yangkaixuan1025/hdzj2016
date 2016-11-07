package wl.hdzj.entity;

import javax.persistence.*;
import javax.persistence.Column;

/**
 * Created by micro on 2016/11/7.
 */
@Entity
public class Team {
    private int tid;
    private int del;
    private String desride;
    private String name;
    private String pic;

    @Id
    @GeneratedValue
    @javax.persistence.Column(name = "tid", nullable = false)
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "del", nullable = false)
    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    @Basic
    @Column(name = "desride", nullable = false, length = 4000)
    public String getDesride() {
        return desride;
    }

    public void setDesride(String desride) {
        this.desride = desride;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "pic", nullable = false, length = 255)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (tid != team.tid) return false;
        if (del != team.del) return false;
        if (desride != null ? !desride.equals(team.desride) : team.desride != null) return false;
        if (name != null ? !name.equals(team.name) : team.name != null) return false;
        if (pic != null ? !pic.equals(team.pic) : team.pic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid;
        result = 31 * result + del;
        result = 31 * result + (desride != null ? desride.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        return result;
    }
}
