package cn.qianyan.beans;

import org.springframework.stereotype.Component;

@Component
public class Device {
    private String did;
    private String dname;
    private int dalertNum;
    private String dtemperature;
    private int dstate;
    private int dkeepState;
    private String dbreakTime;
    private String aid;
    private String dtid;
    private DevType devType;

    public DevType getDevType() {
        return devType;
    }

    public void setDevType(DevType devType) {
        this.devType = devType;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDalertNum() {
        return dalertNum;
    }

    public void setDalertNum(int dalertNum) {
        this.dalertNum = dalertNum;
    }

    public String getDtemperature() {
        return dtemperature;
    }

    public void setDtemperature(String dtemperature) {
        this.dtemperature = dtemperature;
    }

    public int getDstate() {
        return dstate;
    }

    public void setDstate(int dstate) {
        this.dstate = dstate;
    }

    public int getDkeepState() {
        return dkeepState;
    }

    public void setDkeepState(int dkeepState) {
        this.dkeepState = dkeepState;
    }

    public String getDbreakTime() {
        return dbreakTime;
    }

    public void setDbreakTime(String dbreakTime) {
        this.dbreakTime = dbreakTime;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getDtid() {
        return dtid;
    }

    public void setDtid(String dtid) {
        this.dtid = dtid;
    }

    @Override
    public String toString() {
        return "Device{" +
                "did='" + did + '\'' +
                ", dname='" + dname + '\'' +
                ", dalertNum=" + dalertNum +
                ", dtemperature='" + dtemperature + '\'' +
                ", dstate=" + dstate +
                ", dkeepState=" + dkeepState +
                ", dbreakTime='" + dbreakTime + '\'' +
                ", aid='" + aid + '\'' +
                ", dtid='" + dtid + '\'' +
                ", devType=" + devType +
                '}';
    }
}
