package cn.qianyan.beans;

import org.springframework.stereotype.Component;

@Component
public class Menu {

    private String mid;
    private String mname;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mid='" + mid + '\'' +
                ", mname='" + mname + '\'' +
                '}';
    }
}
