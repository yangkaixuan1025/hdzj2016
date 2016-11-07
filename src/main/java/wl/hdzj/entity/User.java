package wl.hdzj.entity;

import javax.persistence.*;
import javax.persistence.Column;

/**
 * Created by micro on 2016/11/7.
 */
@Entity
public class User {
    private int id;
    private String account;
    private String name;
    private String passwd;
    private String phone;
    private short sex;
    private String role;

    @Id
    @GeneratedValue
    @javax.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account", nullable = false, length = 200)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "passwd", nullable = false, length = 100)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "sex", nullable = false)
    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "role", nullable = false, length = 10)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (sex != user.sex) return false;
        if (account != null ? !account.equals(user.account) : user.account != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (passwd != null ? !passwd.equals(user.passwd) : user.passwd != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (role != null ? !role.equals(user.role) : user.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
