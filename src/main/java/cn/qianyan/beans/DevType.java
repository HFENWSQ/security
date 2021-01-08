package cn.qianyan.beans;

import org.springframework.stereotype.Component;

@Component
public class DevType {

    private String dtid;
    private String dtname;

    public String getDtid() {
        return dtid;
    }

    public void setDtid(String dtid) {
        this.dtid = dtid;
    }

    public String getDtname() {
        return dtname;
    }

    public void setDtname(String dtname) {
        this.dtname = dtname;
    }

    @Override
    public String toString() {
        return "DevType{" +
                "dtid='" + dtid + '\'' +
                ", dtname='" + dtname + '\'' +
                '}';
    }
}
