package entity;

import java.io.Serializable;

public class Provincial implements Serializable {
    private int pid;
    private String pName;
    private int cid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Provincial() {
    }

    public Provincial(int pid, String pName, int cid) {
        this.pid = pid;
        this.pName = pName;
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "provincial{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                ", cid=" + cid +
                '}';
    }


}
