package wl.hdzj.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by micro on 2016/10/31.
 */
@Entity
@Table(name = "T_NWES", schema = "hdzj_2016")
public class TNwesEntity {
    private int nId;
    private int cId;
    private int tId;
    private String nTitle;
    private String nSubtitile;
    private String nMessage;
    private Timestamp nDate;
    private String nAuther;
    private String nPic;
    private short nType;
    private short nIsdraft;
    private short nIstop;

    @Id
    @Column(name = "N_ID")
    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    @Basic
    @Column(name = "C_ID")
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
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
    @Column(name = "N_TITLE")
    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    @Basic
    @Column(name = "N_SUBTITILE")
    public String getnSubtitile() {
        return nSubtitile;
    }

    public void setnSubtitile(String nSubtitile) {
        this.nSubtitile = nSubtitile;
    }

    @Basic
    @Column(name = "N_MESSAGE")
    public String getnMessage() {
        return nMessage;
    }

    public void setnMessage(String nMessage) {
        this.nMessage = nMessage;
    }

    @Basic
    @Column(name = "N_DATE")
    public Timestamp getnDate() {
        return nDate;
    }

    public void setnDate(Timestamp nDate) {
        this.nDate = nDate;
    }

    @Basic
    @Column(name = "N_AUTHER")
    public String getnAuther() {
        return nAuther;
    }

    public void setnAuther(String nAuther) {
        this.nAuther = nAuther;
    }

    @Basic
    @Column(name = "N_PIC")
    public String getnPic() {
        return nPic;
    }

    public void setnPic(String nPic) {
        this.nPic = nPic;
    }

    @Basic
    @Column(name = "N_TYPE")
    public short getnType() {
        return nType;
    }

    public void setnType(short nType) {
        this.nType = nType;
    }

    @Basic
    @Column(name = "N_ISDRAFT")
    public short getnIsdraft() {
        return nIsdraft;
    }

    public void setnIsdraft(short nIsdraft) {
        this.nIsdraft = nIsdraft;
    }

    @Basic
    @Column(name = "N_ISTOP")
    public short getnIstop() {
        return nIstop;
    }

    public void setnIstop(short nIstop) {
        this.nIstop = nIstop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TNwesEntity that = (TNwesEntity) o;

        if (nId != that.nId) return false;
        if (cId != that.cId) return false;
        if (tId != that.tId) return false;
        if (nType != that.nType) return false;
        if (nIsdraft != that.nIsdraft) return false;
        if (nIstop != that.nIstop) return false;
        if (nTitle != null ? !nTitle.equals(that.nTitle) : that.nTitle != null) return false;
        if (nSubtitile != null ? !nSubtitile.equals(that.nSubtitile) : that.nSubtitile != null) return false;
        if (nMessage != null ? !nMessage.equals(that.nMessage) : that.nMessage != null) return false;
        if (nDate != null ? !nDate.equals(that.nDate) : that.nDate != null) return false;
        if (nAuther != null ? !nAuther.equals(that.nAuther) : that.nAuther != null) return false;
        if (nPic != null ? !nPic.equals(that.nPic) : that.nPic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nId;
        result = 31 * result + cId;
        result = 31 * result + tId;
        result = 31 * result + (nTitle != null ? nTitle.hashCode() : 0);
        result = 31 * result + (nSubtitile != null ? nSubtitile.hashCode() : 0);
        result = 31 * result + (nMessage != null ? nMessage.hashCode() : 0);
        result = 31 * result + (nDate != null ? nDate.hashCode() : 0);
        result = 31 * result + (nAuther != null ? nAuther.hashCode() : 0);
        result = 31 * result + (nPic != null ? nPic.hashCode() : 0);
        result = 31 * result + (int) nType;
        result = 31 * result + (int) nIsdraft;
        result = 31 * result + (int) nIstop;
        return result;
    }
}
