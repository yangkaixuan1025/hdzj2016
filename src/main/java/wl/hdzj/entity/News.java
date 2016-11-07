package wl.hdzj.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by micro on 2016/11/7.
 */
@Entity
public class News {
    private int nid;
    private String auther;
    private Timestamp date;
    private short isdraft;
    private short istop;
    private String message;
    private String pic;
    private String subtitle;
    private String title;
    private short type;
    private Column columnByCid;
    private Team teamByTid;

    public News(String auther, Timestamp date, short isdraft, short istop, String message, String pic, String subtitle, String title, short type, Column columnByCid, Team teamByTid) {
        this.auther = auther;
        this.date = date;
        this.isdraft = isdraft;
        this.istop = istop;
        this.message = message;
        this.pic = pic;
        this.subtitle = subtitle;
        this.title = title;
        this.type = type;
        this.columnByCid = columnByCid;
        this.teamByTid = teamByTid;
    }

    public News() {
    }

    @Id
    @GeneratedValue
    @javax.persistence.Column(name = "nid", nullable = false)
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Basic
    @javax.persistence.Column(name = "auther", nullable = false, length = 255)
    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Basic
    @javax.persistence.Column(name = "date", nullable = true)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @javax.persistence.Column(name = "isdraft", nullable = false)
    public short getIsdraft() {
        return isdraft;
    }

    public void setIsdraft(short isdraft) {
        this.isdraft = isdraft;
    }

    @Basic
    @javax.persistence.Column(name = "istop", nullable = false)
    public short getIstop() {
        return istop;
    }

    public void setIstop(short istop) {
        this.istop = istop;
    }

    @Basic
    @javax.persistence.Column(name = "message", nullable = false, length = 4000)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @javax.persistence.Column(name = "pic", nullable = false, length = 255)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @javax.persistence.Column(name = "subtitle", nullable = false, length = 255)
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Basic
    @javax.persistence.Column(name = "title", nullable = false, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @javax.persistence.Column(name = "type", nullable = false)
    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (nid != news.nid) return false;
        if (isdraft != news.isdraft) return false;
        if (istop != news.istop) return false;
        if (type != news.type) return false;
        if (auther != null ? !auther.equals(news.auther) : news.auther != null) return false;
        if (date != null ? !date.equals(news.date) : news.date != null) return false;
        if (message != null ? !message.equals(news.message) : news.message != null) return false;
        if (pic != null ? !pic.equals(news.pic) : news.pic != null) return false;
        if (subtitle != null ? !subtitle.equals(news.subtitle) : news.subtitle != null) return false;
        if (title != null ? !title.equals(news.title) : news.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nid;
        result = 31 * result + (auther != null ? auther.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (int) isdraft;
        result = 31 * result + (int) istop;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (subtitle != null ? subtitle.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (int) type;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid")
    public Column getColumnByCid() {
        return columnByCid;
    }

    public void setColumnByCid(Column columnByCid) {
        this.columnByCid = columnByCid;
    }

    @ManyToOne
    @JoinColumn(name = "tid", referencedColumnName = "tid")
    public Team getTeamByTid() { return teamByTid; }

    public void setTeamByTid(Team columnByTid) {
        this.teamByTid = columnByTid;
    }
}
