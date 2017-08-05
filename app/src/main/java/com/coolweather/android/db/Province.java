package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/5 0005.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceNmae;
    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceNmae(String provinceNmae) {
        this.provinceNmae = provinceNmae;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvinceNmae() {
        return provinceNmae;
    }

    public int getProvinceCode() {
        return provinceCode;
    }
}
