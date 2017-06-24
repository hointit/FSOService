package com.fso.fsoservices;

/**
 * Created by hoint on 12/06/2017.
 */

public class DataLocation {
    public String Latitude;
    public String Longitude;
    public String Time = null;

    public DataLocation() {
    }

    public DataLocation(String latitude, String longitude, String time) {
        Latitude = latitude;
        Longitude = longitude;
        Time = time;
    }
}
