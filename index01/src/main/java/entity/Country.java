package entity;

import java.io.Serializable;
import java.util.Set;

public class Country implements Serializable {
    private int cid;
    private String cName;
    private Set<Provincial> provincial;

    @Override
    public String toString() {
        return "Country{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                ", provincial=" + provincial +
                '}';
    }

    public Country(int cid, String cName, Set<Provincial> provincial) {
        this.cid = cid;
        this.cName = cName;
        this.provincial = provincial;
    }

    public Country() {

    }

    public int getCid() {

        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Set<Provincial> getProvincial() {
        return provincial;
    }

    public void setProvincial(Set<Provincial> provincial) {
        this.provincial = provincial;
    }
}
