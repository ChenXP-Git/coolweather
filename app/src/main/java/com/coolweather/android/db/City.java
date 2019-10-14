package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setCityName(String name){
        this.cityName = name;
    }
    public String getCityName(){ return cityName; }

    public void setCityCode(int code){
        this.cityCode = code;
    }
    public int getCityCode(){
        return cityCode;
    }
}
