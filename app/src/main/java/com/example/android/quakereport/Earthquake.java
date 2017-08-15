package com.example.android.quakereport;

/**
 * Created by Xaris on 29/07/2017.
 */

public class Earthquake {

    private double magnitude;
    private String location;
    private long timeInMillli;
    private String url;

    public Earthquake(double magnitude, String location, long timeInMillli, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMillli = timeInMillli;
        this.url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMillli() {
        return timeInMillli;
    }

    public String getUrl() {
        return url;
    }
}
