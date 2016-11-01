package wl.hdzj.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by micro on 2016/10/31.
 */
@Entity
@Table(name = "T_LOG", schema = "hdzj_2016")
public class TLogEntity {
    private int lLog;
    private Timestamp lDate;
    private String lName;
    private String lDescribe;
    private short lIsBackUp;

    @Id
    @Column(name = "L_LOG")
    public int getlLog() {
        return lLog;
    }

    public void setlLog(int lLog) {
        this.lLog = lLog;
    }

    @Basic
    @Column(name = "L_DATE")
    public Timestamp getlDate() {
        return lDate;
    }

    public void setlDate(Timestamp lDate) {
        this.lDate = lDate;
    }

    @Basic
    @Column(name = "L_NAME")
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Basic
    @Column(name = "L_DESCRIBE")
    public String getlDescribe() {
        return lDescribe;
    }

    public void setlDescribe(String lDescribe) {
        this.lDescribe = lDescribe;
    }

    @Basic
    @Column(name = "L_IS_BACK_UP")
    public short getlIsBackUp() {
        return lIsBackUp;
    }

    public void setlIsBackUp(short lIsBackUp) {
        this.lIsBackUp = lIsBackUp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TLogEntity that = (TLogEntity) o;

        if (lLog != that.lLog) return false;
        if (lIsBackUp != that.lIsBackUp) return false;
        if (lDate != null ? !lDate.equals(that.lDate) : that.lDate != null) return false;
        if (lName != null ? !lName.equals(that.lName) : that.lName != null) return false;
        if (lDescribe != null ? !lDescribe.equals(that.lDescribe) : that.lDescribe != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lLog;
        result = 31 * result + (lDate != null ? lDate.hashCode() : 0);
        result = 31 * result + (lName != null ? lName.hashCode() : 0);
        result = 31 * result + (lDescribe != null ? lDescribe.hashCode() : 0);
        result = 31 * result + (int) lIsBackUp;
        return result;
    }
}
