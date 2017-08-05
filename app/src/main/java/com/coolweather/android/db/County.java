package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/5 0005.
 */

public class County extends DataSupport {

    private int id;
    private String countName;
    private int cityId;
    private int weatherId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public String getCountName() {
        return countName;
    }

    public int getCityId() {
        return cityId;
    }

    public int getWeatherId() {
        return weatherId;
    }
}
