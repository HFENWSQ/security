package cn.qianyan.beans;

import org.springframework.stereotype.Component;

@Component
public class Change {

    private String cid;
    private String ctime;
    private String cmsg;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getCmsg() {
        return cmsg;
    }

    public void setCmsg(String cmsg) {
        this.cmsg = cmsg;
    }

    @Override
    public String toString() {
        return "Change{" +
                "cid='" + cid + '\'' +
                ", ctime='" + ctime + '\'' +
                ", cmsg='" + cmsg + '\'' +
                '}';
    }
}
