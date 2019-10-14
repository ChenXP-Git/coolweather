package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

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

    public void setProvinceId(int provinceId){this.provinceId = provinceId;}
    public int getProvinceId(){return provinceId;}
}
