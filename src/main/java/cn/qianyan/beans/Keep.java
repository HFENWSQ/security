package cn.qianyan.beans;

import org.springframework.stereotype.Component;

@Component
public class Keep {
    private String kid;
    private int kstateBefore;
    private int kstateAfter;
    private String kbreakTime;
    private String kfinashTime;
    private String kuser;
    private String ksituation;
    private String kquestion;
    private String did;

    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    public int getKstateBefore() {
        return kstateBefore;
    }

    public void setKstateBefore(int kstateBefore) {
        this.kstateBefore = kstateBefore;
    }

    public int getKstateAfter() {
        return kstateAfter;
    }

    public void setKstateAfter(int kstateAfter) {
        this.kstateAfter = kstateAfter;
    }

    public String getKbreakTime() {
        return kbreakTime;
    }

    public void setKbreakTime(String kbreakTime) {
        this.kbreakTime = kbreakTime;
    }

    public String getKfinashTime() {
        return kfinashTime;
    }

    public void setKfinashTime(String kfinashTime) {
        this.kfinashTime = kfinashTime;
    }

    public String getKuser() {
        return kuser;
    }

    public void setKuser(String kuser) {
        this.kuser = kuser;
    }

    public String getKsituation() {
        return ksituation;
    }

    public void setKsituation(String ksituation) {
        this.ksituation = ksituation;
    }

    public String getKquestion() {
        return kquestion;
    }

    public void setKquestion(String kquestion) {
        this.kquestion = kquestion;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Keep{" +
                "kid='" + kid + '\'' +
                ", kstateBefore=" + kstateBefore +
                ", kstateAfter=" + kstateAfter +
                ", kbreakTime='" + kbreakTime + '\'' +
                ", kfinashTime='" + kfinashTime + '\'' +
                ", kuser='" + kuser + '\'' +
                ", ksituation='" + ksituation + '\'' +
                ", kquestion='" + kquestion + '\'' +
                ", did='" + did + '\'' +
                '}';
    }
}
