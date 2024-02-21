package com.zzl.pojo;

public class Host {
    private String hid;
    private String hname;
    private String hsex;
    private String h_haddress;
    private Double harear;
    private Integer h_phone;
    private Integer hnumber;
    private String hpleve;

    public String getHid() {
        return hid;
    }
    public void setHid(String hid) {
        this.hid = hid;
    }
    public String getHname() {
        return hname;
    }

    public void setHname(String hanme) {
        this.hname = hanme;
    }

    public String getHsex() {
        return hsex;
    }

    public void setHsex(String hsex) {
        this.hsex = hsex;
    }

    public String getH_haddress() {
        return h_haddress;
    }

    public void setH_haddress(String h_haddress) {
        this.h_haddress = h_haddress;
    }

    public Double getHarear() {
        return harear;
    }

    public void setHarear(Double harear) {
        this.harear = harear;
    }

    public Integer getH_phone() {
        return h_phone;
    }

    public void setH_phone(Integer h_phone) {
        this.h_phone = h_phone;
    }

    public Integer getHnumber() {
        return hnumber;
    }

    public void setHnumber(Integer hnumber) {
        this.hnumber = hnumber;
    }

    public String getHpleve() {
        return hpleve;
    }

    public void setHpleve(String hpleve) {
        this.hpleve = hpleve;
    }


    @Override
    public String toString() {
        return "Host{" +
                "hid='" + hid + '\'' +
                ", hanme='" + hname + '\'' +
                ", hsex='" + hsex + '\'' +
                ", h_haddress='" + h_haddress + '\'' +
                ", harear=" + harear +
                ", h_phone=" + h_phone +
                ", hnumber=" + hnumber +
                ", hpleve='" + hpleve + '\'' +
                '}';
    }
}
