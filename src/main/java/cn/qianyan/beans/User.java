package cn.qianyan.beans;

import org.springframework.stereotype.Component;

//用户实体类
@Component
public class User {
    private String uid;
    private String uname;
    private String upassword;
    private String utelephone;
    private int uright;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUtelephone() {
        return utelephone;
    }

    public void setUtelephone(String utelephone) {
        this.utelephone = utelephone;
    }

    public int getUright() {
        return uright;
    }

    public void setUright(int uright) {
        this.uright = uright;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", utelephone='" + utelephone + '\'' +
                ", uright=" + uright +
                '}';
    }
}
