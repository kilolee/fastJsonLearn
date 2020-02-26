package com.kilo.jsonfield;

/**
 * Created by kilo on 2020/2/26.
 */
public class Localtion {
    private int longitude;
    private int latitude;

    public Localtion() {
    }

    public Localtion(int longitude, int latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
}
