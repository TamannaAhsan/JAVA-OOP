package com.example.springmvc.model;

public class Programmer {

    private  int cId;
    private  String cName;
    private  String clang;

    public Programmer(){
        super();
    }
    public Programmer(int cId, String cName, String clang ){
        super();
        this.cId = cId;
        this.cName=cName;
        this.clang = clang;

    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getClang() {
        return clang;
    }

    public void setClang(String clang) {
        this.clang = clang;
    }

    @Override
    public String toString() {
        return (cId+" "+cName+" "+clang);
    }
}
