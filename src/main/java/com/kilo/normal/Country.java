package com.kilo.normal;

import java.util.Date;

/**
 * Created by kilo on 2020/2/26.
 */
public class Country {

    private String name;

    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
