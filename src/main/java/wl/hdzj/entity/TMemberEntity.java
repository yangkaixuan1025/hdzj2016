package wl.hdzj.entity;

import javax.persistence.*;

/**
 * Created by micro on 2016/10/31.
 */
@Entity
@Table(name = "T_MEMBER", schema = "hdzj_2016")
public class TMemberEntity {
    private int mId;
    private String mName;
    private short mSex;
    private String mJobTitle;
    private String mSubject;
    private int mSequence;
    private String mDescribe;
    private String mPic;
    private short mIdentify;
    private short mIsshow;
    private int tId;
    private String mXueyuan;

    @Id
    @Column(name = "M_ID")
    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    @Basic
    @Column(name = "M_NAME")
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Basic
    @Column(name = "M_SEX")
    public short getmSex() {
        return mSex;
    }

    public void setmSex(short mSex) {
        this.mSex = mSex;
    }

    @Basic
    @Column(name = "M_JOB_TITLE")
    public String getmJobTitle() {
        return mJobTitle;
    }

    public void setmJobTitle(String mJobTitle) {
        this.mJobTitle = mJobTitle;
    }

    @Basic
    @Column(name = "M_SUBJECT")
    public String getmSubject() {
        return mSubject;
    }

    public void setmSubject(String mSubject) {
        this.mSubject = mSubject;
    }

    @Basic
    @Column(name = "M_SEQUENCE")
    public int getmSequence() {
        return mSequence;
    }

    public void setmSequence(int mSequence) {
        this.mSequence = mSequence;
    }

    @Basic
    @Column(name = "M_DESCRIBE")
    public String getmDescribe() {
        return mDescribe;
    }

    public void setmDescribe(String mDescribe) {
        this.mDescribe = mDescribe;
    }

    @Basic
    @Column(name = "M_PIC")
    public String getmPic() {
        return mPic;
    }

    public void setmPic(String mPic) {
        this.mPic = mPic;
    }

    @Basic
    @Column(name = "M_IDENTIFY")
    public short getmIdentify() {
        return mIdentify;
    }

    public void setmIdentify(short mIdentify) {
        this.mIdentify = mIdentify;
    }

    @Basic
    @Column(name = "M_ISSHOW")
    public short getmIsshow() {
        return mIsshow;
    }

    public void setmIsshow(short mIsshow) {
        this.mIsshow = mIsshow;
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
    @Column(name = "M_XUEYUAN")
    public String getmXueyuan() {
        return mXueyuan;
    }

    public void setmXueyuan(String mXueyuan) {
        this.mXueyuan = mXueyuan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TMemberEntity that = (TMemberEntity) o;

        if (mId != that.mId) return false;
        if (mSex != that.mSex) return false;
        if (mSequence != that.mSequence) return false;
        if (mIdentify != that.mIdentify) return false;
        if (mIsshow != that.mIsshow) return false;
        if (tId != that.tId) return false;
        if (mName != null ? !mName.equals(that.mName) : that.mName != null) return false;
        if (mJobTitle != null ? !mJobTitle.equals(that.mJobTitle) : that.mJobTitle != null) return false;
        if (mSubject != null ? !mSubject.equals(that.mSubject) : that.mSubject != null) return false;
        if (mDescribe != null ? !mDescribe.equals(that.mDescribe) : that.mDescribe != null) return false;
        if (mPic != null ? !mPic.equals(that.mPic) : that.mPic != null) return false;
        if (mXueyuan != null ? !mXueyuan.equals(that.mXueyuan) : that.mXueyuan != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mId;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (int) mSex;
        result = 31 * result + (mJobTitle != null ? mJobTitle.hashCode() : 0);
        result = 31 * result + (mSubject != null ? mSubject.hashCode() : 0);
        result = 31 * result + mSequence;
        result = 31 * result + (mDescribe != null ? mDescribe.hashCode() : 0);
        result = 31 * result + (mPic != null ? mPic.hashCode() : 0);
        result = 31 * result + (int) mIdentify;
        result = 31 * result + (int) mIsshow;
        result = 31 * result + tId;
        result = 31 * result + (mXueyuan != null ? mXueyuan.hashCode() : 0);
        return result;
    }
}
