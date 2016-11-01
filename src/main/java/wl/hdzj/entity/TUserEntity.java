package wl.hdzj.entity;

import javax.persistence.*;

/**
 * Created by micro on 2016/10/31.
 */
@Entity
@Table(name = "T_USER", schema = "hdzj_2016")
public class TUserEntity {
    private int uId;
    private String uAccount;
    private String uPasswd;
    private String uName;
    private short uSex;
    private String uPhonenu;

    @Id
    @Column(name = "U_ID")
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    @Basic
    @Column(name = "U_ACCOUNT")
    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount;
    }

    @Basic
    @Column(name = "U_PASSWD")
    public String getuPasswd() {
        return uPasswd;
    }

    public void setuPasswd(String uPasswd) {
        this.uPasswd = uPasswd;
    }

    @Basic
    @Column(name = "U_NAME")
    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    @Basic
    @Column(name = "U_SEX")
    public short getuSex() {
        return uSex;
    }

    public void setuSex(short uSex) {
        this.uSex = uSex;
    }

    @Basic
    @Column(name = "U_PHONENU")
    public String getuPhonenu() {
        return uPhonenu;
    }

    public void setuPhonenu(String uPhonenu) {
        this.uPhonenu = uPhonenu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserEntity that = (TUserEntity) o;

        if (uId != that.uId) return false;
        if (uSex != that.uSex) return false;
        if (uAccount != null ? !uAccount.equals(that.uAccount) : that.uAccount != null) return false;
        if (uPasswd != null ? !uPasswd.equals(that.uPasswd) : that.uPasswd != null) return false;
        if (uName != null ? !uName.equals(that.uName) : that.uName != null) return false;
        if (uPhonenu != null ? !uPhonenu.equals(that.uPhonenu) : that.uPhonenu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uId;
        result = 31 * result + (uAccount != null ? uAccount.hashCode() : 0);
        result = 31 * result + (uPasswd != null ? uPasswd.hashCode() : 0);
        result = 31 * result + (uName != null ? uName.hashCode() : 0);
        result = 31 * result + (int) uSex;
        result = 31 * result + (uPhonenu != null ? uPhonenu.hashCode() : 0);
        return result;
    }
}
