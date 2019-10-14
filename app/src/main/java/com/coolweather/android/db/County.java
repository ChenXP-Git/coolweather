package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int countyCode;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setCountyName(String name){
        this.countyName = name;
    }
    public String getCountyName(){
        return countyName;
    }

    public void setCountyCode(int code){
        this.countyCode = code;
    }
    public int getCountyCode(){
        return countyCode;
    }
}
