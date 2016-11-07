package wl.hdzj.entity;

import javax.persistence.*;
import javax.persistence.Column;

/**
 * Created by micro on 2016/11/7.
 */
@Entity
public class Member {
    private int mid;
    private String name;
    private Short sex;
    private String jobtitle;
    private String subject;
    private Integer sequence;
    private String describe;
    private String pic;
    private Short identify;
    private Short isshow;
    private String xueyuan;

    @Id
    @GeneratedValue
    @javax.persistence.Column(name = "mid", nullable = false)
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex", nullable = true)
    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "jobtitle", nullable = true, length = 255)
    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    @Basic
    @Column(name = "subject", nullable = true, length = 255)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "sequence", nullable = true)
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Basic
    @Column(name = "describe", nullable = true, length = 4000)
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Basic
    @Column(name = "pic", nullable = true, length = 255)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "identify", nullable = true)
    public Short getIdentify() {
        return identify;
    }

    public void setIdentify(Short identify) {
        this.identify = identify;
    }

    @Basic
    @Column(name = "isshow", nullable = true)
    public Short getIsshow() {
        return isshow;
    }

    public void setIsshow(Short isshow) {
        this.isshow = isshow;
    }

    @Basic
    @Column(name = "xueyuan", nullable = true, length = 255)
    public String getXueyuan() {
        return xueyuan;
    }

    public void setXueyuan(String xueyuan) {
        this.xueyuan = xueyuan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        if (mid != member.mid) return false;
        if (name != null ? !name.equals(member.name) : member.name != null) return false;
        if (sex != null ? !sex.equals(member.sex) : member.sex != null) return false;
        if (jobtitle != null ? !jobtitle.equals(member.jobtitle) : member.jobtitle != null) return false;
        if (subject != null ? !subject.equals(member.subject) : member.subject != null) return false;
        if (sequence != null ? !sequence.equals(member.sequence) : member.sequence != null) return false;
        if (describe != null ? !describe.equals(member.describe) : member.describe != null) return false;
        if (pic != null ? !pic.equals(member.pic) : member.pic != null) return false;
        if (identify != null ? !identify.equals(member.identify) : member.identify != null) return false;
        if (isshow != null ? !isshow.equals(member.isshow) : member.isshow != null) return false;
        if (xueyuan != null ? !xueyuan.equals(member.xueyuan) : member.xueyuan != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (jobtitle != null ? jobtitle.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (sequence != null ? sequence.hashCode() : 0);
        result = 31 * result + (describe != null ? describe.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (identify != null ? identify.hashCode() : 0);
        result = 31 * result + (isshow != null ? isshow.hashCode() : 0);
        result = 31 * result + (xueyuan != null ? xueyuan.hashCode() : 0);
        return result;
    }
}
