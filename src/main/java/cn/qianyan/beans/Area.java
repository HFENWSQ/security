package cn.qianyan.beans;

import org.springframework.stereotype.Component;

@Component
public class Area {
    private String aid;
    private String aname;
    private String aplace;
    private String amanager;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAplace() {
        return aplace;
    }

    public void setAplace(String aplace) {
        this.aplace = aplace;
    }

    public String getAmanager() {
        return amanager;
    }

    public void setAmanager(String amanager) {
        this.amanager = amanager;
    }

    @Override
    public String toString() {
        return "area{" +
                "aid='" + aid + '\'' +
                ", aname='" + aname + '\'' +
                ", aplace='" + aplace + '\'' +
                ", amanager='" + amanager + '\'' +
                '}';
    }
}
